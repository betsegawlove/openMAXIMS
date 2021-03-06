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
// This code was generated by George Cristian Josan using IMS Development Environment (version 1.80 build 5443.18271)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.core.domain.impl;

import ims.admin.domain.OrganisationAndLocation;
import ims.admin.domain.ServiceConfiguration;
import ims.admin.domain.impl.OrganisationAndLocationImpl;
import ims.admin.domain.impl.ServiceConfigurationImpl;
import ims.RefMan.domain.objects.CATSReferralStatus;
import ims.RefMan.domain.objects.CatsReferral;
import ims.RefMan.vo.CatsReferralRefVo;
import ims.RefMan.vo.lookups.ReferralApptStatus;
import ims.core.domain.base.impl.BasePendingEmergencyWorklistImpl;
import ims.core.patient.domain.objects.Patient;
import ims.core.resource.place.domain.objects.Location;
import ims.core.vo.CatsReferralPendingEmergencyNonEDAdmissionListVo;
import ims.core.vo.CatsReferralPendingEmergencyNonEDAdmissionListVoCollection;
import ims.core.vo.CatsReferralStatusWithHcpVo;
import ims.core.vo.LocationLiteVo;
import ims.core.vo.domain.CatsReferralPendingEmergencyNonEDAdmissionListVoAssembler;
import ims.core.vo.domain.CatsReferralRepatriationRequestVoAssembler;
import ims.core.vo.domain.CatsReferralStatusWithHcpVoAssembler;
import ims.core.vo.domain.LocationLiteVoAssembler;
import ims.core.vo.domain.MemberOfStaffLiteVoAssembler;
import ims.core.vo.domain.PatientShortAssembler;
import ims.core.vo.lookups.MedicGrade;
import ims.core.vo.lookups.PendingAdmissionStatus;
import ims.core.vo.lookups.ServiceCategory;
import ims.framework.interfaces.ILocation;
import ims.framework.utils.Date;

import java.util.ArrayList;
import java.util.List;


public class PendingEmergencyWorklistImpl extends BasePendingEmergencyWorklistImpl
{

	private static final long serialVersionUID = 1L;

	
	public ims.core.vo.CatsReferralPendingEmergencyNonEDAdmissionListVoCollection search(ims.core.vo.PendingEmergencyAdmissionWorklistSearchCriteriaVo searchCriteria)
	{
		StringBuilder query = new StringBuilder("SELECT referral, referralStatusHistory FROM CatsReferral AS referral ");
		query.append(" LEFT JOIN referral.patientCategory AS category ");
		query.append(" LEFT JOIN referral.repatriationRequest AS pendAdmit ");
		query.append(" LEFT JOIN referral.referralDetails AS referralDetails ");
		query.append(" LEFT JOIN referral.statusHistory AS referralStatusHistory ");
		query.append(" LEFT JOIN referralStatusHistory.referralStatus AS referralStatus ");
		query.append(" LEFT JOIN pendAdmit.type AS type ");
		query.append(" LEFT JOIN pendAdmit.transferReason AS transfer ");
		query.append(" LEFT JOIN pendAdmit.hospital AS hospital ");
		query.append(" LEFT JOIN pendAdmit.ward AS ward ");
		query.append(" LEFT JOIN pendAdmit.service AS service ");
		query.append(" LEFT JOIN pendAdmit.sourceOfEmergencyReferral AS sourceOfEmerReferral ");
		query.append(" LEFT JOIN pendAdmit.currentStatus AS admitStatus ");
		query.append(" LEFT JOIN admitStatus.status AS status ");
		
		
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		query.append("WHERE pendAdmit is not null AND status.id = :CREATED AND referralStatus.id = :ACCEPTED ");
		
		paramNames.add("ACCEPTED");
		paramValues.add(ReferralApptStatus.REFERRAL_ACCEPTED.getID());
		paramNames.add("CREATED");
		paramValues.add(PendingAdmissionStatus.CREATED.getID());
		
		if (searchCriteria != null)
		{
			if (searchCriteria.getType() != null)
			{
				query.append(" AND type.id = :TYPE_ID ");
				
				paramNames.add("TYPE_ID");
				paramValues.add(searchCriteria.getType().getID());
			}
			
			if (searchCriteria.getCategory() != null)
			{
				query.append(" AND category.id = :CATEGORY_ID ");
				
				paramNames.add("CATEGORY_ID");
				paramValues.add(searchCriteria.getCategory().getID());
			}
			
			if (searchCriteria.getTransferReason() != null)
			{
				query.append(" AND transfer.id = :TRANSFER_ID ");
				
				paramNames.add("TRANSFER_ID");
				paramValues.add(searchCriteria.getTransferReason().getID());
			}
			
			if (searchCriteria.getAcceptingConsultantIsNotNull())
			{
				query.append(" AND referralStatusHistory.authoringUser.id = :MOS_ID");
				paramNames.add("MOS_ID");
				paramValues.add(searchCriteria.getAcceptingConsultant().getIMosId());
			}
			
			if (searchCriteria.getHospital() != null)
			{
				query.append(" AND hospital.id = :HOSPITAL_ID ");
				
				paramNames.add("HOSPITAL_ID");
				paramValues.add(searchCriteria.getHospital().getID());
			}
			
			if (searchCriteria.getWard() != null)
			{
				query.append(" AND ward.id = :WARD_ID ");
				
				paramNames.add("WARD_ID");
				paramValues.add(searchCriteria.getWard().getID());
			}
			
			if (searchCriteria.getService() != null)
			{
				query.append(" AND service.id = :SERVICE_ID ");
				
				paramNames.add("SERVICE_ID");
				paramValues.add(searchCriteria.getService().getID_Service());
			}
			
			if (searchCriteria.getSourceOfReferral() != null)
			{
				query.append(" AND sourceOfEmerReferral.id = :SOURCE_OF_REFERRAL ");
				
				paramNames.add("SOURCE_OF_REFERRAL");
				paramValues.add(searchCriteria.getSourceOfReferral().getID());
			}
			
			if (searchCriteria.getAcceptingDateFrom() != null)
			{
				query.append(" AND referralStatusHistory.statusDateTime >= :DATE_REFERRAL_ACCEPTED_FROM ");
				
				paramNames.add("DATE_REFERRAL_ACCEPTED_FROM");
				paramValues.add(searchCriteria.getAcceptingDateFrom().getDate());
			}
			
			if (searchCriteria.getAcceptingDateTo() != null)
			{
				query.append(" AND referralStatusHistory.statusDateTime <= :DATE_REFERRAL_ACCEPTED_TO ");
				
				paramNames.add("DATE_REFERRAL_ACCEPTED_TO");
				Date acceptingDateTo =  new Date(searchCriteria.getAcceptingDateTo());
				paramValues.add(acceptingDateTo.addDay(1).getDate());
			}
			
			if (searchCriteria.getReferralDateFrom() != null)
			{
				query.append(" AND referralDetails.dateOfReferral >= :DATE_REFERRAL_FROM ");
				
				paramNames.add("DATE_REFERRAL_FROM");
				paramValues.add(searchCriteria.getReferralDateFrom().getDate());
			}
			
			if (searchCriteria.getReferralDateTo() != null)
			{
				query.append(" AND referralDetails.dateOfReferral <= :DATE_REFERRAL_TO ");
				
				paramNames.add("DATE_REFERRAL_TO");
				paramValues.add(searchCriteria.getReferralDateTo().getDate());
			}
		}
		

		List<?> results = getDomainFactory().find(query.toString(), paramNames, paramValues);
		
		if (results == null || results.size() == 0)
			return null;

		
		CatsReferralPendingEmergencyNonEDAdmissionListVoCollection pendingAdmissions = new CatsReferralPendingEmergencyNonEDAdmissionListVoCollection();

		for (int i = 0; i < results.size(); i++)
		{
			Object[] resultLine = (Object[]) results.get(i);
			
			if (resultLine[0] != null)
			{
				CatsReferralPendingEmergencyNonEDAdmissionListVo pendingAdmission = CatsReferralPendingEmergencyNonEDAdmissionListVoAssembler.create((CatsReferral) resultLine[0]);

				if (resultLine.length > 1 && resultLine[1] != null)
				{
					CatsReferralStatusWithHcpVo acceptedStatus = CatsReferralStatusWithHcpVoAssembler.create((CATSReferralStatus) resultLine[1]); 
					pendingAdmission.setAcceptedStatus(acceptedStatus);
				}
				
				pendingAdmissions.add(pendingAdmission);
			}
		}
		
		return pendingAdmissions;
	}


	public ims.core.vo.LocationLiteVoCollection listHospitals()
	{
		OrganisationAndLocation domainImpl = (OrganisationAndLocation) getDomainImpl(OrganisationAndLocationImpl.class);
		return domainImpl.listActiveHospitalsLite();
	}

	
	public ims.core.vo.LocationLiteVoCollection listWardsForHospital(ims.core.resource.place.vo.LocationRefVo hospital, String name)
	{
		OrganisationAndLocation domainImpl = (OrganisationAndLocation) getDomainImpl(OrganisationAndLocationImpl.class);
		return domainImpl.listActiveWardsForHospitalByNameLite(hospital, name);
	}


	public ims.core.vo.ServiceLiteVoCollection listServices(String name)
	{
		ServiceConfiguration domainImpl = (ServiceConfiguration) getDomainImpl(ServiceConfigurationImpl.class);
		return domainImpl.listServices(name, ServiceCategory.CLINICAL, null, true);
	}

	
	public ims.core.vo.MemberOfStaffLiteVoCollection listAcceptingConsultants(String name)
	{
		if (name == null || name.length() == 0)
			return null;
		
		StringBuilder query = new StringBuilder("SELECT mos FROM Medic AS medic LEFT JOIN medic.mos AS mos LEFT JOIN medic.grade AS grade ");
		query.append(" WHERE ");
		query.append(" grade.id = :CONSULTANT AND (mos.name.upperSurname LIKE :SURNAME OR mos.name.upperForename LIKE :FORENAME) ");
		query.append(" ORDER BY mos.name.upperSurname, mos.name.upperForename ");
		
		ArrayList<String> paramNames = new ArrayList<String>();
		ArrayList<Object> paramValues = new ArrayList<Object>();
		
		paramNames.add("CONSULTANT");		paramValues.add(MedicGrade.CONS.getID());
		paramNames.add("SURNAME");			paramValues.add("%" + name.toUpperCase() + "%");
		paramNames.add("FORENAME");			paramValues.add("%" + name.toUpperCase() + "%");

		return MemberOfStaffLiteVoAssembler.createMemberOfStaffLiteVoCollectionFromMemberOfStaff(getDomainFactory().find(query.toString(), paramNames, paramValues));
	}

	
	public ims.core.vo.PatientShort getPatient(ims.core.patient.vo.PatientRefVo patient)
	{
		if (patient == null || patient.getID_Patient() == null)
			return null;
		
		return PatientShortAssembler.create((Patient) getDomainFactory().getDomainObject(Patient.class, patient.getID_Patient()));
	}

	
	public ims.core.vo.CatsReferralRepatriationRequestVo getPendingEmergency(ims.RefMan.vo.CatsReferralRefVo catsReferral)
	{
		if (catsReferral == null || catsReferral.getID_CatsReferral() == null)
			return null;
		
		return CatsReferralRepatriationRequestVoAssembler.create((CatsReferral) getDomainFactory().getDomainObject(CatsReferral.class, catsReferral.getID_CatsReferral()));
	}


	public Boolean cancelPendingEmergencyAdmission(CatsReferralRefVo catsReferral)
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	//WDEV-22249
	public LocationLiteVo getCurrentHospital(ILocation iLoc)
	{
		OrganisationAndLocation impl = (OrganisationAndLocation) getDomainImpl(OrganisationAndLocationImpl.class);
		return impl.getHospitalLiteForLocation((ILocation) iLoc);
	}
	//WDEV-22710
	public LocationLiteVo getCurrentWard(ILocation iLocation)
	{
		if (iLocation == null)
			return null;
		return LocationLiteVoAssembler.create((Location) getDomainFactory().getDomainObject(Location.class, iLocation.getID()));			
	}
	//WDEV-22710 - end
}
