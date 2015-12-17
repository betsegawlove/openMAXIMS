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

package ims.core.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BaseSupportNetworkCommunityServicesImpl extends DomainImpl implements ims.core.domain.SupportNetworkCommunityServices, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validatelistSupportNetworkServiceByPatient(ims.core.vo.PatientShort voPatientShort, Boolean activeOnly)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveCommunitService(ims.core.vo.CommunityServiceVo communityService)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistCommunityServicesByCareContext(ims.core.admin.vo.CareContextRefVo voCareContextRef, Boolean activeOnly)
	{
	}

	@SuppressWarnings("unused")
	public void validategetLocationService(ims.core.vo.LocShortVo locShort, ims.core.clinical.vo.ServiceRefVo service)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistService(ims.core.vo.lookups.ServiceCategoryCollection excludedServices)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistLocations(ims.core.clinical.vo.ServiceRefVo service)
	{
	}
}