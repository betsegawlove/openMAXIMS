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

package ims.coe.vo;

/**
 * Linked to nursing.assessment.Assessment Component business object (ID: 1015100001).
 */
public class AssessmentSleeping extends ims.nursing.vo.AssessmentComponent implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public AssessmentSleeping()
	{
	}
	public AssessmentSleeping(Integer id, int version)
	{
		super(id, version);
	}
	public AssessmentSleeping(ims.coe.vo.beans.AssessmentSleepingBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.iscomplete = bean.getIsComplete();
		this.assessmentinfo = ims.nursing.vo.AssessmentInfoCollection.buildFromBeanCollection(bean.getAssessmentInfo());
		this.copy = bean.getCopy();
		this.componenttype = bean.getComponentType() == null ? null : ims.nursing.vo.lookups.AssessmentComponentType.buildLookup(bean.getComponentType());
		this.lastassessmentinfo = bean.getLastAssessmentInfo() == null ? null : bean.getLastAssessmentInfo().buildVo();
		this.careplantemplate = ims.nursing.vo.CarePlanTemplateCollection.buildFromBeanCollection(bean.getCarePlanTemplate());
		this.careplans = ims.nursing.vo.CarePlanCollection.buildFromBeanCollection(bean.getCarePlans());
		this.timepatientgotobed = bean.getTimePatientGoToBed() == null ? null : bean.getTimePatientGoToBed().buildTime();
		this.timepatientgetup = bean.getTimePatientGetUp() == null ? null : bean.getTimePatientGetUp().buildTime();
		this.howmanyblankets = bean.getHowManyBlankets();
		this.howmanypillows = bean.getHowManyPillows();
		this.patternofsleep = bean.getPatternOfSleep();
		this.patienthavedifficultyinsleeping = bean.getPatientHaveDifficultyInSleeping() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getPatientHaveDifficultyInSleeping());
		this.sleepingaids = bean.getSleepingAids() == null ? null : bean.getSleepingAids().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.coe.vo.beans.AssessmentSleepingBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.iscomplete = bean.getIsComplete();
		this.assessmentinfo = ims.nursing.vo.AssessmentInfoCollection.buildFromBeanCollection(bean.getAssessmentInfo());
		this.copy = bean.getCopy();
		this.componenttype = bean.getComponentType() == null ? null : ims.nursing.vo.lookups.AssessmentComponentType.buildLookup(bean.getComponentType());
		this.lastassessmentinfo = bean.getLastAssessmentInfo() == null ? null : bean.getLastAssessmentInfo().buildVo(map);
		this.careplantemplate = ims.nursing.vo.CarePlanTemplateCollection.buildFromBeanCollection(bean.getCarePlanTemplate());
		this.careplans = ims.nursing.vo.CarePlanCollection.buildFromBeanCollection(bean.getCarePlans());
		this.timepatientgotobed = bean.getTimePatientGoToBed() == null ? null : bean.getTimePatientGoToBed().buildTime();
		this.timepatientgetup = bean.getTimePatientGetUp() == null ? null : bean.getTimePatientGetUp().buildTime();
		this.howmanyblankets = bean.getHowManyBlankets();
		this.howmanypillows = bean.getHowManyPillows();
		this.patternofsleep = bean.getPatternOfSleep();
		this.patienthavedifficultyinsleeping = bean.getPatientHaveDifficultyInSleeping() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getPatientHaveDifficultyInSleeping());
		this.sleepingaids = bean.getSleepingAids() == null ? null : bean.getSleepingAids().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.coe.vo.beans.AssessmentSleepingBean bean = null;
		if(map != null)
			bean = (ims.coe.vo.beans.AssessmentSleepingBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.coe.vo.beans.AssessmentSleepingBean();
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
		if(fieldName.equals("TIMEPATIENTGOTOBED"))
			return getTimePatientGoToBed();
		if(fieldName.equals("TIMEPATIENTGETUP"))
			return getTimePatientGetUp();
		if(fieldName.equals("HOWMANYBLANKETS"))
			return getHowManyBlankets();
		if(fieldName.equals("HOWMANYPILLOWS"))
			return getHowManyPillows();
		if(fieldName.equals("PATTERNOFSLEEP"))
			return getPatternOfSleep();
		if(fieldName.equals("PATIENTHAVEDIFFICULTYINSLEEPING"))
			return getPatientHaveDifficultyInSleeping();
		if(fieldName.equals("SLEEPINGAIDS"))
			return getSleepingAids();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getTimePatientGoToBedIsNotNull()
	{
		return this.timepatientgotobed != null;
	}
	public ims.framework.utils.Time getTimePatientGoToBed()
	{
		return this.timepatientgotobed;
	}
	public void setTimePatientGoToBed(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.timepatientgotobed = value;
	}
	public boolean getTimePatientGetUpIsNotNull()
	{
		return this.timepatientgetup != null;
	}
	public ims.framework.utils.Time getTimePatientGetUp()
	{
		return this.timepatientgetup;
	}
	public void setTimePatientGetUp(ims.framework.utils.Time value)
	{
		this.isValidated = false;
		this.timepatientgetup = value;
	}
	public boolean getHowManyBlanketsIsNotNull()
	{
		return this.howmanyblankets != null;
	}
	public Integer getHowManyBlankets()
	{
		return this.howmanyblankets;
	}
	public void setHowManyBlankets(Integer value)
	{
		this.isValidated = false;
		this.howmanyblankets = value;
	}
	public boolean getHowManyPillowsIsNotNull()
	{
		return this.howmanypillows != null;
	}
	public Integer getHowManyPillows()
	{
		return this.howmanypillows;
	}
	public void setHowManyPillows(Integer value)
	{
		this.isValidated = false;
		this.howmanypillows = value;
	}
	public boolean getPatternOfSleepIsNotNull()
	{
		return this.patternofsleep != null;
	}
	public String getPatternOfSleep()
	{
		return this.patternofsleep;
	}
	public static int getPatternOfSleepMaxLength()
	{
		return 500;
	}
	public void setPatternOfSleep(String value)
	{
		this.isValidated = false;
		this.patternofsleep = value;
	}
	public boolean getPatientHaveDifficultyInSleepingIsNotNull()
	{
		return this.patienthavedifficultyinsleeping != null;
	}
	public ims.core.vo.lookups.YesNoUnknown getPatientHaveDifficultyInSleeping()
	{
		return this.patienthavedifficultyinsleeping;
	}
	public void setPatientHaveDifficultyInSleeping(ims.core.vo.lookups.YesNoUnknown value)
	{
		this.isValidated = false;
		this.patienthavedifficultyinsleeping = value;
	}
	public boolean getSleepingAidsIsNotNull()
	{
		return this.sleepingaids != null;
	}
	public ims.coe.vo.SleepingAidsVo getSleepingAids()
	{
		return this.sleepingaids;
	}
	public void setSleepingAids(ims.coe.vo.SleepingAidsVo value)
	{
		this.isValidated = false;
		this.sleepingaids = value;
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
		if(this.assessmentinfo != null)
		{
			if(!this.assessmentinfo.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.lastassessmentinfo != null)
		{
			if(!this.lastassessmentinfo.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.careplantemplate != null)
		{
			if(!this.careplantemplate.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.careplans != null)
		{
			if(!this.careplans.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.sleepingaids != null)
		{
			if(!this.sleepingaids.isValidated())
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
		if(this.assessmentinfo != null)
		{
			String[] listOfOtherErrors = this.assessmentinfo.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.lastassessmentinfo != null)
		{
			String[] listOfOtherErrors = this.lastassessmentinfo.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.careplantemplate != null)
		{
			String[] listOfOtherErrors = this.careplantemplate.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.careplans != null)
		{
			String[] listOfOtherErrors = this.careplans.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.patternofsleep != null)
			if(this.patternofsleep.length() > 500)
				listOfErrors.add("The length of the field [patternofsleep] in the value object [ims.coe.vo.AssessmentSleeping] is too big. It should be less or equal to 500");
		if(this.sleepingaids != null)
		{
			String[] listOfOtherErrors = this.sleepingaids.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
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
	
		AssessmentSleeping clone = new AssessmentSleeping(this.id, this.version);
		
		clone.iscomplete = this.iscomplete;
		if(this.assessmentinfo == null)
			clone.assessmentinfo = null;
		else
			clone.assessmentinfo = (ims.nursing.vo.AssessmentInfoCollection)this.assessmentinfo.clone();
		clone.copy = this.copy;
		if(this.componenttype == null)
			clone.componenttype = null;
		else
			clone.componenttype = (ims.nursing.vo.lookups.AssessmentComponentType)this.componenttype.clone();
		if(this.lastassessmentinfo == null)
			clone.lastassessmentinfo = null;
		else
			clone.lastassessmentinfo = (ims.nursing.vo.AssessmentInfo)this.lastassessmentinfo.clone();
		if(this.careplantemplate == null)
			clone.careplantemplate = null;
		else
			clone.careplantemplate = (ims.nursing.vo.CarePlanTemplateCollection)this.careplantemplate.clone();
		if(this.careplans == null)
			clone.careplans = null;
		else
			clone.careplans = (ims.nursing.vo.CarePlanCollection)this.careplans.clone();
		if(this.timepatientgotobed == null)
			clone.timepatientgotobed = null;
		else
			clone.timepatientgotobed = (ims.framework.utils.Time)this.timepatientgotobed.clone();
		if(this.timepatientgetup == null)
			clone.timepatientgetup = null;
		else
			clone.timepatientgetup = (ims.framework.utils.Time)this.timepatientgetup.clone();
		clone.howmanyblankets = this.howmanyblankets;
		clone.howmanypillows = this.howmanypillows;
		clone.patternofsleep = this.patternofsleep;
		if(this.patienthavedifficultyinsleeping == null)
			clone.patienthavedifficultyinsleeping = null;
		else
			clone.patienthavedifficultyinsleeping = (ims.core.vo.lookups.YesNoUnknown)this.patienthavedifficultyinsleeping.clone();
		if(this.sleepingaids == null)
			clone.sleepingaids = null;
		else
			clone.sleepingaids = (ims.coe.vo.SleepingAidsVo)this.sleepingaids.clone();
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
		if (!(AssessmentSleeping.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A AssessmentSleeping object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((AssessmentSleeping)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((AssessmentSleeping)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.timepatientgotobed != null)
			count++;
		if(this.timepatientgetup != null)
			count++;
		if(this.howmanyblankets != null)
			count++;
		if(this.howmanypillows != null)
			count++;
		if(this.patternofsleep != null)
			count++;
		if(this.patienthavedifficultyinsleeping != null)
			count++;
		if(this.sleepingaids != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 7;
	}
	protected ims.framework.utils.Time timepatientgotobed;
	protected ims.framework.utils.Time timepatientgetup;
	protected Integer howmanyblankets;
	protected Integer howmanypillows;
	protected String patternofsleep;
	protected ims.core.vo.lookups.YesNoUnknown patienthavedifficultyinsleeping;
	protected ims.coe.vo.SleepingAidsVo sleepingaids;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
