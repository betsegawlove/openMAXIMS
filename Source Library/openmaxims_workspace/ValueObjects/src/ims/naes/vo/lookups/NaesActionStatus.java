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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5589.25814)
// Copyright (C) 1995-2015 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.naes.vo.lookups;

import ims.framework.cn.data.TreeNode;
import java.util.ArrayList;
import ims.framework.utils.Image;
import ims.framework.utils.Color;

public class NaesActionStatus extends ims.vo.LookupInstVo implements TreeNode
{
	private static final long serialVersionUID = 1L;

	public NaesActionStatus()
	{
		super();
	}
	public NaesActionStatus(int id)
	{
		super(id, "", true);
	}
	public NaesActionStatus(int id, String text, boolean active)
	{
		super(id, text, active, null, null, null);
	}
	public NaesActionStatus(int id, String text, boolean active, NaesActionStatus parent, Image image)
	{
		super(id, text, active, parent, image);
	}
	public NaesActionStatus(int id, String text, boolean active, NaesActionStatus parent, Image image, Color color)
	{
		super(id, text, active, parent, image, color);
	}
	public NaesActionStatus(int id, String text, boolean active, NaesActionStatus parent, Image image, Color color, int order)
	{
		super(id, text, active, parent, image, color, order);
	}
	public static NaesActionStatus buildLookup(ims.vo.LookupInstanceBean bean)
	{
		return new NaesActionStatus(bean.getId(), bean.getText(), bean.isActive());
	}
	public String toString()
	{
		if(getText() != null)
			return getText();
		return "";
	}
	public TreeNode getParentNode()
	{
		return (NaesActionStatus)super.getParentInstance();
	}
	public NaesActionStatus getParent()
	{
		return (NaesActionStatus)super.getParentInstance();
	}
	public void setParent(NaesActionStatus parent)
	{
		super.setParentInstance(parent);
	}
	public TreeNode[] getChildren()
	{
		ArrayList children = super.getChildInstances();
		NaesActionStatus[] typedChildren = new NaesActionStatus[children.size()];
		for (int i = 0; i < children.size(); i++)
		{
			typedChildren[i] = (NaesActionStatus)children.get(i);
		}
		return typedChildren;
	}
	public int addChild(TreeNode child)
	{
		if (child instanceof NaesActionStatus)
		{
			super.addChild((NaesActionStatus)child);
		}
		return super.getChildInstances().size();
	}
	public int removeChild(TreeNode child)
	{
		if (child instanceof NaesActionStatus)
		{
			super.removeChild((NaesActionStatus)child);
		}
		return super.getChildInstances().size();
	}
	public Image getExpandedImage()
	{
		return super.getImage();
	}
	public Image getCollapsedImage()
	{
		return super.getImage();
	}
	public static ims.framework.IItemCollection getNegativeInstancesAsIItemCollection()
	{
		NaesActionStatusCollection result = new NaesActionStatusCollection();
		result.add(OUTSTANDING);
		result.add(COMPLETED);
		return result;
	}
	public static NaesActionStatus[] getNegativeInstances()
	{
		NaesActionStatus[] instances = new NaesActionStatus[2];
		instances[0] = OUTSTANDING;
		instances[1] = COMPLETED;
		return instances;
	}
	public static String[] getNegativeInstanceNames()
	{
		String[] negativeInstances = new String[2];
		negativeInstances[0] = "OUTSTANDING";
		negativeInstances[1] = "COMPLETED";
		return negativeInstances;
	}
	public static NaesActionStatus getNegativeInstance(String name)
	{
		if(name == null)
			return null;
		String[] negativeInstances = getNegativeInstanceNames();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].equals(name))
				return getNegativeInstances()[i];
		}
		return null;
	}
	public static NaesActionStatus getNegativeInstance(Integer id)
	{
		if(id == null)
			return null;
		NaesActionStatus[] negativeInstances = getNegativeInstances();
		for (int i = 0; i < negativeInstances.length; i++)
		{
			if(negativeInstances[i].getID() == id)
				return negativeInstances[i];
		}
		return null;
	}
	public int getTypeId()
	{
		return TYPE_ID;
	}
	public static final int TYPE_ID = 1351001;
	public static final NaesActionStatus OUTSTANDING = new NaesActionStatus(-1586, "Outstanding", true, null, null, Color.Default);
	public static final NaesActionStatus COMPLETED = new NaesActionStatus(-1587, "Completed", true, null, null, Color.Default);
}