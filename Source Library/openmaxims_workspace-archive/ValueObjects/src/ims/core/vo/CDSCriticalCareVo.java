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

package ims.core.vo;

/**
 * Linked to core.cds.CDSCriticalCareDetails business object (ID: 1104100005).
 */
public class CDSCriticalCareVo extends ims.core.cds.vo.CDSCriticalCareDetailsRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public CDSCriticalCareVo()
	{
	}
	public CDSCriticalCareVo(Integer id, int version)
	{
		super(id, version);
	}
	public CDSCriticalCareVo(ims.core.vo.beans.CDSCriticalCareVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.localid = bean.getLocalId();
		this.startdate = bean.getStartDate() == null ? null : bean.getStartDate().buildDate();
		this.starttime = bean.getStartTime() == null ? null : bean.getStartTime().buildTime();
		this.unitfunction = bean.getUnitFunction();
		this.gestationlen = bean.getGestationLen();
		this.activitydate = bean.getActivityDate() == null ? null : bean.getActivityDate().buildDate();
		this.personweight = bean.getPersonWeight();
		this.activitycode = bean.getActivityCode();
		this.highcostdrugs = bean.getHighCostDrugs();
		this.dischargedate = bean.getDischargeDate() == null ? null : bean.getDischargeDate().buildDate();
		this.dischargetime = bean.getDischargeTime() == null ? null : bean.getDischargeTime().buildTime();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.CDSCriticalCareVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.localid = bean.getLocalId();
		this.startdate = bean.getStartDate() == null ? null : bean.getStartDate().buildDate();
		this.starttime = bean.getStartTime() == null ? null : bean.getStartTime().buildTime();
		this.unitfunction = bean.getUnitFunction();
		this.gestationlen = bean.getGestationLen();
		this.activitydate = bean.getActivityDate() == null ? null : bean.getActivityDate().buildDate();
		this.personweight = bean.getPersonWeight();
		this.activitycode = bean.getActivityCode();
		this.highcostdrugs = bean.getHighCostDrugs();
		this.dischargedate = bean.getDischargeDate() == null ? null : bean.getDischargeDate().buildDate();
		this.dischargetime = bean.getDischargeTime() == null ? null : bean.getDischargeTime().buildTime();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.CDSCriticalCareVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.CDSCriticalCareVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.CDSCriticalCareVoBean();
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
		if(fieldName.equals("LOCALID"))
			return getLocalId();
		if(fieldName.equals("STARTDATE"))
			return getStartDate();
		if(fieldName.equals("STARTTIME"))
			return getStartTime();
		if(fieldName.equals("UNITFUNCTION"))
			return getUnitFunction();
		if(fieldName.equals("GESTATIONLEN"))
			return getGestationLen();
		if(fieldName.equals("ACTIVITYDATE"))
			return getActivityDate();
		if(fieldName.equals("PERSONWEIGHT"))
			return getPersonWeight();
		if(fieldName.equals("ACTIVITYCODE"))
			return getActivityCode();
		if(fieldName.equals("HIGHCOSTDRUGS"))
			return getHighCostDrugs();
		if(fieldName.equals("DISCHARGEDATE"))
			return getDischargeDate();
		if(fieldName.equals("DISCHARGETIME"))
			return getDischargeTime();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getLocalIdIsNotNull()
	{
		return this.localid != null;
	}
	public String getLocalId()
	{
		return this.localid;
	}
	public static int getLocalIdMaxLength()
	{
		return 8;
	}
	public void setLocalId(String value)
	{
		this.isValidated = false;
		this.localid = value;
	}
	public boolean getStartDateIsNotNull()
	{
		return this.startdate != null;
	}
	public ims.framework.utils.Date getStartDate()
	{
		return this.startdate;
	}
	public void setStartDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.startdate = value;
	}
	public boolean getStartTimeIsNotNull()
	{
		return this.starttime != null;
	}
	public ims.framework.utils.Time getStartTime()
	{
		return this.starttime;
	}
	public void setStartTime(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.starttime = value;
	}
	public boolean getUnitFunctionIsNotNull()
	{
		return this.unitfunction != null;
	}
	public String getUnitFunction()
	{
		return this.unitfunction;
	}
	public static int getUnitFunctionMaxLength()
	{
		return 2;
	}
	public void setUnitFunction(String value)
	{
		this.isValidated = false;
		this.unitfunction = value;
	}
	public boolean getGestationLenIsNotNull()
	{
		return this.gestationlen != null;
	}
	public String getGestationLen()
	{
		return this.gestationlen;
	}
	public static int getGestationLenMaxLength()
	{
		return 2;
	}
	public void setGestationLen(String value)
	{
		this.isValidated = false;
		this.gestationlen = value;
	}
	public boolean getActivityDateIsNotNull()
	{
		return this.activitydate != null;
	}
	public ims.framework.utils.Date getActivityDate()
	{
		return this.activitydate;
	}
	public void setActivityDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.activitydate = value;
	}
	public boolean getPersonWeightIsNotNull()
	{
		return this.personweight != null;
	}
	public String getPersonWeight()
	{
		return this.personweight;
	}
	public static int getPersonWeightMaxLength()
	{
		return 5;
	}
	public void setPersonWeight(String value)
	{
		this.isValidated = false;
		this.personweight = value;
	}
	public boolean getActivityCodeIsNotNull()
	{
		return this.activitycode != null;
	}
	public String getActivityCode()
	{
		return this.activitycode;
	}
	public static int getActivityCodeMaxLength()
	{
		return 2;
	}
	public void setActivityCode(String value)
	{
		this.isValidated = false;
		this.activitycode = value;
	}
	public boolean getHighCostDrugsIsNotNull()
	{
		return this.highcostdrugs != null;
	}
	public String getHighCostDrugs()
	{
		return this.highcostdrugs;
	}
	public static int getHighCostDrugsMaxLength()
	{
		return 5;
	}
	public void setHighCostDrugs(String value)
	{
		this.isValidated = false;
		this.highcostdrugs = value;
	}
	public boolean getDischargeDateIsNotNull()
	{
		return this.dischargedate != null;
	}
	public ims.framework.utils.Date getDischargeDate()
	{
		return this.dischargedate;
	}
	public void setDischargeDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.dischargedate = value;
	}
	public boolean getDischargeTimeIsNotNull()
	{
		return this.dischargetime != null;
	}
	public ims.framework.utils.Time getDischargeTime()
	{
		return this.dischargetime;
	}
	public void setDischargeTime(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.dischargetime = value;
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
		if(this.localid != null)
			if(this.localid.length() > 8)
				listOfErrors.add("The length of the field [localid] in the value object [ims.core.vo.CDSCriticalCareVo] is too big. It should be less or equal to 8");
		if(this.unitfunction != null)
			if(this.unitfunction.length() > 2)
				listOfErrors.add("The length of the field [unitfunction] in the value object [ims.core.vo.CDSCriticalCareVo] is too big. It should be less or equal to 2");
		if(this.gestationlen != null)
			if(this.gestationlen.length() > 2)
				listOfErrors.add("The length of the field [gestationlen] in the value object [ims.core.vo.CDSCriticalCareVo] is too big. It should be less or equal to 2");
		if(this.personweight != null)
			if(this.personweight.length() > 5)
				listOfErrors.add("The length of the field [personweight] in the value object [ims.core.vo.CDSCriticalCareVo] is too big. It should be less or equal to 5");
		if(this.activitycode != null)
			if(this.activitycode.length() > 2)
				listOfErrors.add("The length of the field [activitycode] in the value object [ims.core.vo.CDSCriticalCareVo] is too big. It should be less or equal to 2");
		if(this.highcostdrugs != null)
			if(this.highcostdrugs.length() > 5)
				listOfErrors.add("The length of the field [highcostdrugs] in the value object [ims.core.vo.CDSCriticalCareVo] is too big. It should be less or equal to 5");
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
	
		CDSCriticalCareVo clone = new CDSCriticalCareVo(this.id, this.version);
		
		clone.localid = this.localid;
		if(this.startdate == null)
			clone.startdate = null;
		else
			clone.startdate = (ims.framework.utils.Date)this.startdate.clone();
		if(this.starttime == null)
			clone.starttime = null;
		else
			clone.starttime = (ims.framework.utils.Time)this.starttime.clone();
		clone.unitfunction = this.unitfunction;
		clone.gestationlen = this.gestationlen;
		if(this.activitydate == null)
			clone.activitydate = null;
		else
			clone.activitydate = (ims.framework.utils.Date)this.activitydate.clone();
		clone.personweight = this.personweight;
		clone.activitycode = this.activitycode;
		clone.highcostdrugs = this.highcostdrugs;
		if(this.dischargedate == null)
			clone.dischargedate = null;
		else
			clone.dischargedate = (ims.framework.utils.Date)this.dischargedate.clone();
		if(this.dischargetime == null)
			clone.dischargetime = null;
		else
			clone.dischargetime = (ims.framework.utils.Time)this.dischargetime.clone();
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
		if (!(CDSCriticalCareVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A CDSCriticalCareVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((CDSCriticalCareVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((CDSCriticalCareVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.localid != null)
			count++;
		if(this.startdate != null)
			count++;
		if(this.starttime != null)
			count++;
		if(this.unitfunction != null)
			count++;
		if(this.gestationlen != null)
			count++;
		if(this.activitydate != null)
			count++;
		if(this.personweight != null)
			count++;
		if(this.activitycode != null)
			count++;
		if(this.highcostdrugs != null)
			count++;
		if(this.dischargedate != null)
			count++;
		if(this.dischargetime != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 11;
	}
	protected String localid;
	protected ims.framework.utils.Date startdate;
	protected ims.framework.utils.Time starttime;
	protected String unitfunction;
	protected String gestationlen;
	protected ims.framework.utils.Date activitydate;
	protected String personweight;
	protected String activitycode;
	protected String highcostdrugs;
	protected ims.framework.utils.Date dischargedate;
	protected ims.framework.utils.Time dischargetime;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
