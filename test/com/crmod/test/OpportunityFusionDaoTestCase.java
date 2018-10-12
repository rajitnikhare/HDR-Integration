/*package com.crmod.test;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crmod.exception.FCRMODException;
import com.crmod.mail.MailManager;
import com.crmod.model.BaseObject;
import com.crmod.service.AgentServc;
import com.crmod.service.LocationServc;
import com.crmod.service.OpportunityServc;
import com.crmod.sync.SyncObject;
import com.crmod.util.Constants;
import com.crmod.util.PropFileUtil;
import com.crmod.util.SOAPLoggingHandler;
import com.crmod.ws.stubs.opportunity.FindControl;
import com.crmod.ws.stubs.opportunity.FindCriteria;
import com.crmod.ws.stubs.opportunity.Opportunity;
import com.crmod.ws.stubs.opportunity.OpportunityService;
import com.crmod.ws.stubs.opportunity.OpportunityService_Service;
import com.crmod.ws.stubs.opportunity.ServiceException;
import com.crmod.ws.stubs.opportunity.SortAttribute;
import com.crmod.ws.stubs.opportunity.SortOrder;
import com.crmod.ws.stubs.opportunity.ViewCriteria;
import com.crmod.ws.stubs.opportunity.ViewCriteriaItem;
import com.crmod.ws.stubs.opportunity.ViewCriteriaRow;
import com.crmod.ws.stubs.salescustomobject.Conjunction;
import com.crmod.ws.stubs.salesparty.SalesParty;
import com.crmod.ws.stubs.salesparty.SalesPartyService;
import com.crmod.ws.stubs.salesparty.SalesPartyService_Service;

import com.fusion.util.OpportunityFusionUtil;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/META-INF/spring/applicationContext.xml","classpath:/META-INF/spring/app-datasource-config.xml","classpath:/META-INF/spring/app-mail.xml"})

public class OpportunityFusionDaoTestCase {

	private Logger log = Logger.getLogger(OpportunityFusionDaoTestCase.class);
	
	@Resource
	private SyncObject syncObject;
	
	@Resource
	MailManager mailManager;

	
	@Resource
	AgentServc agentServc;
	
	@Resource
	LocationServc locationServc;
	
	@Resource
	OpportunityServc opportunityServc;
	
	@Test 
	public void getAllPendingFromFusion() throws ServiceException {
				log.debug(">>query");
				OpportunityService_Service service = new OpportunityService_Service();
				OpportunityService publicService = service.getOpportunityServiceSoapHttpPort();
				setWSBindingProvider(publicService
						,PropFileUtil.getValue(Constants.FCRMOD_OPPORTUNITY_URL)
						);
				
				FindCriteria findCriteria = new FindCriteria();
			    findCriteria.setFetchSize(100);
			    findCriteria.setFetchStart(0);
			
			    
			    ArrayList<String> findAttributeList=new ArrayList<String>();
			    findAttributeList.add("OptyId");
			    findAttributeList.add("DreesOwnerID_c");
			    findAttributeList.add("BudgetAvailableDate");
			    findAttributeList.add("Rank_c");
			    findAttributeList.add("SalesStageId");
			    
			    findAttributeList.add("PrimaryFinalfloorplancode_c");
			    findAttributeList.add("PrimaryFinalElevationcode_c");
			    findAttributeList.add("PrimaryFinalneigbourhoodcode_c");
			    findAttributeList.add("PrimaryDivisionCode_c");
			    
			    findAttributeList.add("MarketManagerLeadSource_c");
			    findAttributeList.add("OwnerResourcePartyId");
			    
			    
			    findAttributeList.add("PrimaryContactPartyId");
			    findAttributeList.add("OpportunityContact");
			    //findAttributeList.add("JDEJobIdRO_c");
			    findAttributeList.add("LastUpdateDate");
			    
			    
			    

			  
			    findCriteria.getFindAttribute().addAll(findAttributeList);
			    
			    ViewCriteria viewCriteria_Root = new ViewCriteria();
			    ViewCriteriaRow viewCriteriaRow_Root = new ViewCriteriaRow();

			    //NOTE: JUST FOR TESTING DOWNLOADING ANY PARTICULAR OPPORTUNITY
			    ViewCriteriaItem viewCriteriaItem_Name = new ViewCriteriaItem();
			    viewCriteriaItem_Name.setAttribute("Name");
			    viewCriteriaItem_Name.setOperator("=");
			    viewCriteriaItem_Name.getValue().add("Test Opp by Romesh May22-1");
			    viewCriteriaRow_Root.getItem().add(viewCriteriaItem_Name);
			       
			    //last update
				    ViewCriteriaItem viewCriteriaItem_LastUpdateDate = new ViewCriteriaItem();
				    viewCriteriaItem_LastUpdateDate.setAttribute("LastUpdateDate");
				    viewCriteriaItem_LastUpdateDate.setOperator("AFTER");
				    viewCriteriaItem_LastUpdateDate.getValue().add("2013-05-17T11:48:09.036");
				    viewCriteriaRow_Root.getItem().add(viewCriteriaItem_LastUpdateDate);
			    
			    viewCriteria_Root.getGroup().add(viewCriteriaRow_Root);
			       
			    findCriteria.setFilter(viewCriteria_Root);

			    //sorting order
			    SortAttribute so = new SortAttribute();
				so.setDescending(false);
				so.setName("LastUpdateDate");
				SortOrder s = new SortOrder();
				s.getSortAttribute().add(so);
				findCriteria.setSortOrder(s);

			    findCriteria.setExcludeAttribute(false);
			       
			    FindControl findControl = new FindControl();
			    findControl.setRetrieveAllTranslations(true);
			   
				try {
					List<Opportunity>  lst = publicService
						.findOpportunity(findCriteria, findControl);
					ArrayList<com.crmod.model.Opportunity>  lstStageResults=
					  OpportunityFusionUtil
					  .populateOpportunityListFromFusionOpportunityList(lst, agentServc, locationServc, mailManager, syncObject, opportunityServc);
					
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
					//throw new FCRMODException(e);
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