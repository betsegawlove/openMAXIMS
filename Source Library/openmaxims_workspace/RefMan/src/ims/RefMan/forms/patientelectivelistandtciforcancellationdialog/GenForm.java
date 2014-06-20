// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.forms.patientelectivelistandtciforcancellationdialog;

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
	public static class grdElectiveListRow extends GridRowBridge
	{
		private static final long serialVersionUID = 1L;
		
		protected grdElectiveListRow(GridRow row)
		{
			super(row);
		}
		public void showOpened(int column)
		{
			super.row.showOpened(column);
		}
		public void setColNameReadOnly(boolean value)
		{
			super.row.setReadOnly(0, value);
		}
		public boolean isColNameReadOnly()
		{
			return super.row.isReadOnly(0);
		}
		public void showColNameOpened()
		{
			super.row.showOpened(0);
		}
		public String getColName()
		{
			return (String)super.row.get(0);
		}
		public void setColName(String value)
		{
			super.row.set(0, value);
		}
		public void setCellColNameTooltip(String value)
		{
			super.row.setTooltip(0, value);
		}
		public void setProcedureReadOnly(boolean value)
		{
			super.row.setReadOnly(1, value);
		}
		public boolean isProcedureReadOnly()
		{
			return super.row.isReadOnly(1);
		}
		public void showProcedureOpened()
		{
			super.row.showOpened(1);
		}
		public String getProcedure()
		{
			return (String)super.row.get(1);
		}
		public void setProcedure(String value)
		{
			super.row.set(1, value);
		}
		public void setCellProcedureTooltip(String value)
		{
			super.row.setTooltip(1, value);
		}
		public void setColStatusReadOnly(boolean value)
		{
			super.row.setReadOnly(2, value);
		}
		public boolean isColStatusReadOnly()
		{
			return super.row.isReadOnly(2);
		}
		public void showColStatusOpened()
		{
			super.row.showOpened(2);
		}
		public String getColStatus()
		{
			return (String)super.row.get(2);
		}
		public void setColStatus(String value)
		{
			super.row.set(2, value);
		}
		public void setCellColStatusTooltip(String value)
		{
			super.row.setTooltip(2, value);
		}
		public void setColDateOnListReadOnly(boolean value)
		{
			super.row.setReadOnly(3, value);
		}
		public boolean isColDateOnListReadOnly()
		{
			return super.row.isReadOnly(3);
		}
		public void showColDateOnListOpened()
		{
			super.row.showOpened(3);
		}
		public String getColDateOnList()
		{
			return (String)super.row.get(3);
		}
		public void setColDateOnList(String value)
		{
			super.row.set(3, value);
		}
		public void setCellColDateOnListTooltip(String value)
		{
			super.row.setTooltip(3, value);
		}
		public void setColTciDateReadOnly(boolean value)
		{
			super.row.setReadOnly(4, value);
		}
		public boolean isColTciDateReadOnly()
		{
			return super.row.isReadOnly(4);
		}
		public void showColTciDateOpened()
		{
			super.row.showOpened(4);
		}
		public String getColTciDate()
		{
			return (String)super.row.get(4);
		}
		public void setColTciDate(String value)
		{
			super.row.set(4, value);
		}
		public void setCellColTciDateTooltip(String value)
		{
			super.row.setTooltip(4, value);
		}
		public void setColTciTimeReadOnly(boolean value)
		{
			super.row.setReadOnly(5, value);
		}
		public boolean isColTciTimeReadOnly()
		{
			return super.row.isReadOnly(5);
		}
		public void showColTciTimeOpened()
		{
			super.row.showOpened(5);
		}
		public String getColTciTime()
		{
			return (String)super.row.get(5);
		}
		public void setColTciTime(String value)
		{
			super.row.set(5, value);
		}
		public void setCellColTciTimeTooltip(String value)
		{
			super.row.setTooltip(5, value);
		}
		public void setColSelectReadOnly(boolean value)
		{
			super.row.setReadOnly(6, value);
		}
		public boolean isColSelectReadOnly()
		{
			return super.row.isReadOnly(6);
		}
		public void showColSelectOpened()
		{
			super.row.showOpened(6);
		}
		public boolean getColSelect()
		{
			return ((Boolean)super.row.get(6)).booleanValue();
		}
		public void setColSelect(boolean value)
		{
			super.row.set(6, new Boolean(value));
		}
		public void setCellColSelectTooltip(String value)
		{
			super.row.setTooltip(6, value);
		}
		public ims.RefMan.vo.PatientElectiveListBedAdmissionVo getValue()
		{
			return (ims.RefMan.vo.PatientElectiveListBedAdmissionVo)super.row.getValue();
		}
		public void setValue(ims.RefMan.vo.PatientElectiveListBedAdmissionVo value)
		{
			super.row.setValue(value);
		}
	}
	public static class grdElectiveListRowCollection extends GridRowCollectionBridge
	{
		private static final long serialVersionUID = 1L;
		
		private grdElectiveListRowCollection(GridRowCollection collection)
		{
			super(collection);
		}
		public grdElectiveListRow get(int index)
		{
			return new grdElectiveListRow(super.collection.get(index));
		}
		public grdElectiveListRow newRow()
		{
			return new grdElectiveListRow(super.collection.newRow());
		}
		public grdElectiveListRow newRow(boolean autoSelect)
		{
			return new grdElectiveListRow(super.collection.newRow(autoSelect));
		}
		public grdElectiveListRow newRowAt(int index)
		{
			return new grdElectiveListRow(super.collection.newRowAt(index));
		}
		public grdElectiveListRow newRowAt(int index, boolean autoSelect)
		{
			return new grdElectiveListRow(super.collection.newRowAt(index, autoSelect));
		}
	}
	public static class grdElectiveListGrid extends GridBridge
	{
		private static final long serialVersionUID = 1L;
		
		private void addStringColumn(String caption, int captionAlignment, int alignment, int width, boolean readOnly, boolean bold, int sortOrder, int maxLength, boolean canGrow, ims.framework.enumerations.CharacterCasing casing)
		{
			super.grid.addStringColumn(caption, captionAlignment, alignment, width, readOnly, bold, sortOrder, maxLength, canGrow, casing);
		}
		private void addBoolColumn(String caption, int captionAlignment, int alignment, int width, boolean readOnly, boolean autoPostBack, int sortOrder, boolean canGrow)
		{
			super.grid.addBoolColumn(caption, captionAlignment, alignment, width, readOnly, autoPostBack, sortOrder, canGrow);
		}
		public ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection getValues()
		{
			ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection listOfValues = new ims.RefMan.vo.PatientElectiveListBedAdmissionVoCollection();
			for(int x = 0; x < this.getRows().size(); x++)
			{
				listOfValues.add(this.getRows().get(x).getValue());
			}
			return listOfValues;
		}
		public ims.RefMan.vo.PatientElectiveListBedAdmissionVo getValue()
		{
			return (ims.RefMan.vo.PatientElectiveListBedAdmissionVo)super.grid.getValue();
		}
		public void setValue(ims.RefMan.vo.PatientElectiveListBedAdmissionVo value)
		{
			super.grid.setValue(value);
		}
		public grdElectiveListRow getSelectedRow()
		{
			return super.grid.getSelectedRow() == null ? null : new grdElectiveListRow(super.grid.getSelectedRow());
		}
		public int getSelectedRowIndex()
		{
			return super.grid.getSelectedRowIndex();
		}
		public grdElectiveListRowCollection getRows()
		{
			return new grdElectiveListRowCollection(super.grid.getRows());
		}
		public grdElectiveListRow getRowByValue(ims.RefMan.vo.PatientElectiveListBedAdmissionVo value)
		{
			GridRow row = super.grid.getRowByValue(value);
			return row == null?null:new grdElectiveListRow(row);
		}
		public void setColNameHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(0, value);
		}
		public String getColNameHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(0);
		}
		public void setProcedureHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(1, value);
		}
		public String getProcedureHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(1);
		}
		public void setColStatusHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(2, value);
		}
		public String getColStatusHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(2);
		}
		public void setColDateOnListHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(3, value);
		}
		public String getColDateOnListHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(3);
		}
		public void setColTciDateHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(4, value);
		}
		public String getColTciDateHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(4);
		}
		public void setColTciTimeHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(5, value);
		}
		public String getColTciTimeHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(5);
		}
		public void setColSelectHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(6, value);
		}
		public String getColSelectHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(6);
		}
	}
	private void validateContext(ims.framework.Context context)
	{
		if(context == null)
			return;
		if(!context.isValidContextType(ims.core.vo.PatientShort.class))
			throw new ims.framework.exceptions.CodingRuntimeException("The type 'ims.core.vo.PatientShort' of the global context variable 'Core.PatientShort' is not supported.");
	}
	private void validateMandatoryContext(Context context)
	{
		if(new ims.framework.ContextVariable("Core.PatientShort", "_cvp_Core.PatientShort").getValueIsNull(context))
			throw new ims.framework.exceptions.FormMandatoryContextMissingException("The required context data 'Core.PatientShort' is not available.");
		if(new ims.framework.ContextVariable("RefMan.PatientElectiveListsForCancellationDialog", "_cv_RefMan.PatientElectiveListsForCancellationDialog").getValueIsNull(context))
			throw new ims.framework.exceptions.FormMandatoryContextMissingException("The required context data 'RefMan.PatientElectiveListsForCancellationDialog' is not available.");
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
		this.globalContext = new GlobalContext(context);
	
		if(skipContextValidation == null || !skipContextValidation.booleanValue())
		{
			validateContext(context);
			validateMandatoryContext(context);
		}
	
		super.setContext(form);

		ims.framework.utils.SizeInfo designSize = new ims.framework.utils.SizeInfo(816, 440);
		if(runtimeSize == null)
			runtimeSize = designSize;
		form.setWidth(runtimeSize.getWidth());
		form.setHeight(runtimeSize.getHeight());
		super.setGlobalContext(ContextBridgeFlyweightFactory.getInstance().create(GlobalContextBridge.class, context, false));


		// Button Controls
		RuntimeAnchoring anchoringHelper1 = new RuntimeAnchoring(designSize, runtimeSize, 733, 406, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1000), new Integer(anchoringHelper1.getX()), new Integer(anchoringHelper1.getY()), new Integer(anchoringHelper1.getWidth()), new Integer(anchoringHelper1.getHeight()), new Integer(startTabIndex.intValue() + 3), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Cancel", Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper2 = new RuntimeAnchoring(designSize, runtimeSize, 654, 406, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1001), new Integer(anchoringHelper2.getX()), new Integer(anchoringHelper2.getY()), new Integer(anchoringHelper2.getWidth()), new Integer(anchoringHelper2.getHeight()), new Integer(startTabIndex.intValue() + 2), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "OK", Boolean.FALSE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));

		// Grid Controls
		RuntimeAnchoring anchoringHelper3 = new RuntimeAnchoring(designSize, runtimeSize, 8, 8, 800, 392, ims.framework.enumerations.ControlAnchoring.ALL);
		Grid m_grdElectiveListTemp = (Grid)factory.getControl(Grid.class, new Object[] { control, new Integer(startControlID.intValue() + 1002), new Integer(anchoringHelper3.getX()), new Integer(anchoringHelper3.getY()), new Integer(anchoringHelper3.getWidth()), new Integer(anchoringHelper3.getHeight()), new Integer(startTabIndex.intValue() + 1), ControlState.READONLY, ControlState.EDITABLE, ims.framework.enumerations.ControlAnchoring.ALL,Boolean.FALSE, Boolean.FALSE, new Integer(24), Boolean.TRUE, null, Boolean.FALSE, Boolean.FALSE, new Integer(0), null, Boolean.FALSE, Boolean.TRUE});
		addControl(m_grdElectiveListTemp);
		grdElectiveListGrid grdElectiveList = (grdElectiveListGrid)GridFlyweightFactory.getInstance().createGridBridge(grdElectiveListGrid.class, m_grdElectiveListTemp);
		grdElectiveList.addStringColumn("Name", 0, 0, 150, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdElectiveList.addStringColumn("Procedure", 0, 0, 180, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdElectiveList.addStringColumn("Status", 0, 0, 150, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdElectiveList.addStringColumn("Date On List", 0, 0, 90, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdElectiveList.addStringColumn("TCI Date", 0, 0, 90, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdElectiveList.addStringColumn("TCI Time", 0, 0, 80, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdElectiveList.addBoolColumn("Select", 1, 1, -1, false, false, 0, true);
		super.addGrid(grdElectiveList);
	}


	public Button btnCancel()
	{
		return (Button)super.getControl(0);
	}
	public Button btnOK()
	{
		return (Button)super.getControl(1);
	}
	public grdElectiveListGrid grdElectiveList()
	{
		return (grdElectiveListGrid)super.getGrid(0);
	}
	public GlobalContext getGlobalContext()
	{
		return this.globalContext;
	}
	public static class GlobalContextBridge extends ContextBridge
	{
		private static final long serialVersionUID = 1L;
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
			IReportField[] fields = new IReportField[71];
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