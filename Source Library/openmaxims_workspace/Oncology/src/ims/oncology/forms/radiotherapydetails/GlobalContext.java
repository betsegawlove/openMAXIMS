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

package ims.oncology.forms.radiotherapydetails;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Core = new CoreContext(context);
		Oncology = new OncologyContext(context);
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getCurrentCareContextIsNotNull()
		{
			return !cx_CoreCurrentCareContext.getValueIsNull(context);
		}
		public ims.core.vo.CareContextShortVo getCurrentCareContext()
		{
			return (ims.core.vo.CareContextShortVo)cx_CoreCurrentCareContext.getValue(context);
		}

		private ims.framework.ContextVariable cx_CoreCurrentCareContext = new ims.framework.ContextVariable("Core.CurrentCareContext", "_cvp_Core.CurrentCareContext");
		public boolean getEpisodeofCareShortIsNotNull()
		{
			return !cx_CoreEpisodeofCareShort.getValueIsNull(context);
		}
		public ims.core.vo.EpisodeofCareShortVo getEpisodeofCareShort()
		{
			return (ims.core.vo.EpisodeofCareShortVo)cx_CoreEpisodeofCareShort.getValue(context);
		}

		private ims.framework.ContextVariable cx_CoreEpisodeofCareShort = new ims.framework.ContextVariable("Core.EpisodeofCareShort", "_cvp_Core.EpisodeofCareShort");
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
	public final class OncologyContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private OncologyContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getRadiotherapyPatTreatmentPlanActionIsNotNull()
		{
			return !cx_OncologyRadiotherapyPatTreatmentPlanAction.getValueIsNull(context);
		}
		public ims.ccosched.vo.PatTreatPlanActionLiteVo getRadiotherapyPatTreatmentPlanAction()
		{
			return (ims.ccosched.vo.PatTreatPlanActionLiteVo)cx_OncologyRadiotherapyPatTreatmentPlanAction.getValue(context);
		}
		public void setRadiotherapyPatTreatmentPlanAction(ims.ccosched.vo.PatTreatPlanActionLiteVo value)
		{
			cx_OncologyRadiotherapyPatTreatmentPlanAction.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OncologyRadiotherapyPatTreatmentPlanAction = new ims.framework.ContextVariable("Oncology.RadiotherapyPatTreatmentPlanAction", "_cv_Oncology.RadiotherapyPatTreatmentPlanAction");
		public boolean getDecisionTreatFromDialogIsNotNull()
		{
			return !cx_OncologyDecisionTreatFromDialog.getValueIsNull(context);
		}
		public ims.framework.utils.Date getDecisionTreatFromDialog()
		{
			return (ims.framework.utils.Date)cx_OncologyDecisionTreatFromDialog.getValue(context);
		}
		public void setDecisionTreatFromDialog(ims.framework.utils.Date value)
		{
			cx_OncologyDecisionTreatFromDialog.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_OncologyDecisionTreatFromDialog = new ims.framework.ContextVariable("Oncology.DecisionTreatFromDialog", "_cv_Oncology.DecisionTreatFromDialog");

		private ims.framework.Context context;
	}

	public CoreContext Core;
	public OncologyContext Oncology;
}