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

package ims.ocrr.forms.radiologyorders;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		Core = new CoreContext(context);
		OCRR = new OCRRContext(context);
		RefMan = new RefManContext(context);
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
	public final class OCRRContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private OCRRContext(ims.framework.Context context)
		{
			this.context = context;

			PathologyResults = new PathologyResultsContext(context);
		}
		public final class PathologyResultsContext implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private PathologyResultsContext(ims.framework.Context context)
			{
				this.context = context;
			}
			public boolean getOrderIsNotNull()
			{
				return !cx_OCRRPathologyResultsOrder.getValueIsNull(context);
			}
			public ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo getOrder()
			{
				return (ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo)cx_OCRRPathologyResultsOrder.getValue(context);
			}
		public void setOrder(ims.ocrr.orderingresults.vo.OcsOrderSessionRefVo value)
		{
				cx_OCRRPathologyResultsOrder.setValue(context, value);
		}

			private ims.framework.ContextVariable cx_OCRRPathologyResultsOrder = new ims.framework.ContextVariable("OCRR.PathologyResults.Order", "_cv_OCRR.PathologyResults.Order");
			private ims.framework.Context context;
		}

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

		public PathologyResultsContext PathologyResults;
		private ims.framework.Context context;
	}
	public final class RefManContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private RefManContext(ims.framework.Context context)
		{
			this.context = context;

		}

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

	public CoreContext Core;
	public OCRRContext OCRR;
	public RefManContext RefMan;
}
