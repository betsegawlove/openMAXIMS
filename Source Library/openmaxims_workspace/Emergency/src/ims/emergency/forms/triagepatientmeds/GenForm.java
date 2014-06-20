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

package ims.emergency.forms.triagepatientmeds;

import ims.framework.*;
import ims.framework.controls.*;
import ims.framework.enumerations.*;
import ims.framework.utils.RuntimeAnchoring;

public class GenForm extends FormBridge
{
	private static final long serialVersionUID = 1L;

	protected void fireCustomControlValueChanged()
	{
		super.fireValueChanged();
	}
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
	public static class recbrPatientMedRecordBrowser extends RecordBrowserBridge
	{
		private static final long serialVersionUID = 1L;
		
		public void newRow(ims.core.admin.vo.CareContextRefVo value, String text)
		{
			super.control.newRow(value, text);
		}
		public void newRow(ims.core.admin.vo.CareContextRefVo value, String text, ims.framework.utils.Image image)
		{
			super.control.newRow(value, text, image);
		}
		public void newRow(ims.core.admin.vo.CareContextRefVo value, String text, ims.framework.utils.Color textColor)
		{
			super.control.newRow(value, text, textColor);
		}
		public void newRow(ims.core.admin.vo.CareContextRefVo value, String text, ims.framework.utils.Image image, ims.framework.utils.Color textColor)
		{
			super.control.newRow(value, text, image, textColor);
		}
		public void newRow(int index, ims.core.admin.vo.CareContextRefVo value, String text)
		{
			super.control.newRow(index, value, text);
		}
		public void newRow(int index, ims.core.admin.vo.CareContextRefVo value, String text, ims.framework.utils.Image image)
		{
			super.control.newRow(index, value, text, image);
		}
		public void newRow(int index, ims.core.admin.vo.CareContextRefVo value, String text, ims.framework.utils.Color textColor)
		{
			super.control.newRow(index, value, text, textColor);
		}
		public void newRow(int index, ims.core.admin.vo.CareContextRefVo value, String text, ims.framework.utils.Image image, ims.framework.utils.Color textColor)
		{
			super.control.newRow(index, value, text, image, textColor);
		}
		public ims.core.admin.vo.CareContextRefVo getValue()
		{
			return (ims.core.admin.vo.CareContextRefVo)super.control.getValue();
		}
		public void setValue(ims.core.admin.vo.CareContextRefVo value)
		{
			super.control.setValue(value);
		}
	}
	private void validateContext(ims.framework.Context context)
	{
		if(context == null)
			return;
	}
	public boolean supportsRecordedInError()
	{
		return false;
	}
	public ims.vo.ValueObject getRecordedInErrorVo()
	{
		return null;
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
	
		if(skipContextValidation == null || !skipContextValidation.booleanValue())
		{
			validateContext(context);
		}
	
		super.setContext(form);

		ims.framework.utils.SizeInfo designSize = new ims.framework.utils.SizeInfo(704, 520);
		if(runtimeSize == null)
			runtimeSize = designSize;
		form.setWidth(runtimeSize.getWidth());
		form.setHeight(runtimeSize.getHeight());
		super.setLocalContext(new LocalContext(context, form.getFormInfo(), componentIdentifier));


		// Label Controls
		RuntimeAnchoring anchoringHelper1 = new RuntimeAnchoring(designSize, runtimeSize, 8, 248, 114, 17, ims.framework.enumerations.ControlAnchoring.TOPLEFT);
		super.addControl(factory.getControl(Label.class, new Object[] { control, new Integer(startControlID.intValue() + 1000), new Integer(anchoringHelper1.getX()), new Integer(anchoringHelper1.getY()), new Integer(anchoringHelper1.getWidth()), new Integer(anchoringHelper1.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFT, "Medication Details:", new Integer(1), null, new Integer(0)}));
		RuntimeAnchoring anchoringHelper2 = new RuntimeAnchoring(designSize, runtimeSize, 8, 34, 213, 17, ims.framework.enumerations.ControlAnchoring.TOPLEFT);
		super.addControl(factory.getControl(Label.class, new Object[] { control, new Integer(startControlID.intValue() + 1001), new Integer(anchoringHelper2.getX()), new Integer(anchoringHelper2.getY()), new Integer(anchoringHelper2.getWidth()), new Integer(anchoringHelper2.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFT, "Medication Details from Patients GP:", new Integer(1), null, new Integer(0)}));

		// Button Controls
		RuntimeAnchoring anchoringHelper3 = new RuntimeAnchoring(designSize, runtimeSize, 621, 490, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1002), new Integer(anchoringHelper3.getX()), new Integer(anchoringHelper3.getY()), new Integer(anchoringHelper3.getWidth()), new Integer(anchoringHelper3.getHeight()), new Integer(startTabIndex.intValue() + 7), ControlState.HIDDEN, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Cancel", Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper4 = new RuntimeAnchoring(designSize, runtimeSize, 544, 490, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1003), new Integer(anchoringHelper4.getX()), new Integer(anchoringHelper4.getY()), new Integer(anchoringHelper4.getWidth()), new Integer(anchoringHelper4.getHeight()), new Integer(startTabIndex.intValue() + 6), ControlState.HIDDEN, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Save", Boolean.FALSE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper5 = new RuntimeAnchoring(designSize, runtimeSize, 8, 490, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1004), new Integer(anchoringHelper5.getX()), new Integer(anchoringHelper5.getY()), new Integer(anchoringHelper5.getWidth()), new Integer(anchoringHelper5.getHeight()), new Integer(startTabIndex.intValue() + 5), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT, "Edit", Boolean.TRUE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper6 = new RuntimeAnchoring(designSize, runtimeSize, 8, 490, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1005), new Integer(anchoringHelper6.getX()), new Integer(anchoringHelper6.getY()), new Integer(anchoringHelper6.getWidth()), new Integer(anchoringHelper6.getHeight()), new Integer(startTabIndex.intValue() + 4), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFT, "New", Boolean.TRUE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));

		// TextBox Controls
		RuntimeAnchoring anchoringHelper7 = new RuntimeAnchoring(designSize, runtimeSize, 8, 264, 688, 208, ims.framework.enumerations.ControlAnchoring.ALL);
		super.addControl(factory.getControl(TextBox.class, new Object[] { control, new Integer(startControlID.intValue() + 1006), new Integer(anchoringHelper7.getX()), new Integer(anchoringHelper7.getY()), new Integer(anchoringHelper7.getWidth()), new Integer(anchoringHelper7.getHeight()), new Integer(-1), ControlState.DISABLED, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.ALL,Boolean.TRUE, new Integer(2000), Boolean.TRUE, Boolean.FALSE, null, null, Boolean.FALSE, ims.framework.enumerations.CharacterCasing.NORMAL, ims.framework.enumerations.TextTrimming.NONE, "", ""}));

		// RecordBrowser Controls
		RuntimeAnchoring anchoringHelper8 = new RuntimeAnchoring(designSize, runtimeSize, 8, 8, 688, 21, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT);
		RecordBrowser m_recbrPatientMedTemp = (RecordBrowser)factory.getControl(RecordBrowser.class, new Object[] { control, new Integer(startControlID.intValue() + 1007), new Integer(anchoringHelper8.getX()), new Integer(anchoringHelper8.getY()), new Integer(anchoringHelper8.getWidth()), new Integer(anchoringHelper8.getHeight()), new Integer(startTabIndex.intValue() + 2), ControlState.ENABLED, ControlState.DISABLED,ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT, null});
		addControl(m_recbrPatientMedTemp);
		recbrPatientMedRecordBrowser recbrPatientMed = (recbrPatientMedRecordBrowser)RecordBrowserFlyweightFactory.getInstance().createRecordBrowserBridge(recbrPatientMedRecordBrowser.class, m_recbrPatientMedTemp);
		super.addRecordBrowser(recbrPatientMed);

		// Rich Text Controls
		RuntimeAnchoring anchoringHelper9 = new RuntimeAnchoring(designSize, runtimeSize, 8, 48, 688, 192, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT);
		super.addControl(factory.getControl(RichTextControl.class, new Object[] { control, new Integer(startControlID.intValue() + 1008), new Integer(anchoringHelper9.getX()), new Integer(anchoringHelper9.getY()), new Integer(anchoringHelper9.getWidth()), new Integer(anchoringHelper9.getHeight()), new Integer(-1), ControlState.DISABLED, ControlState.DISABLED, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT, Boolean.FALSE, Boolean.FALSE, new Integer(0)} ));
	}


	public Button btnCancel()
	{
		return (Button)super.getControl(2);
	}
	public Button btnSave()
	{
		return (Button)super.getControl(3);
	}
	public Button btnEdit()
	{
		return (Button)super.getControl(4);
	}
	public Button btnNew()
	{
		return (Button)super.getControl(5);
	}
	public TextBox txtPatMedDescription()
	{
		return (TextBox)super.getControl(6);
	}
	public recbrPatientMedRecordBrowser recbrPatientMed()
	{
		return (recbrPatientMedRecordBrowser)super.getRecordBrowser(0);
	}
	public RichTextControl richMedicationHistory()
	{
		return (RichTextControl)super.getControl(8);
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
			cxl_selectedCareContext = new ims.framework.ContextVariable("selectedCareContext", prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__selectedCareContext_" + componentIdentifier + "");
			cxl_CareContextRef = new ims.framework.ContextVariable("CareContextRef", prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__CareContextRef_" + componentIdentifier + "");
			cxl_EpisodeOfCareRef = new ims.framework.ContextVariable("EpisodeOfCareRef", prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__EpisodeOfCareRef_" + componentIdentifier + "");
			cxl_PatientRef = new ims.framework.ContextVariable("PatientRef", prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__PatientRef_" + componentIdentifier + "");
			cxl_selectedPatientMeds = new ims.framework.ContextVariable("selectedPatientMeds", prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__selectedPatientMeds_" + componentIdentifier + "");
			cxl_isEnabled = new ims.framework.ContextVariable("isEnabled", prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__isEnabled_" + componentIdentifier + "");
			cxl_NhsNumber = new ims.framework.ContextVariable("NhsNumber", prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__NhsNumber_" + componentIdentifier + "");
			cxl_SelectedEvent = new ims.framework.ContextVariable("SelectedEvent", prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__SelectedEvent_" + componentIdentifier + "");
			cxl_TrackingForClinicianWorklistAndTriage = new ims.framework.ContextVariable("TrackingForClinicianWorklistAndTriage", prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__TrackingForClinicianWorklistAndTriage_" + componentIdentifier + "");
		}
		
		public boolean getselectedCareContextIsNotNull()
		{
			return !cxl_selectedCareContext.getValueIsNull(context);
		}
		public ims.core.admin.vo.CareContextRefVo getselectedCareContext()
		{
			return (ims.core.admin.vo.CareContextRefVo)cxl_selectedCareContext.getValue(context);
		}
		public void setselectedCareContext(ims.core.admin.vo.CareContextRefVo value)
		{
			if(value != null && (value.getBoId() == null || value.getBoId().intValue() < 1))
				throw new ims.framework.exceptions.CodingRuntimeException("Invalid domain object id for 'selectedCareContext' RefVo context variable.");
			if(value == null)
				cxl_selectedCareContext.setValue(context, null);
			else
				cxl_selectedCareContext.setValue(context, new ims.core.admin.vo.CareContextRefVo(value.getBoId(), value.getBoVersion()));
		}
		private ims.framework.ContextVariable cxl_selectedCareContext = null;
		public boolean getCareContextRefIsNotNull()
		{
			return !cxl_CareContextRef.getValueIsNull(context);
		}
		public ims.core.admin.vo.CareContextRefVo getCareContextRef()
		{
			return (ims.core.admin.vo.CareContextRefVo)cxl_CareContextRef.getValue(context);
		}
		public void setCareContextRef(ims.core.admin.vo.CareContextRefVo value)
		{
			if(value != null && (value.getBoId() == null || value.getBoId().intValue() < 1))
				throw new ims.framework.exceptions.CodingRuntimeException("Invalid domain object id for 'CareContextRef' RefVo context variable.");
			if(value == null)
				cxl_CareContextRef.setValue(context, null);
			else
				cxl_CareContextRef.setValue(context, new ims.core.admin.vo.CareContextRefVo(value.getBoId(), value.getBoVersion()));
		}
		private ims.framework.ContextVariable cxl_CareContextRef = null;
		public boolean getEpisodeOfCareRefIsNotNull()
		{
			return !cxl_EpisodeOfCareRef.getValueIsNull(context);
		}
		public ims.core.admin.vo.EpisodeOfCareRefVo getEpisodeOfCareRef()
		{
			return (ims.core.admin.vo.EpisodeOfCareRefVo)cxl_EpisodeOfCareRef.getValue(context);
		}
		public void setEpisodeOfCareRef(ims.core.admin.vo.EpisodeOfCareRefVo value)
		{
			if(value != null && (value.getBoId() == null || value.getBoId().intValue() < 1))
				throw new ims.framework.exceptions.CodingRuntimeException("Invalid domain object id for 'EpisodeOfCareRef' RefVo context variable.");
			if(value == null)
				cxl_EpisodeOfCareRef.setValue(context, null);
			else
				cxl_EpisodeOfCareRef.setValue(context, new ims.core.admin.vo.EpisodeOfCareRefVo(value.getBoId(), value.getBoVersion()));
		}
		private ims.framework.ContextVariable cxl_EpisodeOfCareRef = null;
		public boolean getPatientRefIsNotNull()
		{
			return !cxl_PatientRef.getValueIsNull(context);
		}
		public ims.core.patient.vo.PatientRefVo getPatientRef()
		{
			return (ims.core.patient.vo.PatientRefVo)cxl_PatientRef.getValue(context);
		}
		public void setPatientRef(ims.core.patient.vo.PatientRefVo value)
		{
			if(value != null && (value.getBoId() == null || value.getBoId().intValue() < 1))
				throw new ims.framework.exceptions.CodingRuntimeException("Invalid domain object id for 'PatientRef' RefVo context variable.");
			if(value == null)
				cxl_PatientRef.setValue(context, null);
			else
				cxl_PatientRef.setValue(context, new ims.core.patient.vo.PatientRefVo(value.getBoId(), value.getBoVersion()));
		}
		private ims.framework.ContextVariable cxl_PatientRef = null;
		public boolean getselectedPatientMedsIsNotNull()
		{
			return !cxl_selectedPatientMeds.getValueIsNull(context);
		}
		public ims.emergency.vo.PatientMedsVo getselectedPatientMeds()
		{
			return (ims.emergency.vo.PatientMedsVo)cxl_selectedPatientMeds.getValue(context);
		}
		public void setselectedPatientMeds(ims.emergency.vo.PatientMedsVo value)
		{
			cxl_selectedPatientMeds.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_selectedPatientMeds = null;
		public boolean getisEnabledIsNotNull()
		{
			return !cxl_isEnabled.getValueIsNull(context);
		}
		public Boolean getisEnabled()
		{
			return (Boolean)cxl_isEnabled.getValue(context);
		}
		public void setisEnabled(Boolean value)
		{
			cxl_isEnabled.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_isEnabled = null;
		public boolean getNhsNumberIsNotNull()
		{
			return !cxl_NhsNumber.getValueIsNull(context);
		}
		public String getNhsNumber()
		{
			return (String)cxl_NhsNumber.getValue(context);
		}
		public void setNhsNumber(String value)
		{
			cxl_NhsNumber.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_NhsNumber = null;
		public boolean getSelectedEventIsNotNull()
		{
			return !cxl_SelectedEvent.getValueIsNull(context);
		}
		public ims.emergency.vo.enums.EdAssessment_CustomControlsEvents getSelectedEvent()
		{
			return (ims.emergency.vo.enums.EdAssessment_CustomControlsEvents)cxl_SelectedEvent.getValue(context);
		}
		public void setSelectedEvent(ims.emergency.vo.enums.EdAssessment_CustomControlsEvents value)
		{
			cxl_SelectedEvent.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_SelectedEvent = null;
		public boolean getTrackingForClinicianWorklistAndTriageIsNotNull()
		{
			return !cxl_TrackingForClinicianWorklistAndTriage.getValueIsNull(context);
		}
		public ims.emergency.vo.TrackingForClinicianWorklistAndTriageVo getTrackingForClinicianWorklistAndTriage()
		{
			return (ims.emergency.vo.TrackingForClinicianWorklistAndTriageVo)cxl_TrackingForClinicianWorklistAndTriage.getValue(context);
		}
		public void setTrackingForClinicianWorklistAndTriage(ims.emergency.vo.TrackingForClinicianWorklistAndTriageVo value)
		{
			cxl_TrackingForClinicianWorklistAndTriage.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_TrackingForClinicianWorklistAndTriage = null;
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
			IReportField[] fields = new IReportField[83];
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
			fields[71] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__selectedCareContext_" + componentIdentifier, "BO-1004100019-ID", "ID_CareContext");
			fields[72] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__CareContextRef_" + componentIdentifier, "BO-1004100019-ID", "ID_CareContext");
			fields[73] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__EpisodeOfCareRef_" + componentIdentifier, "BO-1004100018-ID", "ID_EpisodeOfCare");
			fields[74] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__PatientRef_" + componentIdentifier, "BO-1001100000-ID", "ID_Patient");
			fields[75] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__selectedPatientMeds_" + componentIdentifier, "BO-1086100016-ID", "ID_PatientMedicationOnAttendance");
			fields[76] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__selectedPatientMeds_" + componentIdentifier, "BO-1086100016-PATIENT", "Patient");
			fields[77] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__selectedPatientMeds_" + componentIdentifier, "BO-1086100016-EPISODE", "Episode");
			fields[78] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__selectedPatientMeds_" + componentIdentifier, "BO-1086100016-ATTENDANCE", "Attendance");
			fields[79] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__selectedPatientMeds_" + componentIdentifier, "BO-1086100016-CURRENTMEDICATIONDETAILS", "CurrentMedicationDetails");
			fields[80] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__selectedPatientMeds_" + componentIdentifier, "BO-1086100016-MEDICATIONDETAILSFROMGP", "MedicationDetailsFromGP");
			fields[81] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__TrackingForClinicianWorklistAndTriage_" + componentIdentifier, "BO-1086100005-ID", "ID_Tracking");
			fields[82] = new ims.framework.ReportField(this.context, prefix + "_lv_Emergency.TriagePatientMeds.__internal_x_context__TrackingForClinicianWorklistAndTriage_" + componentIdentifier, "BO-1086100005-ISDISCHARGED", "IsDischarged");
			return fields;
		}
		protected Context context = null;
		protected ims.framework.FormInfo formInfo;
		protected String componentIdentifier;
	}
	public String getUniqueIdentifier()
	{
		return formInfo.getLocalVariablesPrefix() + formInfo.getNamespaceName() + formInfo.getFormName() + formInfo.getFormId() + "_" + this.componentIdentifier;
	}
	private Context context = null;
	private ims.framework.FormInfo formInfo = null;
	private String componentIdentifier;
	private IReportField[] reportFields = null;
}
