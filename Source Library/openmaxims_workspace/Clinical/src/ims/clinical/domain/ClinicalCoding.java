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

package ims.clinical.domain;

// Generated from form domain impl
public interface ClinicalCoding extends ims.domain.DomainInterface
{
	// Generated from form domain interface definition
	public ims.clinical.vo.ClinicalProblemShortVoCollection listConfiguredProblemsShort(String pcName, Boolean isActive) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* listHotlistProblemsShort
	*/
	public ims.clinical.vo.ClinicalProblemShortVoCollection listHotlistProblemsShort(String pcName, ims.core.vo.lookups.Specialty specialty) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* listHotlistProcedureShort
	*/
	public ims.core.vo.ProcedureLiteVoCollection listHotlistProcedureShort(String procedureName, ims.core.vo.lookups.Specialty specialty, Boolean outpatonly) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.core.vo.ProcedureLiteVoCollection listProcLiteVo(String filter, Boolean outpatonly) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* List of Diagnoses to choose from
	*/
	public ims.core.vo.DiagLiteVoCollection listDiagnosisLiteVo(String filter) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* listHotListDiagnosis
	*/
	public ims.core.vo.DiagLiteVoCollection listHotListDiagnosis(String name, ims.core.vo.lookups.Specialty specialty) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* searches for allergen list
	*/
	public ims.core.vo.AllergenVoCollection listAllergens(String voAllergen) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* List of medications found for a partial Medication name search
	*/
	public ims.core.vo.MedicationLiteVoCollection listMedications(String filterMedication) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* Save a ProcedureVo
	*/
	public ims.core.vo.ProcedureVo saveProcedureVo(ims.core.vo.ProcedureVo voProcedureVo) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	/**
	* Save a DiagnosisVo record
	*/
	public ims.core.vo.DiagnosisVo saveDiagnosisVo(ims.core.vo.DiagnosisVo voDiagnosisVo) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	public ims.clinical.vo.ProblemConfigVo saveConfigVo(ims.clinical.vo.ProblemConfigVo voPatientConfig) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	public ims.core.vo.MedicationVo saveConfigVo(ims.core.vo.MedicationVo voMedicationConfig) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	public ims.core.vo.DiagnosisVo getDiagnosisByName(String strDiagnosisName);

	// Generated from form domain interface definition
	public ims.core.vo.MedicationVo getMedicationByName(String strName);

	// Generated from form domain interface definition
	public ims.core.vo.ProcedureVo getProcedureByName(String strName);

	// Generated from form domain interface definition
	public ims.clinical.vo.ProblemConfigVo getProblemByName(String strName);

	// Generated from form domain interface definition
	public ims.core.vo.AllergenVo getAllergenByName(String strName);

	// Generated from form domain interface definition
	public ims.core.vo.AllergenVo saveAllergenVo(ims.core.vo.AllergenVo voAllergen) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	/**
	* saveCancerImagingEventVo
	*/
	public ims.core.vo.CancerImagingEventVo saveCancerImagingEventVo(ims.core.vo.CancerImagingEventVo voImagingEvent) throws ims.domain.exceptions.StaleObjectException, ims.domain.exceptions.UniqueKeyViolationException;

	// Generated from form domain interface definition
	/**
	* listHotlistImagingEventsLite
	*/
	public ims.core.vo.CancerImagingEventLiteVoCollection listHotlistImagingEventsLite(String name, ims.core.vo.lookups.Specialty specialty) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* listImagingEventsLite
	*/
	public ims.core.vo.CancerImagingEventLiteVoCollection listImagingEventsLite(String name) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* getImagingEvnetByName
	*/
	public ims.core.vo.CancerImagingEventVo getImagingEventByName(String name);

	// Generated from form domain interface definition
	/**
	* listHotlistMedication
	*/
	public ims.core.vo.MedicationLiteVoCollection listHotlistMedication(String name, ims.core.vo.lookups.Specialty specialty) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.core.vo.DiagLiteVoCollection listDivisionDiagnoses(String name, ims.core.vo.lookups.DiagnosisDivisions division) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.core.vo.TaxonomyMapCollection searchCodes(ims.core.vo.TaxonomyMap filter) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.core.vo.ProcedureLiteVoCollection listProcLiteVo(String filter) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.core.vo.ProcedureLiteVoCollection listHotlistProcedureShort(String procedureName, ims.core.vo.lookups.Specialty lkpSpecialty) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.core.vo.ProcedureVoCollection listProcedureVo(String name, Boolean isMedication, Boolean isEndoscopy, Boolean outpatientOnly, ims.core.vo.lookups.Specialty specialty, Boolean allProceduresORHotlist) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.core.vo.MedicationLiteVoCollection listMedications(String filterMedication, String ignoredListMedications) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.core.vo.MedicationLiteVoCollection listHotlistMedication(String name,  ims.core.vo.lookups.Specialty specialty, String ignoredListMedications) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	/**
	* public ims.core.vo.DiagLiteVoCollection listHotListDiagnosis(String name, ims.core.vo.lookups.Specialty specialty) throws DomainInterfaceException
	*/
	public ims.core.vo.DiagLiteVoCollection listHotListDiagnosis(String name,  ims.core.vo.lookups.Specialty specialty, Boolean includeExcludedKeywords) throws ims.domain.exceptions.DomainInterfaceException;

	// Generated from form domain interface definition
	public ims.core.vo.DiagLiteVoCollection listDivisionDiagnoses(String name, ims.core.vo.lookups.DiagnosisDivisions division, Boolean includeExcludedKeywords) throws ims.domain.exceptions.DomainInterfaceException;
}
