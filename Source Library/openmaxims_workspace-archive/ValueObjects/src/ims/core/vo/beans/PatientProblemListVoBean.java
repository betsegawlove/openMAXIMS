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

package ims.core.vo.beans;

public class PatientProblemListVoBean extends ims.vo.ValueObjectBean
{
	public PatientProblemListVoBean()
	{
	}
	public PatientProblemListVoBean(ims.core.vo.PatientProblemListVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patientproblem = vo.getPatientProblem();
		this.status = vo.getStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getStatus().getBean();
		this.primaryforcarespells = vo.getPrimaryForCareSpells() == null ? null : vo.getPrimaryForCareSpells().getBeanCollection();
		this.sysinfo = vo.getSysInfo() == null ? null : (ims.vo.SysInfoBean)vo.getSysInfo().getBean();
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.PatientProblemListVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patientproblem = vo.getPatientProblem();
		this.status = vo.getStatus() == null ? null : (ims.vo.LookupInstanceBean)vo.getStatus().getBean();
		this.primaryforcarespells = vo.getPrimaryForCareSpells() == null ? null : vo.getPrimaryForCareSpells().getBeanCollection();
		this.sysinfo = vo.getSysInfo() == null ? null : (ims.vo.SysInfoBean)vo.getSysInfo().getBean();
		this.authoringinformation = vo.getAuthoringInformation() == null ? null : (ims.core.vo.beans.AuthoringInformationVoBean)vo.getAuthoringInformation().getBean(map);
	}

	public ims.core.vo.PatientProblemListVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.PatientProblemListVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.PatientProblemListVo vo = null;
		if(map != null)
			vo = (ims.core.vo.PatientProblemListVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.PatientProblemListVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public String getPatientProblem()
	{
		return this.patientproblem;
	}
	public void setPatientProblem(String value)
	{
		this.patientproblem = value;
	}
	public ims.vo.LookupInstanceBean getStatus()
	{
		return this.status;
	}
	public void setStatus(ims.vo.LookupInstanceBean value)
	{
		this.status = value;
	}
	public ims.core.vo.beans.CSPrimaryProblemVoBean[] getPrimaryForCareSpells()
	{
		return this.primaryforcarespells;
	}
	public void setPrimaryForCareSpells(ims.core.vo.beans.CSPrimaryProblemVoBean[] value)
	{
		this.primaryforcarespells = value;
	}
	public ims.vo.SysInfoBean getSysInfo()
	{
		return this.sysinfo;
	}
	public void setSysInfo(ims.vo.SysInfoBean value)
	{
		this.sysinfo = value;
	}
	public ims.core.vo.beans.AuthoringInformationVoBean getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.beans.AuthoringInformationVoBean value)
	{
		this.authoringinformation = value;
	}

	private Integer id;
	private int version;
	private String patientproblem;
	private ims.vo.LookupInstanceBean status;
	private ims.core.vo.beans.CSPrimaryProblemVoBean[] primaryforcarespells;
	private ims.vo.SysInfoBean sysinfo;
	private ims.core.vo.beans.AuthoringInformationVoBean authoringinformation;
}
