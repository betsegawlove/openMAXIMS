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

package ims.clinicaladmin.vo;

/**
 * Linked to clinical.configuration.InternalReferralSettings business object (ID: 1073100036).
 */
public class InternalReferralSettingsVo extends ims.clinical.configuration.vo.InternalReferralSettingsRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public InternalReferralSettingsVo()
	{
	}
	public InternalReferralSettingsVo(Integer id, int version)
	{
		super(id, version);
	}
	public InternalReferralSettingsVo(ims.clinicaladmin.vo.beans.InternalReferralSettingsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.newconditionreferralbacktogp = bean.getNewConditionReferralBackToGP() == null ? null : ims.clinical.vo.lookups.InternalReferralConditionalReferralToGP.buildLookup(bean.getNewConditionReferralBackToGP());
		this.referralbacktogpoptionalmessage = bean.getReferralBackToGPOptionalMessage();
		this.referralbacktogpmandatorymessage = bean.getReferralBackToGPMandatoryMessage();
		this.urgentreferralbackgroundcolour = bean.getUrgentReferralBackgroundColour() == null ? null : bean.getUrgentReferralBackgroundColour().buildColor();
		this.allowscanimport = bean.getAllowScanImport();
		this.searchnumberofdays = bean.getSearchNumberOfDays();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinicaladmin.vo.beans.InternalReferralSettingsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.newconditionreferralbacktogp = bean.getNewConditionReferralBackToGP() == null ? null : ims.clinical.vo.lookups.InternalReferralConditionalReferralToGP.buildLookup(bean.getNewConditionReferralBackToGP());
		this.referralbacktogpoptionalmessage = bean.getReferralBackToGPOptionalMessage();
		this.referralbacktogpmandatorymessage = bean.getReferralBackToGPMandatoryMessage();
		this.urgentreferralbackgroundcolour = bean.getUrgentReferralBackgroundColour() == null ? null : bean.getUrgentReferralBackgroundColour().buildColor();
		this.allowscanimport = bean.getAllowScanImport();
		this.searchnumberofdays = bean.getSearchNumberOfDays();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinicaladmin.vo.beans.InternalReferralSettingsVoBean bean = null;
		if(map != null)
			bean = (ims.clinicaladmin.vo.beans.InternalReferralSettingsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinicaladmin.vo.beans.InternalReferralSettingsVoBean();
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
		if(fieldName.equals("NEWCONDITIONREFERRALBACKTOGP"))
			return getNewConditionReferralBackToGP();
		if(fieldName.equals("REFERRALBACKTOGPOPTIONALMESSAGE"))
			return getReferralBackToGPOptionalMessage();
		if(fieldName.equals("REFERRALBACKTOGPMANDATORYMESSAGE"))
			return getReferralBackToGPMandatoryMessage();
		if(fieldName.equals("URGENTREFERRALBACKGROUNDCOLOUR"))
			return getUrgentReferralBackgroundColour();
		if(fieldName.equals("ALLOWSCANIMPORT"))
			return getAllowScanImport();
		if(fieldName.equals("SEARCHNUMBEROFDAYS"))
			return getSearchNumberOfDays();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getNewConditionReferralBackToGPIsNotNull()
	{
		return this.newconditionreferralbacktogp != null;
	}
	public ims.clinical.vo.lookups.InternalReferralConditionalReferralToGP getNewConditionReferralBackToGP()
	{
		return this.newconditionreferralbacktogp;
	}
	public void setNewConditionReferralBackToGP(ims.clinical.vo.lookups.InternalReferralConditionalReferralToGP value)
	{
		this.isValidated = false;
		this.newconditionreferralbacktogp = value;
	}
	public boolean getReferralBackToGPOptionalMessageIsNotNull()
	{
		return this.referralbacktogpoptionalmessage != null;
	}
	public String getReferralBackToGPOptionalMessage()
	{
		return this.referralbacktogpoptionalmessage;
	}
	public static int getReferralBackToGPOptionalMessageMaxLength()
	{
		return 500;
	}
	public void setReferralBackToGPOptionalMessage(String value)
	{
		this.isValidated = false;
		this.referralbacktogpoptionalmessage = value;
	}
	public boolean getReferralBackToGPMandatoryMessageIsNotNull()
	{
		return this.referralbacktogpmandatorymessage != null;
	}
	public String getReferralBackToGPMandatoryMessage()
	{
		return this.referralbacktogpmandatorymessage;
	}
	public static int getReferralBackToGPMandatoryMessageMaxLength()
	{
		return 500;
	}
	public void setReferralBackToGPMandatoryMessage(String value)
	{
		this.isValidated = false;
		this.referralbacktogpmandatorymessage = value;
	}
	public boolean getUrgentReferralBackgroundColourIsNotNull()
	{
		return this.urgentreferralbackgroundcolour != null;
	}
	public ims.framework.utils.Color getUrgentReferralBackgroundColour()
	{
		return this.urgentreferralbackgroundcolour;
	}
	public void setUrgentReferralBackgroundColour(ims.framework.utils.Color value)
	{
		this.isValidated = false;
		this.urgentreferralbackgroundcolour = value;
	}
	public boolean getAllowScanImportIsNotNull()
	{
		return this.allowscanimport != null;
	}
	public Boolean getAllowScanImport()
	{
		return this.allowscanimport;
	}
	public void setAllowScanImport(Boolean value)
	{
		this.isValidated = false;
		this.allowscanimport = value;
	}
	public boolean getSearchNumberOfDaysIsNotNull()
	{
		return this.searchnumberofdays != null;
	}
	public Integer getSearchNumberOfDays()
	{
		return this.searchnumberofdays;
	}
	public void setSearchNumberOfDays(Integer value)
	{
		this.isValidated = false;
		this.searchnumberofdays = value;
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
		if(this.newconditionreferralbacktogp == null)
			listOfErrors.add("NewConditionReferralBackToGP is mandatory");
		if(this.referralbacktogpoptionalmessage == null || this.referralbacktogpoptionalmessage.length() == 0)
			listOfErrors.add("ReferralBackToGPOptionalMessage is mandatory");
		else if(this.referralbacktogpoptionalmessage.length() > 500)
			listOfErrors.add("The length of the field [referralbacktogpoptionalmessage] in the value object [ims.clinicaladmin.vo.InternalReferralSettingsVo] is too big. It should be less or equal to 500");
		if(this.referralbacktogpmandatorymessage == null || this.referralbacktogpmandatorymessage.length() == 0)
			listOfErrors.add("ReferralBackToGPMandatoryMessage is mandatory");
		else if(this.referralbacktogpmandatorymessage.length() > 500)
			listOfErrors.add("The length of the field [referralbacktogpmandatorymessage] in the value object [ims.clinicaladmin.vo.InternalReferralSettingsVo] is too big. It should be less or equal to 500");
		if(this.urgentreferralbackgroundcolour == null)
			listOfErrors.add("UrgentReferralBackgroundColour is mandatory");
		if(this.allowscanimport == null)
			listOfErrors.add("AllowScanImport is mandatory");
		if(this.searchnumberofdays == null)
			listOfErrors.add("SearchNumberOfDays is mandatory");
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
	
		InternalReferralSettingsVo clone = new InternalReferralSettingsVo(this.id, this.version);
		
		if(this.newconditionreferralbacktogp == null)
			clone.newconditionreferralbacktogp = null;
		else
			clone.newconditionreferralbacktogp = (ims.clinical.vo.lookups.InternalReferralConditionalReferralToGP)this.newconditionreferralbacktogp.clone();
		clone.referralbacktogpoptionalmessage = this.referralbacktogpoptionalmessage;
		clone.referralbacktogpmandatorymessage = this.referralbacktogpmandatorymessage;
		if(this.urgentreferralbackgroundcolour == null)
			clone.urgentreferralbackgroundcolour = null;
		else
			clone.urgentreferralbackgroundcolour = (ims.framework.utils.Color)this.urgentreferralbackgroundcolour.clone();
		clone.allowscanimport = this.allowscanimport;
		clone.searchnumberofdays = this.searchnumberofdays;
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
		if (!(InternalReferralSettingsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A InternalReferralSettingsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((InternalReferralSettingsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((InternalReferralSettingsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.newconditionreferralbacktogp != null)
			count++;
		if(this.referralbacktogpoptionalmessage != null)
			count++;
		if(this.referralbacktogpmandatorymessage != null)
			count++;
		if(this.urgentreferralbackgroundcolour != null)
			count++;
		if(this.allowscanimport != null)
			count++;
		if(this.searchnumberofdays != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 6;
	}
	protected ims.clinical.vo.lookups.InternalReferralConditionalReferralToGP newconditionreferralbacktogp;
	protected String referralbacktogpoptionalmessage;
	protected String referralbacktogpmandatorymessage;
	protected ims.framework.utils.Color urgentreferralbackgroundcolour;
	protected Boolean allowscanimport;
	protected Integer searchnumberofdays;
	private boolean isValidated = false;
	private boolean isBusy = false;
}