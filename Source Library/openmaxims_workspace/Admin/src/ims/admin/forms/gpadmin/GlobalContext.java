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

package ims.admin.forms.gpadmin;

import java.io.Serializable;

public final class GlobalContext extends ims.framework.FormContext implements Serializable
{
	private static final long serialVersionUID = 1L;

	public GlobalContext(ims.framework.Context context)
	{
		super(context);

		NTPF = new NTPFContext(context);
		Core = new CoreContext(context);
		Admin = new AdminContext(context);
	}
	public final class NTPFContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private NTPFContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getTargetObjectIdIsNotNull()
		{
			return !cx_NTPFTargetObjectId.getValueIsNull(context);
		}
		public Integer getTargetObjectId()
		{
			return (Integer)cx_NTPFTargetObjectId.getValue(context);
		}
		public void setTargetObjectId(Integer value)
		{
			cx_NTPFTargetObjectId.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_NTPFTargetObjectId = new ims.framework.ContextVariable("NTPF.TargetObjectId", "_cv_NTPF.TargetObjectId");
		public boolean getNewGPCreatedIsNotNull()
		{
			return !cx_NTPFNewGPCreated.getValueIsNull(context);
		}
		public Boolean getNewGPCreated()
		{
			return (Boolean)cx_NTPFNewGPCreated.getValue(context);
		}
		public void setNewGPCreated(Boolean value)
		{
			cx_NTPFNewGPCreated.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_NTPFNewGPCreated = new ims.framework.ContextVariable("NTPF.NewGPCreated", "_cvp_NTPF.NewGPCreated");

		private ims.framework.Context context;
	}
	public final class CoreContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private CoreContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getGPDetailsIsNotNull()
		{
			return !cx_CoreGPDetails.getValueIsNull(context);
		}
		public ims.core.vo.GpShortVo getGPDetails()
		{
			return (ims.core.vo.GpShortVo)cx_CoreGPDetails.getValue(context);
		}
		public void setGPDetails(ims.core.vo.GpShortVo value)
		{
			cx_CoreGPDetails.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_CoreGPDetails = new ims.framework.ContextVariable("Core.GPDetails", "_cv_Core.GPDetails");

		private ims.framework.Context context;
	}
	public final class AdminContext implements Serializable
	{
		private static final long serialVersionUID = 1L;

		private AdminContext(ims.framework.Context context)
		{
			this.context = context;

		}

		public boolean getInvisibleRemoveContextMenuIsNotNull()
		{
			return !cx_AdminInvisibleRemoveContextMenu.getValueIsNull(context);
		}
		public Boolean getInvisibleRemoveContextMenu()
		{
			return (Boolean)cx_AdminInvisibleRemoveContextMenu.getValue(context);
		}
		public void setInvisibleRemoveContextMenu(Boolean value)
		{
			cx_AdminInvisibleRemoveContextMenu.setValue(context, value);
		}

		private ims.framework.ContextVariable cx_AdminInvisibleRemoveContextMenu = new ims.framework.ContextVariable("Admin.InvisibleRemoveContextMenu", "_cv_Admin.InvisibleRemoveContextMenu");
		public boolean getPracticeIsNotNull()
		{
			return !cx_AdminPractice.getValueIsNull(context);
		}
		public ims.core.vo.OrganisationWithSitesVo getPractice()
		{
			return (ims.core.vo.OrganisationWithSitesVo)cx_AdminPractice.getValue(context);
		}

		private ims.framework.ContextVariable cx_AdminPractice = new ims.framework.ContextVariable("Admin.Practice", "_cv_Admin.Practice");

		private ims.framework.Context context;
	}

	public NTPFContext NTPF;
	public CoreContext Core;
	public AdminContext Admin;
}
