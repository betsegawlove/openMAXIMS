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

package ims.clinicaladmin.vo.beans;

public class PrognosticGroupingCongfigVoBean extends ims.vo.ValueObjectBean
{
	public PrognosticGroupingCongfigVoBean()
	{
	}
	public PrognosticGroupingCongfigVoBean(ims.clinicaladmin.vo.PrognosticGroupingCongfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.ishistologicaltypepertinent = vo.getIsHistologicalTypePertinent();
		this.ishistologicalgradepertinent = vo.getIsHistologicalGradePertinent();
		this.istumourlocationpertinent = vo.getIsTumourLocationPertinent();
		this.isriskcategorypertinent = vo.getIsRiskCategoryPertinent();
		this.ispsapertinent = vo.getIsPSAPertinent();
		this.isgleasonpertinent = vo.getIsGleasonPertinent();
		this.psa = vo.getPSA() == null ? null : vo.getPSA().getBeanCollection();
		this.gleason = vo.getGleason() == null ? null : vo.getGleason().getBeanCollection();
		this.location = vo.getLocation() == null ? null : vo.getLocation().getBeanCollection();
		this.risk = vo.getRisk() == null ? null : vo.getRisk().getBeanCollection();
		this.usetvalues = vo.getUseTValues();
		this.usemvalues = vo.getUseMValues();
		this.usenvalues = vo.getUseNValues();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinicaladmin.vo.PrognosticGroupingCongfigVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.ishistologicaltypepertinent = vo.getIsHistologicalTypePertinent();
		this.ishistologicalgradepertinent = vo.getIsHistologicalGradePertinent();
		this.istumourlocationpertinent = vo.getIsTumourLocationPertinent();
		this.isriskcategorypertinent = vo.getIsRiskCategoryPertinent();
		this.ispsapertinent = vo.getIsPSAPertinent();
		this.isgleasonpertinent = vo.getIsGleasonPertinent();
		this.psa = vo.getPSA() == null ? null : vo.getPSA().getBeanCollection();
		this.gleason = vo.getGleason() == null ? null : vo.getGleason().getBeanCollection();
		this.location = vo.getLocation() == null ? null : vo.getLocation().getBeanCollection();
		this.risk = vo.getRisk() == null ? null : vo.getRisk().getBeanCollection();
		this.usetvalues = vo.getUseTValues();
		this.usemvalues = vo.getUseMValues();
		this.usenvalues = vo.getUseNValues();
	}

	public ims.clinicaladmin.vo.PrognosticGroupingCongfigVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.clinicaladmin.vo.PrognosticGroupingCongfigVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinicaladmin.vo.PrognosticGroupingCongfigVo vo = null;
		if(map != null)
			vo = (ims.clinicaladmin.vo.PrognosticGroupingCongfigVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.clinicaladmin.vo.PrognosticGroupingCongfigVo();
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
	public Boolean getIsHistologicalTypePertinent()
	{
		return this.ishistologicaltypepertinent;
	}
	public void setIsHistologicalTypePertinent(Boolean value)
	{
		this.ishistologicaltypepertinent = value;
	}
	public Boolean getIsHistologicalGradePertinent()
	{
		return this.ishistologicalgradepertinent;
	}
	public void setIsHistologicalGradePertinent(Boolean value)
	{
		this.ishistologicalgradepertinent = value;
	}
	public Boolean getIsTumourLocationPertinent()
	{
		return this.istumourlocationpertinent;
	}
	public void setIsTumourLocationPertinent(Boolean value)
	{
		this.istumourlocationpertinent = value;
	}
	public Boolean getIsRiskCategoryPertinent()
	{
		return this.isriskcategorypertinent;
	}
	public void setIsRiskCategoryPertinent(Boolean value)
	{
		this.isriskcategorypertinent = value;
	}
	public Boolean getIsPSAPertinent()
	{
		return this.ispsapertinent;
	}
	public void setIsPSAPertinent(Boolean value)
	{
		this.ispsapertinent = value;
	}
	public Boolean getIsGleasonPertinent()
	{
		return this.isgleasonpertinent;
	}
	public void setIsGleasonPertinent(Boolean value)
	{
		this.isgleasonpertinent = value;
	}
	public ims.clinicaladmin.vo.beans.PSAConfigVoBean[] getPSA()
	{
		return this.psa;
	}
	public void setPSA(ims.clinicaladmin.vo.beans.PSAConfigVoBean[] value)
	{
		this.psa = value;
	}
	public ims.clinicaladmin.vo.beans.GleasonConfigLiteVoBean[] getGleason()
	{
		return this.gleason;
	}
	public void setGleason(ims.clinicaladmin.vo.beans.GleasonConfigLiteVoBean[] value)
	{
		this.gleason = value;
	}
	public ims.oncology.vo.beans.PrognosticLocationConfigVoBean[] getLocation()
	{
		return this.location;
	}
	public void setLocation(ims.oncology.vo.beans.PrognosticLocationConfigVoBean[] value)
	{
		this.location = value;
	}
	public ims.clinicaladmin.vo.beans.PrognosticRiskConfigVoBean[] getRisk()
	{
		return this.risk;
	}
	public void setRisk(ims.clinicaladmin.vo.beans.PrognosticRiskConfigVoBean[] value)
	{
		this.risk = value;
	}
	public Boolean getUseTValues()
	{
		return this.usetvalues;
	}
	public void setUseTValues(Boolean value)
	{
		this.usetvalues = value;
	}
	public Boolean getUseMValues()
	{
		return this.usemvalues;
	}
	public void setUseMValues(Boolean value)
	{
		this.usemvalues = value;
	}
	public Boolean getUseNValues()
	{
		return this.usenvalues;
	}
	public void setUseNValues(Boolean value)
	{
		this.usenvalues = value;
	}

	private Integer id;
	private int version;
	private Boolean ishistologicaltypepertinent;
	private Boolean ishistologicalgradepertinent;
	private Boolean istumourlocationpertinent;
	private Boolean isriskcategorypertinent;
	private Boolean ispsapertinent;
	private Boolean isgleasonpertinent;
	private ims.clinicaladmin.vo.beans.PSAConfigVoBean[] psa;
	private ims.clinicaladmin.vo.beans.GleasonConfigLiteVoBean[] gleason;
	private ims.oncology.vo.beans.PrognosticLocationConfigVoBean[] location;
	private ims.clinicaladmin.vo.beans.PrognosticRiskConfigVoBean[] risk;
	private Boolean usetvalues;
	private Boolean usemvalues;
	private Boolean usenvalues;
}