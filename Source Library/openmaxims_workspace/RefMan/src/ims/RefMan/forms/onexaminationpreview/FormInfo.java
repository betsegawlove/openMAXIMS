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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.onexaminationpreview;

public final class FormInfo extends ims.framework.FormInfo
{
	private static final long serialVersionUID = 1L;
	public FormInfo(Integer formId)
	{
		super(formId);
	}
	public String getNamespaceName()
	{
		return "RefMan";
	}
	public String getFormName()
	{
		return "OnExaminationPreview";
	}
	public int getWidth()
	{
		return 824;
	}
	public int getHeight()
	{
		return 592;
	}
	public String[] getContextVariables()
	{
		return new String[] {  };
	}
	public String getLocalVariablesPrefix()
	{
		return "_lv_RefMan.OnExaminationPreview.__internal_x_context__" + String.valueOf(getFormId());
	}
	public ims.framework.FormInfo[] getComponentsFormInfo()
	{
		ims.framework.FormInfo[] componentsInfo = new ims.framework.FormInfo[9];
		componentsInfo[0] = new ims.core.forms.uploaddocument.FormInfo(102264);
		componentsInfo[1] = new ims.RefMan.forms.clinicalnotescomponent.FormInfo(134166);
		componentsInfo[2] = new ims.RefMan.forms.diagnosisandmanagementcomponent.FormInfo(134169);
		componentsInfo[3] = new ims.RefMan.forms.prescriptioncomponent.FormInfo(134173);
		componentsInfo[4] = new ims.RefMan.forms.referraloutcomecomponent.FormInfo(134120);
		componentsInfo[5] = new ims.RefMan.forms.followupnotescomponent.FormInfo(134168);
		componentsInfo[6] = new ims.RefMan.forms.correspondencenotes.FormInfo(134180);
		componentsInfo[7] = new ims.RefMan.forms.tltsummarynotescomponent.FormInfo(134172);
		componentsInfo[8] = new ims.RefMan.forms.catsreportcomponent.FormInfo(134179);
		return componentsInfo;
	}
	public String getImagePath()
	{
		return "";
	}
}
