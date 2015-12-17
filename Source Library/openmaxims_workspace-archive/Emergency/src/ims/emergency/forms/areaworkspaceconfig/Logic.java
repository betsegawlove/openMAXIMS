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
// This code was generated by Florin Blindu using IMS Development Environment (version 1.80 build 4342.23748)
// Copyright (C) 1995-2012 IMS MAXIMS. All rights reserved.

package ims.emergency.forms.areaworkspaceconfig;

import ims.emergency.forms.areaworkspaceconfig.GenForm.grdAreaWorkspaceRow;
import ims.emergency.vo.ColumnDetailVo;
import ims.emergency.vo.ColumnDetailVoCollection;
import ims.emergency.vo.TrackingAreaVo;
import ims.emergency.vo.TrackingAreaVoCollection;
import ims.emergency.vo.enums.AreaWorkspaceEvent;
import ims.framework.Control;
import ims.framework.FormName;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	public void initialize(Boolean argument, TrackingAreaVoCollection areaDefCollection)
	{
		if (argument && areaDefCollection == null && form.cmbArea().getValue() != null) // Edit
		{
			form.getGlobalContext().Emergency.setTrackingAreaWorkspace(domain.getTrackingArea(form.cmbArea().getValue()));
			engine.open(form.getForms().Emergency.TrackingAreaColumnConfigurationDialog);
		}
		else if (areaDefCollection != null) // view Mode
		{
			populateFromAreaCombo(areaDefCollection);
			form.getGlobalContext().Emergency.setTrackingAreaWorkspace(null);
		}
		open();
	}

	private void populateFromAreaCombo(TrackingAreaVoCollection areaDefCollection)
	{
		form.cmbArea().clear();
		for (int i = 0; i < areaDefCollection.size(); i++)
		{
			/*if (areaDefCollection.get(i).getIsOverallView())
				continue;*/

			form.cmbArea().newRow(areaDefCollection.get(i), areaDefCollection.get(i).getAreaDisplayName());
		}
	}

	public void setValue(TrackingAreaVo columnDetails)
	{
		if (columnDetails == null)
			return;

		form.getGlobalContext().Emergency.setTrackingAreaWorkspace(domain.getTrackingArea(columnDetails));
		open();
	}

	private void open()
	{
		form.cmbArea().setValue(form.getGlobalContext().Emergency.getTrackingAreaWorkspace());
		populateGrid();
	}

	private void populateGrid()
	{
		form.grdAreaWorkspace().getRows().clear();

		if (form.getGlobalContext().Emergency.getTrackingAreaWorkspace() == null)
			return;
		else if (form.getGlobalContext().Emergency.getTrackingAreaWorkspace().getColumns() == null)
			return;

		ColumnDetailVoCollection collColumnDetails = form.getGlobalContext().Emergency.getTrackingAreaWorkspace().getColumns();

		for (int i = 0; i < collColumnDetails.size(); i++)
		{
			addRow(collColumnDetails.get(i));	// latest changes 06.04.2012
		}

	}
	
	private void populateGridWithOrder() //used only when closing the Dialog
	{
		if (form.getGlobalContext().Emergency.getTrackingAreaWorkspace() == null)
			return;
		else if (form.getGlobalContext().Emergency.getTrackingAreaWorkspace().getColumns() == null)
			return;

		ColumnDetailVoCollection collColumnDetails = form.getGlobalContext().Emergency.getTrackingAreaWorkspace().getColumns();

		ColumnDetailVoCollection tempColl=new ColumnDetailVoCollection();
		
		int rowsNumber = form.grdAreaWorkspace().getRows().size();
		
		//remove rows
		for (int i=form.grdAreaWorkspace().getRows().size()-1;i>=0;i--) 
		{ 
			boolean isInCollection = false;
			for (int j=collColumnDetails.size()-1;j>=0;j--)
			{
				if (collColumnDetails.get(j).getColumn().equals(form.grdAreaWorkspace().getRows().get(i).getValue().getColumn()))
				{
					isInCollection=true;
				}	
			}
			if (!isInCollection)
				form.grdAreaWorkspace().getRows().remove(i);
		}
		
		//add or update rows
		for (int i = 0; i < collColumnDetails.size(); i++)
		{
			ColumnDetailVo columnDetail = collColumnDetails.get(i);

			boolean isInGrid = false;
			
			if (rowsNumber==0)
			{
				addRow(collColumnDetails.get(i));
				continue;
			}
			
    		for (int j = 0; j <form.grdAreaWorkspace().getRows().size() ; j++)
    		{
    			ColumnDetailVo gridRecord = form.grdAreaWorkspace().getRows().get(j).getValue();
    			if (columnDetail.getColumn().equals(gridRecord.getColumn()) )
    			{	
    				if (!gridRecord.getColHeader().equals(columnDetail.getColHeader()) || !gridRecord.getColWidth().equals(columnDetail.getColWidth()) || !maskInPublicAreaValuesAreEquals(gridRecord.getMaskInPublicArea(),columnDetail.getMaskInPublicArea())) //WDEV-17966
    				{
    					updateRow(form.grdAreaWorkspace().getRows().get(j), columnDetail);
    				}			
    				
    				isInGrid=true;				
    				break;	
   				}		
    		}
			
			if (!isInGrid)
			{
				tempColl.add(columnDetail);
			}
		}
		
		for (int i=0;i<tempColl.size();i++)
		{
			addRow(tempColl.get(i));
		}

	}

	//WDEV-17966
	private boolean maskInPublicAreaValuesAreEquals(Boolean maskInPublicAreaGrid, Boolean maskInPublicAreaGC)
	{
		if (maskInPublicAreaGrid==null && maskInPublicAreaGC==null)
			return true;
		
		if (maskInPublicAreaGrid!=null && maskInPublicAreaGC!=null && maskInPublicAreaGrid.equals(maskInPublicAreaGC))
			return true;
		
		return false;
		
	}

	private void updateRow(grdAreaWorkspaceRow row, ColumnDetailVo columnDetail)
	{
		row.setcolHeader(columnDetail.getColHeader());
		row.setcolWidth(columnDetail.getColWidth().toString());
		row.setcolImage(columnDetail.getColumn().getImage());
		row.setcolMaskInPublicArea(columnDetail.getMaskInPublicArea()!=null ? columnDetail.getMaskInPublicArea(): false);//WDEV-17966
		row.setValue(columnDetail);

	}

	private void addRow(ColumnDetailVo columnDetail)// latest changes 06.04.2012
	{
		grdAreaWorkspaceRow row = form.grdAreaWorkspace().getRows().newRow();
		row.setcolHeader(columnDetail.getColHeader());
		row.setcolWidth(columnDetail.getColWidth().toString());
		row.setcolImage(columnDetail.getColumn().getImage());
		row.setcolMaskInPublicArea(columnDetail.getMaskInPublicArea()!=null ? columnDetail.getMaskInPublicArea(): false);//WDEV-17966
		row.setValue(columnDetail);
	}

	public TrackingAreaVo getValue()
	{
		return populateDataFromScreen(form.getGlobalContext().Emergency.getTrackingAreaWorkspace());
	}

	private TrackingAreaVo populateDataFromScreen(TrackingAreaVo trackingArea)// latest changes 06.04.2012
	{
		ColumnDetailVoCollection collectionToSave = new ColumnDetailVoCollection();
		for (int i = 0; i < form.grdAreaWorkspace().getRows().size(); i++)
		{
			collectionToSave.add(form.grdAreaWorkspace().getRows().get(i).getValue());
		}
		trackingArea.setColumns(collectionToSave);
		return trackingArea;
	}

	@Override
	protected void onFormModeChanged()
	{
		updateControlsState();
	}

	private void updateControlsState()
	{
		form.getContextMenus().Emergency.getAreaWorkspaceConfigEditColumnsItem().setVisible(FormMode.EDIT.equals(form.getMode()));
		form.getContextMenus().Emergency.getAreaWorkspaceConfigPreviewItem().setVisible(form.cmbArea().getValue() != null);
		form.getContextMenus().Emergency.getAreaWorkspaceConfigMoveUpItem().setVisible(FormMode.EDIT.equals(form.getMode()) && form.grdAreaWorkspace().canMoveCurrentUp());// latest changes 06.04.2012
		form.getContextMenus().Emergency.getAreaWorkspaceConfigMoveDownItem().setVisible(FormMode.EDIT.equals(form.getMode()) && form.grdAreaWorkspace().canMoveCurrentDown());// latest changes 06.04.2012
		
		//WDEV-14896
		form.getContextMenus().Emergency.getAreaWorkspaceConfigCopyItem().setVisible(FormMode.VIEW.equals(form.getMode()) && form.cmbArea().getValue()==null);
	}

	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException
	{
		open();
	}

	@Override
	protected void onFormDialogClosed(FormName formName, DialogResult result) throws PresentationLogicException
	{
		if (formName.equals(form.getForms().Emergency.TrackingAreaColumnConfigurationDialog)&& result.equals(DialogResult.OK)) //WDEV-14896
		{
			// open();
			populateGridWithOrder();
		}
		//WDEV-14896
		else if (formName.equals(form.getForms().Emergency.CopyAreaWorkspaceConfig)&& result.equals(DialogResult.OK))
		{
			form.getLocalContext().setSelectedEvent(AreaWorkspaceEvent.COPYAREAWORKSPACEDIALOGCLOSED);
			form.fireCustomControlValueChanged();
		}
		updateControlsState();
	}

	@Override
	protected void onContextMenuItemClick(int menuItemID, Control sender) throws PresentationLogicException
	{
		switch (menuItemID)
		{
			case GenForm.ContextMenus.EmergencyNamespace.AreaWorkspaceConfig.EditColumns:
				engine.open(form.getForms().Emergency.TrackingAreaColumnConfigurationDialog);
				break;
			case GenForm.ContextMenus.EmergencyNamespace.AreaWorkspaceConfig.Preview:
				// form.getGlobalContext().Emergency.setTrackingAreaColumns(form.getGlobalContext().Emergency.getTrackingAreaWorkspace().getColumns());
				form.getGlobalContext().Emergency.setTrackingAreaColumns(populateDataFromScreen(form.getGlobalContext().Emergency.getTrackingAreaWorkspace()).getColumns());// latest changes 06.04.2012
				engine.open(form.getForms().Emergency.TrackingAreaColumnPreview);
				break;
			case GenForm.ContextMenus.EmergencyNamespace.AreaWorkspaceConfig.MoveUp:// latest changes 06.04.2012
				form.grdAreaWorkspace().moveUp();
				updateControlsState();
				break;
			case GenForm.ContextMenus.EmergencyNamespace.AreaWorkspaceConfig.MoveDown:// latest changes 06.04.2012
				form.grdAreaWorkspace().moveDown();
				updateControlsState();
				break;
			case GenForm.ContextMenus.EmergencyNamespace.AreaWorkspaceConfig.Copy: //WDEV-14896
				// form.getGlobalContext().Emergency.setTrackingAreaColumns(form.getGlobalContext().Emergency.getTrackingAreaWorkspace().getColumns());
				//form.getGlobalContext().Emergency.setTrackingAreaColumns(populateDataFromScreen(form.getGlobalContext().Emergency.getTrackingAreaWorkspace()).getColumns());// latest changes 06.04.2012
				engine.open(form.getForms().Emergency.CopyAreaWorkspaceConfig);
				break;

		}
	}

	@Override
	protected void onCmbAreaValueChanged() throws PresentationLogicException
	{
		if (form.cmbArea().getValue() != null)
		{
			form.getGlobalContext().Emergency.setTrackingAreaWorkspace(domain.getTrackingArea(form.cmbArea().getValue()));
		}
		else
		{
			form.getGlobalContext().Emergency.setTrackingAreaWorkspace(null);
		}

		populateGrid();
		form.getLocalContext().setSelectedEvent(AreaWorkspaceEvent.COMBOVALUECHANGED);
		form.fireCustomControlValueChanged();

	}

	public TrackingAreaVo getFromAreaCombo()
	{
		return form.cmbArea().getValue();
	}

	public AreaWorkspaceEvent getSelectedEvent()
	{
		return form.getLocalContext().getSelectedEvent();
	}

	public void resetSelectedEvent()
	{
		form.getLocalContext().setSelectedEvent(null);

	}

	@Override
	protected void onGrdAreaWorkspaceSelectionChanged() throws PresentationLogicException
	{
		updateControlsState();
	}

}