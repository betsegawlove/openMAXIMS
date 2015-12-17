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

package ims.clinical.vo;

/**
 * Linked to clinical.configuration.SECSConfiguration business object (ID: 1028100024).
 */
public class SECSConfigurationVo extends ims.clinical.configuration.vo.SECSConfigurationRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public SECSConfigurationVo()
	{
	}
	public SECSConfigurationVo(Integer id, int version)
	{
		super(id, version);
	}
	public SECSConfigurationVo(ims.clinical.vo.beans.SECSConfigurationVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.type = bean.getType() == null ? null : ims.core.vo.lookups.SECSTypes.buildLookup(bean.getType());
		this.rangeconfig = bean.getRangeConfig() == null ? null : bean.getRangeConfig().buildVo();
		this.lookupconfig = bean.getLookupConfig() == null ? null : bean.getLookupConfig().buildVo();
		this.oxygensatsconfig = bean.getOxygenSatsConfig() == null ? null : bean.getOxygenSatsConfig().buildVo();
		this.isactive = bean.getIsActive();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.SECSConfigurationVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.type = bean.getType() == null ? null : ims.core.vo.lookups.SECSTypes.buildLookup(bean.getType());
		this.rangeconfig = bean.getRangeConfig() == null ? null : bean.getRangeConfig().buildVo(map);
		this.lookupconfig = bean.getLookupConfig() == null ? null : bean.getLookupConfig().buildVo(map);
		this.oxygensatsconfig = bean.getOxygenSatsConfig() == null ? null : bean.getOxygenSatsConfig().buildVo(map);
		this.isactive = bean.getIsActive();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.SECSConfigurationVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.SECSConfigurationVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.SECSConfigurationVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("TYPE"))
			return getType();
		if(fieldName.equals("RANGECONFIG"))
			return getRangeConfig();
		if(fieldName.equals("LOOKUPCONFIG"))
			return getLookupConfig();
		if(fieldName.equals("OXYGENSATSCONFIG"))
			return getOxygenSatsConfig();
		if(fieldName.equals("ISACTIVE"))
			return getIsActive();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getTypeIsNotNull()
	{
		return this.type != null;
	}
	public ims.core.vo.lookups.SECSTypes getType()
	{
		return this.type;
	}
	public void setType(ims.core.vo.lookups.SECSTypes value)
	{
		this.isValidated = false;
		this.type = value;
	}
	public boolean getRangeConfigIsNotNull()
	{
		return this.rangeconfig != null;
	}
	public ims.clinical.vo.SECSRangeConfigVo getRangeConfig()
	{
		return this.rangeconfig;
	}
	public void setRangeConfig(ims.clinical.vo.SECSRangeConfigVo value)
	{
		this.isValidated = false;
		this.rangeconfig = value;
	}
	public boolean getLookupConfigIsNotNull()
	{
		return this.lookupconfig != null;
	}
	public ims.clinical.vo.SECSLookupConfigVo getLookupConfig()
	{
		return this.lookupconfig;
	}
	public void setLookupConfig(ims.clinical.vo.SECSLookupConfigVo value)
	{
		this.isValidated = false;
		this.lookupconfig = value;
	}
	public boolean getOxygenSatsConfigIsNotNull()
	{
		return this.oxygensatsconfig != null;
	}
	public ims.clinical.vo.SECSOxygenSatsVo getOxygenSatsConfig()
	{
		return this.oxygensatsconfig;
	}
	public void setOxygenSatsConfig(ims.clinical.vo.SECSOxygenSatsVo value)
	{
		this.isValidated = false;
		this.oxygensatsconfig = value;
	}
	public boolean getIsActiveIsNotNull()
	{
		return this.isactive != null;
	}
	public Boolean getIsActive()
	{
		return this.isactive;
	}
	public void setIsActive(Boolean value)
	{
		this.isValidated = false;
		this.isactive = value;
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		if(this.rangeconfig != null)
		{
			if(!this.rangeconfig.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.lookupconfig != null)
		{
			if(!this.lookupconfig.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.oxygensatsconfig != null)
		{
			if(!this.oxygensatsconfig.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		if(this.type == null)
			listOfErrors.add("Parameter is mandatory");
		if(this.rangeconfig != null)
		{
			String[] listOfOtherErrors = this.rangeconfig.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.lookupconfig != null)
		{
			String[] listOfOtherErrors = this.lookupconfig.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.oxygensatsconfig != null)
		{
			String[] listOfOtherErrors = this.oxygensatsconfig.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.isactive == null)
			listOfErrors.add("isActive is mandatory");
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		SECSConfigurationVo clone = new SECSConfigurationVo(this.id, this.version);
		
		if(this.type == null)
			clone.type = null;
		else
			clone.type = (ims.core.vo.lookups.SECSTypes)this.type.clone();
		if(this.rangeconfig == null)
			clone.rangeconfig = null;
		else
			clone.rangeconfig = (ims.clinical.vo.SECSRangeConfigVo)this.rangeconfig.clone();
		if(this.lookupconfig == null)
			clone.lookupconfig = null;
		else
			clone.lookupconfig = (ims.clinical.vo.SECSLookupConfigVo)this.lookupconfig.clone();
		if(this.oxygensatsconfig == null)
			clone.oxygensatsconfig = null;
		else
			clone.oxygensatsconfig = (ims.clinical.vo.SECSOxygenSatsVo)this.oxygensatsconfig.clone();
		clone.isactive = this.isactive;
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(SECSConfigurationVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A SECSConfigurationVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		SECSConfigurationVo compareObj = (SECSConfigurationVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getType() == null && compareObj.getType() != null)
				return -1;
			if(this.getType() != null && compareObj.getType() == null)
				return 1;
			if(this.getType() != null && compareObj.getType() != null)
				retVal = this.getType().compareTo(compareObj.getType());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.type != null)
			count++;
		if(this.rangeconfig != null)
			count++;
		if(this.lookupconfig != null)
			count++;
		if(this.oxygensatsconfig != null)
			count++;
		if(this.isactive != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 5;
	}
	protected ims.core.vo.lookups.SECSTypes type;
	protected ims.clinical.vo.SECSRangeConfigVo rangeconfig;
	protected ims.clinical.vo.SECSLookupConfigVo lookupconfig;
	protected ims.clinical.vo.SECSOxygenSatsVo oxygensatsconfig;
	protected Boolean isactive;
	private boolean isValidated = false;
	private boolean isBusy = false;
}