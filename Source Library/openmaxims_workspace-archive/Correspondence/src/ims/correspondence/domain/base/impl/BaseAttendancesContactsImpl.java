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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.correspondence.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BaseAttendancesContactsImpl extends DomainImpl implements ims.correspondence.domain.AttendancesContacts, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validatelistPASContacts(ims.core.vo.PatientShort patient)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPasEvent(ims.core.admin.pas.vo.PASEventRefVo voPasEventRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetCorrespondenceDetails(ims.correspondence.vo.CorrespondenceDetailsRefVo voCorrespDetRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPatient(ims.core.vo.PatientShort voFilter)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveCorrespondenceDetails(ims.correspondence.vo.CorrespondenceDetailsVo voCorrespDet, ims.vo.LookupInstVo pasEventType)
	{
	}

	@SuppressWarnings("unused")
	public void validategetCorrespondenceDetailsByPasEvent(ims.core.admin.pas.vo.PASEventRefVo voPasEventRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPasEvent(ims.core.patient.vo.PatientRefVo voPatienRef, String pasEventId)
	{
	}

	@SuppressWarnings("unused")
	public void validatecreatePasEvent(ims.framework.utils.DateTime eventDateTime, ims.core.patient.vo.PatientRefVo voRefPatient, ims.correspondence.vo.PasContactVo voPasContact)
	{
	}

	@SuppressWarnings("unused")
	public void validategetFullUserAccessForUser(Integer appUserID)
	{
	}
}