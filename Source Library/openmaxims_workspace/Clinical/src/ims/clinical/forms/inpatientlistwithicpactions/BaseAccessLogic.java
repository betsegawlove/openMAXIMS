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

package ims.clinical.forms.inpatientlistwithicpactions;

import java.io.Serializable;
import ims.framework.Context;
import ims.framework.FormName;
import ims.framework.FormAccessLogic;

public class BaseAccessLogic extends FormAccessLogic implements Serializable
{
	private static final long serialVersionUID = 1L;

	public final void setContext(Context context, FormName formName)
	{
		form = new CurrentForm(new GlobalContext(context), new CurrentForms());
		engine = new CurrentEngine(formName);
	}
	public boolean isAccessible()
	{

		return true;
	}
	public boolean isReadOnly()
	{
		return false;
	}

	public CurrentEngine engine;
	public CurrentForm form;

	public final static class CurrentForm implements Serializable
	{
		private static final long serialVersionUID = 1L;

		CurrentForm(GlobalContext globalcontext, CurrentForms forms)
		{
			this.globalcontext = globalcontext;
			this.forms = forms;
		}
		public final GlobalContext getGlobalContext()
		{
			return globalcontext;
		}
		public final CurrentForms getForms()
		{
			return forms;
		}
		private GlobalContext globalcontext;
		private CurrentForms forms;
	}
	public final static class CurrentEngine implements Serializable
	{
		private static final long serialVersionUID = 1L;

		CurrentEngine(FormName formName)
		{
			this.formName = formName;
		}
		public final FormName getFormName()
		{
			return formName;
		}
		private FormName formName;
	}
	public static final class CurrentForms implements Serializable
	{
		private static final long serialVersionUID = 1L;

		protected final class LocalFormName extends FormName
		{
			private static final long serialVersionUID = 1L;
		
			protected LocalFormName(int value)
			{
				super(value);
			}
		}

		private CurrentForms()
		{
			RefMan = new RefManForms();
			ICP = new ICPForms();
			Clinical = new ClinicalForms();
			Core = new CoreForms();
		}
		public final class RefManForms implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private RefManForms()
			{
				ICPActions = new LocalFormName(123153);
				DischargeSummaryWardPacuDialogAlias = new LocalFormName(134170);
			}
			public final FormName ICPActions;
			public final FormName DischargeSummaryWardPacuDialogAlias;
		}
		public final class ICPForms implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private ICPForms()
			{
				PatientICP = new LocalFormName(118100);
			}
			public final FormName PatientICP;
		}
		public final class ClinicalForms implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private ClinicalForms()
			{
				InpatientBedNumberDialog = new LocalFormName(123160);
			}
			public final FormName InpatientBedNumberDialog;
		}
		public final class CoreForms implements Serializable
		{
			private static final long serialVersionUID = 1L;

			private CoreForms()
			{
				InpatientTransferDialog = new LocalFormName(102366);
			}
			public final FormName InpatientTransferDialog;
		}

		public RefManForms RefMan;
		public ICPForms ICP;
		public ClinicalForms Clinical;
		public CoreForms Core;
	}
}
