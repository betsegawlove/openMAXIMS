//#############################################################################
//#                                                                           #
//#  Copyright (C) <2015>  <IMS MAXIMS>                                       #
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
//#  IMS MAXIMS provides absolutely NO GUARANTEE OF THE CLINICAL SAFTEY of    #
//#  this program.  Users of this software do so entirely at their own risk.  #
//#  IMS MAXIMS only ensures the Clinical Safety of unaltered run-time        #
//#  software that it builds, deploys and maintains.                          #
//#                                                                           #
//#############################################################################
//#EOH
// This code was generated by Alexie Ursache using IMS Development Environment (version 1.45 build 2393.21546)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.ocrr.domain.impl;

import ims.admin.domain.MosAdmin;
import ims.admin.domain.impl.MosAdminImpl;
import ims.core.domain.Demographics;
import ims.core.domain.PatientSearch;
import ims.core.domain.impl.DemographicsImpl;
import ims.core.domain.impl.PatientSearchImpl;
import ims.core.vo.MemberOfStaffShortVo;
import ims.core.vo.MemberOfStaffShortVoCollection;
import ims.core.vo.Patient;
import ims.core.vo.PatientShort;
import ims.domain.DomainFactory;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.exceptions.CodingRuntimeException;
import ims.ocrr.domain.base.impl.BaseSpecimenCollectionClinicImpl;
import ims.ocrr.orderingresults.domain.objects.OrderInvestigation;
import ims.ocrr.orderingresults.domain.objects.SpecimenWorkListItem;
import ims.ocrr.vo.SpecimenWorkListItemListVo;
import ims.ocrr.vo.SpecimenWorkListItemListVoCollection;
import ims.ocrr.vo.domain.SpecimenWorkListItemListVoAssembler;
import ims.ocrr.vo.lookups.OcsDisplayFlag;
import ims.ocrr.vo.lookups.SpecimenCollectionMethod;
import ims.ocrr.vo.lookups.SpecimenCollectionStatus;

import java.util.ArrayList;
import java.util.List;

public class SpecimenCollectionClinicImpl extends BaseSpecimenCollectionClinicImpl
{
	/**
	 * searchPatients
	 */
	public ims.core.vo.PatientShortCollection searchPatients(ims.core.vo.PatientFilter filter) throws ims.domain.exceptions.DomainInterfaceException
	{
		PatientSearch patientSearch = (PatientSearch) getDomainImpl(PatientSearchImpl.class);
		return patientSearch.searchPatients(filter);
	}
	
	public SpecimenWorkListItemListVoCollection listWorkListItems(Integer patientId, SpecimenCollectionMethod listType, SpecimenCollectionStatus status)
	{
		if (patientId == null)
			throw new CodingRuntimeException("Cannot get  SpecimenWorkListItem for null patientId");

		if (listType == null)
			throw new CodingRuntimeException("Cannot get  SpecimenWorkListItem for null ListType");
		
		ArrayList markers = new ArrayList();
		ArrayList values  = new ArrayList();
		
		StringBuffer hql = new StringBuffer(" select sp from SpecimenWorkListItem as sp left join sp.specimen as spec left join spec.order as ord left join ord.patient as pat left join sp.dFTOrderInvestigation as dft left join dft.orderDetails as dftDetails left join dftDetails.patient as dftPat");
		String sqlClause = " where ";
		
		if(patientId != null)
		{
			hql.append(sqlClause);
			hql.append("((spec is not null and pat.id = :PATID) OR (spec is null and dftPat.id = :PATID))");
			markers.add("PATID");
			values.add(patientId);
			sqlClause = " and ";
		}
		
		if(listType != null)
		{
			hql.append(sqlClause);
			hql.append(" sp.listType = :LT");
			markers.add("LT");
			values.add(getDomLookup(listType));
			sqlClause = " and ";
		}
		
		if(status != null)
		{
			hql.append(sqlClause);
			hql.append(" sp.collectionStatus = :STID");
			markers.add("STID");
			values.add(getDomLookup(status));
		} 
		else
		{
			//WDEV-12906
			hql.append(sqlClause);
			hql.append(" ( sp.collectionStatus != :STATUS and sp.collectionStatus != :STATUS2 ) ");
			markers.add("STATUS");
			values.add(getDomLookup(SpecimenCollectionStatus.AWAITING_AUTHORISATION));
			markers.add("STATUS2");
			values.add(getDomLookup(SpecimenCollectionStatus.CANCELLED));
		}
		
		List list = getDomainFactory().find(hql.toString(), markers, values);
		
		return SpecimenWorkListItemListVoAssembler.createSpecimenWorkListItemListVoCollectionFromSpecimenWorkListItem(list).sort();
	}

	public SpecimenWorkListItemListVo getWorkListItem(Integer workListItemId)
	{
		if(workListItemId == null)
			throw new CodingRuntimeException("Cannot get SpecimenWorkListItemListVo for null id");
		
		DomainFactory factory = getDomainFactory();
		SpecimenWorkListItem doSpecimenWorkListItem = (SpecimenWorkListItem) factory.getDomainObject(SpecimenWorkListItem.class, workListItemId);
		return SpecimenWorkListItemListVoAssembler.create(doSpecimenWorkListItem);		
	}

	public SpecimenWorkListItemListVo saveWorkListItem(SpecimenWorkListItemListVo orderSpecimenVo) throws StaleObjectException
	{
		if(orderSpecimenVo == null)
			throw new CodingRuntimeException("Cannot save null SpecimenWorkListItemListVo");
		
		DomainFactory factory = getDomainFactory();
		SpecimenWorkListItem doSpecimenWorkListItem = SpecimenWorkListItemListVoAssembler.extractSpecimenWorkListItem(factory, orderSpecimenVo);
		
		if(orderSpecimenVo.getCollectionStatusIsNotNull() && orderSpecimenVo.getCollectionStatus().equals(SpecimenCollectionStatus.COLLECTIONCOMPLETE) && doSpecimenWorkListItem.getSpecimen() != null)
		{
			java.util.Set investigations = doSpecimenWorkListItem.getSpecimen().getInvestigations();
			for (java.util.Iterator iter = investigations.iterator(); iter.hasNext();)
			{
				Object obj = iter.next();
				if (obj instanceof OrderInvestigation)
				{
					OrderInvestigation element = (OrderInvestigation) obj;
					element.setDisplayDateTime(orderSpecimenVo.getSpecimen().getCollDateTimePlacer().getJavaDate());
					element.setDisplayFlag(getDomLookup(OcsDisplayFlag.SPEC_COLL));
				}
			}
		}
		
		factory.save(doSpecimenWorkListItem);
		return SpecimenWorkListItemListVoAssembler.create(doSpecimenWorkListItem);
	}

	public MemberOfStaffShortVoCollection listMembersOfStaff(MemberOfStaffShortVo filter)
	{
		MosAdmin adminImpl = (MosAdmin) getDomainImpl(MosAdminImpl.class);
		return adminImpl.listMembersOfStaff(filter);
	}

	public Patient getPatient(PatientShort voPatShort) throws StaleObjectException
	{
		Demographics impl = (Demographics) getDomainImpl(DemographicsImpl.class);
		return impl.getPatient(voPatShort);
	}
}
