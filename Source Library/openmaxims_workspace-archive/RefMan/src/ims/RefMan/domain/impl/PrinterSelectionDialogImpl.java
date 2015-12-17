// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.66 build 3236.16532)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.RefMan.domain.impl;

import ims.RefMan.domain.base.impl.BasePrinterSelectionDialogImpl;
import ims.RefMan.domain.objects.CatsReferral;
import ims.RefMan.domain.objects.ReferralOutcome;
import ims.RefMan.vo.CatsReferralRefVo;
import ims.RefMan.vo.CatsReferralReportsVo;
import ims.RefMan.vo.ReferralOutcomeVo;
import ims.RefMan.vo.domain.CatsReferralReportsVoAssembler;
import ims.RefMan.vo.domain.ReferralOutcomeVoAssembler;
import ims.core.documents.domain.objects.PatientDocument;
import ims.core.domain.PrintReport;
import ims.core.domain.impl.PrintReportImpl;
import ims.core.vo.PatientDocumentVo;
import ims.core.vo.domain.PatientDocumentVoAssembler;
import ims.domain.DomainFactory;
import ims.domain.exceptions.DomainRuntimeException;
import ims.domain.exceptions.StaleObjectException;
import ims.ocrr.orderingresults.domain.objects.OrderInvestigation;
import ims.ocrr.orderingresults.vo.OrderInvestigationRefVo;
import ims.ocrr.orderingresults.vo.OrderInvestigationRefVoCollection;
import ims.ocrr.vo.OrderInvestigationListVoCollection;
import ims.ocrr.vo.domain.OrderInvestigationListVoAssembler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrinterSelectionDialogImpl extends BasePrinterSelectionDialogImpl
{

	private static final long serialVersionUID = 1L;

	/**
	* getSystemReportAndTemplate
	*/
	public String[] getSystemReportAndTemplate(Integer imsId)
	{
		String[] result = null;		
		DomainFactory factory = getDomainFactory();
		
		List lst = factory.find("select r1_1.reportXml, t1_1.templateXml, r1_1.reportName, r1_1.reportDescription, t1_1.name, t1_1.description from ReportBo as r1_1 left join r1_1.templates as t1_1 where (r1_1.imsId= :imsid) order by t1_1.name", new String[] {"imsid"}, new Object[] {imsId});
		
		if(lst.iterator().hasNext())
		{
			Object[] obj = (Object[])lst.iterator().next();
			
			result = new String[] {(String)obj[0], (String)obj[1], (String)obj[2], (String)obj[3], (String)obj[4], (String)obj[5]};
		}
		
		return result;
	}

	/**
	* savePatientDocument
	*/
	public void savePatientDocument(PatientDocumentVo document, CatsReferralReportsVo catReferral, ReferralOutcomeVo voOutcome) throws StaleObjectException
	{
		if (document != null)
		{
			if (!document.isValidated())
				throw new DomainRuntimeException("PatientDocumentVo not validated");
		}
		
		DomainFactory factory = getDomainFactory();
		PatientDocument doc = PatientDocumentVoAssembler.extractPatientDocument(factory, document);
		factory.save(doc);				

		CatsReferral doCatsReferral = CatsReferralReportsVoAssembler.extractCatsReferral(factory, catReferral);
		if (catReferral != null) 
			doCatsReferral.getReferralDocuments().add(doc);						
		
		factory.save(doCatsReferral);
	
		ReferralOutcome doRef = ReferralOutcomeVoAssembler.extractReferralOutcome(factory, voOutcome);
		if(doRef != null)	//wdev-12355
			factory.save(doRef);
		
//		PatientDocumentSaveVo vo = new PatientDocumentSaveVo();
//		vo.setPatientDocumentVo(PatientDocumentVoAssembler.create(doc));
//		vo.setCatsReferralWizardVo(CatsReferralWizardVoAssembler.create(doCatsReferral));		
	}

	/**
	* getCatsReferral
	*/
	public ims.RefMan.vo.CatsReferralReportsVo getCatsReferral(ims.RefMan.vo.CatsReferralRefVo voCatsRef)
	{
		return CatsReferralReportsVoAssembler.create((CatsReferral)getDomainFactory().getDomainObject(CatsReferral.class, voCatsRef.getID_CatsReferral()));
	}

	/**
	* listReports
	*/
	public ims.admin.vo.ReportVoCollection listReports(Integer formId)
	{
		PrintReport impl = (PrintReport) getDomainImpl(PrintReportImpl.class);
		return impl.listReports(formId);
	}

	/**
	 * WDEV-12345
	 * Retrieve OrderInvestigations records associated to ReferralOutcoem record corresponding to CATS Referral record
	 */
	public OrderInvestigationRefVoCollection listInvestigations(CatsReferralRefVo referral)
	{
		// Test referral parameter
		if (referral == null || !referral.getID_CatsReferralIsNotNull())
			return null;
		
		
		// Build query to retrieve  Investigations  associated to  ReferralOutcome  record corresponding to  CATS Referral record
		String query = "select investigation from ReferralOutcome as refOut left join refOut.referralDischarge as dis join dis.resultsForReport as investigation where refOut.catsReferral.id = :ID";
		// Query database for investigations
		List<?> investigationsList = getDomainFactory().find(query, "ID", referral.getID_CatsReferral());
		
		// Create collection for results
		OrderInvestigationRefVoCollection resultsCollection = new OrderInvestigationRefVoCollection();
		
		// Iterate investigations returned by database query
		Iterator<?> investigationIterator = investigationsList.iterator();
		
		while (investigationIterator.hasNext())
		{
			OrderInvestigation investigation = (OrderInvestigation) investigationIterator.next();
			
			// Create OrderInvestigationRefVo
			OrderInvestigationRefVo investigationRef = new OrderInvestigationRefVo(investigation.getId(), investigation.getVersion());
			// Add OrderInvestigationRefVo to results
			resultsCollection.add(investigationRef);
		}
		
		// Results
		return resultsCollection;
	}

}