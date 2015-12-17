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

/**
 * Linked to core.generic.Address business object (ID: 1002100000).
 */
public class AddressForCaseNoteWorklistVo extends ims.core.generic.vo.AddressRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public AddressForCaseNoteWorklistVo()
	{
	}
	public AddressForCaseNoteWorklistVo(Integer id, int version)
	{
		super(id, version);
	}
	public AddressForCaseNoteWorklistVo(ims.core.vo.beans.AddressForCaseNoteWorklistVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.phone = bean.getPhone();
		this.fax = bean.getFax();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.AddressForCaseNoteWorklistVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.phone = bean.getPhone();
		this.fax = bean.getFax();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.AddressForCaseNoteWorklistVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.AddressForCaseNoteWorklistVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.AddressForCaseNoteWorklistVoBean();
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
		if(fieldName.equals("PHONE"))
			return getPhone();
		if(fieldName.equals("FAX"))
			return getFax();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPhoneIsNotNull()
	{
		return this.phone != null;
	}
	public String getPhone()
	{
		return this.phone;
	}
	public static int getPhoneMaxLength()
	{
		return 30;
	}
	public void setPhone(String value)
	{
		this.isValidated = false;
		this.phone = value;
	}
	public boolean getFaxIsNotNull()
	{
		return this.fax != null;
	}
	public String getFax()
	{
		return this.fax;
	}
	public static int getFaxMaxLength()
	{
		return 30;
	}
	public void setFax(String value)
	{
		this.isValidated = false;
		this.fax = value;
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
		if(this.phone != null)
			if(this.phone.length() > 30)
				listOfErrors.add("The length of the field [phone] in the value object [ims.core.vo.AddressForCaseNoteWorklistVo] is too big. It should be less or equal to 30");
		if(this.fax != null)
			if(this.fax.length() > 30)
				listOfErrors.add("The length of the field [fax] in the value object [ims.core.vo.AddressForCaseNoteWorklistVo] is too big. It should be less or equal to 30");
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
	
		AddressForCaseNoteWorklistVo clone = new AddressForCaseNoteWorklistVo(this.id, this.version);
		
		clone.phone = this.phone;
		clone.fax = this.fax;
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
		if (!(AddressForCaseNoteWorklistVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A AddressForCaseNoteWorklistVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((AddressForCaseNoteWorklistVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((AddressForCaseNoteWorklistVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.phone != null)
			count++;
		if(this.fax != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected String phone;
	protected String fax;
	private boolean isValidated = false;
	private boolean isBusy = false;
}