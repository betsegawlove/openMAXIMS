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

package ims.RefMan.vo;

/**
 * Linked to RefMan.ConsultationDetails business object (ID: 1096100000).
 */
public class ConsultationDetailsVo extends ims.RefMan.vo.ConsultationDetailsRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ConsultationDetailsVo()
	{
	}
	public ConsultationDetailsVo(Integer id, int version)
	{
		super(id, version);
	}
	public ConsultationDetailsVo(ims.RefMan.vo.beans.ConsultationDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo();
		this.referralsummary = bean.getReferralSummary() == null ? null : bean.getReferralSummary().buildVo();
		this.baselineobs = bean.getBaselineObs() == null ? null : bean.getBaselineObs().buildVo();
		this.onexam = bean.getOnExam() == null ? null : bean.getOnExam().buildVo();
		this.atconsultation = bean.getAtConsultation() == null ? null : bean.getAtConsultation().buildVo();
		this.outcome = bean.getOutcome() == null ? null : bean.getOutcome().buildVo();
		this.catsreferral = bean.getCATSReferral() == null ? null : new ims.RefMan.vo.CatsReferralRefVo(new Integer(bean.getCATSReferral().getId()), bean.getCATSReferral().getVersion());
		this.consultationtimes = ims.RefMan.vo.ConsultationTimeVoCollection.buildFromBeanCollection(bean.getConsultationTimes());
		this.tlttimes = ims.RefMan.vo.TLTContactTimeVoCollection.buildFromBeanCollection(bean.getTltTimes());
		this.clinicalcontacttime = ims.RefMan.vo.ClinicalContactTimeVoCollection.buildFromBeanCollection(bean.getClinicalContactTime());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.RefMan.vo.beans.ConsultationDetailsVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.authoringinformation = bean.getAuthoringInformation() == null ? null : bean.getAuthoringInformation().buildVo(map);
		this.referralsummary = bean.getReferralSummary() == null ? null : bean.getReferralSummary().buildVo(map);
		this.baselineobs = bean.getBaselineObs() == null ? null : bean.getBaselineObs().buildVo(map);
		this.onexam = bean.getOnExam() == null ? null : bean.getOnExam().buildVo(map);
		this.atconsultation = bean.getAtConsultation() == null ? null : bean.getAtConsultation().buildVo(map);
		this.outcome = bean.getOutcome() == null ? null : bean.getOutcome().buildVo(map);
		this.catsreferral = bean.getCATSReferral() == null ? null : new ims.RefMan.vo.CatsReferralRefVo(new Integer(bean.getCATSReferral().getId()), bean.getCATSReferral().getVersion());
		this.consultationtimes = ims.RefMan.vo.ConsultationTimeVoCollection.buildFromBeanCollection(bean.getConsultationTimes());
		this.tlttimes = ims.RefMan.vo.TLTContactTimeVoCollection.buildFromBeanCollection(bean.getTltTimes());
		this.clinicalcontacttime = ims.RefMan.vo.ClinicalContactTimeVoCollection.buildFromBeanCollection(bean.getClinicalContactTime());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.RefMan.vo.beans.ConsultationDetailsVoBean bean = null;
		if(map != null)
			bean = (ims.RefMan.vo.beans.ConsultationDetailsVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.RefMan.vo.beans.ConsultationDetailsVoBean();
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
		if(fieldName.equals("AUTHORINGINFORMATION"))
			return getAuthoringInformation();
		if(fieldName.equals("REFERRALSUMMARY"))
			return getReferralSummary();
		if(fieldName.equals("BASELINEOBS"))
			return getBaselineObs();
		if(fieldName.equals("ONEXAM"))
			return getOnExam();
		if(fieldName.equals("ATCONSULTATION"))
			return getAtConsultation();
		if(fieldName.equals("OUTCOME"))
			return getOutcome();
		if(fieldName.equals("CATSREFERRAL"))
			return getCATSReferral();
		if(fieldName.equals("CONSULTATIONTIMES"))
			return getConsultationTimes();
		if(fieldName.equals("TLTTIMES"))
			return getTltTimes();
		if(fieldName.equals("CLINICALCONTACTTIME"))
			return getClinicalContactTime();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getAuthoringInformationIsNotNull()
	{
		return this.authoringinformation != null;
	}
	public ims.core.vo.AuthoringInformationVo getAuthoringInformation()
	{
		return this.authoringinformation;
	}
	public void setAuthoringInformation(ims.core.vo.AuthoringInformationVo value)
	{
		this.isValidated = false;
		this.authoringinformation = value;
	}
	public boolean getReferralSummaryIsNotNull()
	{
		return this.referralsummary != null;
	}
	public ims.RefMan.vo.PresentationReferralSummaryVo getReferralSummary()
	{
		return this.referralsummary;
	}
	public void setReferralSummary(ims.RefMan.vo.PresentationReferralSummaryVo value)
	{
		this.isValidated = false;
		this.referralsummary = value;
	}
	public boolean getBaselineObsIsNotNull()
	{
		return this.baselineobs != null;
	}
	public ims.RefMan.vo.BaselineObservationsVo getBaselineObs()
	{
		return this.baselineobs;
	}
	public void setBaselineObs(ims.RefMan.vo.BaselineObservationsVo value)
	{
		this.isValidated = false;
		this.baselineobs = value;
	}
	public boolean getOnExamIsNotNull()
	{
		return this.onexam != null;
	}
	public ims.RefMan.vo.onExaminationVo getOnExam()
	{
		return this.onexam;
	}
	public void setOnExam(ims.RefMan.vo.onExaminationVo value)
	{
		this.isValidated = false;
		this.onexam = value;
	}
	public boolean getAtConsultationIsNotNull()
	{
		return this.atconsultation != null;
	}
	public ims.RefMan.vo.AtConsultationVo getAtConsultation()
	{
		return this.atconsultation;
	}
	public void setAtConsultation(ims.RefMan.vo.AtConsultationVo value)
	{
		this.isValidated = false;
		this.atconsultation = value;
	}
	public boolean getOutcomeIsNotNull()
	{
		return this.outcome != null;
	}
	public ims.RefMan.vo.ReferralOutcomeVo getOutcome()
	{
		return this.outcome;
	}
	public void setOutcome(ims.RefMan.vo.ReferralOutcomeVo value)
	{
		this.isValidated = false;
		this.outcome = value;
	}
	public boolean getCATSReferralIsNotNull()
	{
		return this.catsreferral != null;
	}
	public ims.RefMan.vo.CatsReferralRefVo getCATSReferral()
	{
		return this.catsreferral;
	}
	public void setCATSReferral(ims.RefMan.vo.CatsReferralRefVo value)
	{
		this.isValidated = false;
		this.catsreferral = value;
	}
	public boolean getConsultationTimesIsNotNull()
	{
		return this.consultationtimes != null;
	}
	public ims.RefMan.vo.ConsultationTimeVoCollection getConsultationTimes()
	{
		return this.consultationtimes;
	}
	public void setConsultationTimes(ims.RefMan.vo.ConsultationTimeVoCollection value)
	{
		this.isValidated = false;
		this.consultationtimes = value;
	}
	public boolean getTltTimesIsNotNull()
	{
		return this.tlttimes != null;
	}
	public ims.RefMan.vo.TLTContactTimeVoCollection getTltTimes()
	{
		return this.tlttimes;
	}
	public void setTltTimes(ims.RefMan.vo.TLTContactTimeVoCollection value)
	{
		this.isValidated = false;
		this.tlttimes = value;
	}
	public boolean getClinicalContactTimeIsNotNull()
	{
		return this.clinicalcontacttime != null;
	}
	public ims.RefMan.vo.ClinicalContactTimeVoCollection getClinicalContactTime()
	{
		return this.clinicalcontacttime;
	}
	public void setClinicalContactTime(ims.RefMan.vo.ClinicalContactTimeVoCollection value)
	{
		this.isValidated = false;
		this.clinicalcontacttime = value;
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
		if(this.baselineobs != null)
		{
			if(!this.baselineobs.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.onexam != null)
		{
			if(!this.onexam.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.atconsultation != null)
		{
			if(!this.atconsultation.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.outcome != null)
		{
			if(!this.outcome.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.consultationtimes != null)
		{
			if(!this.consultationtimes.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.tlttimes != null)
		{
			if(!this.tlttimes.isValidated())
			{
				this.isBusy = false;
				return false;
			}
		}
		if(this.clinicalcontacttime != null)
		{
			if(!this.clinicalcontacttime.isValidated())
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
		if(this.baselineobs != null)
		{
			String[] listOfOtherErrors = this.baselineobs.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.onexam != null)
		{
			String[] listOfOtherErrors = this.onexam.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.atconsultation != null)
		{
			String[] listOfOtherErrors = this.atconsultation.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.outcome != null)
		{
			String[] listOfOtherErrors = this.outcome.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.catsreferral == null)
			listOfErrors.add("CATSReferral is mandatory");
		if(this.consultationtimes != null)
		{
			String[] listOfOtherErrors = this.consultationtimes.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.tlttimes != null)
		{
			String[] listOfOtherErrors = this.tlttimes.validate();
			if(listOfOtherErrors != null)
			{
				for(int x = 0; x < listOfOtherErrors.length; x++)
				{
					listOfErrors.add(listOfOtherErrors[x]);
				}
			}
		}
		if(this.clinicalcontacttime != null)
		{
			String[] listOfOtherErrors = this.clinicalcontacttime.validate();
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
	
		ConsultationDetailsVo clone = new ConsultationDetailsVo(this.id, this.version);
		
		if(this.authoringinformation == null)
			clone.authoringinformation = null;
		else
			clone.authoringinformation = (ims.core.vo.AuthoringInformationVo)this.authoringinformation.clone();
		if(this.referralsummary == null)
			clone.referralsummary = null;
		else
			clone.referralsummary = (ims.RefMan.vo.PresentationReferralSummaryVo)this.referralsummary.clone();
		if(this.baselineobs == null)
			clone.baselineobs = null;
		else
			clone.baselineobs = (ims.RefMan.vo.BaselineObservationsVo)this.baselineobs.clone();
		if(this.onexam == null)
			clone.onexam = null;
		else
			clone.onexam = (ims.RefMan.vo.onExaminationVo)this.onexam.clone();
		if(this.atconsultation == null)
			clone.atconsultation = null;
		else
			clone.atconsultation = (ims.RefMan.vo.AtConsultationVo)this.atconsultation.clone();
		if(this.outcome == null)
			clone.outcome = null;
		else
			clone.outcome = (ims.RefMan.vo.ReferralOutcomeVo)this.outcome.clone();
		clone.catsreferral = this.catsreferral;
		if(this.consultationtimes == null)
			clone.consultationtimes = null;
		else
			clone.consultationtimes = (ims.RefMan.vo.ConsultationTimeVoCollection)this.consultationtimes.clone();
		if(this.tlttimes == null)
			clone.tlttimes = null;
		else
			clone.tlttimes = (ims.RefMan.vo.TLTContactTimeVoCollection)this.tlttimes.clone();
		if(this.clinicalcontacttime == null)
			clone.clinicalcontacttime = null;
		else
			clone.clinicalcontacttime = (ims.RefMan.vo.ClinicalContactTimeVoCollection)this.clinicalcontacttime.clone();
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
		if (!(ConsultationDetailsVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ConsultationDetailsVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ConsultationDetailsVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ConsultationDetailsVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.authoringinformation != null)
			count++;
		if(this.referralsummary != null)
			count++;
		if(this.baselineobs != null)
			count++;
		if(this.onexam != null)
			count++;
		if(this.atconsultation != null)
			count++;
		if(this.outcome != null)
			count++;
		if(this.catsreferral != null)
			count++;
		if(this.consultationtimes != null)
			count++;
		if(this.tlttimes != null)
			count++;
		if(this.clinicalcontacttime != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 10;
	}
	protected ims.core.vo.AuthoringInformationVo authoringinformation;
	protected ims.RefMan.vo.PresentationReferralSummaryVo referralsummary;
	protected ims.RefMan.vo.BaselineObservationsVo baselineobs;
	protected ims.RefMan.vo.onExaminationVo onexam;
	protected ims.RefMan.vo.AtConsultationVo atconsultation;
	protected ims.RefMan.vo.ReferralOutcomeVo outcome;
	protected ims.RefMan.vo.CatsReferralRefVo catsreferral;
	protected ims.RefMan.vo.ConsultationTimeVoCollection consultationtimes;
	protected ims.RefMan.vo.TLTContactTimeVoCollection tlttimes;
	protected ims.RefMan.vo.ClinicalContactTimeVoCollection clinicalcontacttime;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
