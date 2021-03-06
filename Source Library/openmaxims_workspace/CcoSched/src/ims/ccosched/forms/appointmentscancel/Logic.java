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
// This code was generated by Alexie Ursache using IMS Development Environment (version 1.22 build 41103.1700)
// Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.

package ims.ccosched.forms.appointmentscancel;

import ims.core.vo.MemberOfStaffShortVo;
import ims.dto.Result;
import ims.dto.client.Lkup;
import ims.dto.client.Sd_appt;
import ims.dto.client.Sd_appt_dts;
import ims.framework.controls.TreeNode;
import ims.framework.enumerations.DialogResult;

import java.util.Hashtable;
public class Logic extends BaseLogicDTO
{
	protected void OnFormOpen() throws ims.framework.exceptions.FormOpenException
	{
		// load statuses
		Lkup statuses = getLookup("3449");

		if(statuses != null && statuses.DataCollection.count() > 0)
		for (int i = 0; i < statuses.DataCollection.count(); ++i)
			if ((statuses.DataCollection.get(i).Lkup_stat.equalsIgnoreCase("Y") || statuses.DataCollection.get(i).Lkup_stat.equals("1")) && (statuses.DataCollection.get(i).Lkup_id.equals("-2190" ) || statuses.DataCollection.get(i).Lkup_id.equals("-2193")))
				form.Status().newRow(statuses.DataCollection.get(i).Lkup_id, statuses.DataCollection.get(i).Lkup_nm);

		form.Status().setValue("-2190");

		// load reasons
		Lkup reasons = getLookup("3444");
		Hashtable ht = new Hashtable();
		for (int i = 0; i < reasons.DataCollection.count(); ++i)
			if ((reasons.DataCollection.get(i).Lkup_stat.equalsIgnoreCase("Y") || reasons.DataCollection.get(i).Lkup_stat.equals("1")) && (reasons.DataCollection.get(i).Lkup_parent.equals("0") || reasons.DataCollection.get(i).Lkup_parent.equals("")))
				ht.put(reasons.DataCollection.get(i).Lkup_id, form.Reason().getNodes().add(reasons.DataCollection.get(i).Lkup_id, reasons.DataCollection.get(i).Lkup_nm));
		for (int i = 0; i < reasons.DataCollection.count(); ++i)
			if ((reasons.DataCollection.get(i).Lkup_stat.equalsIgnoreCase("Y") || reasons.DataCollection.get(i).Lkup_stat.equals("1")) && (!reasons.DataCollection.get(i).Lkup_parent.equals("0") && !reasons.DataCollection.get(i).Lkup_parent.equals("")))
				ht.put(reasons.DataCollection.get(i).Lkup_id, ((TreeNode)ht.get(reasons.DataCollection.get(i).Lkup_parent)).getNodes().add(reasons.DataCollection.get(i).Lkup_id, reasons.DataCollection.get(i).Lkup_nm));
	}
	protected void OnButtonCancel() throws ims.framework.exceptions.PresentationLogicException
	{
		engine.close(DialogResult.CANCEL);
	}
	protected void OnButtonSave() throws ims.framework.exceptions.PresentationLogicException
	{
		if(Save())
			engine.close(DialogResult.OK);
	}
	private boolean Save()
	{
		// Add code to save the data here.
		//13/12/2004 - Reason is mandatory
		String reason = GetReason();
		if(reason == null || reason.equals(""))
		{
			engine.showMessage("No reason selected.");
			return false;
		}
		//foreach (dto.Sd_appt_dtsDTO.Sd_appt_dtsClient apptDts in Form._GlobalContext.Scheduler.Reschedule.SelectedAppointments.Value)
		for(int i=0; i<form.getGlobalContext().CcoSched.Reschedule.getSelectedAppointments().count(); i++)
		{
			Sd_appt_dts.Sd_appt_dtsRecord apptDts = form.getGlobalContext().CcoSched.Reschedule.getSelectedAppointments().get(i);
			Sd_appt appointments = (Sd_appt) domain.getDTOInstance(Sd_appt.class);
			appointments.Filter.clear();
			appointments.Filter.Appt_head_id = apptDts.Appt_head_id;
			Result result = appointments.get();
			if (result != null)
			{
				showMessage(result.getMessage());
				return false;
			}

			Sd_appt.Sd_apptRecord appointment = appointments.DataCollection.get(0);
			result = appointments.getForUpdate();
			if (result != null)
			{
				if (result.getId() < 0)
					showMessage(result.getMessage());
				else
					showMessage("Data was changed.");
				return false;
			}
			
			for(int j=0; j<appointment.Appt_idCollection.count(); j++)
			//foreach (dto.Sd_apptDTO.Appt_idClient t in appointment.Appt_idCollection)
			{
				Sd_appt.Sd_apptAppt_idRecord t = appointment.Appt_idCollection.get(j);
				if (t.Appt_id.equals(apptDts.Appt_id))					
				{
					t.Appt_stat = form.Status().getValue();
					t.Appt_stat_reason = reason;
					// WDEV-14218
					// Any member of staff can make a booking
					MemberOfStaffShortVo mosVo = (MemberOfStaffShortVo) domain.getMosUser();
					if (mosVo != null)
						t.Hcp_booking1 =String.valueOf(mosVo.getIMosId());

					break;
				}
			}
			
			result = appointments.update();
			if (result != null)
			{
				//WDEV-14600
				showMessage("Failed to update record. Please select Status");
				//showMessage(result.getMessage());
				return false;
			}			
		}
		return true;
	}
	private String GetReason()
	{
		String tmp = "";

		//foreach (TreeNode root in Form.Reason.Nodes)		
		for(int i=0; i<form.Reason().getNodes().size(); i++)
		{
			TreeNode root = form.Reason().getNodes().get(i);
			//foreach (TreeNode node in root.Nodes)
			for(int j=0; j<root.getNodes().size(); j++)
			{
				TreeNode node = root.getNodes().get(j);
				if (node.isChecked())
				{
					tmp = (String)node.getValue();
					break;
				}
			}
			if (!tmp.equals(""))
				break;
			if (root.isChecked())
			{
				tmp = (String)root.getValue();
				break;
			}
		}
		return tmp;
	}
	private void showMessage(String message)
	{
		engine.showMessage(message);
	}
	private Lkup getLookup(String lookupId)
	{
		Lkup lkup = (Lkup) domain.getDTOInstance(Lkup.class);
		lkup.Filter.clear();
		lkup.Filter.Lkup_typ = lookupId;
		Result result = lkup.list();
		if (result != null)
		{
			showMessage(result.getMessage());
		}
		
		return lkup;
	}
	protected void onReasonTreeViewSelectionChanged(ims.framework.controls.TreeNode nodeval) throws ims.framework.exceptions.PresentationLogicException
	{
		//foreach (TreeNode root in Form.Reason.Nodes)
		for (int i = 0; i < form.Reason().getNodes().size(); i++) 
		{
			TreeNode root = form.Reason().getNodes().get(i);
			
			//foreach (TreeNode node in root.Nodes)
			for (int j = 0; j < root.getNodes().size(); j++) 
			{
				TreeNode node = root.getNodes().get(j);
				
				node.setChecked(node.getValue().equals(nodeval));
				root.setChecked(root.getValue().equals(nodeval));
			}
		}
	}
	protected void onReasonTreeViewCheck(ims.framework.controls.TreeNode nodeval) throws ims.framework.exceptions.PresentationLogicException
	{
		//foreach (TreeNode root in Form.Reason.Nodes)
		for (int i = 0; i < form.Reason().getNodes().size(); i++) 
		{
			TreeNode root = form.Reason().getNodes().get(i);
			
			//foreach (TreeNode node in root.Nodes)
			for (int j = 0; j < root.getNodes().size(); j++) 
			{
				TreeNode node = root.getNodes().get(j);
				
				if (!node.equals(nodeval))
					node.setChecked(false);
			}
			
			if (!root.equals(nodeval))
				root.setChecked(false);

			form.Reason().setValue(nodeval.getValue());
		}
	}
}
