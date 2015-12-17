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

package ims.spinalinjuries.forms.medmskspineexamfindingsdialog;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.domain.DomainInterface.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.domain.DomainInterface domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbFindingTypeValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbFindingType().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.spinalinjuries.vo.lookups.SpineExaminationFinding existingInstance = (ims.spinalinjuries.vo.lookups.SpineExaminationFinding)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbFindingTypeLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.spinalinjuries.vo.lookups.SpineExaminationFinding)
		{
			ims.spinalinjuries.vo.lookups.SpineExaminationFinding instance = (ims.spinalinjuries.vo.lookups.SpineExaminationFinding)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbFindingTypeLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.spinalinjuries.vo.lookups.SpineExaminationFinding existingInstance = (ims.spinalinjuries.vo.lookups.SpineExaminationFinding)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbFindingType().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbFindingTypeLookup()
	{
		this.form.cmbFindingType().clear();
		ims.spinalinjuries.vo.lookups.SpineExaminationFindingCollection lookupCollection = ims.spinalinjuries.vo.lookups.LookupHelper.getSpineExaminationFinding(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbFindingType().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbFindingTypeLookupValue(int id)
	{
		ims.spinalinjuries.vo.lookups.SpineExaminationFinding instance = ims.spinalinjuries.vo.lookups.LookupHelper.getSpineExaminationFindingInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbFindingType().setValue(instance);
	}
	protected final void defaultcmbFindingTypeLookupValue()
	{
		this.form.cmbFindingType().setValue((ims.spinalinjuries.vo.lookups.SpineExaminationFinding)domain.getLookupService().getDefaultInstance(ims.spinalinjuries.vo.lookups.SpineExaminationFinding.class, engine.getFormName().getID(), ims.spinalinjuries.vo.lookups.SpineExaminationFinding.TYPE_ID));
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.domain.DomainInterface domain;
}