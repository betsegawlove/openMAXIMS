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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.clinical.forms.onadmissionsummary;

import ims.framework.*;
import ims.framework.controls.*;
import ims.framework.enumerations.*;
import ims.framework.utils.RuntimeAnchoring;

public class GenForm extends FormBridge
{
	private static final long serialVersionUID = 1L;

	public boolean canProvideData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).canProvideData();
	}
	public boolean hasData(IReportSeed[] reportSeeds)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields()).hasData();
	}
	public IReportField[] getData(IReportSeed[] reportSeeds)
	{
		return getData(reportSeeds, false);
	}
	public IReportField[] getData(IReportSeed[] reportSeeds, boolean excludeNulls)
	{
		return new ReportDataProvider(reportSeeds, this.getFormReportFields(), excludeNulls).getData();
	}
	private void validateContext(ims.framework.Context context)
	{
		if(context == null)
			return;
		if(!context.isValidContextType(ims.core.vo.PatientShort.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.PatientShort' of the global context variable 'Core.PatientShort' is not supported.");
		if(!context.isValidContextType(ims.core.vo.ClinicalContactShortVo.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.ClinicalContactShortVo' of the global context variable 'Core.CurrentClinicalContact' is not supported.");
		if(!context.isValidContextType(ims.core.vo.CareContextShortVo.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.CareContextShortVo' of the global context variable 'Core.CurrentCareContext' is not supported.");
		if(!context.isValidContextType(ims.core.vo.ClinicalNotesVo.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.ClinicalNotesVo' of the global context variable 'Clinical.CurrentClinicalNote' is not supported.");
	}
	private void validateMandatoryContext(Context context)
	{
		if(new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort").getValueIsNull(context))
			throw new ims.framework.exceptions.FormMandatoryContextMissingException("The required context data 'Core.PatientShort' is not available.");
		if(new ims.framework.ContextVariable("Core.CurrentCareContext", "_cvp_Core.CurrentCareContext").getValueIsNull(context))
			throw new ims.framework.exceptions.FormMandatoryContextMissingException("The required context data 'Core.CurrentCareContext' is not available.");
	}
	public boolean supportsRecordedInError()
	{
		return true;
	}
	public ims.vo.ValueObject getRecordedInErrorVo()
	{
		return this.getLocalContext().getSelectedRecord();
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context) throws Exception
	{
		setContext(loader, form, appForm, factory, context, Boolean.FALSE, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, Context context, Boolean skipContextValidation) throws Exception
	{
		setContext(loader, form, appForm, factory, context, skipContextValidation, new Integer(0), null, null, new Integer(0));
	}
	protected void setContext(FormLoader loader, Form form, ims.framework.interfaces.IAppForm appForm, UIFactory factory, ims.framework.Context context, Boolean skipContextValidation, Integer startControlID, ims.framework.utils.SizeInfo runtimeSize, ims.framework.Control control, Integer startTabIndex) throws Exception
	{
		if(loader == null); // this is to avoid eclipse warning only.
		if(factory == null); // this is to avoid eclipse warning only.
		if(runtimeSize == null); // this is to avoid eclipse warning only.
		if(appForm == null)
			throw new RuntimeException("Invalid application form");
		if(startControlID == null)
			throw new RuntimeException("Invalid startControlID");
		if(control == null); // this is to avoid eclipse warning only.
		if(startTabIndex == null)
			throw new RuntimeException("Invalid startTabIndex");
		this.context = context;
		this.componentIdentifier = startControlID.toString();
		this.formInfo = form.getFormInfo();
		this.globalContext = new GlobalContext(context);
	
		if(skipContextValidation == null || !skipContextValidation.booleanValue())
		{
			validateContext(context);
			validateMandatoryContext(context);
		}
	
		super.setContext(form);

		ims.framework.utils.SizeInfo designSize = new ims.framework.utils.SizeInfo(848, 632);
		if(runtimeSize == null)
			runtimeSize = designSize;
		form.setWidth(runtimeSize.getWidth());
		form.setHeight(runtimeSize.getHeight());
		super.setFormReferences(FormReferencesFlyweightFactory.getInstance().create(Forms.class));
		super.setGlobalContext(ContextBridgeFlyweightFactory.getInstance().create(GlobalContextBridge.class, context, false));
		super.setLocalContext(new LocalContext(context, form.getFormInfo(), componentIdentifier));


		// Panel Controls
		RuntimeAnchoring anchoringHelper1 = new RuntimeAnchoring(designSize, runtimeSize, 8, 8, 832, 576, ims.framework.enumerations.ControlAnchoring.ALL);
		super.addControl(factory.getControl(Panel.class, new Object[] { control, new Integer(startControlID.intValue() + 1000), new Integer(anchoringHelper1.getX()), new Integer(anchoringHelper1.getY()), new Integer(anchoringHelper1.getWidth()), new Integer(anchoringHelper1.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.ALL,"Details", new Integer(2), ""}));

		// Custom Controls
		ims.framework.CustomComponent instance1 = factory.getEmptyCustomComponent();
		RuntimeAnchoring anchoringHelper2 = new RuntimeAnchoring(designSize, runtimeSize, 16, 40, 448, 56, ims.framework.enumerations.ControlAnchoring.TOPLEFT);
		ims.framework.FormUiLogic m_customControlAuthoringInfoForm = loader.loadComponent(102228, appForm, startControlID * 10 + 1000, anchoringHelper2.getSize(), instance1, -1, skipContextValidation);
		//ims.framework.Control m_customControlAuthoringInfoControl = factory.getControl(CustomComponent.class, new Object[] { control, new Integer(startControlID.intValue() + 1001), new Integer(16), new Integer(40), new Integer(448), new Integer(56), ControlState.DISABLED, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFT, new Integer(-1), m_customControlAuthoringInfoForm, instance1 } );
		ims.framework.Control m_customControlAuthoringInfoControl = factory.getControl(CustomComponent.class, new Object[] { control, new Integer(startControlID.intValue() + 1002),  new Integer(anchoringHelper2.getX()), new Integer(anchoringHelper2.getY()), new Integer(anchoringHelper2.getWidth()), new Integer(anchoringHelper2.getHeight()), ControlState.DISABLED, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFT, new Integer(-1), m_customControlAuthoringInfoForm, instance1, Boolean.FALSE } );
		super.addControl(m_customControlAuthoringInfoControl);
		Menu[] menus1 = m_customControlAuthoringInfoForm.getForm().getRegisteredMenus();
		for(int x = 0; x < menus1.length; x++)
		{
			form.registerMenu(menus1[x]);
		}

		// Button Controls
		RuntimeAnchoring anchoringHelper3 = new RuntimeAnchoring(designSize, runtimeSize, 8, 592, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1003), new Integer(anchoringHelper3.getX()), new Integer(anchoringHelper3.getY()), new Integer(anchoringHelper3.getWidth()), new Integer(anchoringHelper3.getHeight()), new Integer(startTabIndex.intValue() + 1), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT, "New", Boolean.TRUE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper4 = new RuntimeAnchoring(designSize, runtimeSize, 16, 592, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1004), new Integer(anchoringHelper4.getX()), new Integer(anchoringHelper4.getY()), new Integer(anchoringHelper4.getWidth()), new Integer(anchoringHelper4.getHeight()), new Integer(startTabIndex.intValue() + 2), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT, "Edit", Boolean.TRUE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper5 = new RuntimeAnchoring(designSize, runtimeSize, 760, 592, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1005), new Integer(anchoringHelper5.getX()), new Integer(anchoringHelper5.getY()), new Integer(anchoringHelper5.getWidth()), new Integer(anchoringHelper5.getHeight()), new Integer(startTabIndex.intValue() + 5), ControlState.HIDDEN, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Cancel", Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper6 = new RuntimeAnchoring(designSize, runtimeSize, 680, 592, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1006), new Integer(anchoringHelper6.getX()), new Integer(anchoringHelper6.getY()), new Integer(anchoringHelper6.getWidth()), new Integer(anchoringHelper6.getHeight()), new Integer(startTabIndex.intValue() + 4), ControlState.HIDDEN, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Save", Boolean.FALSE, null, Boolean.TRUE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));

		// TextBox Controls
		RuntimeAnchoring anchoringHelper7 = new RuntimeAnchoring(designSize, runtimeSize, 24, 104, 800, 464, ims.framework.enumerations.ControlAnchoring.ALL);
		super.addControl(factory.getControl(TextBox.class, new Object[] { control, new Integer(startControlID.intValue() + 1007), new Integer(anchoringHelper7.getX()), new Integer(anchoringHelper7.getY()), new Integer(anchoringHelper7.getWidth()), new Integer(anchoringHelper7.getHeight()), new Integer(startTabIndex.intValue() + 3), ControlState.DISABLED, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.ALL,Boolean.TRUE, new Integer(1500), Boolean.TRUE, Boolean.FALSE, null, null, Boolean.TRUE, ims.framework.enumerations.CharacterCasing.NORMAL, ims.framework.enumerations.TextTrimming.NONE, "", ""}));
	}



	public Forms getForms()
	{
		return (Forms)super.getFormReferences();
	}
	public Panel pnl1()
	{
		return (Panel)super.getControl(0);
	}
	public ims.core.forms.authoringinfo.IComponent customControlAuthoringInfo()
	{
		return (ims.core.forms.authoringinfo.IComponent)((ims.framework.cn.controls.CustomComponent)super.getControl(1)).getLogic();
	}
	public void setcustomControlAuthoringInfoValueChangedEvent(ims.framework.delegates.ValueChanged delegate)
	{
		((CustomComponent)super.getControl(1)).setValueChangedEvent(delegate);
	}
	public void setcustomControlAuthoringInfoVisible(boolean value)
	{
		((ims.framework.Control)super.getControl(1)).setVisible(value);
	}
	public boolean iscustomControlAuthoringInfoVisible()
	{
		return ((ims.framework.Control)super.getControl(1)).isVisible();
	}
	public void setcustomControlAuthoringInfoEnabled(boolean value)
	{
		((ims.framework.Control)super.getControl(1)).setEnabled(value);
	}
	public boolean iscustomControlAuthoringInfoEnabled()
	{
		return ((ims.framework.Control)super.getControl(1)).isEnabled();
	}
	public Button btnNew()
	{
		return (Button)super.getControl(2);
	}
	public Button btnUpdate()
	{
		return (Button)super.getControl(3);
	}
	public Button btnCancel()
	{
		return (Button)super.getControl(4);
	}
	public Button btnSave()
	{
		return (Button)super.getControl(5);
	}
	public TextBox txtSummary()
	{
		return (TextBox)super.getControl(6);
	}

	public static class Forms implements java.io.Serializable
	{
		private static final long serialVersionUID = 1L;
		protected final class LocalFormName extends FormName
		{
			private static final long serialVersionUID = 1L;
		
			private LocalFormName(int name)
			{
				super(name);
			}
		}

		private Forms()
		{
			Clinical = new ClinicalForms();
		}
		public final class ClinicalForms implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private ClinicalForms()
			{
				OnAdmissionSummary = new LocalFormName(123122);
			}
			public final FormName OnAdmissionSummary;
		}

		public ClinicalForms Clinical;
	}

	public GlobalContext getGlobalContext()
	{
		return this.globalContext;
	}
	public static class GlobalContextBridge extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
	}
	public LocalContext getLocalContext()
	{
		return (LocalContext)super.getLocalCtx();
	}
	public class LocalContext extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
		
		public LocalContext(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			super.setContext(context);
			String prefix = formInfo.getLocalVariablesPrefix();
			cxl_SelectedRecord = new ims.framework.ContextVariable("SelectedRecord", prefix + "_lv_Clinical.OnAdmissionSummary.__internal_x_context__SelectedRecord_" + componentIdentifier + "");
		}
		
		public boolean getSelectedRecordIsNotNull()
		{
			return !cxl_SelectedRecord.getValueIsNull(context);
		}
		public ims.clinical.vo.OnAdmissionSummaryVo getSelectedRecord()
		{
			return (ims.clinical.vo.OnAdmissionSummaryVo)cxl_SelectedRecord.getValue(context);
		}
		public void setSelectedRecord(ims.clinical.vo.OnAdmissionSummaryVo value)
		{
			cxl_SelectedRecord.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_SelectedRecord = null;
	}
	private IReportField[] getFormReportFields()
	{
		if(this.context == null)
			return null;
		if(this.reportFields == null)
			this.reportFields = new ReportFields(this.context, this.formInfo, this.componentIdentifier).getReportFields();
		return this.reportFields;
	}
	private class ReportFields
	{
		public ReportFields(Context context, ims.framework.FormInfo formInfo, String componentIdentifier)
		{
			this.context = context;
			this.formInfo = formInfo;
			this.componentIdentifier = componentIdentifier;
		}
		public IReportField[] getReportFields()
		{
			String prefix = formInfo.getLocalVariablesPrefix();
			IReportField[] fields = new IReportField[74];
			fields[0] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ID", "ID_Patient");
			fields[1] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SEX", "Sex");
			fields[2] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOB", "Dob");
			fields[3] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-DOD", "Dod");
			fields[4] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-RELIGION", "Religion");
			fields[5] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISACTIVE", "IsActive");
			fields[6] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ETHNICORIGIN", "EthnicOrigin");
			fields[7] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-MARITALSTATUS", "MaritalStatus");
			fields[8] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SCN", "SCN");
			fields[9] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-SOURCEOFINFORMATION", "SourceOfInformation");
			fields[10] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-TIMEOFDEATH", "TimeOfDeath");
			fields[11] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-ISQUICKREGISTRATIONPATIENT", "IsQuickRegistrationPatient");
			fields[12] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientShort", "BO-1001100000-CURRENTRESPONSIBLECONSULTANT", "CurrentResponsibleConsultant");
			fields[13] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-ID", "ID_Patient");
			fields[14] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-SEX", "Sex");
			fields[15] = new ims.framework.ReportField(this.context, "_cvp_Core.PatientFilter", "BO-1001100000-DOB", "Dob");
			fields[16] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ID", "ID_ClinicalContact");
			fields[17] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-SPECIALTY", "Specialty");
			fields[18] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CONTACTTYPE", "ContactType");
			fields[19] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-STARTDATETIME", "StartDateTime");
			fields[20] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ENDDATETIME", "EndDateTime");
			fields[21] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-CARECONTEXT", "CareContext");
			fields[22] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentClinicalContact", "BO-1004100003-ISCLINICALNOTECREATED", "IsClinicalNoteCreated");
			fields[23] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ID", "ID_Hcp");
			fields[24] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-HCPTYPE", "HcpType");
			fields[25] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISACTIVE", "IsActive");
			fields[26] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISHCPARESPONSIBLEHCP", "IsHCPaResponsibleHCP");
			fields[27] = new ims.framework.ReportField(this.context, "_cvp_Core.RecordingHCP", "BO-1006100000-ISARESPONSIBLEEDCLINICIAN", "IsAResponsibleEDClinician");
			fields[28] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ID", "ID_CareContext");
			fields[29] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-CONTEXT", "Context");
			fields[30] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ORDERINGHOSPITAL", "OrderingHospital");
			fields[31] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ESTIMATEDDISCHARGEDATE", "EstimatedDischargeDate");
			fields[32] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-STARTDATETIME", "StartDateTime");
			fields[33] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-ENDDATETIME", "EndDateTime");
			fields[34] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-LOCATIONTYPE", "LocationType");
			fields[35] = new ims.framework.ReportField(this.context, "_cvp_Core.CurrentCareContext", "BO-1004100019-RESPONSIBLEHCP", "ResponsibleHCP");
			fields[36] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ID", "ID_EpisodeOfCare");
			fields[37] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-CARESPELL", "CareSpell");
			fields[38] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-SPECIALTY", "Specialty");
			fields[39] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-RELATIONSHIP", "Relationship");
			fields[40] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-STARTDATE", "StartDate");
			fields[41] = new ims.framework.ReportField(this.context, "_cvp_Core.EpisodeofCareShort", "BO-1004100018-ENDDATE", "EndDate");
			fields[42] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[43] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALNOTE", "ClinicalNote");
			fields[44] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTETYPE", "NoteType");
			fields[45] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-DISCIPLINE", "Discipline");
			fields[46] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CLINICALCONTACT", "ClinicalContact");
			fields[47] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISDERIVEDNOTE", "IsDerivedNote");
			fields[48] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEW", "ForReview");
			fields[49] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[50] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-REVIEWINGDATETIME", "ReviewingDateTime");
			fields[51] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISCORRECTED", "IsCorrected");
			fields[52] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-ISTRANSCRIBED", "IsTranscribed");
			fields[53] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-SOURCEOFNOTE", "SourceOfNote");
			fields[54] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-RECORDINGDATETIME", "RecordingDateTime");
			fields[55] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-INHOSPITALREPORT", "InHospitalReport");
			fields[56] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[57] = new ims.framework.ReportField(this.context, "_cvp_Clinical.CurrentClinicalNote", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[58] = new ims.framework.ReportField(this.context, "_cvp_STHK.AvailableBedsListFilter", "BO-1014100009-ID", "ID_BedSpaceState");
			fields[59] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ID", "ID_PendingEmergencyAdmission");
			fields[60] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingEmergencyAdmissionsFilter", "BO-1014100011-ADMISSIONSTATUS", "AdmissionStatus");
			fields[61] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ID", "ID_InpatientEpisode");
			fields[62] = new ims.framework.ReportField(this.context, "_cvp_STHK.PendingDischargesListFilter", "BO-1014100000-ESTDISCHARGEDATE", "EstDischargeDate");
			fields[63] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-ID", "ID_ClinicalNotes");
			fields[64] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEW", "ForReview");
			fields[65] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-FORREVIEWDISCIPLINE", "ForReviewDiscipline");
			fields[66] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-NOTECLASSIFICATION", "NoteClassification");
			fields[67] = new ims.framework.ReportField(this.context, "_cvp_Clinical.ExtendedClinicalNotesListFilter", "BO-1011100000-CARECONTEXT", "CareContext");
			fields[68] = new ims.framework.ReportField(this.context, "_cvp_Core.PasEvent", "BO-1014100003-ID", "ID_PASEvent");
			fields[69] = new ims.framework.ReportField(this.context, "_cvp_Correspondence.CorrespondenceDetails", "BO-1052100001-ID", "ID_CorrespondenceDetails");
			fields[70] = new ims.framework.ReportField(this.context, "_cvp_RefMan.CatsReferral", "BO-1004100035-ID", "ID_CatsReferral");
			fields[71] = new ims.framework.ReportField(this.context, prefix + "_lv_Clinical.OnAdmissionSummary.__internal_x_context__SelectedRecord_" + componentIdentifier, "BO-1072100039-ID", "ID_OnAdmissionSummary");
			fields[72] = new ims.framework.ReportField(this.context, prefix + "_lv_Clinical.OnAdmissionSummary.__internal_x_context__SelectedRecord_" + componentIdentifier, "BO-1072100039-CARECONTEXT", "CareContext");
			fields[73] = new ims.framework.ReportField(this.context, prefix + "_lv_Clinical.OnAdmissionSummary.__internal_x_context__SelectedRecord_" + componentIdentifier, "BO-1072100039-CLINICALCONTACT", "ClinicalContact");
			return fields;
		}
		protected Context context = null;
		protected ims.framework.FormInfo formInfo;
		protected String componentIdentifier;
	}
	public String getUniqueIdentifier()
	{
		return null;
	}
	private Context context = null;
	private ims.framework.FormInfo formInfo = null;
	private String componentIdentifier;
	private GlobalContext globalContext = null;
	private IReportField[] reportFields = null;
}
