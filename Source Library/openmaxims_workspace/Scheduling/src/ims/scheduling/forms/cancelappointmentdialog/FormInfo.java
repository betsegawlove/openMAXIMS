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

package ims.scheduling.forms.cancelappointmentdialog;

public final class FormInfo extends ims.framework.FormInfo
{
	private static final long serialVersionUID = 1L;
	public FormInfo(Integer formId)
	{
		super(formId);
	}
	public String getNamespaceName()
	{
		return "Scheduling";
	}
	public String getFormName()
	{
		return "CancelAppointmentDialog";
	}
	public int getWidth()
	{
		return 520;
	}
	public int getHeight()
	{
		return 280;
	}
	public String[] getContextVariables()
	{
		return new String[] { "_cv_Scheduling.BookingActivity", "_cv_Scheduling.BookingService", "_cv_Scheduling.ApptCancelStatus", "_cv_Scheduling.BookingAppointment", "_cv_ChooseAndBook.isCABAppt", "_cv_RefMan.CatsReferralStatus", "_cv_Scheduling.BookingSession", "_cv_Scheduling.BookingAppointmentRef", "_cv_RefMan.CatsReferralStatusHistory" };
	}
	public String getLocalVariablesPrefix()
	{
		return "_lv_Scheduling.CancelAppointmentDialog.__internal_x_context__" + String.valueOf(getFormId());
	}
	public ims.framework.FormInfo[] getComponentsFormInfo()
	{
		ims.framework.FormInfo[] componentsInfo = new ims.framework.FormInfo[0];
		return componentsInfo;
	}
	public String getImagePath()
	{
		return "Images/Core/appointment_cancel_48.png";
	}
}
