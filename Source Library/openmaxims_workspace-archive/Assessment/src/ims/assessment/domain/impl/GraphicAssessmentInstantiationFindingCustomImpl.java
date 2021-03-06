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
// This code was generated by Vasile Purdila using IMS Development Environment (version 1.45 build 2446.19845)
// Copyright (C) 1995-2006 IMS MAXIMS plc. All rights reserved.

package ims.assessment.domain.impl;

import ims.admin.domain.HcpAdmin;
import ims.admin.domain.impl.HcpAdminImpl;
import ims.assessment.domain.base.impl.BaseGraphicAssessmentInstantiationFindingCustomImpl;

public class GraphicAssessmentInstantiationFindingCustomImpl extends BaseGraphicAssessmentInstantiationFindingCustomImpl
{

	private static final long serialVersionUID = 1L;

	/**
	* List HCP's based on filter HCP passed in
	*/
	public ims.core.vo.HcpLiteVoCollection listHCPs(String name)
	{
		HcpAdmin implHcpAdmin = (HcpAdmin)getDomainImpl(HcpAdminImpl.class);
		return implHcpAdmin.listHcpLiteByName(name);
	}
}
