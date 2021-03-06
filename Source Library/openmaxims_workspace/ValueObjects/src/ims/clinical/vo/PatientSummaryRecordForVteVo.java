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

package ims.clinical.vo;

/**
 * Linked to core.PatientSummaryRecord business object (ID: 1000100005).
 */
public class PatientSummaryRecordForVteVo extends ims.core.vo.PatientSummaryRecordRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientSummaryRecordForVteVo()
	{
	}
	public PatientSummaryRecordForVteVo(Integer id, int version)
	{
		super(id, version);
	}
	public PatientSummaryRecordForVteVo(ims.clinical.vo.beans.PatientSummaryRecordForVteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.preopvteassessment = bean.getPreOpVTEAssessment() == null ? null : bean.getPreOpVTEAssessment().buildVo();
		this.preopvtecompleteddate = bean.getPreOpVTECompletedDate() == null ? null : bean.getPreOpVTECompletedDate().buildDate();
		this.preopvtevalidationdate = bean.getPreOpVTEValidationDate() == null ? null : bean.getPreOpVTEValidationDate().buildDate();
		this.inpatientvteassessment = bean.getInpatientVTEAssessment() == null ? null : bean.getInpatientVTEAssessment().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.PatientSummaryRecordForVteVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.preopvteassessment = bean.getPreOpVTEAssessment() == null ? null : bean.getPreOpVTEAssessment().buildVo(map);
		this.preopvtecompleteddate = bean.getPreOpVTECompletedDate() == null ? null : bean.getPreOpVTECompletedDate().buildDate();
		this.preopvtevalidationdate = bean.getPreOpVTEValidationDate() == null ? null : bean.getPreOpVTEValidationDate().buildDate();
		this.inpatientvteassessment = bean.getInpatientVTEAssessment() == null ? null : bean.getInpatientVTEAssessment().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.PatientSummaryRecordForVteVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.PatientSummaryRecordForVteVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.PatientSummaryRecordForVteVoBean();
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
		if(fieldName.equals("PREOPVTEASSESSMENT"))
			return getPreOpVTEAssessment();
		if(fieldName.equals("PREOPVTECOMPLETEDDATE"))
			return getPreOpVTECompletedDate();
		if(fieldName.equals("PREOPVTEVALIDATIONDATE"))
			return getPreOpVTEValidationDate();
		if(fieldName.equals("INPATIENTVTEASSESSMENT"))
			return getInpatientVTEAssessment();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPreOpVTEAssessmentIsNotNull()
	{
		return this.preopvteassessment != null;
	}
	public ims.clinical.vo.VTERiskAssessmentStatusVo getPreOpVTEAssessment()
	{
		return this.preopvteassessment;
	}
	public void setPreOpVTEAssessment(ims.clinical.vo.VTERiskAssessmentStatusVo value)
	{
		this.isValidated = false;
		this.preopvteassessment = value;
	}
	public boolean getPreOpVTECompletedDateIsNotNull()
	{
		return this.preopvtecompleteddate != null;
	}
	public ims.framework.utils.Date getPreOpVTECompletedDate()
	{
		return this.preopvtecompleteddate;
	}
	public void setPreOpVTECompletedDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.preopvtecompleteddate = value;
	}
	public boolean getPreOpVTEValidationDateIsNotNull()
	{
		return this.preopvtevalidationdate != null;
	}
	public ims.framework.utils.Date getPreOpVTEValidationDate()
	{
		return this.preopvtevalidationdate;
	}
	public void setPreOpVTEValidationDate(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.preopvtevalidationdate = value;
	}
	public boolean getInpatientVTEAssessmentIsNotNull()
	{
		return this.inpatientvteassessment != null;
	}
	public ims.clinical.vo.VTERiskAssessmentStatusVo getInpatientVTEAssessment()
	{
		return this.inpatientvteassessment;
	}
	public void setInpatientVTEAssessment(ims.clinical.vo.VTERiskAssessmentStatusVo value)
	{
		this.isValidated = false;
		this.inpatientvteassessment = value;
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
	
		PatientSummaryRecordForVteVo clone = new PatientSummaryRecordForVteVo(this.id, this.version);
		
		if(this.preopvteassessment == null)
			clone.preopvteassessment = null;
		else
			clone.preopvteassessment = (ims.clinical.vo.VTERiskAssessmentStatusVo)this.preopvteassessment.clone();
		if(this.preopvtecompleteddate == null)
			clone.preopvtecompleteddate = null;
		else
			clone.preopvtecompleteddate = (ims.framework.utils.Date)this.preopvtecompleteddate.clone();
		if(this.preopvtevalidationdate == null)
			clone.preopvtevalidationdate = null;
		else
			clone.preopvtevalidationdate = (ims.framework.utils.Date)this.preopvtevalidationdate.clone();
		if(this.inpatientvteassessment == null)
			clone.inpatientvteassessment = null;
		else
			clone.inpatientvteassessment = (ims.clinical.vo.VTERiskAssessmentStatusVo)this.inpatientvteassessment.clone();
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
		if (!(PatientSummaryRecordForVteVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientSummaryRecordForVteVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PatientSummaryRecordForVteVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PatientSummaryRecordForVteVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.preopvteassessment != null)
			count++;
		if(this.preopvtecompleteddate != null)
			count++;
		if(this.preopvtevalidationdate != null)
			count++;
		if(this.inpatientvteassessment != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 4;
	}
	protected ims.clinical.vo.VTERiskAssessmentStatusVo preopvteassessment;
	protected ims.framework.utils.Date preopvtecompleteddate;
	protected ims.framework.utils.Date preopvtevalidationdate;
	protected ims.clinical.vo.VTERiskAssessmentStatusVo inpatientvteassessment;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
