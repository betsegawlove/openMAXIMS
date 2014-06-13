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

public class VitalSignsForNursingNotesVoBean extends ims.vo.ValueObjectBean
{
	public VitalSignsForNursingNotesVoBean()
	{
	}
	public VitalSignsForNursingNotesVoBean(ims.core.vo.VitalSignsForNursingNotesVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.vitalstakendatetime = vo.getVitalsTakenDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getVitalsTakenDateTime().getBean();
		this.bloodpressure = vo.getBloodPressure() == null ? null : (ims.core.vo.beans.BloodPressureForNursingNotesVoBean)vo.getBloodPressure().getBean();
		this.pulse = vo.getPulse() == null ? null : (ims.core.vo.beans.PulseForNursingNotesVoBean)vo.getPulse().getBean();
		this.respiratory = vo.getRespiratory() == null ? null : (ims.core.vo.beans.RespiratoryForNursingNotesVoBean)vo.getRespiratory().getBean();
		this.temperature = vo.getTemperature() == null ? null : (ims.core.vo.beans.TemperatureForNursingNotesVoBean)vo.getTemperature().getBean();
		this.metrics = vo.getMetrics() == null ? null : (ims.core.vo.beans.MetricsForNursingNotesVoBean)vo.getMetrics().getBean();
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.VitalSignsForNursingNotesVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.vitalstakendatetime = vo.getVitalsTakenDateTime() == null ? null : (ims.framework.utils.beans.DateTimeBean)vo.getVitalsTakenDateTime().getBean();
		this.bloodpressure = vo.getBloodPressure() == null ? null : (ims.core.vo.beans.BloodPressureForNursingNotesVoBean)vo.getBloodPressure().getBean(map);
		this.pulse = vo.getPulse() == null ? null : (ims.core.vo.beans.PulseForNursingNotesVoBean)vo.getPulse().getBean(map);
		this.respiratory = vo.getRespiratory() == null ? null : (ims.core.vo.beans.RespiratoryForNursingNotesVoBean)vo.getRespiratory().getBean(map);
		this.temperature = vo.getTemperature() == null ? null : (ims.core.vo.beans.TemperatureForNursingNotesVoBean)vo.getTemperature().getBean(map);
		this.metrics = vo.getMetrics() == null ? null : (ims.core.vo.beans.MetricsForNursingNotesVoBean)vo.getMetrics().getBean(map);
		this.carecontext = vo.getCareContext() == null ? null : new ims.vo.RefVoBean(vo.getCareContext().getBoId(), vo.getCareContext().getBoVersion());
	}

	public ims.core.vo.VitalSignsForNursingNotesVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.core.vo.VitalSignsForNursingNotesVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.VitalSignsForNursingNotesVo vo = null;
		if(map != null)
			vo = (ims.core.vo.VitalSignsForNursingNotesVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.core.vo.VitalSignsForNursingNotesVo();
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
	public ims.framework.utils.beans.DateTimeBean getVitalsTakenDateTime()
	{
		return this.vitalstakendatetime;
	}
	public void setVitalsTakenDateTime(ims.framework.utils.beans.DateTimeBean value)
	{
		this.vitalstakendatetime = value;
	}
	public ims.core.vo.beans.BloodPressureForNursingNotesVoBean getBloodPressure()
	{
		return this.bloodpressure;
	}
	public void setBloodPressure(ims.core.vo.beans.BloodPressureForNursingNotesVoBean value)
	{
		this.bloodpressure = value;
	}
	public ims.core.vo.beans.PulseForNursingNotesVoBean getPulse()
	{
		return this.pulse;
	}
	public void setPulse(ims.core.vo.beans.PulseForNursingNotesVoBean value)
	{
		this.pulse = value;
	}
	public ims.core.vo.beans.RespiratoryForNursingNotesVoBean getRespiratory()
	{
		return this.respiratory;
	}
	public void setRespiratory(ims.core.vo.beans.RespiratoryForNursingNotesVoBean value)
	{
		this.respiratory = value;
	}
	public ims.core.vo.beans.TemperatureForNursingNotesVoBean getTemperature()
	{
		return this.temperature;
	}
	public void setTemperature(ims.core.vo.beans.TemperatureForNursingNotesVoBean value)
	{
		this.temperature = value;
	}
	public ims.core.vo.beans.MetricsForNursingNotesVoBean getMetrics()
	{
		return this.metrics;
	}
	public void setMetrics(ims.core.vo.beans.MetricsForNursingNotesVoBean value)
	{
		this.metrics = value;
	}
	public ims.vo.RefVoBean getCareContext()
	{
		return this.carecontext;
	}
	public void setCareContext(ims.vo.RefVoBean value)
	{
		this.carecontext = value;
	}

	private Integer id;
	private int version;
	private ims.framework.utils.beans.DateTimeBean vitalstakendatetime;
	private ims.core.vo.beans.BloodPressureForNursingNotesVoBean bloodpressure;
	private ims.core.vo.beans.PulseForNursingNotesVoBean pulse;
	private ims.core.vo.beans.RespiratoryForNursingNotesVoBean respiratory;
	private ims.core.vo.beans.TemperatureForNursingNotesVoBean temperature;
	private ims.core.vo.beans.MetricsForNursingNotesVoBean metrics;
	private ims.vo.RefVoBean carecontext;
}