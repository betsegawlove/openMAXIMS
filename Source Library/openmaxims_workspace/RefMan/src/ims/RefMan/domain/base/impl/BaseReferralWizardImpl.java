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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BaseReferralWizardImpl extends DomainImpl implements ims.RefMan.domain.ReferralWizard, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validategetCatsReferral(ims.RefMan.vo.CatsReferralRefVo voCatsRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveCatsReferral(ims.RefMan.vo.CatsReferralWizardVo record)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPatient(ims.core.patient.vo.PatientRefVo patient)
	{
	}

	@SuppressWarnings("unused")
	public void validategetHcpLiteById(ims.core.resource.people.vo.HcpRefVo refId)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveCareSpellAndReferralDetails(ims.RefMan.vo.CatsReferralWizardVo referVo, ims.core.vo.CareSpellVo voCareSpell, Boolean bDiagnosticReferral)
	{
	}

	@SuppressWarnings("unused")
	public void validategetServiceById(ims.core.vo.ServiceVo voService)
	{
	}

	@SuppressWarnings("unused")
	public void validategetPatientsGp(Integer idPatient)
	{
	}

	@SuppressWarnings("unused")
	public void validatepukkaJMessaging(ims.RefMan.domain.objects.CatsReferral doCatsReferral, Boolean isCreateOrder)
	{
		if(doCatsReferral == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'doCatsReferral' of type 'ims.RefMan.domain.objects.CatsReferral' cannot be null.");
		if(isCreateOrder == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'isCreateOrder' of type 'Boolean' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validategetCareContext(ims.core.admin.vo.CareContextRefVo careContextRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatecheck62dayTarget(ims.RefMan.vo.CatsReferralWizardVo referral, ims.RefMan.vo.lookups.ReferralUrgency prevReferralUrgency, ims.RefMan.vo.lookups.CancerType prevCancerType)
	{
		if(referral == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'referral' of type 'ims.RefMan.vo.CatsReferralWizardVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatehasLocationDiagnosicContracts(ims.core.resource.place.vo.LocationRefVo location)
	{
	}

	@SuppressWarnings("unused")
	public void validategetEndDateKPI(ims.RefMan.vo.CatsReferralWizardVo catsReferral)
	{
	}
}
