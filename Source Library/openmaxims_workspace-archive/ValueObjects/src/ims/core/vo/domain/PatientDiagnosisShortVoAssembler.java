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
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.core.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Rory Fitzpatrick
 */
public class PatientDiagnosisShortVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.core.vo.PatientDiagnosisShortVo copy(ims.core.vo.PatientDiagnosisShortVo valueObjectDest, ims.core.vo.PatientDiagnosisShortVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_PatientDiagnosis(valueObjectSrc.getID_PatientDiagnosis());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// isComplication
		valueObjectDest.setIsComplication(valueObjectSrc.getIsComplication());
		// DateResolved
		valueObjectDest.setDateResolved(valueObjectSrc.getDateResolved());
		// SysInfo
		valueObjectDest.setSysInfo(valueObjectSrc.getSysInfo());
		// DateOnset
		valueObjectDest.setDateOnset(valueObjectSrc.getDateOnset());
		// ClinicalContact
		valueObjectDest.setClinicalContact(valueObjectSrc.getClinicalContact());
		// DiagLaterality
		valueObjectDest.setDiagLaterality(valueObjectSrc.getDiagLaterality());
		// SiteText
		valueObjectDest.setSiteText(valueObjectSrc.getSiteText());
		// isPMH
		valueObjectDest.setIsPMH(valueObjectSrc.getIsPMH());
		// isCancerDiagnosis
		valueObjectDest.setIsCancerDiagnosis(valueObjectSrc.getIsCancerDiagnosis());
		// AuthoringInfo
		valueObjectDest.setAuthoringInfo(valueObjectSrc.getAuthoringInfo());
		// DiagnosisDescription
		valueObjectDest.setDiagnosisDescription(valueObjectSrc.getDiagnosisDescription());
		// DiagnosedDate
		valueObjectDest.setDiagnosedDate(valueObjectSrc.getDiagnosedDate());
		// CurrentStatus
		valueObjectDest.setCurrentStatus(valueObjectSrc.getCurrentStatus());
		// SourceofInformation
		valueObjectDest.setSourceofInformation(valueObjectSrc.getSourceofInformation());
		// Diagnosis
		valueObjectDest.setDiagnosis(valueObjectSrc.getDiagnosis());
		// CareContext
		valueObjectDest.setCareContext(valueObjectSrc.getCareContext());
		// isComorbidity
		valueObjectDest.setIsComorbidity(valueObjectSrc.getIsComorbidity());
		// EpisodeOfCare
		valueObjectDest.setEpisodeOfCare(valueObjectSrc.getEpisodeOfCare());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createPatientDiagnosisShortVoCollectionFromPatientDiagnosis(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientDiagnosis objects.
	 */
	public static ims.core.vo.PatientDiagnosisShortVoCollection createPatientDiagnosisShortVoCollectionFromPatientDiagnosis(java.util.Set domainObjectSet)	
	{
		return createPatientDiagnosisShortVoCollectionFromPatientDiagnosis(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.clinical.domain.objects.PatientDiagnosis objects.
	 */
	public static ims.core.vo.PatientDiagnosisShortVoCollection createPatientDiagnosisShortVoCollectionFromPatientDiagnosis(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.core.vo.PatientDiagnosisShortVoCollection voList = new ims.core.vo.PatientDiagnosisShortVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.clinical.domain.objects.PatientDiagnosis domainObject = (ims.core.clinical.domain.objects.PatientDiagnosis) iterator.next();
			ims.core.vo.PatientDiagnosisShortVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientDiagnosis objects.
	 */
	public static ims.core.vo.PatientDiagnosisShortVoCollection createPatientDiagnosisShortVoCollectionFromPatientDiagnosis(java.util.List domainObjectList) 
	{
		return createPatientDiagnosisShortVoCollectionFromPatientDiagnosis(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.clinical.domain.objects.PatientDiagnosis objects.
	 */
	public static ims.core.vo.PatientDiagnosisShortVoCollection createPatientDiagnosisShortVoCollectionFromPatientDiagnosis(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.core.vo.PatientDiagnosisShortVoCollection voList = new ims.core.vo.PatientDiagnosisShortVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.clinical.domain.objects.PatientDiagnosis domainObject = (ims.core.clinical.domain.objects.PatientDiagnosis) domainObjectList.get(i);
			ims.core.vo.PatientDiagnosisShortVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.core.clinical.domain.objects.PatientDiagnosis set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractPatientDiagnosisSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisShortVoCollection voCollection) 
	 {
	 	return extractPatientDiagnosisSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractPatientDiagnosisSet(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisShortVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientDiagnosisShortVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientDiagnosis domainObject = PatientDiagnosisShortVoAssembler.extractPatientDiagnosis(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.core.clinical.domain.objects.PatientDiagnosis list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractPatientDiagnosisList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisShortVoCollection voCollection) 
	 {
	 	return extractPatientDiagnosisList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractPatientDiagnosisList(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisShortVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.core.vo.PatientDiagnosisShortVo vo = voCollection.get(i);
			ims.core.clinical.domain.objects.PatientDiagnosis domainObject = PatientDiagnosisShortVoAssembler.extractPatientDiagnosis(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.core.clinical.domain.objects.PatientDiagnosis object.
	 * @param domainObject ims.core.clinical.domain.objects.PatientDiagnosis
	 */
	 public static ims.core.vo.PatientDiagnosisShortVo create(ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.clinical.domain.objects.PatientDiagnosis object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.core.vo.PatientDiagnosisShortVo create(DomainObjectMap map, ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.core.vo.PatientDiagnosisShortVo valueObject = (ims.core.vo.PatientDiagnosisShortVo) map.getValueObject(domainObject, ims.core.vo.PatientDiagnosisShortVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.core.vo.PatientDiagnosisShortVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientDiagnosis
	 */
	 public static ims.core.vo.PatientDiagnosisShortVo insert(ims.core.vo.PatientDiagnosisShortVo valueObject, ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.clinical.domain.objects.PatientDiagnosis
	 */
	 public static ims.core.vo.PatientDiagnosisShortVo insert(DomainObjectMap map, ims.core.vo.PatientDiagnosisShortVo valueObject, ims.core.clinical.domain.objects.PatientDiagnosis domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_PatientDiagnosis(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// isComplication
		valueObject.setIsComplication( domainObject.isIsComplication() );
		// DateResolved
		java.util.Date DateResolved = domainObject.getDateResolved();
		if ( null != DateResolved ) 
		{
			valueObject.setDateResolved(new ims.framework.utils.Date(DateResolved) );
		}
		// SysInfo
		// set system information
		valueObject.setSysInfo(ims.vo.domain.SystemInformationAssembler.create(domainObject.getSystemInformation()));
		// DateOnset
		java.util.Date DateOnset = domainObject.getDateOnset();
		if ( null != DateOnset ) 
		{
			valueObject.setDateOnset(new ims.framework.utils.Date(DateOnset) );
		}
		// ClinicalContact
		valueObject.setClinicalContact(ims.core.vo.domain.ClinicalContactShortVoAssembler.create(map, domainObject.getClinicalContact()) );
		// DiagLaterality
		ims.domain.lookups.LookupInstance instance6 = domainObject.getDiagLaterality();
		if ( null != instance6 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance6.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance6.getImage().getImageId(), instance6.getImage().getImagePath());
			}
			color = instance6.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.LateralityLRB voLookup6 = new ims.core.vo.lookups.LateralityLRB(instance6.getId(),instance6.getText(), instance6.isActive(), null, img, color);
			ims.core.vo.lookups.LateralityLRB parentVoLookup6 = voLookup6;
			ims.domain.lookups.LookupInstance parent6 = instance6.getParent();
			while (parent6 != null)
			{
				if (parent6.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent6.getImage().getImageId(), parent6.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent6.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup6.setParent(new ims.core.vo.lookups.LateralityLRB(parent6.getId(),parent6.getText(), parent6.isActive(), null, img, color));
				parentVoLookup6 = parentVoLookup6.getParent();
								parent6 = parent6.getParent();
			}			
			valueObject.setDiagLaterality(voLookup6);
		}
				// SiteText
		valueObject.setSiteText(domainObject.getSiteText());
		// isPMH
		valueObject.setIsPMH( domainObject.isIsPMH() );
		// isCancerDiagnosis
		valueObject.setIsCancerDiagnosis( domainObject.isIsCancerDiagnosis() );
		// AuthoringInfo
		valueObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.create(map, domainObject.getAuthoringInfo()) );
		// DiagnosisDescription
		valueObject.setDiagnosisDescription(domainObject.getDiagnosisDescription());
		// DiagnosedDate
		Integer DiagnosedDate = domainObject.getDiagnosedDate();
		if ( null != DiagnosedDate ) 
		{
			valueObject.setDiagnosedDate(new ims.framework.utils.PartialDate(DiagnosedDate) );
		}
		// CurrentStatus
		valueObject.setCurrentStatus(ims.clinical.vo.domain.PatientDiagnosisStatusVoAssembler.create(map, domainObject.getCurrentStatus()) );
		// SourceofInformation
		ims.domain.lookups.LookupInstance instance14 = domainObject.getSourceofInformation();
		if ( null != instance14 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance14.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance14.getImage().getImageId(), instance14.getImage().getImagePath());
			}
			color = instance14.getColor();
			if (color != null) 
				color.getValue();

			ims.core.vo.lookups.SourceofInformation voLookup14 = new ims.core.vo.lookups.SourceofInformation(instance14.getId(),instance14.getText(), instance14.isActive(), null, img, color);
			ims.core.vo.lookups.SourceofInformation parentVoLookup14 = voLookup14;
			ims.domain.lookups.LookupInstance parent14 = instance14.getParent();
			while (parent14 != null)
			{
				if (parent14.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent14.getImage().getImageId(), parent14.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent14.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup14.setParent(new ims.core.vo.lookups.SourceofInformation(parent14.getId(),parent14.getText(), parent14.isActive(), null, img, color));
				parentVoLookup14 = parentVoLookup14.getParent();
								parent14 = parent14.getParent();
			}			
			valueObject.setSourceofInformation(voLookup14);
		}
				// Diagnosis
		valueObject.setDiagnosis(ims.core.vo.domain.DiagLiteVoAssembler.create(map, domainObject.getDiagnosis()) );
		// CareContext
		valueObject.setCareContext(ims.core.vo.domain.CareContextLiteVoAssembler.create(map, domainObject.getCareContext()) );
		// isComorbidity
		valueObject.setIsComorbidity( domainObject.isIsComorbidity() );
		// EpisodeOfCare
		if (domainObject.getEpisodeOfCare() != null)
		{
			if(domainObject.getEpisodeOfCare() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getEpisodeOfCare();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(id, -1));				
			}
			else
			{
				valueObject.setEpisodeOfCare(new ims.core.admin.vo.EpisodeOfCareRefVo(domainObject.getEpisodeOfCare().getId(), domainObject.getEpisodeOfCare().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.clinical.domain.objects.PatientDiagnosis extractPatientDiagnosis(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisShortVo valueObject) 
	{
		return 	extractPatientDiagnosis(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.clinical.domain.objects.PatientDiagnosis extractPatientDiagnosis(ims.domain.ILightweightDomainFactory domainFactory, ims.core.vo.PatientDiagnosisShortVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_PatientDiagnosis();
		ims.core.clinical.domain.objects.PatientDiagnosis domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.clinical.domain.objects.PatientDiagnosis)domMap.get(valueObject);
			}
			// ims.core.vo.PatientDiagnosisShortVo ID_PatientDiagnosis field is unknown
			domainObject = new ims.core.clinical.domain.objects.PatientDiagnosis();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_PatientDiagnosis());
			if (domMap.get(key) != null)
			{
				return (ims.core.clinical.domain.objects.PatientDiagnosis)domMap.get(key);
			}
			domainObject = (ims.core.clinical.domain.objects.PatientDiagnosis) domainFactory.getDomainObject(ims.core.clinical.domain.objects.PatientDiagnosis.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_PatientDiagnosis());

		domainObject.setIsComplication(valueObject.getIsComplication());
		java.util.Date value2 = null;
		ims.framework.utils.Date date2 = valueObject.getDateResolved();		
		if ( date2 != null ) 
		{
			value2 = date2.getDate();
		}
		domainObject.setDateResolved(value2);
		java.util.Date value4 = null;
		ims.framework.utils.Date date4 = valueObject.getDateOnset();		
		if ( date4 != null ) 
		{
			value4 = date4.getDate();
		}
		domainObject.setDateOnset(value4);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.ClinicalContact value5 = null;
		if ( null != valueObject.getClinicalContact() ) 
		{
			if (valueObject.getClinicalContact().getBoId() == null)
			{
				if (domMap.get(valueObject.getClinicalContact()) != null)
				{
					value5 = (ims.core.admin.domain.objects.ClinicalContact)domMap.get(valueObject.getClinicalContact());
				}
			}
			else
			{
				value5 = (ims.core.admin.domain.objects.ClinicalContact)domainFactory.getDomainObject(ims.core.admin.domain.objects.ClinicalContact.class, valueObject.getClinicalContact().getBoId());
			}
		}
		domainObject.setClinicalContact(value5);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value6 = null;
		if ( null != valueObject.getDiagLaterality() ) 
		{
			value6 =
				domainFactory.getLookupInstance(valueObject.getDiagLaterality().getID());
		}
		domainObject.setDiagLaterality(value6);
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getSiteText() != null && valueObject.getSiteText().equals(""))
		{
			valueObject.setSiteText(null);
		}
		domainObject.setSiteText(valueObject.getSiteText());
		domainObject.setIsPMH(valueObject.getIsPMH());
		domainObject.setIsCancerDiagnosis(valueObject.getIsCancerDiagnosis());
		domainObject.setAuthoringInfo(ims.core.vo.domain.AuthoringInformationVoAssembler.extractAuthoringInformation(domainFactory, valueObject.getAuthoringInfo(), domMap));
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDiagnosisDescription() != null && valueObject.getDiagnosisDescription().equals(""))
		{
			valueObject.setDiagnosisDescription(null);
		}
		domainObject.setDiagnosisDescription(valueObject.getDiagnosisDescription());
		ims.framework.utils.PartialDate DiagnosedDate = valueObject.getDiagnosedDate();
		Integer value12 = null;
		if ( null != DiagnosedDate ) 
		{
			value12 = DiagnosedDate.toInteger();
		}
		domainObject.setDiagnosedDate(value12);
		domainObject.setCurrentStatus(ims.clinical.vo.domain.PatientDiagnosisStatusVoAssembler.extractPatientDiagnosisStatus(domainFactory, valueObject.getCurrentStatus(), domMap));
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value14 = null;
		if ( null != valueObject.getSourceofInformation() ) 
		{
			value14 =
				domainFactory.getLookupInstance(valueObject.getSourceofInformation().getID());
		}
		domainObject.setSourceofInformation(value14);
		domainObject.setDiagnosis(ims.core.vo.domain.DiagLiteVoAssembler.extractDiagnosis(domainFactory, valueObject.getDiagnosis(), domMap));
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.core.admin.domain.objects.CareContext value16 = null;
		if ( null != valueObject.getCareContext() ) 
		{
			if (valueObject.getCareContext().getBoId() == null)
			{
				if (domMap.get(valueObject.getCareContext()) != null)
				{
					value16 = (ims.core.admin.domain.objects.CareContext)domMap.get(valueObject.getCareContext());
				}
			}
			else
			{
				value16 = (ims.core.admin.domain.objects.CareContext)domainFactory.getDomainObject(ims.core.admin.domain.objects.CareContext.class, valueObject.getCareContext().getBoId());
			}
		}
		domainObject.setCareContext(value16);
		domainObject.setIsComorbidity(valueObject.getIsComorbidity());
		ims.core.admin.domain.objects.EpisodeOfCare value18 = null;
		if ( null != valueObject.getEpisodeOfCare() ) 
		{
			if (valueObject.getEpisodeOfCare().getBoId() == null)
			{
				if (domMap.get(valueObject.getEpisodeOfCare()) != null)
				{
					value18 = (ims.core.admin.domain.objects.EpisodeOfCare)domMap.get(valueObject.getEpisodeOfCare());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value18 = domainObject.getEpisodeOfCare();	
			}
			else
			{
				value18 = (ims.core.admin.domain.objects.EpisodeOfCare)domainFactory.getDomainObject(ims.core.admin.domain.objects.EpisodeOfCare.class, valueObject.getEpisodeOfCare().getBoId());
			}
		}
		domainObject.setEpisodeOfCare(value18);

		return domainObject;
	}

}
