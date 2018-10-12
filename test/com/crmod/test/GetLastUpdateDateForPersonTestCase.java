/*
package com.crmod.test;

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


import com.crmod.ws.stubs.person.Conjunction;
import com.crmod.ws.stubs.person.FindControl;
import com.crmod.ws.stubs.person.FindCriteria;
import com.crmod.ws.stubs.person.PersonResult;
import com.crmod.ws.stubs.person.SortAttribute;
import com.crmod.ws.stubs.person.SortOrder;
import com.crmod.ws.stubs.person.ViewCriteria;
import com.crmod.ws.stubs.person.ViewCriteriaItem;
import com.crmod.ws.stubs.person.ViewCriteriaRow;
import com.crmod.ws.stubs.person.Person;
import com.crmod.ws.stubs.person.PersonService;
import com.crmod.ws.stubs.person.PersonService_Service;
import com.fusion.util.PersonLastUpdateDateCalculateUtil;

public class GetLastUpdateDateForPersonTestCase {

	private Logger log = Logger.getLogger(GetLastUpdateDateForPersonTestCase.class);
	
	@Test
	public void doitMain() throws Exception {
			try {
				//Aaron Carnegie Brown
				
				String partyID="300000004983761";
				
				PropFileUtil.load();
				
				
				PersonService_Service service = new PersonService_Service();
				PersonService publicService = service.getPersonServiceSoapHttpPort();
				setWSBindingProvider(publicService
						,PropFileUtil.getValue(Constants.FCRMOD_PERSON_URL)
						);
				
				FindCriteria findCriteria = new FindCriteria();
			    findCriteria.setFetchSize(100);
			    findCriteria.setFetchStart(0);
				   
				
			
				ViewCriteria viewCriteria_Root = new ViewCriteria();
				ViewCriteriaRow viewCriteriaRow_Root = new ViewCriteriaRow();			

				
				
				  //PartyType
                ViewCriteriaItem viewCriteriaItem_PartyType = new ViewCriteriaItem();
                viewCriteriaItem_PartyType.setConjunction(Conjunction.AND);
                viewCriteriaItem_PartyType.setUpperCaseCompare(false);
                viewCriteriaItem_PartyType.setAttribute("PartyId");
                viewCriteriaItem_PartyType.setOperator("=");
                viewCriteriaItem_PartyType.getValue().add(partyID);
                //>>>>add to root
                viewCriteriaRow_Root.getItem().add(viewCriteriaItem_PartyType);
                //PartyType
                ArrayList<String> findAttributeList = new ArrayList<String>();
                findAttributeList.add("PartyId");
                findAttributeList.add("PartyName");
                
                PersonLastUpdateDateCalculateUtil.appendRequiredAttributes(findAttributeList);
                
                
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
				
				findCriteria.getFindAttribute().addAll(findAttributeList);
				
				findControl.setRetrieveAllTranslations(true);

				try {
					PersonResult personList = publicService
							.findPerson(findCriteria, findControl);

					if(personList!=null)
					{
						Person p = personList.getValue().get(0);
						
						PersonLastUpdateDateCalculateUtil.getAccurateLastUpdateDate(p);
					}
					
				}
				 catch (Exception e) {
					
					throw new FCRMODException(e);
				}
				 
			} catch (Exception e) {
				throw e;
			}
	}
	
	
	public void setWSBindingProvider(Object publicService, String endPointAddress) {
		 BindingProvider wsbp = (BindingProvider)publicService;
	     Map<String, Object> reqContext = ((BindingProvider) wsbp).getRequestContext();
	     log.info("Got the end point address : " + endPointAddress);
	     reqContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endPointAddress);
	     
	     String crmuser=PropFileUtil.getValue(Constants.FCRMOD_USERNAME);
	     String crmpwd=PropFileUtil.getValue(Constants.FCRMOD_PASSWORD);
	     System.out.println(crmuser);
	     System.out.println(crmpwd);
	     //System.out.println("crmuser:"+crmuser);
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