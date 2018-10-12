/*package com.crmod.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import org.jboss.logging.Logger;
import org.junit.Test;

import com.crmod.exception.FCRMODException;
import com.crmod.model.FloorPlanElevation;
import com.crmod.service.impl.ActivityDao;
import com.crmod.service.impl.EmailTemplateDao;
import com.crmod.service.impl.FloorPlanElevationDao;
import com.crmod.util.Constants;
import com.crmod.util.PropFileUtil;
import com.crmod.util.SOAPLoggingHandler;
import com.crmod.ws.stubs.person.ChildFindCriteria;
import com.crmod.ws.stubs.person.Conjunction;
import com.crmod.ws.stubs.person.FindControl;
import com.crmod.ws.stubs.person.FindCriteria;
import com.crmod.ws.stubs.person.PersonResult;
import com.crmod.ws.stubs.person.PersonService;
import com.crmod.ws.stubs.person.PersonService_Service;
import com.crmod.ws.stubs.person.ServiceException;
import com.crmod.ws.stubs.person.ViewCriteria;
import com.crmod.ws.stubs.person.ViewCriteriaItem;
import com.crmod.ws.stubs.person.ViewCriteriaRow;
import com.crmod.ws.stubs.salescustomobject.EmailTemplatesC;

public class FusionDaoTestCase {

	private FloorPlanElevationDao floorPlanElevationDao = new FloorPlanElevationDao();
	
	private EmailTemplateDao emailTemplateDao = new EmailTemplateDao();
	
	private Logger log = Logger.getLogger(FusionDaoTestCase.class);
	
	private ActivityDao activityDao = new ActivityDao();
	
	@Test
	public void getUniqueFloorPlan() throws FCRMODException{
		FloorPlanElevation floorPlanElevation =  floorPlanElevationDao.getUniqueFloorPlan_WithRetry("ABG", "NHVI", "B");
		log.info(floorPlanElevation);
	}
	
	@Test
	public void emailTemplateDao() throws FCRMODException{
		EmailTemplatesC emailTemplatesC =  emailTemplateDao.getEmailTemplateByType_WithRetry("OSC");
		String emailBody = new String(emailTemplatesC.getEmailBodyC().getValue());
		log.debug(emailBody);
	}
	
	@Test 
	public void testNestedQuery() throws ServiceException {
			try {
				log.debug(">>query");
				PersonService_Service service = new PersonService_Service();
				PersonService publicService = service.getPersonServiceSoapHttpPort();
				setWSBindingProvider(publicService,PropFileUtil.getValue(Constants.FCRMOD_PERSON_URL));
				
				FindCriteria findCriteria = new FindCriteria();
				findCriteria.setFetchSize(1);
				findCriteria.setFetchStart(0);
				   
				log.debug("Applying filter");
				
				ViewCriteriaItem viewCriteriaItem = new ViewCriteriaItem();
				viewCriteriaItem.setConjunction(Conjunction.AND);
				viewCriteriaItem.setAttribute("Phone");
				viewCriteriaItem.setOperator("EXISTS");
				ViewCriteriaRow viewCriteriaRow = new ViewCriteriaRow();
				viewCriteriaRow.getItem().add(viewCriteriaItem);
				ViewCriteria viewCriteria = new ViewCriteria();
				
				viewCriteria.getGroup().add(viewCriteriaRow);

				ViewCriteriaItem viewCriteriaItem2 = new ViewCriteriaItem();
				viewCriteriaItem2.setAttribute("PhoneLineType");
				viewCriteriaItem2.setOperator("=");
				viewCriteriaItem2.getValue().add("FAX");
				ViewCriteriaRow viewCriteriaRow2 = new ViewCriteriaRow();
				viewCriteriaRow2.getItem().add(viewCriteriaItem2);
				
				ViewCriteria viewCriteria2 = new ViewCriteria();
				viewCriteria2.getGroup().add(viewCriteriaRow2);

				viewCriteriaItem.setNested(viewCriteria2);
				//viewCriteria2.getGroup().add(viewCriteriaRow2);
				
				findCriteria.setFilter(viewCriteria);
				findCriteria.setExcludeAttribute(false);
				FindControl findControl = new FindControl();
				findControl.setRetrieveAllTranslations(true);
				PersonResult personList = publicService.findPerson(findCriteria, findControl);
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
	
	@Test 
	public void testChildQuery() throws ServiceException {
			try {
				log.debug(">>query");
				PersonService_Service service = new PersonService_Service();
				PersonService publicService = service.getPersonServiceSoapHttpPort();
				setWSBindingProvider(publicService,PropFileUtil.getValue(Constants.FCRMOD_ACTIVITY_URL,Constants.FCRMOD_ACTIVITY_DEFAULT_URL));
				
				FindCriteria findCriteria = new FindCriteria();
				findCriteria.setFetchSize(0);
				findCriteria.setFetchStart(1);
				   
				log.debug("Applying filter");
				
				ViewCriteriaItem viewCriteriaItem = new ViewCriteriaItem();
				viewCriteriaItem.setConjunction(Conjunction.AND);
				viewCriteriaItem.setAttribute("Phone");
				viewCriteriaItem.setOperator("EXISTS");
				ViewCriteriaRow viewCriteriaRow = new ViewCriteriaRow();
				viewCriteriaRow.getItem().add(viewCriteriaItem);
				ViewCriteria viewCriteria = new ViewCriteria();
				
				viewCriteria.getGroup().add(viewCriteriaRow);

				ViewCriteriaItem viewCriteriaItem2 = new ViewCriteriaItem();
				viewCriteriaItem2.setAttribute("PhoneLineType");
				viewCriteriaItem2.setOperator("=");
				viewCriteriaItem2.getValue().add("FAX");
				ViewCriteriaRow viewCriteriaRow2 = new ViewCriteriaRow();
				viewCriteriaRow2.getItem().add(viewCriteriaItem2);
				
				ViewCriteria viewCriteria2 = new ViewCriteria();
				viewCriteria2.getGroup().add(viewCriteriaRow2);

				ChildFindCriteria childFilter = new ChildFindCriteria();
				//viewCriteriaItem.setNested(viewCriteria2);
				//viewCriteria2.getGroup().add(viewCriteriaRow2);
				findCriteria.getChildFindCriteria().add(childFilter);
				findCriteria.setFilter(viewCriteria);
				findCriteria.setExcludeAttribute(false);
				FindControl findControl = new FindControl();
				findControl.setRetrieveAllTranslations(true);
				PersonResult personList = publicService.findPerson(findCriteria, findControl);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Test
	public void getTaskByName() throws Exception{
		String name = "<fetchStart>0</fetchStart><fetchSize>1</fetchSize><filter><group><upperCaseCompare>false</upperCaseCompare><item><upperCaseCompare>false</upperCaseCompare><attribute>TaskName</attribute><operator>=</operator><value>Test</value></item></group></filter><excludeAttribute>false</excludeAttribute>";
		//activityDao.getTaskByName_WithRetry(name);
	}
}
*/