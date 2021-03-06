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
// This code was generated by Catalin Tomozei using IMS Development Environment (version 1.71 build 3631.21133)
// Copyright (C) 1995-2009 IMS MAXIMS. All rights reserved.

package ims.RefMan.domain.impl;

import java.util.ArrayList;
import java.util.List;
import ims.RefMan.domain.base.impl.BaseLinkReportNoteToTemplateImpl;
import ims.RefMan.domain.objects.ReportNotePrintTemplate;
import ims.RefMan.vo.ReportNotePrintTemplateVo;
import ims.RefMan.vo.ReportNotePrintTemplateVoCollection;
import ims.RefMan.vo.domain.ReportNotePrintTemplateVoAssembler;
import ims.RefMan.vo.lookups.ReportNoteType;
import ims.domain.DomainFactory;
import ims.domain.exceptions.ForeignKeyViolationException;
import ims.domain.exceptions.StaleObjectException;
import ims.framework.enumerations.SortOrder;
import ims.framework.exceptions.CodingRuntimeException;

public class LinkReportNoteToTemplateImpl extends BaseLinkReportNoteToTemplateImpl
{

	private static final long serialVersionUID = 1L;
			
	public ReportNotePrintTemplateVo getReportNotePrintTemplateByType(ReportNoteType type)
	{
		if(type == null) {
			throw new CodingRuntimeException("ReportNoteType is null");
		}
		
		DomainFactory factory = getDomainFactory();
		StringBuffer hql = new StringBuffer("select rnpt from ReportNotePrintTemplate as rnpt left join rnpt.noteType as type ");
		
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		hql.append("  where type.id = :idType");
		names.add("idType");
		values.add(type.getId());	
				
		List result = factory.find(hql.toString(),names,values);
		
		if (result != null && result.size() > 0) {
			ReportNotePrintTemplateVoCollection voColl = ReportNotePrintTemplateVoAssembler.createReportNotePrintTemplateVoCollectionFromReportNotePrintTemplate(result);
			if(voColl != null && voColl.size() > 0) 
			{
				voColl.sort(SortOrder.DESCENDING);
				return voColl.get(0);
			}
		}
		
		return null;
	}

	public ReportNotePrintTemplateVo save(ReportNotePrintTemplateVo report) throws StaleObjectException 
	{
		if(report == null) {
			throw new CodingRuntimeException("ReportNotePrintTemplateVo is null");
		}	
		
		DomainFactory factory = getDomainFactory();
		ReportNotePrintTemplate dom = ReportNotePrintTemplateVoAssembler.extractReportNotePrintTemplate(factory, report);
		factory.save(dom);
		
		return ReportNotePrintTemplateVoAssembler.create(dom);
	}
	
	public void removeLink(ReportNotePrintTemplateVo report) throws StaleObjectException, ForeignKeyViolationException 
	{
		if(report == null) {
			throw new CodingRuntimeException("ReportNotePrintTemplateVo is null");
		}	
		
		DomainFactory factory = getDomainFactory();
		ReportNotePrintTemplate dom = ReportNotePrintTemplateVoAssembler.extractReportNotePrintTemplate(factory, report);
		factory.delete(dom);				
	}	
}
