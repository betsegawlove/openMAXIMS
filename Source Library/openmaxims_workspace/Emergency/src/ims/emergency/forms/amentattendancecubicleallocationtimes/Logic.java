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
// This code was generated by Cristian Belciug using IMS Development Environment (version 1.80 build 5127.24028)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.

package ims.emergency.forms.amentattendancecubicleallocationtimes;

import java.util.ArrayList;
import java.util.List;

import ims.configuration.gen.ConfigFlag;
import ims.core.vo.CubicleAllocationForAmendTimesVo;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.DialogResult;
import ims.framework.utils.DateTime;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}
	
	private void open()
	{
		form.getLocalContext().setCurrentRecord(domain.get(form.getGlobalContext().Emergency.getAmendAttendanceCubicleAllocationTimes()));
		
		if(form.getLocalContext().getCurrentRecord() == null)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			engine.close(DialogResult.ABORT);
		}
		
		populateScreenFromData(form.getLocalContext().getCurrentRecord());
	}
	
	private void populateScreenFromData(CubicleAllocationForAmendTimesVo cubicleAllocationForAmendTimesVo)
	{
		clearScreen();
		
		if(cubicleAllocationForAmendTimesVo == null)
			return;
		
		form.txtAllocatedBy().setValue(cubicleAllocationForAmendTimesVo.getAllocatedBy() != null ? cubicleAllocationForAmendTimesVo.getAllocatedBy().getIMosName() : null);
		form.txtCubicle().setValue(cubicleAllocationForAmendTimesVo.getCubicleRoomBed() != null ? cubicleAllocationForAmendTimesVo.getCubicleRoomBed().getCubicleRoomBedName() : null);
		
		form.dtimAllocated().setValue(cubicleAllocationForAmendTimesVo.getAllocatedCubicleDateTime());
	}

	private void clearScreen()
	{
		form.txtAllocatedBy().setValue(null);
		form.txtCubicle().setValue(null);
		form.dtimAllocated().setValue(null);
	}

	
	@Override
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	
	@Override
	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(save())
			engine.close(DialogResult.OK);
	}
	
	private boolean save()
	{
		CubicleAllocationForAmendTimesVo record = populateDataFromScreen(form.getLocalContext().getCurrentRecord());
		
		String[] errors = validateUIRules();
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}
		
		errors = record.validate();
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}
		
		try
		{
			domain.save(record);
		}
		catch (StaleObjectException e)
		{
			e.printStackTrace();
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			engine.close(DialogResult.ABORT);
			return false;
		}
		
		return true;
	}

	private String[] validateUIRules()
	{
		List<String> uiErrors = new ArrayList<String>();
		DateTime registrationDateTime = form.getGlobalContext().Emergency.getEmergencyAttendanceForTimeAmendments().getRegistrationDateTime();
		DateTime dischargeDatetime = form.getGlobalContext().Emergency.getEmergencyAttendanceForTimeAmendments().getDischargeDateTime();
		
		if(form.dtimAllocated().isEnabled() && form.dtimAllocated().getValue() == null)
		{
			uiErrors.add("Allocated Date is mandatory.");
		}
		
		if (form.dtimAllocated().getValue() != null && form.dtimAllocated().getValue().isGreaterThan(new DateTime()))
		{
			uiErrors.add("Allocated Date cannot be set in the future.");
		}
		
		if (form.dtimAllocated().getValue() != null && registrationDateTime != null && form.dtimAllocated().getValue().isLessThan(registrationDateTime))
		{
			uiErrors.add("Allocated Date cannot be less than Registration Start Time.");
		}
		if(form.dtimAllocated().getValue() != null && dischargeDatetime != null && form.dtimAllocated().getValue().isGreaterThan(dischargeDatetime))
		{
			uiErrors.add("Allocated Date cannot be greater than Departed Date/Time.");
		}
		
		String[] uiResults = new String[uiErrors.size()];
		uiErrors.toArray(uiResults);
		
		return uiResults;
	}

	private CubicleAllocationForAmendTimesVo populateDataFromScreen(CubicleAllocationForAmendTimesVo currentRecord)
	{
		if(currentRecord == null)
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			engine.close(DialogResult.ABORT);
		}
		
		currentRecord.setAllocatedCubicleDateTime(form.dtimAllocated().getValue());
		
		return currentRecord;
	}
}
