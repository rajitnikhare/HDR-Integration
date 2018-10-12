package com.hdr.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hdr.model.BaseObject;
import com.hdr.service.SalerPartyServ;
import com.serene.pdms.ws.stubs.company.Conjunction;
import com.serene.pdms.ws.stubs.company.FindControl;
import com.serene.pdms.ws.stubs.company.FindCriteria;
import com.serene.pdms.ws.stubs.company.SalesParty;
import com.serene.pdms.ws.stubs.company.SalesPartyService;
import com.serene.pdms.ws.stubs.company.SalesPartyService_Service;
import com.serene.pdms.ws.stubs.company.ViewCriteria;
import com.serene.pdms.ws.stubs.company.ViewCriteriaItem;
import com.serene.pdms.ws.stubs.company.ViewCriteriaRow;

@Service
public class SalesPaertyServImpl extends AbstractFCRMODWebService implements SalerPartyServ {
	
	private static final Logger log = Logger.getLogger(SalesPaertyServImpl.class);
	
	@Override
	public List<SalesParty> find(Object o) throws Exception {
		try {

			
			BaseObject bo = (BaseObject) o;
			SalesPartyService_Service service = new SalesPartyService_Service();
			SalesPartyService publicService = service.getSalesPartyServiceSoapHttpPort();
			setWSBindingProvider(publicService, "https://caye-test.crm.us2.oraclecloud.com:443/crmCommonSalesParties/SalesPartyService?WSDL");
			ViewCriteria criteria = null;
			if(bo.getViewCriteriaAttributeName()!=null){
				ViewCriteriaItem criteriaItem = new ViewCriteriaItem();
				criteriaItem.setAttribute(bo.getViewCriteriaAttributeName());
				criteriaItem.setOperator(bo.getOperator());
				criteriaItem.getValue().add(bo.getViewCriteriaAttributeValue());
				criteriaItem.setConjunction(Conjunction.AND);
				
				ViewCriteriaRow criteriaRow = new ViewCriteriaRow();
				criteriaRow.setConjunction(Conjunction.AND);
				criteriaRow.getItem().add(criteriaItem);
				
				
				criteria = new ViewCriteria();
				criteria.setConjunction(Conjunction.AND);
				criteria.getGroup().add(criteriaRow);
			}
				
			FindCriteria fCriteria = new FindCriteria();
			FindControl fControl = new FindControl();
			
			
			fCriteria.setFetchSize(bo.getFetchSize());
			fCriteria.setFetchStart(bo.getFetchStart());
			if(criteria!=null)fCriteria.setFilter(criteria);
			
			if(bo.getListOfAttribute()!=null && bo.getListOfAttribute().size()>0)fCriteria.getFindAttribute().addAll(bo.getListOfAttribute());
			List<SalesParty> output = publicService.findSalesParty(fCriteria, fControl);
			if(output!=null && output.size()>0){
				return output;
			}
			
			
			return null;
		
		} catch (Exception e) {
			throw e;
		}
	}

}
