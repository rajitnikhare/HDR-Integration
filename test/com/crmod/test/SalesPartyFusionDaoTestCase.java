/*package com.crmod.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import org.jboss.logging.Logger;
import org.junit.Test;

import com.crmod.exception.FCRMODException;
import com.crmod.model.Agency;
import com.crmod.model.Agent;
import com.crmod.model.BaseObject;
import com.crmod.model.FloorPlanElevation;
import com.crmod.service.impl.FloorPlanElevationDao;
import com.crmod.util.Constants;
import com.crmod.util.PropFileUtil;
import com.crmod.util.SOAPLoggingHandler;
import com.crmod.ws.stubs.salesparty.FindSalesParty;
import com.crmod.ws.stubs.salesparty.OrganizationProfile;
import com.crmod.ws.stubs.salesparty.Conjunction;
import com.crmod.ws.stubs.salesparty.FindControl;
import com.crmod.ws.stubs.salesparty.FindCriteria;
import com.crmod.ws.stubs.salesparty.ObjectFactory;
import com.crmod.ws.stubs.salesparty.OrganizationParty;
import com.crmod.ws.stubs.salesparty.PersonResult;
import com.crmod.ws.stubs.salesparty.ServiceException;
import com.crmod.ws.stubs.salesparty.SortAttribute;
import com.crmod.ws.stubs.salesparty.SortOrder;
import com.crmod.ws.stubs.salesparty.ViewCriteria;
import com.crmod.ws.stubs.salesparty.ViewCriteriaItem;
import com.crmod.ws.stubs.salesparty.ViewCriteriaRow;
import com.crmod.ws.stubs.salesparty.SalesParty;
import com.crmod.ws.stubs.salesparty.SalesPartyService;
import com.crmod.ws.stubs.salesparty.SalesPartyService_Service;
import com.fusion.util.PersonFusionUtil;


public class SalesPartyFusionDaoTestCase {

	private Logger log = Logger.getLogger(SalesPartyFusionDaoTestCase.class);
	
	
	@Test 
	public void getAllPending() throws ServiceException {
			try {
				
				
				log.debug(">>query");
				SalesPartyService_Service service = new SalesPartyService_Service();
				SalesPartyService publicService = service.getSalesPartyServiceSoapHttpPort();
				setWSBindingProvider(publicService
						,PropFileUtil.getValue(Constants.FCRMOD_SALESPARTY_URL)
						);
				
				FindCriteria findCriteria = new FindCriteria();
			    findCriteria.setFetchSize(100);
			    findCriteria.setFetchStart(0);
				   
				log.debug("Applying filter");
			
				ViewCriteria viewCriteria_Root = new ViewCriteria();
				ViewCriteriaRow viewCriteriaRow_Root = new ViewCriteriaRow();			

				
				
				  //PartyType
                ViewCriteriaItem viewCriteriaItem_PartyType = new ViewCriteriaItem();
                viewCriteriaItem_PartyType.setConjunction(Conjunction.AND);
                viewCriteriaItem_PartyType.setUpperCaseCompare(false);
                viewCriteriaItem_PartyType.setAttribute("PartyType");
                viewCriteriaItem_PartyType.setOperator("=");
                viewCriteriaItem_PartyType.getValue().add("ORGANIZATION");
                //>>>>add to root
                viewCriteriaRow_Root.getItem().add(viewCriteriaItem_PartyType);
                //PartyType
                
                //OrganizationParty
                ViewCriteriaItem viewCriteriaItem_OrganizationParty = new ViewCriteriaItem();
                viewCriteriaItem_OrganizationParty.setConjunction(Conjunction.AND);
                viewCriteriaItem_OrganizationParty.setAttribute("OrganizationParty");
                viewCriteriaItem_OrganizationParty.setOperator("EXISTS");
                ViewCriteriaRow viewCriteriaRow_OrganizationParty = new ViewCriteriaRow();
                viewCriteriaRow_OrganizationParty.getItem().add(viewCriteriaItem_OrganizationParty);
                
                
                //Last Modified date for Organization Party
                ViewCriteria viewCriteriaLastUpdateDate = new ViewCriteria();
                ViewCriteriaRow viewCriteriaLastUpdateDaterow = new ViewCriteriaRow();
                ViewCriteriaItem viewCriteriaItem_4 = new ViewCriteriaItem();
                viewCriteriaItem_4.setConjunction(Conjunction.AND);
                viewCriteriaItem_4.setUpperCaseCompare(false);
                viewCriteriaItem_4.setAttribute("LastUpdateDate");
                viewCriteriaItem_4.setOperator("AFTER");
                viewCriteriaItem_4.getValue().add("2013-05-17T11:48:09.036");
                viewCriteriaLastUpdateDaterow.getItem().add(viewCriteriaItem_4);
             
                //OrganizationProfile
                ViewCriteria viewCriteria_OrganizationProfile = new ViewCriteria();
                ViewCriteriaItem viewCriteriaItem_OrganizationProfile = new ViewCriteriaItem();
                viewCriteriaItem_OrganizationProfile.setConjunction(Conjunction.AND);
                viewCriteriaItem_OrganizationProfile.setAttribute("OrganizationProfile");
                viewCriteriaItem_OrganizationProfile.setOperator("EXISTS");
                ViewCriteriaRow viewCriteriaRow_OrganizationProfile = new ViewCriteriaRow();
                viewCriteriaRow_OrganizationProfile.getItem().add(viewCriteriaItem_OrganizationProfile);
                
                
                viewCriteriaRow_OrganizationProfile.getItem().add(viewCriteriaItem_4);

                ViewCriteriaItem viewCriteriaItem_AccountTypeC = new ViewCriteriaItem();
                viewCriteriaItem_AccountTypeC.setConjunction(Conjunction.AND);
                viewCriteriaItem_AccountTypeC.setAttribute("AccountType_c");
                viewCriteriaItem_AccountTypeC.setOperator("=");
                viewCriteriaItem_AccountTypeC.getValue().add("Real Estate Agency");
                ViewCriteriaRow viewCriteriaRow2 = new ViewCriteriaRow();
                viewCriteriaRow2.getItem().add(viewCriteriaItem_AccountTypeC);
                ViewCriteria viewCriteria_AccountTypec = new ViewCriteria();
                viewCriteria_AccountTypec.getGroup().add(viewCriteriaRow2);
                viewCriteriaItem_OrganizationProfile.setNested(viewCriteria_AccountTypec);
                
                
                viewCriteria_OrganizationProfile.getGroup().add(viewCriteriaRow_OrganizationProfile);
                
                
                
                
                
                viewCriteriaItem_OrganizationParty.setNested(viewCriteria_OrganizationProfile);
                
                
                viewCriteriaRow_Root.getItem().add(viewCriteriaItem_OrganizationParty);

                
				viewCriteria_Root.getGroup().add(viewCriteriaRow_Root);
				
                //finally add the filter
                findCriteria.setFilter(viewCriteria_Root);

                sort order
        		SortAttribute so = new SortAttribute();
        		so.setDescending(false);
        		so.setName("LastUpdateDate");
        		SortOrder s = new SortOrder();
        		s.getSortAttribute().add(so);
        		findCriteria.setSortOrder(s);
        	    sort order
				
				findCriteria.setExcludeAttribute(false);
				FindControl findControl = new FindControl();
				findControl.setRetrieveAllTranslations(true);

				try {
					List<SalesParty>  lst = publicService
						.findSalesParty(findCriteria, findControl);
					ArrayList<Agency>  lstStageResults=
					  SalesPartyFusionUtil.populateAgencyListFromFusionSalesPartyList(lst);
					
					if(lstStageResults!=null&&lstStageResults.size()>0)
					{
						log.debug("total results found:"+lstStageResults.size());
						//return (ArrayList<T>) lstStageResults;
					}
					else
					{
						log.debug("No records found..");
						//return null;
					}
					
				}
				 catch (Exception e) {
					log.error("Error while query fusion ", e);
					throw new FCRMODException(e);
				}
				 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	
	public void setWSBindingProvider(Object publicService, String endPointAddress) {
		 BindingProvider wsbp = (BindingProvider)publicService;
	     Map<String, Object> reqContext = ((BindingProvider) wsbp).getRequestContext();
	     log.info("Got the end point address : " + endPointAddress);
	     reqContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endPointAddress);
	     
	     String crmuser=PropFileUtil.getValue(Constants.FCRMOD_USERNAME);
	     String crmpwd=PropFileUtil.getValue(Constants.FCRMOD_PASSWORD);
	     //log.debug("crmuser:"+crmuser);
	     //PropFileUtil.getValue(Constants.FCRMOD_PASSWORD);
	     
	     reqContext.put(BindingProvider.USERNAME_PROPERTY, crmuser);
	     reqContext.put(BindingProvider.PASSWORD_PROPERTY, crmpwd);
	     
	     List handlerList = wsbp.getBinding().getHandlerChain();
		 if (handlerList == null)
			handlerList = new ArrayList();
			SOAPLoggingHandler loggingHandler = new SOAPLoggingHandler();
			handlerList.add(loggingHandler);
			wsbp.getBinding().setHandlerChain(handlerList);
	}
}
*/