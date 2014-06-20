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

package ims.scheduling.forms.patientappointmentmanagement;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Core = new CoreContext(context);
		RefMan = new RefManContext(context);
		Scheduling = new SchedulingContext(context);
		ChooseAndBook = new ChooseAndBookContext(context);
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
		}
		public void setPatientShort(ims.core.vo.PatientShort value)
		{
			cx_CorePatientShort.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CorePatientShort = new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort");

		private ims.framework.Context context;
	}
	public final class RefManContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RefManContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getCatsReferralIsNotNull()
		{
			return !cx_RefManCatsReferral.getValueIsNull(context);
		}
		public ims.RefMan.vo.CatsReferralRefVo getCatsReferral()
		{
			return (ims.RefMan.vo.CatsReferralRefVo)cx_RefManCatsReferral.getValue(context);
		}
		public void setCatsReferral(ims.RefMan.vo.CatsReferralRefVo value)
		{
			cx_RefManCatsReferral.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManCatsReferral = new ims.framework.ContextVariable("RefMan.CatsReferral", "_cvp_RefMan.CatsReferral");
		public boolean getCurrentStatusIsNotNull()
		{
			return !cx_RefManCurrentStatus.getValueIsNull(context);
		}
		public ims.scheduling.vo.lookups.Status_Reason getCurrentStatus()
		{
			return (ims.scheduling.vo.lookups.Status_Reason)cx_RefManCurrentStatus.getValue(context);
		}
		public void setCurrentStatus(ims.scheduling.vo.lookups.Status_Reason value)
		{
			cx_RefManCurrentStatus.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManCurrentStatus = new ims.framework.ContextVariable("RefMan.CurrentStatus", "_cv_RefMan.CurrentStatus");
		public boolean getChosenStatusIsNotNull()
		{
			return !cx_RefManChosenStatus.getValueIsNull(context);
		}
		public ims.scheduling.vo.lookups.Status_Reason getChosenStatus()
		{
			return (ims.scheduling.vo.lookups.Status_Reason)cx_RefManChosenStatus.getValue(context);
		}
		public void setChosenStatus(ims.scheduling.vo.lookups.Status_Reason value)
		{
			cx_RefManChosenStatus.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManChosenStatus = new ims.framework.ContextVariable("RefMan.ChosenStatus", "_cv_RefMan.ChosenStatus");
		public boolean getReferralContractTypeForPatientIsNotNull()
		{
			return !cx_RefManReferralContractTypeForPatient.getValueIsNull(context);
		}
		public ims.core.vo.lookups.ReferralManagementContractType getReferralContractTypeForPatient()
		{
			return (ims.core.vo.lookups.ReferralManagementContractType)cx_RefManReferralContractTypeForPatient.getValue(context);
		}
		public void setReferralContractTypeForPatient(ims.core.vo.lookups.ReferralManagementContractType value)
		{
			cx_RefManReferralContractTypeForPatient.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManReferralContractTypeForPatient = new ims.framework.ContextVariable("RefMan.ReferralContractTypeForPatient", "_cvp_RefMan.ReferralContractTypeForPatient");
		public boolean getCatsReferralStatusIsNotNull()
		{
			return !cx_RefManCatsReferralStatus.getValueIsNull(context);
		}
		public ims.RefMan.vo.CatsReferralStatusVo getCatsReferralStatus()
		{
			return (ims.RefMan.vo.CatsReferralStatusVo)cx_RefManCatsReferralStatus.getValue(context);
		}
		public void setCatsReferralStatus(ims.RefMan.vo.CatsReferralStatusVo value)
		{
			cx_RefManCatsReferralStatus.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManCatsReferralStatus = new ims.framework.ContextVariable("RefMan.CatsReferralStatus", "_cv_RefMan.CatsReferralStatus");

		private ims.framework.Context context;
	}
	public final class SchedulingContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private SchedulingContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getBookingSessionIsNotNull()
		{
			return !cx_SchedulingBookingSession.getValueIsNull(context);
		}
		public ims.scheduling.vo.Sch_SessionRefVo getBookingSession()
		{
			return (ims.scheduling.vo.Sch_SessionRefVo)cx_SchedulingBookingSession.getValue(context);
		}
		public void setBookingSession(ims.scheduling.vo.Sch_SessionRefVo value)
		{
			cx_SchedulingBookingSession.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingBookingSession = new ims.framework.ContextVariable("Scheduling.BookingSession", "_cv_Scheduling.BookingSession");
		public boolean getApptCancelStatusIsNotNull()
		{
			return !cx_SchedulingApptCancelStatus.getValueIsNull(context);
		}
		public ims.scheduling.vo.Appointment_StatusVo getApptCancelStatus()
		{
			return (ims.scheduling.vo.Appointment_StatusVo)cx_SchedulingApptCancelStatus.getValue(context);
		}
		public void setApptCancelStatus(ims.scheduling.vo.Appointment_StatusVo value)
		{
			cx_SchedulingApptCancelStatus.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingApptCancelStatus = new ims.framework.ContextVariable("Scheduling.ApptCancelStatus", "_cv_Scheduling.ApptCancelStatus");
		public boolean getBookingAppointmentIsNotNull()
		{
			return !cx_SchedulingBookingAppointment.getValueIsNull(context);
		}
		public ims.scheduling.vo.Booking_AppointmentVo getBookingAppointment()
		{
			return (ims.scheduling.vo.Booking_AppointmentVo)cx_SchedulingBookingAppointment.getValue(context);
		}
		public void setBookingAppointment(ims.scheduling.vo.Booking_AppointmentVo value)
		{
			cx_SchedulingBookingAppointment.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingBookingAppointment = new ims.framework.ContextVariable("Scheduling.BookingAppointment", "_cv_Scheduling.BookingAppointment");
		public boolean getBookingAppointmentRefIsNotNull()
		{
			return !cx_SchedulingBookingAppointmentRef.getValueIsNull(context);
		}
		public ims.scheduling.vo.Booking_AppointmentRefVo getBookingAppointmentRef()
		{
			return (ims.scheduling.vo.Booking_AppointmentRefVo)cx_SchedulingBookingAppointmentRef.getValue(context);
		}
		public void setBookingAppointmentRef(ims.scheduling.vo.Booking_AppointmentRefVo value)
		{
			cx_SchedulingBookingAppointmentRef.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingBookingAppointmentRef = new ims.framework.ContextVariable("Scheduling.BookingAppointmentRef", "_cv_Scheduling.BookingAppointmentRef");
		public boolean getBookingActivityIsNotNull()
		{
			return !cx_SchedulingBookingActivity.getValueIsNull(context);
		}
		public ims.core.resource.place.vo.ActivityRefVo getBookingActivity()
		{
			return (ims.core.resource.place.vo.ActivityRefVo)cx_SchedulingBookingActivity.getValue(context);
		}
		public void setBookingActivity(ims.core.resource.place.vo.ActivityRefVo value)
		{
			cx_SchedulingBookingActivity.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingBookingActivity = new ims.framework.ContextVariable("Scheduling.BookingActivity", "_cv_Scheduling.BookingActivity");
		public boolean getBookingServiceIsNotNull()
		{
			return !cx_SchedulingBookingService.getValueIsNull(context);
		}
		public ims.core.clinical.vo.ServiceRefVo getBookingService()
		{
			return (ims.core.clinical.vo.ServiceRefVo)cx_SchedulingBookingService.getValue(context);
		}
		public void setBookingService(ims.core.clinical.vo.ServiceRefVo value)
		{
			cx_SchedulingBookingService.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingBookingService = new ims.framework.ContextVariable("Scheduling.BookingService", "_cv_Scheduling.BookingService");

		private ims.framework.Context context;
	}
	public final class ChooseAndBookContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private ChooseAndBookContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getisCABApptIsNotNull()
		{
			return !cx_ChooseAndBookisCABAppt.getValueIsNull(context);
		}
		public Boolean getisCABAppt()
		{
			return (Boolean)cx_ChooseAndBookisCABAppt.getValue(context);
		}
		public void setisCABAppt(Boolean value)
		{
			cx_ChooseAndBookisCABAppt.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ChooseAndBookisCABAppt = new ims.framework.ContextVariable("ChooseAndBook.isCABAppt", "_cv_ChooseAndBook.isCABAppt");

		private ims.framework.Context context;
	}

	public CoreContext Core;
	public RefManContext RefMan;
	public SchedulingContext Scheduling;
	public ChooseAndBookContext ChooseAndBook;
}
