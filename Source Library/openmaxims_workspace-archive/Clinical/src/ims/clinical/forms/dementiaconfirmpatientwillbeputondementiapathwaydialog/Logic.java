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
// This code was generated by Ancuta Ciubotaru using IMS Development Environment (version 1.80 build 4696.13908)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.clinical.forms.dementiaconfirmpatientwillbeputondementiapathwaydialog;

import ims.clinical.vo.DementiaForWorklistVo;
import ims.clinical.vo.DementiaVo;
import ims.clinical.vo.DementiaWorklistStatusVo;
import ims.clinical.vo.DementiaWorklistStatusVoCollection;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.AuthoringInformationVo;
import ims.core.vo.HcpLiteVo;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.DialogResult;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.DateTime;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(save())
			engine.close(DialogResult.OK);
	}
	private DementiaVo populateDataFromScreen(DementiaVo dementiaVo)
	{
		dementiaVo.setConfirmedPatientPutOnDementiaPathway(Boolean.TRUE);
					
		return dementiaVo;
	}
	private boolean save() 
	{
		// TODO Auto-generated method stub
		if(form.getLocalContext().getselectedDementiaIsNotNull())
		{
			DementiaVo dementiaToSave = populateDataFromScreen((DementiaVo) form.getLocalContext().getselectedDementia().clone());		

			String[] errors = null;//dementiaToSave.validate(getUIErrors());
			if (errors != null && errors.length > 0)
			{
				engine.showErrors(errors);
				return false;
			}
			try
			{
				domain.saveDementia(dementiaToSave);
			}
			catch (StaleObjectException e)
			{
				engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
				engine.close(DialogResult.CANCEL);
				return false;
			}
		}
		return true;
	}

	
	protected void onFormOpen(Object[] args) throws PresentationLogicException 
	{
		if (args != null)
		{
			if (args.length == 1 && args[0] != null && args[0] instanceof DementiaForWorklistVo)
				form.getLocalContext().setselectedDementia(domain.getDementia((DementiaForWorklistVo) args[0]));			
		}		
	}

}
