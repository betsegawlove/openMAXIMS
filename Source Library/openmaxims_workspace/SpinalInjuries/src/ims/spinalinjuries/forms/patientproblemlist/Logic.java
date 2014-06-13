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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.22 build 50117.1700)
// Copyright (C) 1995-2005 IMS MAXIMS plc. All rights reserved.

package ims.spinalinjuries.forms.patientproblemlist;

import ims.core.vo.ClinicalContactShortVo;
import ims.core.vo.lookups.ContactType;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.Control;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.generalmedical.vo.MedicalProbOnAdmisVo;
import ims.generalmedical.vo.MedicalProbOnAdmisVoCollection;

public class Logic extends BaseLogic
{
	protected void onFormOpen() throws ims.framework.exceptions.FormOpenException
	{
		open();
	}
	
	private void open()
	{
		MedicalProbOnAdmisVoCollection problems = domain.listPatientProblems(form.getGlobalContext().Core.getCurrentCareContext());
		if (problems != null)
		{
			form.getLocalContext().setdetails(problems);
			populateGrid(problems);
		}
		form.setMode(FormMode.VIEW);
		form.getLocalContext().setSelectedMedicalProbOnAdmisVo(null);
	}
	
	private void populateGrid(MedicalProbOnAdmisVoCollection problems)
	{
		form.grdProblems().getRows().clear();
		GenForm.grdProblemsRow row;
		for (int i=0; i<problems.size(); i++)
		{
			MedicalProbOnAdmisVo pblm = problems.get(i);
			if (pblm.getIsActiveIsNotNull() && pblm.getIsActive().booleanValue())
			{
				row = form.grdProblems().getRows().newRow();
				row.setValue(pblm);
				row.setcolProblemContext(pblm.getProblemContext());
				row.setcolProblem(pblm.getPatientProblem());
			}
		}
	}
	
	protected void onBtnUpdateClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.setMode(FormMode.EDIT);
	}

	protected void onBtnSaveClick() throws ims.framework.exceptions.PresentationLogicException
	{
		MedicalProbOnAdmisVoCollection problems = form.getLocalContext().getdetails();
		if (problems == null)
			problems = new MedicalProbOnAdmisVoCollection();
				
		//MedicalProbOnAdmisVoCollection coll = problems.getProblemsOnAdmissionIsNotNull() && problems.getProblemsOnAdmission().size() > 0?problems.getProblemsOnAdmission():new MedicalProbOnAdmisVoCollection();
		GenForm.grdProblemsRow row;
		for (int i=0; i<form.grdProblems().getRows().size(); i++)
		{
			row = form.grdProblems().getRows().get(i);
			MedicalProbOnAdmisVo vo = row.getValue();
			if (vo == null)
			{
				vo = new MedicalProbOnAdmisVo();
			}
			
			if(form.getGlobalContext().Core.getCurrentClinicalContactIsNotNull())
				vo.setClinicalContact(form.getGlobalContext().Core.getCurrentClinicalContact());
			if(form.getGlobalContext().Core.getCurrentClinicalContactIsNotNull())
				vo.setCareContext(form.getGlobalContext().Core.getCurrentClinicalContact().getCareContext());
			
			vo.setPatientProblem(row.getcolProblem());
			vo.setProblemContext(row.getcolProblemContext());
			vo.setIsActive(new Boolean(true));
			
			if(vo.getID_PatientProblem()==null)
				problems.add(vo);
		}
		
		String[] errors = problems.validate();
		if (errors != null)
		{
			engine.showErrors(errors);
			return;
		}
		
		try {
			domain.savePatientProblems(problems);
		} catch (StaleObjectException e) 
		{
			engine.showMessage("Data has changed, screen will be refreshed");
			open();
			return;
		}
		open();
		
	}
	protected void onBtnCancelClick() throws ims.framework.exceptions.PresentationLogicException
	{
		open();
	}

	protected void addProblem(Control sender) 
	{
		if(sender.equals(form.grdProblems()))
		{
			GenForm.grdProblemsRow row = form.grdProblems().getRows().newRow(true);
			row.setValue(new MedicalProbOnAdmisVo());
			row.setcolProblemContext("Patient Problems");
			form.getLocalContext().setSelectedMedicalProbOnAdmisVo(form.grdProblems().getValue()); //WDEV-15209
		}
	}

	protected void onFormModeChanged() 
	{
		updateControlsState(); //WDEV-15209
	}

	private void updateControlsState()
	{
		form.getContextMenus().getGenericGridRemoveItem().setVisible(form.getMode().equals(FormMode.EDIT) && form.getLocalContext().getSelectedMedicalProbOnAdmisVoIsNotNull());
		form.getContextMenus().getGenericGridAddItem().setVisible(form.getMode().equals(FormMode.EDIT));
		
		if(form.getMode().equals(FormMode.EDIT))
			form.btnUpdate().setVisible(false);
		else
			form.btnUpdate().setVisible(isMedicalAdmission());
		
	}

	private boolean isMedicalAdmission()
	{
		ClinicalContactShortVo voClinicalContact = form.getGlobalContext().Core.getCurrentClinicalContact();
		if(voClinicalContact != null && voClinicalContact.getContactType().equals(ContactType.SPINALMEDICALADMISSION))
			return true;
		else
			return false;
	}

	protected void onContextMenuItemClick(int menuItemID, Control sender) throws PresentationLogicException 
	{
		  switch (menuItemID)
		  {
		  	case GenForm.ContextMenus.GenericGrid.Remove:
		  		removeProblem(sender);
		  		updateControlsState();
		  		break;
		  	case GenForm.ContextMenus.GenericGrid.Add:
		  		addProblem(sender);
		  		updateControlsState();
		  		break;
		  }
	}
	
	private void removeProblem(Control sender)
	{
		if(sender.equals(form.grdProblems()))
		{
			if(form.grdProblems().getSelectedRowIndex() >= 0)
			{
				makeVoInactive(form.grdProblems().getValue());
				form.grdProblems().removeSelectedRow();
				form.getLocalContext().setSelectedMedicalProbOnAdmisVo(null); //WDEV-15209
			}
			else
			{
				engine.showMessage("Please select a Problem to be removed");
			}
		}
	}

	private void makeVoInactive(MedicalProbOnAdmisVo problem)
	{
		MedicalProbOnAdmisVoCollection problems = form.getLocalContext().getdetails();
		if(problems != null && problem.getID_PatientProblemIsNotNull())
		{
			for(int i=0; i<problems.size(); i++)
			{
				if(problem.getID_PatientProblem().equals(problems.get(i).getID_PatientProblem()))
				{
					problems.get(i).setIsActive(new Boolean(false));
				}
			}
			form.getLocalContext().setdetails(problems);
		}
	}

	@Override
	protected void onGrdProblemsSelectionChanged() throws PresentationLogicException 
	{	
		form.getLocalContext().setSelectedMedicalProbOnAdmisVo(form.grdProblems().getValue());
		updateControlsState();
	}
}