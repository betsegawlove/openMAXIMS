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

package ims.emergency.vo;

/**
 * Linked to core.admin.EmergencyAttendance business object (ID: 1004100025).
 */
public class EmergencyAttendanceNonInsuranceHealthCoverVo extends ims.core.admin.vo.EmergencyAttendanceRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public EmergencyAttendanceNonInsuranceHealthCoverVo()
	{
	}
	public EmergencyAttendanceNonInsuranceHealthCoverVo(Integer id, int version)
	{
		super(id, version);
	}
	public EmergencyAttendanceNonInsuranceHealthCoverVo(ims.emergency.vo.beans.EmergencyAttendanceNonInsuranceHealthCoverVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.insurance = bean.getInsurance() == null ? null : bean.getInsurance().buildVo();
		this.patientmedicalinsurance = bean.getPatientMedicalInsurance() == null ? null : bean.getPatientMedicalInsurance().buildVo();
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.emergency.vo.beans.EmergencyAttendanceNonInsuranceHealthCoverVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.insurance = bean.getInsurance() == null ? null : bean.getInsurance().buildVo(map);
		this.patientmedicalinsurance = bean.getPatientMedicalInsurance() == null ? null : bean.getPatientMedicalInsurance().buildVo(map);
		this.patient = bean.getPatient() == null ? null : bean.getPatient().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.emergency.vo.beans.EmergencyAttendanceNonInsuranceHealthCoverVoBean bean = null;
		if(map != null)
			bean = (ims.emergency.vo.beans.EmergencyAttendanceNonInsuranceHealthCoverVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.emergency.vo.beans.EmergencyAttendanceNonInsuranceHealthCoverVoBean();
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
		if(fieldName.equals("INSURANCE"))
			return getInsurance();
		if(fieldName.equals("PATIENTMEDICALINSURANCE"))
			return getPatientMedicalInsurance();
		if(fieldName.equals("PATIENT"))
			return getPatient();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getInsuranceIsNotNull()
	{
		return this.insurance != null;
	}
	public ims.core.vo.NationalHealthCoverVo getInsurance()
	{
		return this.insurance;
	}
	public void setInsurance(ims.core.vo.NationalHealthCoverVo value)
	{
		this.isValidated = false;
		this.insurance = value;
	}
	public boolean getPatientMedicalInsuranceIsNotNull()
	{
		return this.patientmedicalinsurance != null;
	}
	public ims.core.vo.PatientMedicalInsuranceVo getPatientMedicalInsurance()
	{
		return this.patientmedicalinsurance;
	}
	public void setPatientMedicalInsurance(ims.core.vo.PatientMedicalInsuranceVo value)
	{
		this.isValidated = false;
		this.patientmedicalinsurance = value;
	}
	public boolean getPatientIsNotNull()
	{
		return this.patient != null;
	}
	public ims.emergency.vo.PatientWithNonHealthCoverLiteVo getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.emergency.vo.PatientWithNonHealthCoverLiteVo value)
	{
		this.isValidated = false;
		this.patient = value;
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
		if(this.insurance != null)
		{
			if(!this.insurance.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.patientmedicalinsurance != null)
		{
			if(!this.patientmedicalinsurance.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.patient != null)
		{
			if(!this.patient.isValidated())
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
		if(this.insurance != null)
		{
			String[] listOfOtherErrors = this.insurance.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.patientmedicalinsurance != null)
		{
			String[] listOfOtherErrors = this.patientmedicalinsurance.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.patient == null)
			listOfErrors.add("Patient is mandatory");
		if(this.patient != null)
		{
			String[] listOfOtherErrors = this.patient.validate();
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
	
		EmergencyAttendanceNonInsuranceHealthCoverVo clone = new EmergencyAttendanceNonInsuranceHealthCoverVo(this.id, this.version);
		
		if(this.insurance == null)
			clone.insurance = null;
		else
			clone.insurance = (ims.core.vo.NationalHealthCoverVo)this.insurance.clone();
		if(this.patientmedicalinsurance == null)
			clone.patientmedicalinsurance = null;
		else
			clone.patientmedicalinsurance = (ims.core.vo.PatientMedicalInsuranceVo)this.patientmedicalinsurance.clone();
		if(this.patient == null)
			clone.patient = null;
		else
			clone.patient = (ims.emergency.vo.PatientWithNonHealthCoverLiteVo)this.patient.clone();
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
		if (!(EmergencyAttendanceNonInsuranceHealthCoverVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A EmergencyAttendanceNonInsuranceHealthCoverVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((EmergencyAttendanceNonInsuranceHealthCoverVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((EmergencyAttendanceNonInsuranceHealthCoverVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.insurance != null)
			count++;
		if(this.patientmedicalinsurance != null)
			count++;
		if(this.patient != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected ims.core.vo.NationalHealthCoverVo insurance;
	protected ims.core.vo.PatientMedicalInsuranceVo patientmedicalinsurance;
	protected ims.emergency.vo.PatientWithNonHealthCoverLiteVo patient;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
