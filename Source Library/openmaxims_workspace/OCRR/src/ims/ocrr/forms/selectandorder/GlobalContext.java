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

package ims.ocrr.forms.selectandorder;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		OCRR = new OCRRContext(context);
		Core = new CoreContext(context);
		RefMan = new RefManContext(context);
		Rotherham = new RotherhamContext(context);
	}
	public final class OCRRContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private OCRRContext(ims.framework.Context context)
		{
			this.context = context;

			SelectAndOrder = new SelectAndOrderContext(context);
		}
		public final class SelectAndOrderContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private SelectAndOrderContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getLaunchYesNoGenderDialogIsNotNull()
			{
				return !cx_OCRRSelectAndOrderLaunchYesNoGenderDialog.getValueIsNull(context);
			}
			public Boolean getLaunchYesNoGenderDialog()
			{
				return (Boolean)cx_OCRRSelectAndOrderLaunchYesNoGenderDialog.getValue(context);
			}
		public void setLaunchYesNoGenderDialog(Boolean value)
		{
				cx_OCRRSelectAndOrderLaunchYesNoGenderDialog.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_OCRRSelectAndOrderLaunchYesNoGenderDialog = new ims.framework.ContextVariable("OCRR.SelectAndOrder.LaunchYesNoGenderDialog", "_cv_OCRR.SelectAndOrder.LaunchYesNoGenderDialog");
			public boolean getLaunchYesNoReOrderDialogIsNotNull()
			{
				return !cx_OCRRSelectAndOrderLaunchYesNoReOrderDialog.getValueIsNull(context);
			}
			public Boolean getLaunchYesNoReOrderDialog()
			{
				return (Boolean)cx_OCRRSelectAndOrderLaunchYesNoReOrderDialog.getValue(context);
			}
		public void setLaunchYesNoReOrderDialog(Boolean value)
		{
				cx_OCRRSelectAndOrderLaunchYesNoReOrderDialog.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_OCRRSelectAndOrderLaunchYesNoReOrderDialog = new ims.framework.ContextVariable("OCRR.SelectAndOrder.LaunchYesNoReOrderDialog", "_cv_OCRR.SelectAndOrder.LaunchYesNoReOrderDialog");
			public boolean getLaunchMyOrderInfoDialogIsNotNull()
			{
				return !cx_OCRRSelectAndOrderLaunchMyOrderInfoDialog.getValueIsNull(context);
			}
			public Boolean getLaunchMyOrderInfoDialog()
			{
				return (Boolean)cx_OCRRSelectAndOrderLaunchMyOrderInfoDialog.getValue(context);
			}
		public void setLaunchMyOrderInfoDialog(Boolean value)
		{
				cx_OCRRSelectAndOrderLaunchMyOrderInfoDialog.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_OCRRSelectAndOrderLaunchMyOrderInfoDialog = new ims.framework.ContextVariable("OCRR.SelectAndOrder.LaunchMyOrderInfoDialog", "_cv_OCRR.SelectAndOrder.LaunchMyOrderInfoDialog");
			private ims.framework.Context context;
		}

		public boolean getMyOrderComponentsIsNotNull()
		{
			return !cx_OCRRMyOrderComponents.getValueIsNull(context);
		}
		public ims.ocrr.vo.MyOrderComponentVoCollection getMyOrderComponents()
		{
			return (ims.ocrr.vo.MyOrderComponentVoCollection)cx_OCRRMyOrderComponents.getValue(context);
		}
		public void setMyOrderComponents(ims.ocrr.vo.MyOrderComponentVoCollection value)
		{
			cx_OCRRMyOrderComponents.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRMyOrderComponents = new ims.framework.ContextVariable("OCRR.MyOrderComponents", "_cv_OCRR.MyOrderComponents");
		public boolean getMyOrderInformationsIsNotNull()
		{
			return !cx_OCRRMyOrderInformations.getValueIsNull(context);
		}
		public ims.core.vo.GeneralQuestionAnswerVoCollection getMyOrderInformations()
		{
			return (ims.core.vo.GeneralQuestionAnswerVoCollection)cx_OCRRMyOrderInformations.getValue(context);
		}
		public void setMyOrderInformations(ims.core.vo.GeneralQuestionAnswerVoCollection value)
		{
			cx_OCRRMyOrderInformations.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRMyOrderInformations = new ims.framework.ContextVariable("OCRR.MyOrderInformations", "_cv_OCRR.MyOrderInformations");
		public boolean getMyOrderQuestionsIsNotNull()
		{
			return !cx_OCRRMyOrderQuestions.getValueIsNull(context);
		}
		public ims.ocrr.vo.OcsQASessionVo getMyOrderQuestions()
		{
			return (ims.ocrr.vo.OcsQASessionVo)cx_OCRRMyOrderQuestions.getValue(context);
		}
		public void setMyOrderQuestions(ims.ocrr.vo.OcsQASessionVo value)
		{
			cx_OCRRMyOrderQuestions.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRMyOrderQuestions = new ims.framework.ContextVariable("OCRR.MyOrderQuestions", "_cv_OCRR.MyOrderQuestions");
		public boolean getQuestionTooltipsIsNotNull()
		{
			return !cx_OCRRQuestionTooltips.getValueIsNull(context);
		}
		public ims.ocrr.vo.QuestionTooltipVoCollection getQuestionTooltips()
		{
			return (ims.ocrr.vo.QuestionTooltipVoCollection)cx_OCRRQuestionTooltips.getValue(context);
		}
		public void setQuestionTooltips(ims.ocrr.vo.QuestionTooltipVoCollection value)
		{
			cx_OCRRQuestionTooltips.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRQuestionTooltips = new ims.framework.ContextVariable("OCRR.QuestionTooltips", "_cv_OCRR.QuestionTooltips");
		public boolean getOrderInvestigationToAmendIsNotNull()
		{
			return !cx_OCRROrderInvestigationToAmend.getValueIsNull(context);
		}
		public ims.ocrr.vo.OrderInvestigationLiteVo getOrderInvestigationToAmend()
		{
			return (ims.ocrr.vo.OrderInvestigationLiteVo)cx_OCRROrderInvestigationToAmend.getValue(context);
		}
		public void setOrderInvestigationToAmend(ims.ocrr.vo.OrderInvestigationLiteVo value)
		{
			cx_OCRROrderInvestigationToAmend.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRROrderInvestigationToAmend = new ims.framework.ContextVariable("OCRR.OrderInvestigationToAmend", "_cv_OCRR.OrderInvestigationToAmend");
		public boolean getReasonForReOrderIsNotNull()
		{
			return !cx_OCRRReasonForReOrder.getValueIsNull(context);
		}
		public String getReasonForReOrder()
		{
			return (String)cx_OCRRReasonForReOrder.getValue(context);
		}
		public void setReasonForReOrder(String value)
		{
			cx_OCRRReasonForReOrder.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRReasonForReOrder = new ims.framework.ContextVariable("OCRR.ReasonForReOrder", "_cv_OCRR.ReasonForReOrder");
		public boolean getGenderInvestigationsIsNotNull()
		{
			return !cx_OCRRGenderInvestigations.getValueIsNull(context);
		}
		public ims.ocrr.vo.GenderInvestigationVoCollection getGenderInvestigations()
		{
			return (ims.ocrr.vo.GenderInvestigationVoCollection)cx_OCRRGenderInvestigations.getValue(context);
		}
		public void setGenderInvestigations(ims.ocrr.vo.GenderInvestigationVoCollection value)
		{
			cx_OCRRGenderInvestigations.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRGenderInvestigations = new ims.framework.ContextVariable("OCRR.GenderInvestigations", "_cv_OCRR.GenderInvestigations");
		public boolean getRoleDisciplineSecurityLevelsIsNotNull()
		{
			return !cx_OCRRRoleDisciplineSecurityLevels.getValueIsNull(context);
		}
		public ims.ocrr.vo.RoleDisciplineSecurityLevelLiteGCVo getRoleDisciplineSecurityLevels()
		{
			return (ims.ocrr.vo.RoleDisciplineSecurityLevelLiteGCVo)cx_OCRRRoleDisciplineSecurityLevels.getValue(context);
		}
		public void setRoleDisciplineSecurityLevels(ims.ocrr.vo.RoleDisciplineSecurityLevelLiteGCVo value)
		{
			cx_OCRRRoleDisciplineSecurityLevels.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRRoleDisciplineSecurityLevels = new ims.framework.ContextVariable("OCRR.RoleDisciplineSecurityLevels", "_cvp_OCRR.RoleDisciplineSecurityLevels");
		public boolean getYesNoDialogWithReasonMessageIsNotNull()
		{
			return !cx_OCRRYesNoDialogWithReasonMessage.getValueIsNull(context);
		}
		public ims.ocrr.vo.ReOrderPeriodMessageVoCollection getYesNoDialogWithReasonMessage()
		{
			return (ims.ocrr.vo.ReOrderPeriodMessageVoCollection)cx_OCRRYesNoDialogWithReasonMessage.getValue(context);
		}
		public void setYesNoDialogWithReasonMessage(ims.ocrr.vo.ReOrderPeriodMessageVoCollection value)
		{
			cx_OCRRYesNoDialogWithReasonMessage.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRYesNoDialogWithReasonMessage = new ims.framework.ContextVariable("OCRR.YesNoDialogWithReasonMessage", "_cv_OCRR.YesNoDialogWithReasonMessage");
		public boolean getRefusedInvestigationIsNotNull()
		{
			return !cx_OCRRRefusedInvestigation.getValueIsNull(context);
		}
		public ims.ocrr.configuration.vo.InvestigationRefVoCollection getRefusedInvestigation()
		{
			return (ims.ocrr.configuration.vo.InvestigationRefVoCollection)cx_OCRRRefusedInvestigation.getValue(context);
		}
		public void setRefusedInvestigation(ims.ocrr.configuration.vo.InvestigationRefVoCollection value)
		{
			cx_OCRRRefusedInvestigation.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OCRRRefusedInvestigation = new ims.framework.ContextVariable("OCRR.RefusedInvestigation", "_cv_OCRR.RefusedInvestigation");

		public SelectAndOrderContext SelectAndOrder;
		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

			CareContextSelectDialog = new CareContextSelectDialogContext(context);
		}
		public final class CareContextSelectDialogContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private CareContextSelectDialogContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getChosenCareContextIsNotNull()
			{
				return !cx_CoreCareContextSelectDialogChosenCareContext.getValueIsNull(context);
			}
			public ims.core.vo.CareContextPasVo getChosenCareContext()
			{
				return (ims.core.vo.CareContextPasVo)cx_CoreCareContextSelectDialogChosenCareContext.getValue(context);
			}

			private ims.framework.ContextVariable cx_CoreCareContextSelectDialogChosenCareContext = new ims.framework.ContextVariable("Core.CareContextSelectDialog.ChosenCareContext", "_cv_Core.CareContextSelectDialog.ChosenCareContext");
			private ims.framework.Context context;
		}

		public boolean getHideCancelButtonIsNotNull()
		{
			return !cx_CoreHideCancelButton.getValueIsNull(context);
		}
		public Boolean getHideCancelButton()
		{
			return (Boolean)cx_CoreHideCancelButton.getValue(context);
		}
		public void setHideCancelButton(Boolean value)
		{
			cx_CoreHideCancelButton.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreHideCancelButton = new ims.framework.ContextVariable("Core.HideCancelButton", "_cv_Core.HideCancelButton");
		public boolean getSecondYesNoDialogMessageIsNotNull()
		{
			return !cx_CoreSecondYesNoDialogMessage.getValueIsNull(context);
		}
		public String getSecondYesNoDialogMessage()
		{
			return (String)cx_CoreSecondYesNoDialogMessage.getValue(context);
		}
		public void setSecondYesNoDialogMessage(String value)
		{
			cx_CoreSecondYesNoDialogMessage.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreSecondYesNoDialogMessage = new ims.framework.ContextVariable("Core.SecondYesNoDialogMessage", "_cv_Core.SecondYesNoDialogMessage");
		public boolean getYesNoDialogLaunchedFromSelfIsNotNull()
		{
			return !cx_CoreYesNoDialogLaunchedFromSelf.getValueIsNull(context);
		}
		public Boolean getYesNoDialogLaunchedFromSelf()
		{
			return (Boolean)cx_CoreYesNoDialogLaunchedFromSelf.getValue(context);
		}
		public void setYesNoDialogLaunchedFromSelf(Boolean value)
		{
			cx_CoreYesNoDialogLaunchedFromSelf.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreYesNoDialogLaunchedFromSelf = new ims.framework.ContextVariable("Core.YesNoDialogLaunchedFromSelf", "_cv_Core.YesNoDialogLaunchedFromSelf");
		public boolean getPatientShortIsNotNull()
		{
			return !cx_CorePatientShort.getValueIsNull(context);
		}
		public ims.core.vo.PatientShort getPatientShort()
		{
			return (ims.core.vo.PatientShort)cx_CorePatientShort.getValue(context);
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

		private ims.framework.ContextVariable cx_CoreCurrentCareContext = new ims.framework.ContextVariable("Core.CurrentCareContext", "_cvp_Core.CurrentCareContext");
		public boolean getYesNoDialogMessageIsNotNull()
		{
			return !cx_CoreYesNoDialogMessage.getValueIsNull(context);
		}
		public String getYesNoDialogMessage()
		{
			return (String)cx_CoreYesNoDialogMessage.getValue(context);
		}
		public void setYesNoDialogMessage(String value)
		{
			cx_CoreYesNoDialogMessage.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreYesNoDialogMessage = new ims.framework.ContextVariable("Core.YesNoDialogMessage", "_cv_Core.YesNoDialogMessage");
		public boolean getOutpatientAttendanceForOrderIsNotNull()
		{
			return !cx_CoreOutpatientAttendanceForOrder.getValueIsNull(context);
		}
		public ims.core.vo.OutPatientListVo getOutpatientAttendanceForOrder()
		{
			return (ims.core.vo.OutPatientListVo)cx_CoreOutpatientAttendanceForOrder.getValue(context);
		}

		private ims.framework.ContextVariable cx_CoreOutpatientAttendanceForOrder = new ims.framework.ContextVariable("Core.OutpatientAttendanceForOrder", "_cv_Core.OutpatientAttendanceForOrder");
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

		public CareContextSelectDialogContext CareContextSelectDialog;
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

	public OCRRContext OCRR;
	public CoreContext Core;
	public RefManContext RefMan;
	public RotherhamContext Rotherham;
}
