// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.catsreportcomponent;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		RefMan = new RefManContext(context);
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
		public boolean getIsComponentInEditModeIsNotNull()
		{
			return !cx_RefManIsComponentInEditMode.getValueIsNull(context);
		}
		public ims.framework.enumerations.FormMode getIsComponentInEditMode()
		{
			return (ims.framework.enumerations.FormMode)cx_RefManIsComponentInEditMode.getValue(context);
		}
		public void setIsComponentInEditMode(ims.framework.enumerations.FormMode value)
		{
			cx_RefManIsComponentInEditMode.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_RefManIsComponentInEditMode = new ims.framework.ContextVariable("RefMan.IsComponentInEditMode", "_cv_RefMan.IsComponentInEditMode");

		private ims.framework.Context context;
	}

	public RefManContext RefMan;
}
