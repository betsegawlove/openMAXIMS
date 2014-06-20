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

package ims.admin.forms.screenhints;

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
	public static class grdHintFormsRow extends GridRowBridge
	{
		private static final long serialVersionUID = 1L;
		
		protected grdHintFormsRow(GridRow row)
		{
			super(row);
		}
		public void showOpened(int column)
		{
			super.row.showOpened(column);
		}
		public void setTypeIconReadOnly(boolean value)
		{
			super.row.setReadOnly(0, value);
		}
		public boolean isTypeIconReadOnly()
		{
			return super.row.isReadOnly(0);
		}
		public void showTypeIconOpened()
		{
			super.row.showOpened(0);
		}
		public ims.framework.utils.Image getTypeIcon()
		{
			return (ims.framework.utils.Image)super.row.get(0);
		}
		public void setTypeIcon(ims.framework.utils.Image value)
		{
			super.row.set(0, value);
		}
		public void setCellTypeIconTooltip(String value)
		{
			super.row.setTooltip(0, value);
		}
		public void setNameReadOnly(boolean value)
		{
			super.row.setReadOnly(1, value);
		}
		public boolean isNameReadOnly()
		{
			return super.row.isReadOnly(1);
		}
		public void showNameOpened()
		{
			super.row.showOpened(1);
		}
		public String getName()
		{
			return (String)super.row.get(1);
		}
		public void setName(String value)
		{
			super.row.set(1, value);
		}
		public void setCellNameTooltip(String value)
		{
			super.row.setTooltip(1, value);
		}
		public ims.core.vo.ScreenHintVo getValue()
		{
			return (ims.core.vo.ScreenHintVo)super.row.getValue();
		}
		public void setValue(ims.core.vo.ScreenHintVo value)
		{
			super.row.setValue(value);
		}
	}
	public static class grdHintFormsRowCollection extends GridRowCollectionBridge
	{
		private static final long serialVersionUID = 1L;
		
		private grdHintFormsRowCollection(GridRowCollection collection)
		{
			super(collection);
		}
		public grdHintFormsRow get(int index)
		{
			return new grdHintFormsRow(super.collection.get(index));
		}
		public grdHintFormsRow newRow()
		{
			return new grdHintFormsRow(super.collection.newRow());
		}
		public grdHintFormsRow newRow(boolean autoSelect)
		{
			return new grdHintFormsRow(super.collection.newRow(autoSelect));
		}
		public grdHintFormsRow newRowAt(int index)
		{
			return new grdHintFormsRow(super.collection.newRowAt(index));
		}
		public grdHintFormsRow newRowAt(int index, boolean autoSelect)
		{
			return new grdHintFormsRow(super.collection.newRowAt(index, autoSelect));
		}
	}
	public static class grdHintFormsGrid extends GridBridge
	{
		private static final long serialVersionUID = 1L;
		
		private void addImageColumn(String caption, int captionAlignment, int alignment, int width, boolean canGrow, int sortOrder)
		{
			super.grid.addImageColumn(caption, captionAlignment, alignment, width, canGrow, sortOrder);
		}
		private void addHtmlColumn(String caption, int captionAlignment, int alignment, int width, boolean readOnly, boolean bold, int sortOrder, boolean canGrow)
		{
			super.grid.addHtmlColumn(caption, captionAlignment, alignment, width, readOnly, bold, sortOrder, canGrow);
		}
		public ims.core.vo.ScreenHintVoCollection getValues()
		{
			ims.core.vo.ScreenHintVoCollection listOfValues = new ims.core.vo.ScreenHintVoCollection();
			for(int x = 0; x < this.getRows().size(); x++)
			{
				listOfValues.add(this.getRows().get(x).getValue());
			}
			return listOfValues;
		}
		public ims.core.vo.ScreenHintVo getValue()
		{
			return (ims.core.vo.ScreenHintVo)super.grid.getValue();
		}
		public void setValue(ims.core.vo.ScreenHintVo value)
		{
			super.grid.setValue(value);
		}
		public grdHintFormsRow getSelectedRow()
		{
			return super.grid.getSelectedRow() == null ? null : new grdHintFormsRow(super.grid.getSelectedRow());
		}
		public int getSelectedRowIndex()
		{
			return super.grid.getSelectedRowIndex();
		}
		public grdHintFormsRowCollection getRows()
		{
			return new grdHintFormsRowCollection(super.grid.getRows());
		}
		public grdHintFormsRow getRowByValue(ims.core.vo.ScreenHintVo value)
		{
			GridRow row = super.grid.getRowByValue(value);
			return row == null?null:new grdHintFormsRow(row);
		}
		public void setTypeIconHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(0, value);
		}
		public String getTypeIconHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(0);
		}
		public void setNameHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(1, value);
		}
		public String getNameHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(1);
		}
	}
	public static class grdFormHintsRow extends GridRowBridge
	{
		private static final long serialVersionUID = 1L;
		
		protected grdFormHintsRow(GridRow row)
		{
			super(row);
		}
		public void showOpened(int column)
		{
			super.row.showOpened(column);
		}
		public void setcolHintReadOnly(boolean value)
		{
			super.row.setReadOnly(0, value);
		}
		public boolean iscolHintReadOnly()
		{
			return super.row.isReadOnly(0);
		}
		public void showcolHintOpened()
		{
			super.row.showOpened(0);
		}
		public String getcolHint()
		{
			return (String)super.row.get(0);
		}
		public void setcolHint(String value)
		{
			super.row.set(0, value);
		}
		public void setCellcolHintTooltip(String value)
		{
			super.row.setTooltip(0, value);
		}
		public void setcolHintDescriptionReadOnly(boolean value)
		{
			super.row.setReadOnly(1, value);
		}
		public boolean iscolHintDescriptionReadOnly()
		{
			return super.row.isReadOnly(1);
		}
		public void showcolHintDescriptionOpened()
		{
			super.row.showOpened(1);
		}
		public ims.framework.utils.Image getcolHintDescription()
		{
			return (ims.framework.utils.Image)super.row.get(1);
		}
		public void setcolHintDescription(ims.framework.utils.Image value)
		{
			super.row.set(1, value);
		}
		public void setCellcolHintDescriptionTooltip(String value)
		{
			super.row.setTooltip(1, value);
		}
		public ims.core.vo.ScreenHintVo getValue()
		{
			return (ims.core.vo.ScreenHintVo)super.row.getValue();
		}
		public void setValue(ims.core.vo.ScreenHintVo value)
		{
			super.row.setValue(value);
		}
	}
	public static class grdFormHintsRowCollection extends GridRowCollectionBridge
	{
		private static final long serialVersionUID = 1L;
		
		private grdFormHintsRowCollection(GridRowCollection collection)
		{
			super(collection);
		}
		public grdFormHintsRow get(int index)
		{
			return new grdFormHintsRow(super.collection.get(index));
		}
		public grdFormHintsRow newRow()
		{
			return new grdFormHintsRow(super.collection.newRow());
		}
		public grdFormHintsRow newRow(boolean autoSelect)
		{
			return new grdFormHintsRow(super.collection.newRow(autoSelect));
		}
		public grdFormHintsRow newRowAt(int index)
		{
			return new grdFormHintsRow(super.collection.newRowAt(index));
		}
		public grdFormHintsRow newRowAt(int index, boolean autoSelect)
		{
			return new grdFormHintsRow(super.collection.newRowAt(index, autoSelect));
		}
	}
	public static class grdFormHintsGrid extends GridBridge
	{
		private static final long serialVersionUID = 1L;
		
		private void addStringColumn(String caption, int captionAlignment, int alignment, int width, boolean readOnly, boolean bold, int sortOrder, int maxLength, boolean canGrow, ims.framework.enumerations.CharacterCasing casing)
		{
			super.grid.addStringColumn(caption, captionAlignment, alignment, width, readOnly, bold, sortOrder, maxLength, canGrow, casing);
		}
		private void addImageColumn(String caption, int captionAlignment, int alignment, int width, boolean canGrow, int sortOrder)
		{
			super.grid.addImageColumn(caption, captionAlignment, alignment, width, canGrow, sortOrder);
		}
		public ims.core.vo.ScreenHintVoCollection getValues()
		{
			ims.core.vo.ScreenHintVoCollection listOfValues = new ims.core.vo.ScreenHintVoCollection();
			for(int x = 0; x < this.getRows().size(); x++)
			{
				listOfValues.add(this.getRows().get(x).getValue());
			}
			return listOfValues;
		}
		public ims.core.vo.ScreenHintVo getValue()
		{
			return (ims.core.vo.ScreenHintVo)super.grid.getValue();
		}
		public void setValue(ims.core.vo.ScreenHintVo value)
		{
			super.grid.setValue(value);
		}
		public grdFormHintsRow getSelectedRow()
		{
			return super.grid.getSelectedRow() == null ? null : new grdFormHintsRow(super.grid.getSelectedRow());
		}
		public int getSelectedRowIndex()
		{
			return super.grid.getSelectedRowIndex();
		}
		public grdFormHintsRowCollection getRows()
		{
			return new grdFormHintsRowCollection(super.grid.getRows());
		}
		public grdFormHintsRow getRowByValue(ims.core.vo.ScreenHintVo value)
		{
			GridRow row = super.grid.getRowByValue(value);
			return row == null?null:new grdFormHintsRow(row);
		}
		public void setcolHintHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(0, value);
		}
		public String getcolHintHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(0);
		}
		public void setcolHintDescriptionHeaderTooltip(String value)
		{
			super.grid.setColumnHeaderTooltip(1, value);
		}
		public String getcolHintDescriptionHeaderTooltip()
		{
			return super.grid.getColumnHeaderTooltip(1);
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

		ims.framework.utils.SizeInfo designSize = new ims.framework.utils.SizeInfo(848, 632);
		if(runtimeSize == null)
			runtimeSize = designSize;
		form.setWidth(runtimeSize.getWidth());
		form.setHeight(runtimeSize.getHeight());
		super.setImageReferences(ImageReferencesFlyweightFactory.getInstance().create(Images.class));
		super.setLocalContext(new LocalContext(context, form.getFormInfo(), componentIdentifier));

		// Context Menus
		contextMenus = new ContextMenus();
		contextMenus.contextMenuLIP = factory.createMenu(startControlID.intValue() + 1);
		contextMenus.contextMenuLIPNewItem = factory.createMenuItem(startControlID.intValue() + 1, "New", true, false, new Integer(102179), true, false);
		contextMenus.contextMenuLIP.add(contextMenus.contextMenuLIPNewItem);
		contextMenus.contextMenuLIPUpdateItem = factory.createMenuItem(startControlID.intValue() + 2, "Edit", true, false, new Integer(102150), true, false);
		contextMenus.contextMenuLIP.add(contextMenus.contextMenuLIPUpdateItem);
		form.registerMenu(contextMenus.contextMenuLIP);


		// Panel Controls
		RuntimeAnchoring anchoringHelper1 = new RuntimeAnchoring(designSize, runtimeSize, 8, 8, 304, 24, ims.framework.enumerations.ControlAnchoring.TOPLEFT);
		super.addControl(factory.getControl(Panel.class, new Object[] { control, new Integer(startControlID.intValue() + 1000), new Integer(anchoringHelper1.getX()), new Integer(anchoringHelper1.getY()), new Integer(anchoringHelper1.getWidth()), new Integer(anchoringHelper1.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFT,"Forms with Hints:", new Integer(2), ""}));
		RuntimeAnchoring anchoringHelper2 = new RuntimeAnchoring(designSize, runtimeSize, 320, 344, 520, 248, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFTRIGHT);
		super.addControl(factory.getControl(Panel.class, new Object[] { control, new Integer(startControlID.intValue() + 1001), new Integer(anchoringHelper2.getX()), new Integer(anchoringHelper2.getY()), new Integer(anchoringHelper2.getWidth()), new Integer(anchoringHelper2.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFTRIGHT,"User description for Hint:", new Integer(2), ""}));
		RuntimeAnchoring anchoringHelper3 = new RuntimeAnchoring(designSize, runtimeSize, 320, 8, 520, 24, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT);
		super.addControl(factory.getControl(Panel.class, new Object[] { control, new Integer(startControlID.intValue() + 1002), new Integer(anchoringHelper3.getX()), new Integer(anchoringHelper3.getY()), new Integer(anchoringHelper3.getWidth()), new Integer(anchoringHelper3.getHeight()), ControlState.UNKNOWN, ControlState.UNKNOWN, ims.framework.enumerations.ControlAnchoring.TOPLEFTRIGHT,"Available Hints:", new Integer(2), ""}));

		// Button Controls
		RuntimeAnchoring anchoringHelper4 = new RuntimeAnchoring(designSize, runtimeSize, 760, 600, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1003), new Integer(anchoringHelper4.getX()), new Integer(anchoringHelper4.getY()), new Integer(anchoringHelper4.getWidth()), new Integer(anchoringHelper4.getHeight()), new Integer(-1), ControlState.HIDDEN, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Cancel", Boolean.FALSE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));
		RuntimeAnchoring anchoringHelper5 = new RuntimeAnchoring(designSize, runtimeSize, 672, 600, 75, 23, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT);
		super.addControl(factory.getControl(Button.class, new Object[] { control, new Integer(startControlID.intValue() + 1004), new Integer(anchoringHelper5.getX()), new Integer(anchoringHelper5.getY()), new Integer(anchoringHelper5.getWidth()), new Integer(anchoringHelper5.getHeight()), new Integer(-1), ControlState.HIDDEN, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMRIGHT, "Save", Boolean.FALSE, null, Boolean.FALSE, Boolean.TRUE, Boolean.FALSE, null, ims.framework.utils.Color.Default, ims.framework.utils.Color.Default }));

		// Grid Controls
		RuntimeAnchoring anchoringHelper6 = new RuntimeAnchoring(designSize, runtimeSize, 8, 40, 304, 552, ims.framework.enumerations.ControlAnchoring.TOPBOTTOMLEFT);
		Grid m_grdHintFormsTemp = (Grid)factory.getControl(Grid.class, new Object[] { control, new Integer(startControlID.intValue() + 1005), new Integer(anchoringHelper6.getX()), new Integer(anchoringHelper6.getY()), new Integer(anchoringHelper6.getWidth()), new Integer(anchoringHelper6.getHeight()), new Integer(startTabIndex.intValue() + 2), ControlState.READONLY, ControlState.DISABLED, ims.framework.enumerations.ControlAnchoring.TOPBOTTOMLEFT,Boolean.TRUE, Boolean.TRUE, new Integer(24), Boolean.TRUE, null, Boolean.FALSE, Boolean.TRUE, new Integer(0), null, Boolean.FALSE, Boolean.TRUE});
		addControl(m_grdHintFormsTemp);
		grdHintFormsGrid grdHintForms = (grdHintFormsGrid)GridFlyweightFactory.getInstance().createGridBridge(grdHintFormsGrid.class, m_grdHintFormsTemp);
		grdHintForms.addImageColumn(" ", 0, 0, 50, false, 0);
		grdHintForms.addHtmlColumn("Name", 0, 0, -1, true, false, 0, true);
		super.addGrid(grdHintForms);
		RuntimeAnchoring anchoringHelper7 = new RuntimeAnchoring(designSize, runtimeSize, 320, 40, 520, 296, ims.framework.enumerations.ControlAnchoring.ALL);
		Grid m_grdFormHintsTemp = (Grid)factory.getControl(Grid.class, new Object[] { control, new Integer(startControlID.intValue() + 1006), new Integer(anchoringHelper7.getX()), new Integer(anchoringHelper7.getY()), new Integer(anchoringHelper7.getWidth()), new Integer(anchoringHelper7.getHeight()), new Integer(startTabIndex.intValue() + 1), ControlState.READONLY, ControlState.DISABLED, ims.framework.enumerations.ControlAnchoring.ALL,Boolean.TRUE, Boolean.FALSE, new Integer(24), Boolean.TRUE, contextMenus.contextMenuLIP, Boolean.FALSE, Boolean.FALSE, new Integer(0), null, Boolean.FALSE, Boolean.TRUE});
		addControl(m_grdFormHintsTemp);
		grdFormHintsGrid grdFormHints = (grdFormHintsGrid)GridFlyweightFactory.getInstance().createGridBridge(grdFormHintsGrid.class, m_grdFormHintsTemp);
		grdFormHints.addStringColumn("Hint", 0, 0, 440, true, false, 0, 0, true, ims.framework.enumerations.CharacterCasing.NORMAL);
		grdFormHints.addImageColumn("Description", 0, 0, -1, true, 0);
		super.addGrid(grdFormHints);

		// Rich Text Controls
		RuntimeAnchoring anchoringHelper8 = new RuntimeAnchoring(designSize, runtimeSize, 328, 376, 504, 200, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFTRIGHT);
		super.addControl(factory.getControl(RichTextControl.class, new Object[] { control, new Integer(startControlID.intValue() + 1007), new Integer(anchoringHelper8.getX()), new Integer(anchoringHelper8.getY()), new Integer(anchoringHelper8.getWidth()), new Integer(anchoringHelper8.getHeight()), new Integer(startTabIndex.intValue() + 3), ControlState.DISABLED, ControlState.ENABLED, ims.framework.enumerations.ControlAnchoring.BOTTOMLEFTRIGHT, Boolean.FALSE, Boolean.TRUE, new Integer(0)} ));
	}



	public Images getImages()
	{
		return (Images)super.getImageReferences();
	}
	public Button btnCancel()
	{
		return (Button)super.getControl(3);
	}
	public Button btnSave()
	{
		return (Button)super.getControl(4);
	}
	public grdHintFormsGrid grdHintForms()
	{
		return (grdHintFormsGrid)super.getGrid(0);
	}
	public grdFormHintsGrid grdFormHints()
	{
		return (grdFormHintsGrid)super.getGrid(1);
	}
	public RichTextControl richTextHintDesc()
	{
		return (RichTextControl)super.getControl(7);
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
			Admin = new AdminImages();
			Core = new CoreImages();
		}
		public final class AdminImages implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private AdminImages()
			{
				Form48 = new ImageHelper(103236, "Images/Admin/form_48.png", new Integer(48), new Integer(48));
			}
			public final ims.framework.utils.Image Form48;
		}
		public final class CoreImages implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			private CoreImages()
			{
				HintIcon = new ImageHelper(102559, "Images/Core/hint_icon.PNG", new Integer(16), new Integer(16));
			}
			public final ims.framework.utils.Image HintIcon;
		}
		public final AdminImages Admin;
		public final CoreImages Core;
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
			cxl_ScreenHints = new ims.framework.ContextVariable("ScreenHints", prefix + "_lv_Admin.ScreenHints.__internal_x_context__ScreenHints_" + componentIdentifier + "");
			cxl_SelectedRecord = new ims.framework.ContextVariable("SelectedRecord", prefix + "_lv_Admin.ScreenHints.__internal_x_context__SelectedRecord_" + componentIdentifier + "");
		}
		
		public boolean getScreenHintsIsNotNull()
		{
			return !cxl_ScreenHints.getValueIsNull(context);
		}
		public ims.core.vo.ScreenHintVoCollection getScreenHints()
		{
			return (ims.core.vo.ScreenHintVoCollection)cxl_ScreenHints.getValue(context);
		}
		public void setScreenHints(ims.core.vo.ScreenHintVoCollection value)
		{
			cxl_ScreenHints.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_ScreenHints = null;
		public boolean getSelectedRecordIsNotNull()
		{
			return !cxl_SelectedRecord.getValueIsNull(context);
		}
		public ims.core.vo.ScreenHintVo getSelectedRecord()
		{
			return (ims.core.vo.ScreenHintVo)cxl_SelectedRecord.getValue(context);
		}
		public void setSelectedRecord(ims.core.vo.ScreenHintVo value)
		{
			cxl_SelectedRecord.setValue(context, value);
		}
		private ims.framework.ContextVariable cxl_SelectedRecord = null;
	}

	public final class ContextMenus implements java.io.Serializable
	{
		private static final long serialVersionUID = 1L;
		public final class LIP implements java.io.Serializable
		{
			private static final long serialVersionUID = 1L;
			public static final int New = 1;
			public static final int Update = 2;
		}
		public void disableAllLIPMenuItems()
		{
			this.contextMenuLIPNewItem.setEnabled(false);
			this.contextMenuLIPUpdateItem.setEnabled(false);
		}
		public void hideAllLIPMenuItems()
		{
			this.contextMenuLIPNewItem.setVisible(false);
			this.contextMenuLIPUpdateItem.setVisible(false);
		}
		private Menu contextMenuLIP;
		public MenuItem getLIPNewItem()
		{
			return this.contextMenuLIPNewItem;
		}
		private MenuItem contextMenuLIPNewItem;
		public MenuItem getLIPUpdateItem()
		{
			return this.contextMenuLIPUpdateItem;
		}
		private MenuItem contextMenuLIPUpdateItem;
	}

	private ContextMenus contextMenus;
	public ContextMenus getContextMenus()
	{
		return this.contextMenus;
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
			IReportField[] fields = new IReportField[76];
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
			fields[71] = new ims.framework.ReportField(this.context, prefix + "_lv_Admin.ScreenHints.__internal_x_context__SelectedRecord_" + componentIdentifier, "BO-1002100008-ID", "ID_ScreenHint");
			fields[72] = new ims.framework.ReportField(this.context, prefix + "_lv_Admin.ScreenHints.__internal_x_context__SelectedRecord_" + componentIdentifier, "BO-1002100008-IMSID", "ImsId");
			fields[73] = new ims.framework.ReportField(this.context, prefix + "_lv_Admin.ScreenHints.__internal_x_context__SelectedRecord_" + componentIdentifier, "BO-1002100008-FORMID", "FormId");
			fields[74] = new ims.framework.ReportField(this.context, prefix + "_lv_Admin.ScreenHints.__internal_x_context__SelectedRecord_" + componentIdentifier, "BO-1002100008-USAGEDESCRIPTION", "UsageDescription");
			fields[75] = new ims.framework.ReportField(this.context, prefix + "_lv_Admin.ScreenHints.__internal_x_context__SelectedRecord_" + componentIdentifier, "BO-1002100008-USERHINTTEXT", "UserHintText");
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
	private IReportField[] reportFields = null;
}
