//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Vasile Purdila using IMS Development Environment (version 1.45 build 2257.28884)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.ocrr.domain.impl;

import ims.core.clinical.vo.ServiceRefVo;
import ims.core.patient.vo.PatientRefVo;
import ims.core.resource.people.vo.HcpRefVo;
import ims.core.vo.HcpLiteVoCollection;
import ims.core.vo.ServiceLiteVoCollection;
import ims.core.vo.domain.HcpLiteVoAssembler;
import ims.core.vo.domain.ServiceLiteVoAssembler;
import ims.core.vo.lookups.PreActiveActiveInactiveStatus;
import ims.core.vo.lookups.ServiceCategory;
import ims.core.vo.lookups.TaxonomyType;
import ims.framework.enumerations.SortOrder;
import ims.framework.exceptions.CodingRuntimeException;
import ims.framework.interfaces.IAppRole;
import ims.framework.utils.DateTime;
import ims.ocrr.configuration.vo.InvestigationIndexRefVo;
import ims.ocrr.domain.SelectandOrder;
import ims.ocrr.domain.base.impl.BaseClinicalImagingResultsImpl;
import ims.ocrr.orderingresults.domain.objects.OrderInvestigation;
import ims.ocrr.orderingresults.domain.objects.OrderedInvestigationStatus;
import ims.ocrr.vo.InvestigationIndexLiteVoCollection;
import ims.ocrr.vo.OrdInvXOStatusHistoryLiteVo;
import ims.ocrr.vo.OrdInvXOStatusHistoryLiteVoCollection;
import ims.ocrr.vo.RadiologyResultListVo;
import ims.ocrr.vo.RadiologyResultListVoCollection;
import ims.ocrr.vo.RoleDisciplineSecurityLevelLiteGCVo;
import ims.ocrr.vo.domain.InvestigationIndexLiteVoAssembler;
import ims.ocrr.vo.domain.OrdInvXOStatusHistoryLiteVoAssembler;
import ims.ocrr.vo.domain.RadiologyResultListVoAssembler;
import ims.ocrr.vo.lookups.Category;
import ims.ocrr.vo.lookups.OrderInvStatus;
import ims.ocrr.vo.lookups.ResultStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ClinicalImagingResultsImpl extends BaseClinicalImagingResultsImpl
{
	private static final long serialVersionUID = 1L;

	/**
	* listExams
	*/
	public ims.ocrr.vo.InvestigationIndexLiteVoCollection listExams(String name)
	{
		if(name != null)
			name = name.toUpperCase();
		
		return InvestigationIndexLiteVoAssembler.createInvestigationIndexLiteVoCollectionFromInvestigationIndex(
				getDomainFactory().find("from InvestigationIndex as i1_1 where (i1_1.category = :cat and i1_1.upperName like :name and i1_1.activeStatus = :status and i1_1.isProfile = :isProfile) order by i1_1.upperName", 
						new String[] {"name", "cat", "status", "isProfile"}, new Object[] {name, getDomLookup(Category.CLINICALIMAGING), getDomLookup(PreActiveActiveInactiveStatus.ACTIVE), Boolean.FALSE}));
	}

	public HcpLiteVoCollection listClinicians(String name)
	{
		if (name == null || name.length() == 0)
			return null;
		
		String query = "SELECT hcp FROM Hcp AS hcp LEFT JOIN hcp.mos AS mos WHERE mos.name.upperSurname LIKE :HCP_NAME AND hcp.isActive = 1 AND hcp.isHCPaResponsibleHCP = 1 ORDER BY mos.name.upperSurname";
		
		return HcpLiteVoAssembler.createHcpLiteVoCollectionFromHcp(getDomainFactory().find(query, "HCP_NAME", name.toUpperCase() + "%", 400));
	}

	public RadiologyResultListVoCollection listResults(DateTime dateFrom, DateTime dateTo, ServiceRefVo department, InvestigationIndexRefVo exam, HcpRefVo clinician, Boolean resultsOnly, PatientRefVo patientId, Boolean bCompleted)
	{
		/*
		if(dateFrom == null || dateTo == null)
			throw new DomainRuntimeException("Date From/To cannot be null !");
		*/
		
		if(resultsOnly == null)
			throw new CodingRuntimeException("ResultsOnly parameter cannot be null !");

		ArrayList<String> markers = new ArrayList<String>();
		ArrayList<Object> values = new ArrayList<Object>();

		StringBuffer sb = new StringBuffer("from OrderInvestigation as o1_1 where ");

		sb.append(" o1_1.investigation.investigationIndex.category = :cat");
		markers.add("cat");
		values.add(getDomLookup(Category.CLINICALIMAGING));
		
		if(dateFrom != null && dateTo != null)
		{			
			sb.append(" and");
			sb.append(" o1_1.displayDateTime between :fromdate and :todate");
				
			markers.add("fromdate");
			values.add(dateFrom.getJavaDate());
			markers.add("todate");
			values.add(dateTo.getJavaDate());
		}
		
		if (department != null)
		{
			sb.append(" and o1_1.investigation.providerService.locationService.service.id = :DEPARTMENT");
			markers.add("DEPARTMENT");
			values.add(department.getID_Service());
		}
		if (exam != null)
		{
			sb.append(" and o1_1.investigation.investigationIndex.id = :EXAM");
			markers.add("EXAM");
			values.add(exam.getID_InvestigationIndex());
		}
		if (clinician != null)
		{
			sb.append(" and o1_1.orderDetails.responsibleClinician.id = :CLINICIAN");
			markers.add("CLINICIAN");
			values.add(clinician.getID_Hcp());
		}
		if (bCompleted != null
			&& bCompleted)
		{
			sb.append(" and o1_1.ordInvCurrentStatus.ordInvStatus = :statComp ");
			markers.add("statComp");
			values.add(getDomLookup(OrderInvStatus.COMPLETE));
		}
		if (resultsOnly != null && resultsOnly.booleanValue())
		{
			sb.append(" and o1_1.resultDetails is not null");//WDEV-10227
		}
		if (patientId != null)
		{
			sb.append(" and o1_1.orderDetails.patient.id  = :PID");
			markers.add("PID");
			values.add(patientId.getID_Patient());
		}
		sb.append(" order by o1_1.displayDateTime desc, o1_1.ordInvSeq asc, o1_1.systemInformation.creationDateTime, o1_1.systemInformation.creationUser");
		
		//WDEV-12054
		List results = getDomainFactory().find(sb.toString(), markers, values);
		HashMap map = new HashMap();
		map = getListXoHistory(map, results);
		
		RadiologyResultListVoCollection voCollResults = RadiologyResultListVoAssembler.createRadiologyResultListVoCollectionFromOrderInvestigation(results).sort(SortOrder.DESCENDING);
		
		if(voCollResults != null)
		{
			for(RadiologyResultListVo voResult : voCollResults)
			{
				if(map.containsKey(voResult.getID_OrderInvestigation()))
				{
					voResult.setOrdInvXOStatusHistory((OrdInvXOStatusHistoryLiteVoCollection) map.get(voResult.getID_OrderInvestigation()));
				}
			}
		}
		
		return voCollResults;
	}

	//WDEV-12054
	public HashMap getListXoHistory(HashMap map, List results)
	{
		if(results != null)
		{
			Iterator it = results.iterator();
			while(it.hasNext())
			{
				OrderInvestigation doOrdInv = (OrderInvestigation) it.next();
				if(doOrdInv.getOrdInvXOStatusHistory() != null)
				{
					OrdInvXOStatusHistoryLiteVoCollection voColOrderedInvestigationXoStatus = new OrdInvXOStatusHistoryLiteVoCollection();
					int dummyId = 1;
					Iterator it1 = doOrdInv.getOrdInvXOStatusHistory().iterator();
					while(it1.hasNext())
					{
						OrderedInvestigationStatus doStatus = (OrderedInvestigationStatus) it1.next();
						OrdInvXOStatusHistoryLiteVo voStatus = OrdInvXOStatusHistoryLiteVoAssembler.create(doStatus);
						voStatus.setID_OrderedInvestigationStatus(Integer.valueOf(dummyId));
						dummyId++;
						voColOrderedInvestigationXoStatus.add(voStatus);
					}
					
					//reset original id
					for (OrdInvXOStatusHistoryLiteVo voStatus : voColOrderedInvestigationXoStatus)
						voStatus.setID_OrderedInvestigationStatus(doOrdInv.getId());
			
					//store orderinvestigations and their respective collection of Xo statuses
					map.put(doOrdInv.getId(), voColOrderedInvestigationXoStatus);
				}
			}
		}
		
		return map;
	}

	public ServiceLiteVoCollection listServices(String name, ServiceCategory type) 
	{
		if(type != null)
			return ServiceLiteVoAssembler.createServiceLiteVoCollectionFromService(
					getDomainFactory().find("from Service as s1_1 where (s1_1.serviceCategory = :type and upper(s1_1.serviceName) like upper(:name)) and isActive = :active order by s1_1.serviceName asc", 
							new String[] {"type", "name", "active"}, new Object[] {getDomLookup(type), name, Boolean.TRUE}));
		
		return ServiceLiteVoAssembler.createServiceLiteVoCollectionFromService(
				getDomainFactory().find("from Service as s1_1 where (upper(s1_1.serviceName) like upper(:name)) and isActive = :active order by s1_1.serviceName asc", 
						new String[] {"name", "active"}, new Object[] {name, Boolean.TRUE}));
		
	}

	public RoleDisciplineSecurityLevelLiteGCVo getRoleDisciplineSecurityLevels(IAppRole role)
	{
		SelectandOrder impl = (SelectandOrder)getDomainImpl(SelectandOrderImpl.class);
		return impl.getRoleDisciplineSecurityLevels(role);
		
	}

	
	public InvestigationIndexLiteVoCollection listExamsSynonyms(String name,Boolean beginWith) 
	{
		
		if(name != null)
		{
			name.replaceAll("%", "");
					
			if(beginWith != null)
				name = (!beginWith ? "%" + name.toUpperCase() + "%" : name.toUpperCase() + "%");
			else
				name = name.toUpperCase() + "%";
					
		}
		return InvestigationIndexLiteVoAssembler.createInvestigationIndexLiteVoCollectionFromInvestigationIndex(
				getDomainFactory().find("select distinct i1_1 from InvestigationIndex as i1_1 left join i1_1.synonyms as i2_1 where (i1_1.category = :cat and ((i2_1.upperName like :name and i2_1.activeStatus = :Active) or i1_1.upperName like :name ) and i1_1.activeStatus = :status and i1_1.isProfile = :isProfile) order by i1_1.upperName", 
						new String[] {"name", "cat", "status", "isProfile", "Active"}, new Object[] {name, getDomLookup(Category.CLINICALIMAGING), getDomLookup(PreActiveActiveInactiveStatus.ACTIVE), Boolean.FALSE, Boolean.TRUE}));
		
	}

	// WDEV-15709
	public String getMappingForResultStatusLookup(ResultStatus resultStatusInstance, TaxonomyType extSystem) 
	{
		if(resultStatusInstance == null || extSystem == null || extSystem.getText() == null)
			return null;
		
		String query = "select lm.extCode from LookupInstance as li left join li.mappings as lm where (li.id = :ResultStatusId and lm.extSystem = :TaxonomyType) ";
		
		List<?> list = getDomainFactory().find(query, new String[] {"ResultStatusId", "TaxonomyType"}, new Object[] {resultStatusInstance.getID(), extSystem.getText()});
		
		if(list != null && list.size() > 0)
		{
			if(list.get(0) instanceof String)
				return (String) list.get(0);
		}
		
		return null;
	}
}