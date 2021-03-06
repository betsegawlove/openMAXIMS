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
 * Linked to clinical.ApplicableIntraOperative business object (ID: 1072100131).
 */
public class ApplicableIntraOperativeVo extends ims.clinical.vo.ApplicableIntraOperativeRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public ApplicableIntraOperativeVo()
	{
	}
	public ApplicableIntraOperativeVo(Integer id, int version)
	{
		super(id, version);
	}
	public ApplicableIntraOperativeVo(ims.clinical.vo.beans.ApplicableIntraOperativeVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.theatreappointment = bean.getTheatreAppointment() == null ? null : new ims.scheduling.vo.Booking_AppointmentRefVo(new Integer(bean.getTheatreAppointment().getId()), bean.getTheatreAppointment().getVersion());
		this.displayplannedprocedures = bean.getDisplayPlannedProcedures();
		this.displayanaestheticdetails = bean.getDisplayAnaestheticDetails();
		this.displayprepandpositioning = bean.getDisplayPrepAndPositioning();
		this.displaydiathermyandlaser = bean.getDisplayDiathermyAndLaser();
		this.displayirrigantcatheters = bean.getDisplayIrrigantCatheters();
		this.displayspecimenwounds = bean.getDisplaySpecimenWounds();
		this.displayimplantsarterial = bean.getDisplayImplantsArterial();
		this.displaytourniquet = bean.getDisplayTourniquet();
		this.displaycountsoccurances = bean.getDisplayCountsOccurances();
		this.displayperformedprocedures = bean.getDisplayPerformedProcedures();
		this.displaypacu = bean.getDisplayPACU();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.clinical.vo.beans.ApplicableIntraOperativeVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.theatreappointment = bean.getTheatreAppointment() == null ? null : new ims.scheduling.vo.Booking_AppointmentRefVo(new Integer(bean.getTheatreAppointment().getId()), bean.getTheatreAppointment().getVersion());
		this.displayplannedprocedures = bean.getDisplayPlannedProcedures();
		this.displayanaestheticdetails = bean.getDisplayAnaestheticDetails();
		this.displayprepandpositioning = bean.getDisplayPrepAndPositioning();
		this.displaydiathermyandlaser = bean.getDisplayDiathermyAndLaser();
		this.displayirrigantcatheters = bean.getDisplayIrrigantCatheters();
		this.displayspecimenwounds = bean.getDisplaySpecimenWounds();
		this.displayimplantsarterial = bean.getDisplayImplantsArterial();
		this.displaytourniquet = bean.getDisplayTourniquet();
		this.displaycountsoccurances = bean.getDisplayCountsOccurances();
		this.displayperformedprocedures = bean.getDisplayPerformedProcedures();
		this.displaypacu = bean.getDisplayPACU();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.clinical.vo.beans.ApplicableIntraOperativeVoBean bean = null;
		if(map != null)
			bean = (ims.clinical.vo.beans.ApplicableIntraOperativeVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.clinical.vo.beans.ApplicableIntraOperativeVoBean();
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
		if(fieldName.equals("THEATREAPPOINTMENT"))
			return getTheatreAppointment();
		if(fieldName.equals("DISPLAYPLANNEDPROCEDURES"))
			return getDisplayPlannedProcedures();
		if(fieldName.equals("DISPLAYANAESTHETICDETAILS"))
			return getDisplayAnaestheticDetails();
		if(fieldName.equals("DISPLAYPREPANDPOSITIONING"))
			return getDisplayPrepAndPositioning();
		if(fieldName.equals("DISPLAYDIATHERMYANDLASER"))
			return getDisplayDiathermyAndLaser();
		if(fieldName.equals("DISPLAYIRRIGANTCATHETERS"))
			return getDisplayIrrigantCatheters();
		if(fieldName.equals("DISPLAYSPECIMENWOUNDS"))
			return getDisplaySpecimenWounds();
		if(fieldName.equals("DISPLAYIMPLANTSARTERIAL"))
			return getDisplayImplantsArterial();
		if(fieldName.equals("DISPLAYTOURNIQUET"))
			return getDisplayTourniquet();
		if(fieldName.equals("DISPLAYCOUNTSOCCURANCES"))
			return getDisplayCountsOccurances();
		if(fieldName.equals("DISPLAYPERFORMEDPROCEDURES"))
			return getDisplayPerformedProcedures();
		if(fieldName.equals("DISPLAYPACU"))
			return getDisplayPACU();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getTheatreAppointmentIsNotNull()
	{
		return this.theatreappointment != null;
	}
	public ims.scheduling.vo.Booking_AppointmentRefVo getTheatreAppointment()
	{
		return this.theatreappointment;
	}
	public void setTheatreAppointment(ims.scheduling.vo.Booking_AppointmentRefVo value)
	{
		this.isValidated = false;
		this.theatreappointment = value;
	}
	public boolean getDisplayPlannedProceduresIsNotNull()
	{
		return this.displayplannedprocedures != null;
	}
	public Boolean getDisplayPlannedProcedures()
	{
		return this.displayplannedprocedures;
	}
	public void setDisplayPlannedProcedures(Boolean value)
	{
		this.isValidated = false;
		this.displayplannedprocedures = value;
	}
	public boolean getDisplayAnaestheticDetailsIsNotNull()
	{
		return this.displayanaestheticdetails != null;
	}
	public Boolean getDisplayAnaestheticDetails()
	{
		return this.displayanaestheticdetails;
	}
	public void setDisplayAnaestheticDetails(Boolean value)
	{
		this.isValidated = false;
		this.displayanaestheticdetails = value;
	}
	public boolean getDisplayPrepAndPositioningIsNotNull()
	{
		return this.displayprepandpositioning != null;
	}
	public Boolean getDisplayPrepAndPositioning()
	{
		return this.displayprepandpositioning;
	}
	public void setDisplayPrepAndPositioning(Boolean value)
	{
		this.isValidated = false;
		this.displayprepandpositioning = value;
	}
	public boolean getDisplayDiathermyAndLaserIsNotNull()
	{
		return this.displaydiathermyandlaser != null;
	}
	public Boolean getDisplayDiathermyAndLaser()
	{
		return this.displaydiathermyandlaser;
	}
	public void setDisplayDiathermyAndLaser(Boolean value)
	{
		this.isValidated = false;
		this.displaydiathermyandlaser = value;
	}
	public boolean getDisplayIrrigantCathetersIsNotNull()
	{
		return this.displayirrigantcatheters != null;
	}
	public Boolean getDisplayIrrigantCatheters()
	{
		return this.displayirrigantcatheters;
	}
	public void setDisplayIrrigantCatheters(Boolean value)
	{
		this.isValidated = false;
		this.displayirrigantcatheters = value;
	}
	public boolean getDisplaySpecimenWoundsIsNotNull()
	{
		return this.displayspecimenwounds != null;
	}
	public Boolean getDisplaySpecimenWounds()
	{
		return this.displayspecimenwounds;
	}
	public void setDisplaySpecimenWounds(Boolean value)
	{
		this.isValidated = false;
		this.displayspecimenwounds = value;
	}
	public boolean getDisplayImplantsArterialIsNotNull()
	{
		return this.displayimplantsarterial != null;
	}
	public Boolean getDisplayImplantsArterial()
	{
		return this.displayimplantsarterial;
	}
	public void setDisplayImplantsArterial(Boolean value)
	{
		this.isValidated = false;
		this.displayimplantsarterial = value;
	}
	public boolean getDisplayTourniquetIsNotNull()
	{
		return this.displaytourniquet != null;
	}
	public Boolean getDisplayTourniquet()
	{
		return this.displaytourniquet;
	}
	public void setDisplayTourniquet(Boolean value)
	{
		this.isValidated = false;
		this.displaytourniquet = value;
	}
	public boolean getDisplayCountsOccurancesIsNotNull()
	{
		return this.displaycountsoccurances != null;
	}
	public Boolean getDisplayCountsOccurances()
	{
		return this.displaycountsoccurances;
	}
	public void setDisplayCountsOccurances(Boolean value)
	{
		this.isValidated = false;
		this.displaycountsoccurances = value;
	}
	public boolean getDisplayPerformedProceduresIsNotNull()
	{
		return this.displayperformedprocedures != null;
	}
	public Boolean getDisplayPerformedProcedures()
	{
		return this.displayperformedprocedures;
	}
	public void setDisplayPerformedProcedures(Boolean value)
	{
		this.isValidated = false;
		this.displayperformedprocedures = value;
	}
	public boolean getDisplayPACUIsNotNull()
	{
		return this.displaypacu != null;
	}
	public Boolean getDisplayPACU()
	{
		return this.displaypacu;
	}
	public void setDisplayPACU(Boolean value)
	{
		this.isValidated = false;
		this.displaypacu = value;
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
		if(this.theatreappointment == null)
			listOfErrors.add("TheatreAppointment is mandatory");
		if(this.displayplannedprocedures == null)
			listOfErrors.add("DisplayPlannedProcedures is mandatory");
		if(this.displayanaestheticdetails == null)
			listOfErrors.add("DisplayAnaestheticDetails is mandatory");
		if(this.displayprepandpositioning == null)
			listOfErrors.add("DisplayPrepAndPositioning is mandatory");
		if(this.displaydiathermyandlaser == null)
			listOfErrors.add("DisplayDiathermyAndLaser is mandatory");
		if(this.displayirrigantcatheters == null)
			listOfErrors.add("DisplayIrrigantCatheters is mandatory");
		if(this.displayspecimenwounds == null)
			listOfErrors.add("DisplaySpecimenWounds is mandatory");
		if(this.displayimplantsarterial == null)
			listOfErrors.add("DisplayImplantsArterial is mandatory");
		if(this.displaytourniquet == null)
			listOfErrors.add("DisplayTourniquet is mandatory");
		if(this.displaycountsoccurances == null)
			listOfErrors.add("DisplayCountsOccurances is mandatory");
		if(this.displayperformedprocedures == null)
			listOfErrors.add("DisplayPerformedProcedures is mandatory");
		if(this.displaypacu == null)
			listOfErrors.add("DisplayPACU is mandatory");
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
	
		ApplicableIntraOperativeVo clone = new ApplicableIntraOperativeVo(this.id, this.version);
		
		clone.theatreappointment = this.theatreappointment;
		clone.displayplannedprocedures = this.displayplannedprocedures;
		clone.displayanaestheticdetails = this.displayanaestheticdetails;
		clone.displayprepandpositioning = this.displayprepandpositioning;
		clone.displaydiathermyandlaser = this.displaydiathermyandlaser;
		clone.displayirrigantcatheters = this.displayirrigantcatheters;
		clone.displayspecimenwounds = this.displayspecimenwounds;
		clone.displayimplantsarterial = this.displayimplantsarterial;
		clone.displaytourniquet = this.displaytourniquet;
		clone.displaycountsoccurances = this.displaycountsoccurances;
		clone.displayperformedprocedures = this.displayperformedprocedures;
		clone.displaypacu = this.displaypacu;
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
		if (!(ApplicableIntraOperativeVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A ApplicableIntraOperativeVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((ApplicableIntraOperativeVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((ApplicableIntraOperativeVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.theatreappointment != null)
			count++;
		if(this.displayplannedprocedures != null)
			count++;
		if(this.displayanaestheticdetails != null)
			count++;
		if(this.displayprepandpositioning != null)
			count++;
		if(this.displaydiathermyandlaser != null)
			count++;
		if(this.displayirrigantcatheters != null)
			count++;
		if(this.displayspecimenwounds != null)
			count++;
		if(this.displayimplantsarterial != null)
			count++;
		if(this.displaytourniquet != null)
			count++;
		if(this.displaycountsoccurances != null)
			count++;
		if(this.displayperformedprocedures != null)
			count++;
		if(this.displaypacu != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 12;
	}
	protected ims.scheduling.vo.Booking_AppointmentRefVo theatreappointment;
	protected Boolean displayplannedprocedures;
	protected Boolean displayanaestheticdetails;
	protected Boolean displayprepandpositioning;
	protected Boolean displaydiathermyandlaser;
	protected Boolean displayirrigantcatheters;
	protected Boolean displayspecimenwounds;
	protected Boolean displayimplantsarterial;
	protected Boolean displaytourniquet;
	protected Boolean displaycountsoccurances;
	protected Boolean displayperformedprocedures;
	protected Boolean displaypacu;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
