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

package ims.clinical.forms.cliniclistwithicpactions;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Scheduling = new SchedulingContext(context);
		RefMan = new RefManContext(context);
		Core = new CoreContext(context);
		ICP = new ICPContext(context);
	}
	public final class SchedulingContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private SchedulingContext(ims.framework.Context context)
		{
			this.context = context;

		}

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

		private ims.framework.Context context;
	}
	public final class RefManContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RefManContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getDayCaseAdmApptDateIsNotNull()
		{
			return !cx_RefManDayCaseAdmApptDate.getValueIsNull(context);
		}
		public ims.framework.utils.Date getDayCaseAdmApptDate()
		{
			return (ims.framework.utils.Date)cx_RefManDayCaseAdmApptDate.getValue(context);
		}
		public void setDayCaseAdmApptDate(ims.framework.utils.Date value)
		{
			cx_RefManDayCaseAdmApptDate.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManDayCaseAdmApptDate = new ims.framework.ContextVariable("RefMan.DayCaseAdmApptDate", "_cv_RefMan.DayCaseAdmApptDate");
		public boolean getDayCaseAdmApptTimeIsNotNull()
		{
			return !cx_RefManDayCaseAdmApptTime.getValueIsNull(context);
		}
		public String getDayCaseAdmApptTime()
		{
			return (String)cx_RefManDayCaseAdmApptTime.getValue(context);
		}
		public void setDayCaseAdmApptTime(String value)
		{
			cx_RefManDayCaseAdmApptTime.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManDayCaseAdmApptTime = new ims.framework.ContextVariable("RefMan.DayCaseAdmApptTime", "_cv_RefMan.DayCaseAdmApptTime");
		public boolean getDayCaseAdmClinicNameIsNotNull()
		{
			return !cx_RefManDayCaseAdmClinicName.getValueIsNull(context);
		}
		public String getDayCaseAdmClinicName()
		{
			return (String)cx_RefManDayCaseAdmClinicName.getValue(context);
		}
		public void setDayCaseAdmClinicName(String value)
		{
			cx_RefManDayCaseAdmClinicName.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManDayCaseAdmClinicName = new ims.framework.ContextVariable("RefMan.DayCaseAdmClinicName", "_cv_RefMan.DayCaseAdmClinicName");
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
		public boolean getChosenTimeIsNotNull()
		{
			return !cx_RefManChosenTime.getValueIsNull(context);
		}
		public ims.framework.utils.Time getChosenTime()
		{
			return (ims.framework.utils.Time)cx_RefManChosenTime.getValue(context);
		}
		public void setChosenTime(ims.framework.utils.Time value)
		{
			cx_RefManChosenTime.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManChosenTime = new ims.framework.ContextVariable("RefMan.ChosenTime", "_cv_RefMan.ChosenTime");

		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getHospitalLocIsNotNull()
		{
			return !cx_CoreHospitalLoc.getValueIsNull(context);
		}
		public ims.core.vo.LocShortVo getHospitalLoc()
		{
			return (ims.core.vo.LocShortVo)cx_CoreHospitalLoc.getValue(context);
		}
		public void setHospitalLoc(ims.core.vo.LocShortVo value)
		{
			cx_CoreHospitalLoc.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreHospitalLoc = new ims.framework.ContextVariable("Core.HospitalLoc", "_cv_Core.HospitalLoc");
		public boolean getSelectingPatientFormIsNotNull()
		{
			return !cx_CoreSelectingPatientForm.getValueIsNull(context);
		}
		public ims.framework.FormName getSelectingPatientForm()
		{
			return (ims.framework.FormName)cx_CoreSelectingPatientForm.getValue(context);
		}
		public void setSelectingPatientForm(ims.framework.FormName value)
		{
			cx_CoreSelectingPatientForm.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreSelectingPatientForm = new ims.framework.ContextVariable("Core.SelectingPatientForm", "_cvp_Core.SelectingPatientForm");
		public boolean getSelectedLocationForOrderingIsNotNull()
		{
			return !cx_CoreSelectedLocationForOrdering.getValueIsNull(context);
		}
		public ims.core.vo.LocShortVo getSelectedLocationForOrdering()
		{
			return (ims.core.vo.LocShortVo)cx_CoreSelectedLocationForOrdering.getValue(context);
		}
		public void setSelectedLocationForOrdering(ims.core.vo.LocShortVo value)
		{
			cx_CoreSelectedLocationForOrdering.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreSelectedLocationForOrdering = new ims.framework.ContextVariable("Core.SelectedLocationForOrdering", "_cv_Core.SelectedLocationForOrdering");
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
		public boolean getCurrentCareContextIsNotNull()
		{
			return !cx_CoreCurrentCareContext.getValueIsNull(context);
		}
		public ims.core.vo.CareContextShortVo getCurrentCareContext()
		{
			return (ims.core.vo.CareContextShortVo)cx_CoreCurrentCareContext.getValue(context);
		}
		public void setCurrentCareContext(ims.core.vo.CareContextShortVo value)
		{
			cx_CoreCurrentCareContext.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreCurrentCareContext = new ims.framework.ContextVariable("Core.CurrentCareContext", "_cvp_Core.CurrentCareContext");

		private ims.framework.Context context;
	}
	public final class ICPContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private ICPContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getPatientICPRecordIsNotNull()
		{
			return !cx_ICPPatientICPRecord.getValueIsNull(context);
		}
		public ims.icps.instantiation.vo.PatientICPRefVo getPatientICPRecord()
		{
			return (ims.icps.instantiation.vo.PatientICPRefVo)cx_ICPPatientICPRecord.getValue(context);
		}
		public void setPatientICPRecord(ims.icps.instantiation.vo.PatientICPRefVo value)
		{
			cx_ICPPatientICPRecord.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_ICPPatientICPRecord = new ims.framework.ContextVariable("ICP.PatientICPRecord", "_cv_ICP.PatientICPRecord");

		private ims.framework.Context context;
	}
	public boolean getUKSHOutPatientWardViewSearchCriteriaIsNotNull()
	{
		return !cx_UKSHOutPatientWardViewSearchCriteria.getValueIsNull(context);
	}
	public ims.core.vo.IPandOPSearchCriteriaVo getUKSHOutPatientWardViewSearchCriteria()
	{
		return (ims.core.vo.IPandOPSearchCriteriaVo)cx_UKSHOutPatientWardViewSearchCriteria.getValue(context);
	}
		public void setUKSHOutPatientWardViewSearchCriteria(ims.core.vo.IPandOPSearchCriteriaVo value)
		{
		cx_UKSHOutPatientWardViewSearchCriteria.setValue(context, value);
		}

	private ims.framework.ContextVariable cx_UKSHOutPatientWardViewSearchCriteria = new ims.framework.ContextVariable("UKSHOutPatientWardViewSearchCriteria", "_cvp_UKSHOutPatientWardViewSearchCriteria");

	public SchedulingContext Scheduling;
	public RefManContext RefMan;
	public CoreContext Core;
	public ICPContext ICP;
}
