// This code was generated by Peter Martin using IMS Development Environment (version 1.70 build 3547.20232)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.RefMan.forms.diagnosisandmanagementcomponent;

import java.io.Serializable;

public final class AccessLogic extends BaseAccessLogic implements Serializable
{
	private static final long serialVersionUID = 1L;

	public boolean isAccessible()
	{
		if(!super.isAccessible())
			return false;

		// TODO: Add your conditions here.
		return true;
	}
	public boolean isReadOnly()
	{
		if(super.isReadOnly())
			return true;

		// TODO: Add your conditions here.
		return false;
	}
}