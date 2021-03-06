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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 4847.21738)
// Copyright (C) 1995-2013 IMS MAXIMS. All rights reserved.

package ims.eas.forms.easmiscellaneous;

import java.util.ArrayList;

import ims.ccosched.vo.lookups.AttendingAs;
import ims.ccosched.vo.lookups.Status;
import ims.ccosched.vo.lookups.Transport;
import ims.configuration.gen.ConfigFlag;
import ims.core.vo.lookups.YesNo;
import ims.domain.exceptions.StaleObjectException;
import ims.eas.vo.ElectronicActionSheetVo;
import ims.eas.vo.PrimaryTumourVo;
import ims.eas.vo.ProtocolNameVo;
import ims.eas.vo.lookups.Agents;
import ims.eas.vo.lookups.EASStatus;
import ims.eas.vo.lookups.PrimaryTumour;
import ims.eas.vo.lookups.TreatmentSites;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws ims.framework.exceptions.PresentationLogicException
	{
		updateControlsState();
		
	}
	private void updateControlsState() 
	{
		form.cmbAgent().setEnabled(FormMode.EDIT.equals(form.getMode()) && (form.cmbAgent().getValues() == null || form.cmbAgent().getValues().size() > 0));
		form.cmbConcurrentSystemicTreatment().setEnabled(false);
		form.dtimPlanningAppointment().setEnabled(FormMode.EDIT.equals(form.getMode()));
		form.cmbTransportPlanning().setEnabled(FormMode.EDIT.equals(form.getMode()));
		form.cmbTransportTreatment().setEnabled(FormMode.EDIT.equals(form.getMode()));
		form.cmbIPOPPlanning().setEnabled(FormMode.EDIT.equals(form.getMode()));
		form.cmbIPOPTreatment().setEnabled(FormMode.EDIT.equals(form.getMode()));
		form.cmbPatientStatus().setEnabled(FormMode.EDIT.equals(form.getMode()));
	}

	public void setDefaultLookups(Transport transport, AttendingAs attendingAs, Status status)
	{
		if (form.cmbTransportPlanning().getValue() == null)
			form.cmbTransportPlanning().setValue(transport);
		
		if (form.cmbTransportTreatment().getValue() == null)
			form.cmbTransportTreatment().setValue(transport);
		
		if (form.cmbIPOPPlanning().getValue() == null)
			form.cmbIPOPPlanning().setValue(attendingAs);
		
		if (form.cmbIPOPTreatment().getValue() == null)
			form.cmbIPOPTreatment().setValue(attendingAs);
		
		if (form.cmbPatientStatus().getValue() == null)
			form.cmbPatientStatus().setValue(status);
	}

	public void setValue(ims.eas.vo.ElectronicActionSheetVo easVo)
	{
		form.getLocalContext().setcurrentRecord(easVo);
		open();
	}

	private void open() 
	{
		populateScreenFromData();

		updateControlsState();
	}
	
	private void populateScreenFromData() 
	{
		clearAllControls();
		
		ElectronicActionSheetVo voEAS = form.getLocalContext().getcurrentRecord();
		if (voEAS == null)
			return;
		
		populateSummaryInformation(voEAS);
		
		if (voEAS.getPrimaryTumour()!=null)
			populateAgentCombo(domain.getPrimaryTumourConfig(voEAS.getPrimaryTumour().getPrimaryTumour()));
		
		if (FormMode.EDIT.equals(form.getMode()))
		{
			form.cmbConcurrentSystemicTreatment().setValue(form.cmbAgent().getValue()!=null ? YesNo.YES : YesNo.NO);
		}

		if (voEAS.getAgentIsNotNull() || voEAS.getConcurrentSystemicTreatment()!=null)
		{	
			//WDEV-18984
			if  (voEAS.getAgent() != null && !voEAS.getAgent().isActive())
				form.cmbAgent().newRow(voEAS.getAgent(), voEAS.getAgent().getText());
			
			form.cmbAgent().setValue(voEAS.getAgent());
		}
		
		if (voEAS.getConcurrentSystemicTreatment()!=null)
		{
			form.cmbConcurrentSystemicTreatment().setValue(voEAS.getConcurrentSystemicTreatment());
		}
		
		form.dtimPlanningAppointment().setValue(voEAS.getPlanningApptDate());
		form.cmbTransportPlanning().setValue(voEAS.getPlanningTransport());
		form.cmbTransportTreatment().setValue(voEAS.getTreatmentTransport());
		form.cmbIPOPPlanning().setValue(voEAS.getIP_OP_Planning());
		form.cmbIPOPTreatment().setValue(voEAS.getIP_OP_Treatment());
		form.cmbPatientStatus().setValue(voEAS.getPatientStatus());
		
	}
		
	private void populateSummaryInformation(ElectronicActionSheetVo voEAS) 
	{
		
		PrimaryTumour primaryTumour = voEAS.getPrimaryTumour()!=null ? voEAS.getPrimaryTumour().getPrimaryTumour() : null;
		TreatmentSites treatmentSite = voEAS.getTreatmentSiteIsNotNull() ? voEAS.getTreatmentSite().getTreatmentSite():null;
		ProtocolNameVo protocol = voEAS.getProtocol();
		EASStatus status = voEAS.getEasStatusIsNotNull() && voEAS.getEasStatus().getStatusIsNotNull() ? voEAS.getEasStatus().getStatus():null;
		
		form.ccSummaryInformation().initialise(primaryTumour, treatmentSite, protocol, status);
	}
	private void clearAllControls() 
	{
		form.cmbAgent().setValue(null);
		form.cmbConcurrentSystemicTreatment().setValue(null);
		form.dtimPlanningAppointment().setValue(null);
		form.cmbTransportPlanning().setValue(null);
		form.cmbTransportTreatment().setValue(null);
		form.cmbIPOPPlanning().setValue(null);
		form.cmbIPOPTreatment().setValue(null);
		form.cmbPatientStatus().setValue(null);
	}
	public ims.eas.vo.ElectronicActionSheetVo getValue()
	{
		return form.getLocalContext().getcurrentRecord();
	}

	public Boolean save()
	{
		ElectronicActionSheetVo easToSave = populateDataFromScreen(form.getLocalContext().getcurrentRecord());
		
		String[] errors = easToSave.validate(getUIErrors());
		if(errors != null && errors.length > 0)
		{
			engine.showErrors(errors);
			return false;
		}
		
		try 
		{
			form.getLocalContext().setcurrentRecord(domain.saveEAS(easToSave));
		} 
		catch (StaleObjectException e) 
		{
			engine.showMessage(ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
	
			form.getLocalContext().setcurrentRecord(domain.getEAS(form.getLocalContext().getcurrentRecord()));	
			open();
			return false; 		
		}
		
		return true;
	}
	private String[] getUIErrors() 
	{
		ArrayList<String> errors = new ArrayList<String>();

		if (form.cmbConcurrentSystemicTreatment().getValue()==null)
		{
			errors.add("'Concurrent Systemic Treatment' is mandatory! " );
		}
		
		if (form.dtimPlanningAppointment().getValue()!=null && form.getLocalContext().getcurrentRecord()!=null && form.dtimPlanningAppointment().getValue().getDate().isLessOrEqualThan(form.getLocalContext().getcurrentRecord().getDateSeen()))
		{
			errors.add("'Planning Appointment at CCC given' date must be greater than 'Date Seen'."); //WDEV-17534
		}
		
		if (errors.size() > 0)
		{
			String[] UIErrors = new String[errors.size()];
			errors.toArray(UIErrors);
			return UIErrors;
		}

		return null;
	}
	private ElectronicActionSheetVo populateDataFromScreen(ElectronicActionSheetVo easToSave) 
	{
		if (easToSave==null)
			easToSave = new ElectronicActionSheetVo();
		else
			easToSave = (ElectronicActionSheetVo) easToSave.clone();
		
		easToSave.setAgent(form.cmbAgent().getValue());
		easToSave.setConcurrentSystemicTreatment(form.cmbConcurrentSystemicTreatment().getValue());
		easToSave.setPlanningApptDate(form.dtimPlanningAppointment().getValue());
		easToSave.setPlanningTransport(form.cmbTransportPlanning().getValue());
		easToSave.setTreatmentTransport(form.cmbTransportTreatment().getValue());
		easToSave.setIP_OP_Planning(form.cmbIPOPPlanning().getValue());
		easToSave.setIP_OP_Treatment(form.cmbIPOPTreatment().getValue());
		easToSave.setPatientStatus(form.cmbPatientStatus().getValue());
			
		return easToSave;
	}
	
	@Override
	protected void onFormModeChanged() 
	{
		updateControlsState();
	}
	@Override
	protected void onCmbAgentValueChanged() throws PresentationLogicException 
	{
		form.cmbConcurrentSystemicTreatment().setValue(form.cmbAgent().getValue()!=null ? YesNo.YES : YesNo.NO);
		
	}
	
	private void populateAgentCombo(PrimaryTumourVo primaryTumourVo) 
	{
		form.cmbAgent().clear();
		if (primaryTumourVo==null)
			return;
		
		for (int i=0;primaryTumourVo.getAgents()!=null && i<primaryTumourVo.getAgents().size();i++)
		{
			Agents agent = primaryTumourVo.getAgents().get(i);
			
			//WDEV-18984
			if (!agent.isActive())
				continue;
			
			form.cmbAgent().newRow(agent, agent.getText());
		}
		
		if (primaryTumourVo.getDefaultAgent()!=null)
		{
			form.cmbAgent().setValue(primaryTumourVo.getDefaultAgent());
		}
		else if (primaryTumourVo.getAgents().size()==1)
		{
			form.cmbAgent().setValue(primaryTumourVo.getAgents().get(0));
		}
	}
}
