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

package ims.ocrr.forms.investigationscomponent;

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
	public static class grdResultsRow extends GridRowBridge
	{
		private static final long serialVersionUID = 1L;
		
		protected grdResultsRow(GridRow row)
		{
			super(row);
		}
		public void showOpened(int column)
		{
			super.row.showOpened(column);
		}
		public void setColDateTimeReadOnly(boolean value)
		{
			super.row.setReadOnly(0, value);
		}
		public boolean isColDateTimeReadOnly()
		{
			return super.row.isReadOnly(0);
		}
		public void showColDateTimeOpened()
		{
			super.row.showOpened(0);
		}
		public void setTooltipForColDateTime(String value)
		{
			super.row.setTooltip(0, value);
		}
		public String getColDateTime()
		{
			return (String)super.row.get(0);
		}
		public void setColDateTime(String value)
		{
			super.row.set(0, value);
		}
		public void setCellColDateTimeTooltip(String value)
		{
			super.row.setTooltip(0, value);
		}
		public void setColDateTimeImageReadOnly(boolean value)
		{
			super.row.setReadOnly(1, value);
		}
		public boolean isColDateTimeImageReadOnly()
		{
			return super.row.isReadOnly(1);
		}
		public void showColDateTimeImageOpened()
		{
			super.row.showOpened(1);
		}
		public void setTooltipForColDateTimeImage(String value)
		{
			super.row.setTooltip(1, value);
		}
		public ims.framework.utils.Image getColDateTimeImage()
		{
			return (ims.framework.utils.Image)super.row.get(1);
		}
		public void setColDateTimeImage(ims.framework.utils.Image value)
		{
			super.row.set(1, value);
		}
		public void setCellColDateTimeImageTooltip(String value)
		{
			super.row.setTooltip(1, value);
		}
		public void setColTestNameReadOnly(boolean value)
		{
			super.row.setReadOnly(2, value);
		}
		public boolean isColTestNameReadOnly()
		{
			return super.row.isReadOnly(2);
		}
		public void showColTestNameOpened()
		{
			super.row.showOpened(2);
		}
		public void setTooltipForColTestName(String value)
		{
			super.row.setTooltip(2, value);
		}
		public String getColTestName()
		{
			return (String)super.row.get(2);
		}
		public void setColTestName(String value)
		{
			super.row.set(2, value);
		}
		public void setCellColTestNameTooltip(String value)
		{
			super.row.setTooltip(2, value);
		}
		public void setColSpecimenReadOnly(boolean value)
		{
			super.row.setReadOnly(3, value);
		}
		public boolean isColSpecimenReadOnly()
		{
			return super.row.isReadOnly(3);
		}
		public void showColSpecimenOpened()
		{
			super.row.showOpened(3);
		}
		public void setTooltipForColSpecimen(String value)
		{
			super.row.setTooltip(3, value);
		}
		public String getColSpecimen()
		{
			return (String)super.row.get(3);
		}
		public void setColSpecimen(String value)
		{
			super.row.set(3, value);
		}
		public void setCellColSpecimenTooltip(String value)
		{
			super.row.setTooltip(3, value);
		}
		public void setColProvisonalFinalReadOnly(boolean value)
		{
			super.row.setReadOnly(4, value);
		}
		public boolean isColProvisonalFinalReadOnly()
		{
			return super.row.isReadOnly(4);
		}
		public void showColProvisonalFinalOpened()
		{
			super.row.showOpened(4);
		}
		public void setTooltipForColProvisonalFinal(String value)
		{
			super.row.setTooltip(4, value);
		}
		public String getColProvisonalFinal()
		{
			return (String)super.row.get(4);
		}
		public void setColProvisonalFinal(String value)
		{
			super.row.set(4, value);
		}
		public void setCellColProvisonalFinalTooltip(String value)
		{
			super.row.setTooltip(4, value);
		}
		public void setColABNReadOnly(boolean value)
		{
			super.row.setReadOnly(5, value);
		}
		public boolean isColABNReadOnly()
		{
			return super.row.isReadOnly(5);
		}
		public void showColABNOpened()
		{
			super.row.showOpened(5);
		}
		public void setTooltipForColABN(String value)
		{
			super.row.setTooltip(5, value);
		}
		public ims.framework.utils.Image getColABN()
		{
			return (ims.framework.utils.Image)super.row.get(5);
		}
		public void setColABN(ims.framework.utils.Image value)
		{
			super.row.set(5, value);
		}
		public void setCellColABNTooltip(String value)
		{
			super.row.setTooltip(5, value);
		}
		public void setColStatusReadOnly(boolean value)
		{
			super.row.setReadOnly(6, value);
		}
		public boolean isColStatusReadOnly()
		{
			return super.row.isReadOnly(6);
		}
		public void showColStatusOpened()
		{
			super.row.showOpened(6);
		}
		public void setTooltipForColStatus(String value)
		{
			super.row.setTooltip(6, value);
		}
		public ims.framework.utils.Image getColStatus()
		{
			return (ims.framework.utils.Image)super.row.get(6);
		}
		public void setColStatus(ims.framework.utils.Image value)
		{
			super.row.set(6, value);
		}
		public void setCellColStatusTooltip(String value)
		{
			super.row.setTooltip(6, value);
		}
		public void setColDisciplineReadOnly(boolean value)
		{
			super.row.setReadOnly(7, value);
		}
		public boolean isColDisciplineReadOnly()
		{
			return super.row.isReadOnly(7);
		}
		public void showColDisciplineOpened()
		{
			super.row.showOpened(7);
		}
		public void setTooltipForColDiscipline(String value)
		{
			super.row.setTooltip(7, value);
		}
		public String getColDiscipline()
		{
			return (String)super.row.get(7);
		}
		public void setColDiscipline(String value)
		{
			super.row.set(7, value);
		}
		public void setCellColDisciplineTooltip(String value)
		{
			super.row.setTooltip(7, value);
		}
		public void setColOrderingLocationReadOnly(boolean value)
		{
			super.row.setReadOnly(8, value);
		}
		public boolean isColOrderingLocationReadOnly()
		{
			return super.row.isReadOnly(8);
		}
		public void showColOrderingLocationOpened()
		{
			super.row.showOpened(8);
		}
		public void setTooltipForColOrderingLocation(String value)
		{
			super.row.setTooltip(8, value);
		}
		public String getColOrderingLocation()
		{
			return (String)super.row.get(8);
		}
		public void setColOrderingLocation(String value)
		{
			super.row.set(8, value);
		}
		public void setCellColOrderingLocationTooltip(String value)
		{
			super.row.setTooltip(8, value);
		}
		public void setColClinicianReadOnly(boolean value)
		{
			super.row.setReadOnly(9, value);
		}
		public boolean isColClinicianReadOnly()
		{
			return super.row.isReadOnly(9);
		}
		public void showColClinicianOpened()
		{
			super.row.showOpened(9);
		}
		public void setTooltipForColClinician(String value)
		{
			super.row.setTooltip(9, value);
		}
		public String getColClinician()
		{
			return (String)super.row.get(9);
		}
		public void setColClinician(String value)
		{
			super.row.set(9, value);
		}
		public void setCellColClinicianTooltip(String value)
		{
			super.row.setTooltip(9, value);
		}
		public ims.ocrr.vo.OcsPathRadResultVo getValue()
		{
			return (ims.ocrr.vo.OcsPathRadResultVo)super.row.getValue();
		}
		public void setValue(ims.ocrr.vo.OcsPathRadResultVo value)
		{
			super.row.setValue(value);
		}
		public grdResultsRow getParentRow()
		{
			return super.row.getParent() == null ? null : new grdResultsRow(super.row.getParent());
		}
		public grdResultsRowCollection getRows()
		{
			if(this.collection == null)
				this.collection = new grdResultsRowCollection(super.row.getRows());
			return this.collection;
		}
		private grdResultsRowCollection collection;
	}
	public static class grdResultsRowCollection extends GridRowCollectionBridge
	{
		private static final long serialVersionUID = 1L;
		
		private grdResultsRowCollection(GridRowCollection collection)
		{
			super(collection);
		}
		public grdResultsRow get(int index)
		{
			return new grdResultsRow(super.collection.get(index));
		}
		public grdResultsRow newRow()
		{
			return new grdResultsRow(super.collection.newRow());
		}
		public grdResultsRow newRow(boolean autoSelect)
		{
			return new grdResultsRow(super.collection.newRow(autoSelect));
		}
		public grdResultsRow newRowAt(int index)
		{
			return new grdResultsRow(super.collection.newRowAt(index));
		}
		public grdResultsRow newRowAt(int index, boolean autoSelect)
		{
			return new grdResultsRow(super.collection.newRowAt(index, autoSelect));
		}
	}
	public static class grdResultsGrid extends GridBridge
	{
		private static final long serialVersionUID = 1L;
		
		public GenForm.grdResultsRow[] getAllRows()
		{
			java.util.ArrayList rows = new java.util.ArrayList();
			for(int x = 0; x < getRows().size(); x++)
			{
				GenForm.grdResultsRow row = getRows().get(x);
				rows.add(row);
				GenForm.grdResultsRow[] childRows = getAllRows(row);
				for(int i = 0; i < childRows.length; i++)
				{
					rows.add(childRows[i]);
				}
			}
			GenForm.grdResultsRow[] result = new GenForm.grdResultsRow[rows.size()];
			for(int x = 0; x < rows.size(); x++)
			{
				result[x] = (GenForm.grdResultsRow)rows.get(x);
			}
			return result;
		}
		public GenForm.grdResultsRow[] getAllRows(GenForm.grdResultsRow parentRow)
		{
			java.util.ArrayList rows = new java.util.ArrayList();
			for(int x = 0; x < parentRow.getRows().size(); x++)
			{
				GenForm.grdResultsRow row = parentRow.getRows().get(x);
				rows.add(row);
				GenForm.grdResultsRow[] childRows = getAllRows(row);
				for(int i = 0; i < childRows.length; i++)
				{
					rows.add(childRows[i]);
				}
			}
			GenForm.grdResultsRow[] result = new GenForm.grdResultsRow[rows.size()];
			for(int x = 0; x < rows.size(); x++)
			{
				result[x] = (GenForm.grdResultsRow)rows.get(x);
			}
			return result;
		}
		public void expandAll()
		{
			expandCollapseAll(true);
		}
		public void collapseAll()
		{
			expandCollapseAll(false);
		}
		private void expandCollapseAll(boolean expand)
		{
			for(int x = 0; x < getRows().size(); x++)
			{
				GenForm.grdResultsRow row = getRows().get(x);
				row.setExpanded(expand);
				expandCollapseRow(row, expand);
			}
		}
		private void expandCollapseRow(GenForm.grdResultsRow parentRow, boolean expand)
		{
			for(int x = 0; x < parentRow.getRows().size(); x++)
			{
				GenForm.grdResultsRow row = parentRow.getRows().get(x);
				row.setExpanded(expand);
				expandCollapseRow(row, expand);
			}
		}
		private void addTreeColumn(String caption, int captionAlignment, int width, boolean bold, boolean canGrow)
		{
			super.grid.addTreeColumn(caption, captionAlignment, width, bold, canGrow);
		}
		private void addImageColumn(String caption, int captionAlignment, int alignment, int width, boolean canGrow, int sortOrder)
		{
			super.grid.addImageColumn(caption, captionAlignment, alignment, width, canGrow, sortOrder);
		}
		private void addStringColumn(String caption, int captionAlignment, int alignment, int width, boolean readOnly, boolean bold, int sortOrder, int maxLength, boolean canGrow, ims.framework.enumerations.CharacterCasing casing)
		{
			super.grid.addStringColumn(caption, captionAlignment, alignment, width, readOnly, bold, sortOrder, maxLength, canGrow, casing);
		}
		public ims.ocrr.vo.OcsPathRadResultVoCollection getValues()
		{
			ims.ocrr.vo.OcsPathRadResultVoCollection listOfValues = new ims.ocrr.vo.OcsPathRadResultVoCollection();
			for(int x = 0; x < this.getRows().size(); x++)
			{
				listOfValues.add(this.getRows().get(x).getValue());
			}
			return listOfValues;
		}
		public ims.ocrr.vo.OcsPathRadResultVo getValue()
		{
			return (ims.ocrr.vo.OcsPathRadResultVo)super.grid.getValue();
		}
		public void setValue(ims.ocrr.vo.OcsPathRadResultVo value)
		{
			super.grid.setValue(value);
		}
		public grdResultsRow getSelectedRow()
		{
			return super.grid.getSelectedRow() == null ? null : new grdResultsRow(super.grid.getSelectedRow());
		}
		public int getSelectedRowIndex()
		{
			return super.grid.getSelectedRowIndex();
		}
		public grdResultsRowCollection getRows()
		{
			return new grdResultsRowCollection(super.grid.getRows());
		}
		public grdResultsRow getRowByValue(ims.ocrr.vo.OcsPathRadResultVo value)
		{
			GridRow row = super.grid.getRowByValue(value);
			return row == null?null:new grdResultsRow(row);
		}
		public void setColDateTimeHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(0, value);
		}
		public String getColDateTimeHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(0);
		}
		public void setColDateTimeImageHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(1, value);
		}
		public String getColDateTimeImageHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(1);
		}
		public void setColTestNameHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(2, value);
		}
		public String getColTestNameHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(2);
		}
		public void setColSpecimenHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(3, value);
		}
		public String getColSpecimenHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(3);
		}
		public void setColProvisonalFinalHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(4, value);
		}
		public String getColProvisonalFinalHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(4);
		}
		public void setColABNHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(5, value);
		}
		public String getColABNHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(5);
		}
		public void setColStatusHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(6, value);
		}
		public String getColStatusHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(6);
		}
		public void setColDisciplineHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(7, value);
		}
		public String getColDisciplineHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(7);
		}
		public void setColOrderingLocationHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(8, value);
		}
		public String getColOrderingLocationHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(8);
		}
		public void setColClinicianHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(9, value);
		}
		public String getColClinicianHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(9);
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

		ims.framework.utils.SizeInfo designSize = new ims.framework.utils.SizeInfo(848, 632);
		if(runtimeSize == null)
			runtimeSize = designSize;
		form.setWidth(runtimeSize.getWidth());
		form.setHeight(runtimeSize.getHeight());
		super.setFormReferences(FormReferencesFlyweightFactory.getInstance().create(Forms.class));
		super.setImageReferences(ImageReferencesFlyweightFactory.getInstance().create(Images.class));
		super.setGlobalContext(ContextBridgeFlyweightFactory.getInstance().create(GlobalContextBridge.class, context, false));
		super.setLocalContext(new LocalContext(context, form.getFormInfo(), componentIdentifier));


		// Grid Controls
		RuntimeAnchoring anchoringHelper1 = new RuntimeAnchoring(designSize, runtimeSize, 8, 8, 832, 616, ims.framework.enumerations.ControlAnchoring.ALL);
		Grid m_grdResultsTemp = (Grid)factory.getControl(Grid.class, new Object[] { control, new Integer(startControlID.intValue() + 1000), new Integer(anchoringHelper1.getX()), new Integer(anchoringHelper1.getY()), new Integer(anchoringHelper1.getWidth()), new Integer(anchoringHelper1.getHeight()), new Integer(startTabIndex.intValue() + 1), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.ALL,Boolean.TRUE, Boolean.FALSE, new Integer(24), Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, new Integer(50), "Total:", Boolean.FALSE, Boolean.TRUE});
		addControl(m_grdResultsTemp);
		grdResultsGrid grdResults = (grdResultsGrid)GridFlyweightFactory.getInstance().createGridBridge(grdResultsGrid.class, m_grdResultsTemp);
		grdResults.addTreeColumn("Date / Time", 0, 128, false, false);
		grdResults.addImageColumn(" ", 1, 1, 25, false, 0);
		grdResults.addStringColumn("Investigation", 0, 0, 125, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdResults.addStringColumn("Specimen", 0, 0, 85, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdResults.addStringColumn("P/F", 0, 0, 35, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdResults.addImageColumn("ABN", 1, 1, 35, false, 0);
		grdResults.setColABNHeaderTooltip("Abnormal Result Flag");
		grdResults.addImageColumn("Status", 1, 1, 40, false, 0);
		grdResults.addStringColumn("Discipline", 0, 0, 100, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdResults.addStringColumn("Patient Location", 0, 0, 110, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdResults.addStringColumn("Resp. Clinician", 0, 0, -1, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		super.addGrid(grdResults);
	}



	public Forms getForms()
	{
		return (Forms)super.getFormReferences();
	}

	public Images getImages()
	{
		return (Images)super.getImageReferences();
	}
	public grdResultsGrid grdResults()
	{
		return (grdResultsGrid)super.getGrid(0);
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
			OCRR = new OCRRForms();
		}
		public final class OCRRForms implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private OCRRForms()
			{
				ResultDialog = new LocalFormName(116128);
				OrderSummaryDialog = new LocalFormName(116132);
			}
			public final FormName ResultDialog;
			public final FormName OrderSummaryDialog;
		}

		public OCRRForms OCRR;
	}


	public static class Images implements java.io.Serializable
	{
		private static final long serialVersionUID = 1L;
		private final class ImageHelper extends ims.framework.utils.ImagePath
		{
			private static final long serialVersionUID = 1L;
			
			private ImageHelper(int id, String path, Integer width, Integer height)
			{
				super(id, path, width, height);
			}
		}
		private Images()
		{
			Core = new CoreImages();
			ICP = new ICPImages();
		}
		public final class CoreImages implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private CoreImages()
			{
				FindDisabled24 = new ImageHelper(102172, "Images/Core/FindDisabled_24.png", new Integer(24), new Integer(24));
				FindEnabled24 = new ImageHelper(102175, "Images/Core/Find_24.png", new Integer(24), new Integer(24));
				ClearDisabled24 = new ImageHelper(102173, "Images/Core/ClearDisabled_24.png", new Integer(24), new Integer(24));
				ClearEnabled24 = new ImageHelper(102174, "Images/Core/ClearEnabled_24.png", new Integer(24), new Integer(24));
				CriticalError = new ImageHelper(102250, "Images/Core/CriticalError.gif", new Integer(16), new Integer(16));
				Pupil_size2 = new ImageHelper(102127, "Images/Core/eye_2x.gif", new Integer(13), new Integer(13));
				RedCircle = new ImageHelper(102274, "Images/Core/red-circle-1.gif", new Integer(16), new Integer(16));
				YellowTriangleOut = new ImageHelper(102275, "Images/Core/yellow-tri-1-out.gif", new Integer(16), new Integer(16));
				MultiSelect = new ImageHelper(102233, "Images/Core/MultiSelect.gif", new Integer(16), new Integer(16));
			}
			public final ims.framework.utils.Image FindDisabled24;
			public final ims.framework.utils.Image FindEnabled24;
			public final ims.framework.utils.Image ClearDisabled24;
			public final ims.framework.utils.Image ClearEnabled24;
			public final ims.framework.utils.Image CriticalError;
			public final ims.framework.utils.Image Pupil_size2;
			public final ims.framework.utils.Image RedCircle;
			public final ims.framework.utils.Image YellowTriangleOut;
			public final ims.framework.utils.Image MultiSelect;
		}
		public final class ICPImages implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private ICPImages()
			{
				Child = new ImageHelper(118100, "Images/ICP/property.gif", new Integer(16), new Integer(16));
			}
			public final ims.framework.utils.Image Child;
		}
		public final CoreImages Core;
		public final ICPImages ICP;
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
			cxl_canViewConfidentialInvsResults = new ims.framework.ContextVariable("canViewConfidentialInvsResults", prefix + "_lv_OCRR.InvestigationsComponent.__internal_x_context__canViewConfidentialInvsResults_" + componentIdentifier + "");
			cxl_canViewConfidentialInvsOrdered = new ims.framework.ContextVariable("canViewConfidentialInvsOrdered", prefix + "_lv_OCRR.InvestigationsComponent.__internal_x_context__canViewConfidentialInvsOrdered_" + componentIdentifier + "");
		}
		
		public boolean getcanViewConfidentialInvsResultsIsNotNull()
		{
			return !cxl_canViewConfidentialInvsResults.getValueIsNull(context);
		}
		public Boolean getcanViewConfidentialInvsResults()
		{
			return (Boolean)cxl_canViewConfidentialInvsResults.getValue(context);
		}
		public void setcanViewConfidentialInvsResults(Boolean value)
		{
			cxl_canViewConfidentialInvsResults.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_canViewConfidentialInvsResults = null;
		public boolean getcanViewConfidentialInvsOrderedIsNotNull()
		{
			return !cxl_canViewConfidentialInvsOrdered.getValueIsNull(context);
		}
		public Boolean getcanViewConfidentialInvsOrdered()
		{
			return (Boolean)cxl_canViewConfidentialInvsOrdered.getValue(context);
		}
		public void setcanViewConfidentialInvsOrdered(Boolean value)
		{
			cxl_canViewConfidentialInvsOrdered.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_canViewConfidentialInvsOrdered = null;
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
			IReportField[] fields = new IReportField[72];
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
			fields[71] = new ims.framework.ReportField(this.context, "_cv_OCRR.PathologyResults.Order", "BO-1070100000-ID", "ID_OcsOrderSession");
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
	private GlobalContext globalContext = null;
	private IReportField[] reportFields = null;
}
