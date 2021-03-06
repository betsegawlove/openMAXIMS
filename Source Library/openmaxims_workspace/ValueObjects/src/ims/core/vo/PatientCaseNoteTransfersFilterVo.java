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

package ims.core.vo;


public class PatientCaseNoteTransfersFilterVo extends ims.vo.ValueObject implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PatientCaseNoteTransfersFilterVo()
	{
	}
	public PatientCaseNoteTransfersFilterVo(ims.core.vo.beans.PatientCaseNoteTransfersFilterVoBean bean)
	{
		this.location = bean.getLocation() == null ? null : bean.getLocation().buildVo();
		this.requestedby = bean.getRequestedBy() == null ? null : bean.getRequestedBy().buildVo();
		this.patientcasenote = bean.getPatientCaseNote() == null ? null : new ims.core.clinical.vo.PatientCaseNoteRefVo(new Integer(bean.getPatientCaseNote().getId()), bean.getPatientCaseNote().getVersion());
		this.datefrom = bean.getDateFrom() == null ? null : bean.getDateFrom().buildDate();
		this.dateto = bean.getDateTo() == null ? null : bean.getDateTo().buildDate();
		this.transferredby = bean.getTransferredBy() == null ? null : bean.getTransferredBy().buildVo();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.PatientCaseNoteTransfersFilterVoBean bean)
	{
		this.location = bean.getLocation() == null ? null : bean.getLocation().buildVo(map);
		this.requestedby = bean.getRequestedBy() == null ? null : bean.getRequestedBy().buildVo(map);
		this.patientcasenote = bean.getPatientCaseNote() == null ? null : new ims.core.clinical.vo.PatientCaseNoteRefVo(new Integer(bean.getPatientCaseNote().getId()), bean.getPatientCaseNote().getVersion());
		this.datefrom = bean.getDateFrom() == null ? null : bean.getDateFrom().buildDate();
		this.dateto = bean.getDateTo() == null ? null : bean.getDateTo().buildDate();
		this.transferredby = bean.getTransferredBy() == null ? null : bean.getTransferredBy().buildVo(map);
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.PatientCaseNoteTransfersFilterVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.PatientCaseNoteTransfersFilterVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.PatientCaseNoteTransfersFilterVoBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public boolean getLocationIsNotNull()
	{
		return this.location != null;
	}
	public ims.core.vo.LocationLiteVo getLocation()
	{
		return this.location;
	}
	public void setLocation(ims.core.vo.LocationLiteVo value)
	{
		this.isValidated = false;
		this.location = value;
	}
	public boolean getRequestedByIsNotNull()
	{
		return this.requestedby != null;
	}
	public ims.core.vo.MemberOfStaffLiteVo getRequestedBy()
	{
		return this.requestedby;
	}
	public void setRequestedBy(ims.core.vo.MemberOfStaffLiteVo value)
	{
		this.isValidated = false;
		this.requestedby = value;
	}
	public boolean getPatientCaseNoteIsNotNull()
	{
		return this.patientcasenote != null;
	}
	public ims.core.clinical.vo.PatientCaseNoteRefVo getPatientCaseNote()
	{
		return this.patientcasenote;
	}
	public void setPatientCaseNote(ims.core.clinical.vo.PatientCaseNoteRefVo value)
	{
		this.isValidated = false;
		this.patientcasenote = value;
	}
	public boolean getDateFromIsNotNull()
	{
		return this.datefrom != null;
	}
	public ims.framework.utils.Date getDateFrom()
	{
		return this.datefrom;
	}
	public void setDateFrom(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.datefrom = value;
	}
	public boolean getDateToIsNotNull()
	{
		return this.dateto != null;
	}
	public ims.framework.utils.Date getDateTo()
	{
		return this.dateto;
	}
	public void setDateTo(ims.framework.utils.Date value)
	{
		this.isValidated = false;
		this.dateto = value;
	}
	public boolean getTransferredByIsNotNull()
	{
		return this.transferredby != null;
	}
	public ims.core.vo.MemberOfStaffLiteVo getTransferredBy()
	{
		return this.transferredby;
	}
	public void setTransferredBy(ims.core.vo.MemberOfStaffLiteVo value)
	{
		this.isValidated = false;
		this.transferredby = value;
	}
	public final String getIItemText()
	{
		return toString();
	}
	public final Integer getBoId() 
	{
		return null;
	}
	public final String getBoClassName()
	{
		return null;
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(!(obj instanceof PatientCaseNoteTransfersFilterVo))
			return false;
		PatientCaseNoteTransfersFilterVo compareObj = (PatientCaseNoteTransfersFilterVo)obj;
		if(this.getPatientCaseNote() == null && compareObj.getPatientCaseNote() != null)
			return false;
		if(this.getPatientCaseNote() != null && compareObj.getPatientCaseNote() == null)
			return false;
		if(this.getPatientCaseNote() != null && compareObj.getPatientCaseNote() != null)
			return this.getPatientCaseNote().equals(compareObj.getPatientCaseNote());
		return super.equals(obj);
	}
	/**
	* validateDataRules()
	*/
	public String[] validateDataRules()
	{
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
	
		if (this.patientcasenote == null || this.patientcasenote.getID_PatientCaseNote() == null)
		{
			listOfErrors.add("The case note argument or its id cannot be null");
		} 
		if (this.datefrom != null && this.dateto != null && this.datefrom.isGreaterThan(this.dateto) )
		{
			listOfErrors.add("'Date From' cannot be later than 'Date To'");
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{			
			return null;
		}
		return  listOfErrors.toArray(new java.lang.String[errorCount]);
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
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		PatientCaseNoteTransfersFilterVo clone = new PatientCaseNoteTransfersFilterVo();
		
		if(this.location == null)
			clone.location = null;
		else
			clone.location = (ims.core.vo.LocationLiteVo)this.location.clone();
		if(this.requestedby == null)
			clone.requestedby = null;
		else
			clone.requestedby = (ims.core.vo.MemberOfStaffLiteVo)this.requestedby.clone();
		clone.patientcasenote = this.patientcasenote;
		if(this.datefrom == null)
			clone.datefrom = null;
		else
			clone.datefrom = (ims.framework.utils.Date)this.datefrom.clone();
		if(this.dateto == null)
			clone.dateto = null;
		else
			clone.dateto = (ims.framework.utils.Date)this.dateto.clone();
		if(this.transferredby == null)
			clone.transferredby = null;
		else
			clone.transferredby = (ims.core.vo.MemberOfStaffLiteVo)this.transferredby.clone();
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
		if (!(PatientCaseNoteTransfersFilterVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PatientCaseNoteTransfersFilterVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		PatientCaseNoteTransfersFilterVo compareObj = (PatientCaseNoteTransfersFilterVo)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getPatientCaseNote() == null && compareObj.getPatientCaseNote() != null)
				return -1;
			if(this.getPatientCaseNote() != null && compareObj.getPatientCaseNote() == null)
				return 1;
			if(this.getPatientCaseNote() != null && compareObj.getPatientCaseNote() != null)
				retVal = this.getPatientCaseNote().compareTo(compareObj.getPatientCaseNote());
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
		if(this.location != null)
			count++;
		if(this.requestedby != null)
			count++;
		if(this.patientcasenote != null)
			count++;
		if(this.datefrom != null)
			count++;
		if(this.dateto != null)
			count++;
		if(this.transferredby != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected ims.core.vo.LocationLiteVo location;
	protected ims.core.vo.MemberOfStaffLiteVo requestedby;
	protected ims.core.clinical.vo.PatientCaseNoteRefVo patientcasenote;
	protected ims.framework.utils.Date datefrom;
	protected ims.framework.utils.Date dateto;
	protected ims.core.vo.MemberOfStaffLiteVo transferredby;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
