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

package ims.assessment.vo;

/**
 * Linked to Assessment.Instantiation.PatientAssessment business object (ID: 1003100048).
 */
public class PatientAssessmentShortVo extends ims.assessment.vo.PatientAssessmentLiteVo implements ims.vo.ImsCloneable, Comparable, ims.vo.interfaces.IPatientAssessmentData
{
	private static final long serialVersionUID = 1L;

	public PatientAssessmentShortVo()
	{
	}
	public PatientAssessmentShortVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientAssessmentShortVo(ims.assessment.vo.beans.PatientAssessmentShortVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo();
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PatientAssessmentStatusReason.buildLookup(bean.getStatus());
		this.completedhcp = bean.getCompletedHCP() == null ? null : bean.getCompletedHCP().buildVo();
		this.completeddatetime = bean.getCompletedDateTime() == null ? null : bean.getCompletedDateTime().buildDateTime();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
		this.assessmentdata = bean.getAssessmentData() == null ? null : bean.getAssessmentData().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.assessment.vo.beans.PatientAssessmentShortVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo(map);
		this.status = bean.getStatus() == null ? null : ims.core.vo.lookups.PatientAssessmentStatusReason.buildLookup(bean.getStatus());
		this.completedhcp = bean.getCompletedHCP() == null ? null : bean.getCompletedHCP().buildVo(map);
		this.completeddatetime = bean.getCompletedDateTime() == null ? null : bean.getCompletedDateTime().buildDateTime();
		this.sysinfo = bean.getSysInfo() == null ? null : bean.getSysInfo().buildSystemInformation();
		this.assessmentdata = bean.getAssessmentData() == null ? null : bean.getAssessmentData().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.assessment.vo.beans.PatientAssessmentShortVoBean bean = null;
		if(map != null)
			bean = (ims.assessment.vo.beans.PatientAssessmentShortVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.assessment.vo.beans.PatientAssessmentShortVoBean();
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
		if(fieldName.equals("ASSESSMENTDATA"))
			return getAssessmentData();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getAssessmentDataIsNotNull()
	{
		return this.assessmentdata != null;
	}
	public ims.assessment.vo.PatientAssessmentDataLiteVo getAssessmentData()
	{
		return this.assessmentdata;
	}
	public void setAssessmentData(ims.assessment.vo.PatientAssessmentDataLiteVo value)
	{
		this.isValidated = false;
		this.assessmentdata = value;
	}
	/**
	* IPatientAssessmentData implementation
	*/
	/**
	 * Gets the name of the assessment the PatientAssessment was based on when created
	 */
	public String getAssessmentName()
	{
		if (this.assessmentdata == null)
			return null;
			
		if (this.assessmentdata.userassessment != null)
			return this.assessmentdata.userassessment.name;
			
		if (this.assessmentdata.graphic != null)
			return this.assessmentdata.graphic.name;
			
		return null;
	}
	
	
	/**
	 * Gets authoring information
	 */
	public ims.core.vo.AuthoringInformationVo getAuthoringInfo()
	{
		return this.authoringinformation;
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
		if(this.authoringinformation != null)
		{
			if(!this.authoringinformation.isValidated())
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
		if(this.authoringinformation == null)
			listOfErrors.add("AuthoringInformation is mandatory");
		if(this.authoringinformation != null)
		{
			String[] listOfOtherErrors = this.authoringinformation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.assessmentdata == null)
			listOfErrors.add("AssessmentData is mandatory");
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
	
		PatientAssessmentShortVo clone = new PatientAssessmentShortVo(this.id, this.version);
		
		if(this.authoringinformation == null)
			clone.authoringinformation = null;
		else
			clone.authoringinformation = (ims.core.vo.AuthoringInformationVo)this.authoringinformation.clone();
		if(this.status == null)
			clone.status = null;
		else
			clone.status = (ims.core.vo.lookups.PatientAssessmentStatusReason)this.status.clone();
		if(this.completedhcp == null)
			clone.completedhcp = null;
		else
			clone.completedhcp = (ims.core.vo.HcpLiteVo)this.completedhcp.clone();
		if(this.completeddatetime == null)
			clone.completeddatetime = null;
		else
			clone.completeddatetime = (ims.framework.utils.DateTime)this.completeddatetime.clone();
		if(this.sysinfo == null)
			clone.sysinfo = null;
		else
			clone.sysinfo = (ims.vo.SystemInformation)this.sysinfo.clone();
		if(this.assessmentdata == null)
			clone.assessmentdata = null;
		else
			clone.assessmentdata = (ims.assessment.vo.PatientAssessmentDataLiteVo)this.assessmentdata.clone();
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
		if (!(PatientAssessmentShortVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientAssessmentShortVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PatientAssessmentShortVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PatientAssessmentShortVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = super.countFieldsWithValue();
		if(this.assessmentdata != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return super.countValueObjectFields() + 1;
	}
	protected ims.assessment.vo.PatientAssessmentDataLiteVo assessmentdata;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
