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
// This code was generated by Peter Martin using IMS Development Environment (version 1.65 build 3210.27143)
// Copyright (C) 1995-2008 IMS MAXIMS plc. All rights reserved.

package ims.ocrr.forms.importresultsdialog;

import ims.configuration.gen.ConfigFlag;
import ims.core.vo.MemberOfStaffShortVo;
import ims.core.vo.enums.UploadDocumentAction;
import ims.core.vo.enums.UploadDocumentStoreLevel;
import ims.core.vo.lookups.DocumentCategory;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.MessageButtons;
import ims.framework.MessageIcon;
import ims.framework.cn.events.UpdateTheme;
import ims.framework.enumerations.DialogResult;
import ims.framework.enumerations.FormMode;
import ims.framework.exceptions.PresentationLogicException;
import ims.framework.utils.DateTime;
import ims.ocrr.vo.ImportResultsConfigVo;
import ims.ocrr.vo.OrderedInvestigationStatusVo;
import ims.ocrr.vo.OrderedInvestigationStatusVoCollection;
import ims.ocrr.vo.ReferralAppointmentDetailsOcsOrderVo;
import ims.ocrr.vo.ReferralAppointmentDetailsOcsOrderVoCollection;
import ims.ocrr.vo.ReferralAppointmentDetailsOrderInvestigationVo;
import ims.ocrr.vo.ReferralAppointmentInvestigationsVo;
import ims.ocrr.vo.ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo;
import ims.ocrr.vo.lookups.Category;
import ims.ocrr.vo.lookups.OcsDisplayFlag;
import ims.ocrr.vo.lookups.OrderInvStatus;
import ims.ocrr.vo.lookups.ResultDetailsType;
import ims.ocrr.vo.lookups.ResultStatus;

import java.util.ArrayList;

public class Logic extends BaseLogic
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void onFormOpen(Object[] args) throws PresentationLogicException 
	{

		//WDEV-16361
		if (args != null && args.length > 0 && args[0] instanceof ReferralAppointmentDetailsOrderInvestigationVo) 
		{
			form.getLocalContext().setReferralAppointmentDetailsOrderInvestigationVo((ReferralAppointmentDetailsOrderInvestigationVo) args[0]);
		}
		initialize();
	}
	private void initialize() {
		
		form.setMode(FormMode.VIEW);
		form.btnImport().setEnabled(false);
		form.btnScan().setEnabled(false);
		
		
		form.getLocalContext().setImportResultsConfigVo(domain.getImportResultsConfig());
		populateGrid();			
	}
	@Override
	protected void onFormDialogClosed(ims.framework.FormName formName, ims.framework.enumerations.DialogResult result) throws ims.framework.exceptions.PresentationLogicException
	{
		if (formName.equals(form.getForms().Core.UploadDocumentDialog) && result.equals(DialogResult.OK))
		{
			if (form.getGlobalContext().Core.getPatientDocumentIsNotNull())
			{
				form.htm1().setHTML("<IFRAME id=\"PostFrame\" name=\"PostFrame\" width=\"100%\" height=\"100%\" frameborder=0 src='" + getFileServerURL() + form.getGlobalContext().Core.getPatientDocument().getServerDocument().getFileName() +  "'></IFRAME>");			
				form.getLocalContext().setDisplayDocument("<IFRAME id=\"PostFrame\" name=\"PostFrame\" width=\"100%\" height=\"100%\" frameborder=0 src='" + ConfigFlag.GEN.FILE_SERVER_URL.getValue() + getFileServerURL() + form.getGlobalContext().Core.getPatientDocument().getServerDocument().getFileName() +  "'></IFRAME>");
				form.setMode(FormMode.EDIT);
			}
		}
	}
	private boolean attachDocumentToInvestigation() {
		ReferralAppointmentDetailsOrderInvestigationVo voOrderInv = form.getLocalContext().getReferralAppointmentDetailsOrderInvestigationVo();
		
		ArrayList<String> screenErrors = new ArrayList<String>();
		
		voOrderInv = populateOrderInvestigation(voOrderInv);
		
		if (form.dtimInvestigationDateTime().getValue() == null )
		{
			screenErrors.add("Please enter Investigation Date/Time.");
		}
		
		String[] arrErrors = voOrderInv.validate();
		String[] arrScreenAndVoErrors = addScreenErrorsToVOErrors(screenErrors, arrErrors);
		if (arrScreenAndVoErrors != null && arrScreenAndVoErrors.length > 0)
		{
			engine.showErrors(arrScreenAndVoErrors);
			return false;
		}
		try {
			form.getLocalContext().setReferralAppointmentDetailsOrderInvestigationVo(domain.saveReferralAppointmentDetailsOrderInvestigationVo(voOrderInv));
		} catch (StaleObjectException e) {
			engine.showMessage(ims.configuration.gen.ConfigFlag.UI.STALE_OBJECT_MESSAGE.getValue());
			return false;
		}
		
		return true;		
	}
	private String[] addScreenErrorsToVOErrors(ArrayList screenErrors, String[] arrErrors)
	{
		String[] arrAllErrors = null;

		if (arrErrors != null)
		{
			arrAllErrors = new String[screenErrors.size() + arrErrors.length];
			for (int i = 0; i < screenErrors.size(); i++)
				arrAllErrors[i] = (String) screenErrors.get(i);

			int i = 0;
			for (int p = screenErrors.size(); p < arrAllErrors.length; p++)
			{
				arrAllErrors[p] = arrErrors[i];
				i++;
			}
		}
		else
		{
			arrAllErrors = new String[screenErrors.size()];

			for (int i = 0; i < screenErrors.size(); i++)
				arrAllErrors[i] = (String) screenErrors.get(i);
		}
 
		return arrAllErrors;
	}
	private ReferralAppointmentDetailsOrderInvestigationVo populateOrderInvestigation(ReferralAppointmentDetailsOrderInvestigationVo voOrderInv) 
	{
		if(voOrderInv == null)// 	WDEV-16232
			voOrderInv = new ReferralAppointmentDetailsOrderInvestigationVo();
		
		if(voOrderInv.getResultDetails() == null)// 	WDEV-16232
			voOrderInv.setResultDetails(new ResultDetailsForReferralAppointmentDetailsOrderInvestigationVo());
		
		//WDEV-16361
		if (engine.getPreviousNonDialogFormName().equals(form.getForms().OCRR.ClinicalOrdersResultsOCRRForm))
		{
			voOrderInv.getResultDetails().setType(ResultDetailsType.CLINICAL);
		}
		//WDEV-17955
		else if (voOrderInv.getInvestigation() != null && voOrderInv.getInvestigation().getInvestigationIndex() != null)
		{
			if (Category.CLINICAL.equals(voOrderInv.getInvestigation().getInvestigationIndex().getCategory()) || Category.CLINICALIMAGING.equals(voOrderInv.getInvestigation().getInvestigationIndex().getCategory()))
			{
				voOrderInv.getResultDetails().setType(ResultDetailsType.CLINICAL);
			}
			else if (Category.PATHOLOGY.equals(voOrderInv.getInvestigation().getInvestigationIndex().getCategory()))
			{
				voOrderInv.getResultDetails().setType(ResultDetailsType.PATHOLOGY);
			}
		}
		
		voOrderInv.getResultDetails().setDocumentResultDetails(form.getGlobalContext().Core.getPatientDocument());// 	WDEV-16232
		
		voOrderInv.setRepDateTime(new DateTime());
		voOrderInv.setResultSortDate(new DateTime()); //http://jira/browse/WDEV-18025
		voOrderInv.setRepTimeSupplied(true);
		voOrderInv.setDisplayDateTime(new DateTime());
		voOrderInv.setDisplayTimeSupplied(true);
		
		voOrderInv.setDisplayFlag(OcsDisplayFlag.REPORTED);
		voOrderInv.setResultStatus(ResultStatus.FINAL);
		
		OrderedInvestigationStatusVo status = new OrderedInvestigationStatusVo();
		if (domain.getMosUser() != null)
		{
			if (((MemberOfStaffShortVo) domain.getMosUser()).getAppUser() != null)
				status.setChangeUser(((MemberOfStaffShortVo) domain.getMosUser()).getAppUser().getUserRealName());
		}

		status.setChangeDateTime(new DateTime());
		status.setProcessedDateTime(new DateTime());
		status.setOrdInvStatus(OrderInvStatus.RESULTED);
		status.setStatusReason("import of result");
		voOrderInv.setOrdInvCurrentStatus(status);
		
		if(voOrderInv.getOrdInvStatusHistory()==null)
			voOrderInv.setOrdInvStatusHistory(new OrderedInvestigationStatusVoCollection ());
		
		OrderedInvestigationStatusVoCollection statusHistory = voOrderInv.getOrdInvStatusHistory();
		statusHistory.add(status);
		
		voOrderInv.setInvestigationDateTime(form.dtimInvestigationDateTime().getValue());
		
		//TODO
		voOrderInv.setFillerOrdNum(" ");
		//voOrderInv.setPerformedLocation();
		
		return voOrderInv;
	}
	private void populateGrid() {
		form.grdInvestigations().getRows().clear();
		
		if(form.getGlobalContext().RefMan.getCatsReferralIsNotNull())
		{
			ReferralAppointmentInvestigationsVo voReferralAppointmentInvestigations = domain.listInvestigations(form.getGlobalContext().RefMan.getCatsReferral());
			ReferralAppointmentDetailsOcsOrderVoCollection order = voReferralAppointmentInvestigations.getInvestigationOrders();
			for(ReferralAppointmentDetailsOcsOrderVo voOrder : order)
			{
				for(ReferralAppointmentDetailsOrderInvestigationVo voOrderInv : voOrder.getInvestigations())
				{
					if(configCategory(voOrderInv)){
							
						GenForm.grdInvestigationsRow row = form.grdInvestigations().getRows().newRow();
						if(voOrder.getSysInfoIsNotNull() && voOrder.getSysInfo().getCreationDateTime() != null)
							row.setcolDate(voOrder.getSysInfo().getCreationDateTime().toString(false));
						
						if(voOrderInv.getInvestigationIsNotNull() && voOrderInv.getInvestigation().getInvestigationIndexIsNotNull())
							row.setcolInvestigation(voOrderInv.getInvestigation().getInvestigationIndex().getName());
						
						if(voOrderInv.getSpecimenIsNotNull() && voOrderInv.getSpecimen().size() > 0 && voOrderInv.getSpecimen().get(0).getSpecimenSourceIsNotNull())
							row.setcolSpecimen(voOrderInv.getSpecimen().get(0).getSpecimenSource().getText());
						
						if(voOrder.getResponsibleClinicianIsNotNull())
							row.setcolResp(voOrder.getResponsibleClinician().toString());
						
						row.setcolApptDate(voOrderInv.getAppointmentDateIsNotNull() ? voOrderInv.getAppointmentDate().toString() : null);
						
						if(voOrderInv.getInvestigationIsNotNull() && voOrderInv.getInvestigation().getProviderServiceIsNotNull() && voOrderInv.getInvestigation().getProviderService().getLocationServiceIsNotNull() && voOrderInv.getInvestigation().getProviderService().getLocationService().getServiceIsNotNull())
						{
							if(voOrderInv.getInvestigation().getProviderService().getLocationService().getService().getCanBeScheduledIsNotNull() && voOrderInv.getInvestigation().getProviderService().getLocationService().getService().getCanBeScheduled())
							{
								if(voOrderInv.getAppointmentDate() == null)
								{
									row.setcolImage(form.getImages().OCRR.Information);
									row.setTooltipForcolImage("Investigation requires an Appointment");
								}
							}
						}
						
						//WDEV-6792
						if(voOrderInv.getOrdInvCurrentStatusIsNotNull() && voOrderInv.getOrdInvCurrentStatus().getOrdInvStatusIsNotNull()
								&& (voOrderInv.getOrdInvCurrentStatus().getOrdInvStatus().equals(OrderInvStatus.CANCEL_REQUEST)
										|| voOrderInv.getOrdInvCurrentStatus().getOrdInvStatus().equals(OrderInvStatus.CANCELLED)))
							row.setBackColor(ConfigFlag.UI.CANCELLED_INVESTIGATION_ROW_COLOUR.getValue());
						
						row.setValue(voOrderInv);
					}
				}
			}
		}
		//WDEV-16361
		else if (form.getGlobalContext().OCRR.getReferralAppointmentDetailsOcsOrderVoCollectionIsNotNull())
		{
			ReferralAppointmentDetailsOcsOrderVoCollection voColl = form.getGlobalContext().OCRR.getReferralAppointmentDetailsOcsOrderVoCollection();
			for(int i=0;i<voColl.size();i++)
			{
				ReferralAppointmentDetailsOcsOrderVo voOrder = voColl.get(i);
				
				if (form.getLocalContext().getReferralAppointmentDetailsOrderInvestigationVoIsNotNull())
				{
					addClinicalRow(voOrder, form.getLocalContext().getReferralAppointmentDetailsOrderInvestigationVo());
					form.grdInvestigations().setValue(form.getLocalContext().getReferralAppointmentDetailsOrderInvestigationVo());
					try
					{
						onGrdInvestigationsSelectionChanged();
					}
					catch (PresentationLogicException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{
					for(int j=0;voOrder.getInvestigations()!=null && j<voOrder.getInvestigations().size();j++)
    				{
    					ReferralAppointmentDetailsOrderInvestigationVo voOrderInv = voOrder.getInvestigations().get(j);
    											
    					addClinicalRow(voOrder, voOrderInv);
    					
    				}
				}
			}
		}
		
	}
	
	//WDEV-16361
	private void addClinicalRow(ReferralAppointmentDetailsOcsOrderVo voOrder, ReferralAppointmentDetailsOrderInvestigationVo voOrderInv)
	{
		GenForm.grdInvestigationsRow row = form.grdInvestigations().getRows().newRow();
		if(voOrder.getSysInfoIsNotNull() && voOrder.getSysInfo().getCreationDateTime() != null)
			row.setcolDate(voOrder.getSysInfo().getCreationDateTime().toString(false));
		
		if(voOrderInv.getInvestigationIsNotNull() && voOrderInv.getInvestigation().getInvestigationIndexIsNotNull())
			row.setcolInvestigation(voOrderInv.getInvestigation().getInvestigationIndex().getName());
		
		if(voOrderInv.getSpecimenIsNotNull() && voOrderInv.getSpecimen().size()>0 && voOrderInv.getSpecimen().get(0).getSpecimenSourceIsNotNull())
			row.setcolSpecimen(voOrderInv.getSpecimen().get(0).getSpecimenSource().getText());
		
		if(voOrder.getResponsibleClinicianIsNotNull())
			row.setcolResp(voOrder.getResponsibleClinician().toString());
		
		row.setcolApptDate(voOrderInv.getAppointmentDateIsNotNull() ? voOrderInv.getAppointmentDate().toString() : null);
		
		if(voOrderInv.getOrdInvCurrentStatusIsNotNull() && voOrderInv.getOrdInvCurrentStatus().getOrdInvStatusIsNotNull()
				&& (voOrderInv.getOrdInvCurrentStatus().getOrdInvStatus().equals(OrderInvStatus.CANCEL_REQUEST)
						|| voOrderInv.getOrdInvCurrentStatus().getOrdInvStatus().equals(OrderInvStatus.CANCELLED)))
			row.setBackColor(ConfigFlag.UI.CANCELLED_INVESTIGATION_ROW_COLOUR.getValue());
		
		row.setValue(voOrderInv);
	}
	
	private boolean configCategory(ReferralAppointmentDetailsOrderInvestigationVo voOrderInv) {
		
		ImportResultsConfigVo voImportResultsConfig = form.getLocalContext().getImportResultsConfigVo();
		
		for (int i = 0 ; voImportResultsConfig != null && voImportResultsConfig.getCategories() != null && i < voImportResultsConfig.getCategories().size() ; i++) //WDEV-18184
		{
			if(voOrderInv.getInvestigationIsNotNull() && voOrderInv.getInvestigation().getInvestigationIndexIsNotNull() && 
				voOrderInv.getInvestigation().getInvestigationIndex().getCategoryIsNotNull() && 
				 voOrderInv.getInvestigation().getInvestigationIndex().getCategory().equals(voImportResultsConfig.getCategories().get(i)))
				
					return true;
		}
		return false;
	}
	@Override
	protected void onBtnImportClick() throws ims.framework.exceptions.PresentationLogicException
	{
		if(investigationIsCanceled())
		{
			engine.showMessage("Cannot import result for a cancelled investigation.", "", MessageButtons.OK, MessageIcon.INFORMATION);
			return;
		}
		
		form.getGlobalContext().Core.setUploadDocumentAction(UploadDocumentAction.IMPORT);
		form.getGlobalContext().RefMan.setUploadDocumentsDialogDocumentType(DocumentCategory.RESULTREPORT);
		openDialog();
	}
	
	private boolean investigationIsCanceled() 
	{
		if(form.grdInvestigations().getValue() instanceof ReferralAppointmentDetailsOrderInvestigationVo)
		{
			if(form.grdInvestigations().getValue().getOrdInvCurrentStatusIsNotNull() && form.grdInvestigations().getValue().getOrdInvCurrentStatus().getOrdInvStatusIsNotNull())
			{
				return form.grdInvestigations().getValue().getOrdInvCurrentStatus().getOrdInvStatus().equals(OrderInvStatus.CANCEL_REQUEST) ? true : false;
			}
		}
		
		return false;
	}
	@Override
	protected void onBtnScanClick() throws ims.framework.exceptions.PresentationLogicException
	{
		form.getGlobalContext().Core.setUploadDocumentAction(UploadDocumentAction.SCAN);
		openDialog();	
	}
	
	private void openDialog()
	{
		displayDocument(false);
		
		//WDEV-16361
		if (engine.getPreviousNonDialogFormName().equals(form.getForms().OCRR.ClinicalOrdersResultsOCRRForm))
			engine.open(form.getForms().Core.UploadDocumentDialog,  new Object[]{UploadDocumentStoreLevel.PATIENT});
		else
			engine.open(form.getForms().Core.UploadDocumentDialog,  new Object[]{UploadDocumentStoreLevel.REFERRAL});
	}
	
	private void displayDocument(boolean display) 
	{
		if (!display)			
			form.htm1().setHTML("");
	}
	
	private String getFileServerURL()
	{ 
		return ConfigFlag.GEN.FILE_SERVER_URL.getValue();
	}
	
	@Override
	protected void onGrdInvestigationsSelectionChanged() throws ims.framework.exceptions.PresentationLogicException
	{
		form.htm1().setHTML("");
		if (form.grdInvestigations().getSelectedRow() != null)
		{
			form.getLocalContext().setReferralAppointmentDetailsOrderInvestigationVo(form.grdInvestigations().getSelectedRow().getValue());
			ReferralAppointmentDetailsOrderInvestigationVo vo = form.grdInvestigations().getSelectedRow().getValue();
			if(vo != null && vo.getResultDetails() != null && vo.getResultDetails().getDocumentResultDetailsIsNotNull())// 	WDEV-16232
			{
				form.htm1().setHTML("<IFRAME id=\"PostFrame\" name=\"PostFrame\" width=\"100%\" height=\"100%\" frameborder=0 src='" + getFileServerURL() + form.grdInvestigations().getSelectedRow().getValue().getResultDetails().getDocumentResultDetails().getServerDocument().getFileName() +  "'></IFRAME>");// 	WDEV-16232			
				form.getLocalContext().setDisplayDocument("<IFRAME id=\"PostFrame\" name=\"PostFrame\" width=\"100%\" height=\"100%\" frameborder=0 src='" + ConfigFlag.GEN.FILE_SERVER_URL.getValue() + getFileServerURL() + form.grdInvestigations().getSelectedRow().getValue().getResultDetails().getDocumentResultDetails().getName() +  "'></IFRAME>");// 	WDEV-16232
			}
			
			form.dtimInvestigationDateTime().setValue(vo.getInvestigationDateTime());
		}
		form.btnImport().setEnabled(true);
		form.btnScan().setEnabled(true);
	}
	@Override
	protected void onBtnCloseClick() throws PresentationLogicException {
		engine.close(DialogResult.OK);		
	}
	@Override
	protected void onBtnCancelClick() throws PresentationLogicException {
		populateGrid();
		form.grdInvestigations().setValue(form.getLocalContext().getReferralAppointmentDetailsOrderInvestigationVo());							
	
		form.setMode(FormMode.VIEW);
		onGrdInvestigationsSelectionChanged();
	}
	@Override
	protected void onBtnSaveClick() throws PresentationLogicException {
		
		if(!attachDocumentToInvestigation())
			return;
		
		populateGrid();
		form.grdInvestigations().setValue(form.getLocalContext().getReferralAppointmentDetailsOrderInvestigationVo());							
	
		form.setMode(FormMode.VIEW);
		onGrdInvestigationsSelectionChanged();
	}
	

}
