// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.dischargesummarywardpacu;

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
		Rotherham = new RotherhamContext(context);
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

		private ims.framework.ContextVariable cx_RefManCatsReferral = new ims.framework.ContextVariable("RefMan.CatsReferral", "_cvp_RefMan.CatsReferral");
		public boolean getPatientMedicationIsNotNull()
		{
			return !cx_RefManPatientMedication.getValueIsNull(context);
		}
		public ims.core.vo.PatientMedicationVo getPatientMedication()
		{
			return (ims.core.vo.PatientMedicationVo)cx_RefManPatientMedication.getValue(context);
		}
		public void setPatientMedication(ims.core.vo.PatientMedicationVo value)
		{
			cx_RefManPatientMedication.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManPatientMedication = new ims.framework.ContextVariable("RefMan.PatientMedication", "_cv_RefMan.PatientMedication");
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

		public boolean getTheatreTypeIsNotNull()
		{
			return !cx_SchedulingTheatreType.getValueIsNull(context);
		}
		public ims.scheduling.vo.lookups.TheatreType getTheatreType()
		{
			return (ims.scheduling.vo.lookups.TheatreType)cx_SchedulingTheatreType.getValue(context);
		}
		public void setTheatreType(ims.scheduling.vo.lookups.TheatreType value)
		{
			cx_SchedulingTheatreType.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingTheatreType = new ims.framework.ContextVariable("Scheduling.TheatreType", "_cv_Scheduling.TheatreType");
		public boolean getTheatreServiceIsNotNull()
		{
			return !cx_SchedulingTheatreService.getValueIsNull(context);
		}
		public ims.core.vo.ServiceLiteVo getTheatreService()
		{
			return (ims.core.vo.ServiceLiteVo)cx_SchedulingTheatreService.getValue(context);
		}
		public void setTheatreService(ims.core.vo.ServiceLiteVo value)
		{
			cx_SchedulingTheatreService.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingTheatreService = new ims.framework.ContextVariable("Scheduling.TheatreService", "_cv_Scheduling.TheatreService");
		public boolean getTheatreProcedureIsNotNull()
		{
			return !cx_SchedulingTheatreProcedure.getValueIsNull(context);
		}
		public ims.core.vo.ProcedureLiteVo getTheatreProcedure()
		{
			return (ims.core.vo.ProcedureLiteVo)cx_SchedulingTheatreProcedure.getValue(context);
		}
		public void setTheatreProcedure(ims.core.vo.ProcedureLiteVo value)
		{
			cx_SchedulingTheatreProcedure.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingTheatreProcedure = new ims.framework.ContextVariable("Scheduling.TheatreProcedure", "_cv_Scheduling.TheatreProcedure");
		public boolean getTheatreConsultantIsNotNull()
		{
			return !cx_SchedulingTheatreConsultant.getValueIsNull(context);
		}
		public ims.vo.interfaces.IMos getTheatreConsultant()
		{
			return (ims.vo.interfaces.IMos)cx_SchedulingTheatreConsultant.getValue(context);
		}
		public void setTheatreConsultant(ims.vo.interfaces.IMos value)
		{
			cx_SchedulingTheatreConsultant.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingTheatreConsultant = new ims.framework.ContextVariable("Scheduling.TheatreConsultant", "_cv_Scheduling.TheatreConsultant");
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
		public boolean getTheatreAppointmentIsNotNull()
		{
			return !cx_SchedulingTheatreAppointment.getValueIsNull(context);
		}
		public ims.scheduling.vo.BookingAppointmentTheatreVo getTheatreAppointment()
		{
			return (ims.scheduling.vo.BookingAppointmentTheatreVo)cx_SchedulingTheatreAppointment.getValue(context);
		}
		public void setTheatreAppointment(ims.scheduling.vo.BookingAppointmentTheatreVo value)
		{
			cx_SchedulingTheatreAppointment.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_SchedulingTheatreAppointment = new ims.framework.ContextVariable("Scheduling.TheatreAppointment", "_cv_Scheduling.TheatreAppointment");
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
	public final class RotherhamContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RotherhamContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getAppointmentToLinkIsNotNull()
		{
			return !cx_RotherhamAppointmentToLink.getValueIsNull(context);
		}
		public ims.scheduling.vo.Booking_AppointmentRefVo getAppointmentToLink()
		{
			return (ims.scheduling.vo.Booking_AppointmentRefVo)cx_RotherhamAppointmentToLink.getValue(context);
		}
		public void setAppointmentToLink(ims.scheduling.vo.Booking_AppointmentRefVo value)
		{
			cx_RotherhamAppointmentToLink.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RotherhamAppointmentToLink = new ims.framework.ContextVariable("Rotherham.AppointmentToLink", "_cv_Rotherham.AppointmentToLink");

		private ims.framework.Context context;
	}

	public CoreContext Core;
	public RefManContext RefMan;
	public SchedulingContext Scheduling;
	public ChooseAndBookContext ChooseAndBook;
	public RotherhamContext Rotherham;
}
