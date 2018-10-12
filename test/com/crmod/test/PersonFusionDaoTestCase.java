/*package com.crmod.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.ws.BindingProvider;

import org.jboss.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crmod.exception.FCRMODException;
import com.crmod.model.Agency;
import com.crmod.model.Agent;
import com.crmod.model.BaseObject;
import com.crmod.model.FloorPlanElevation;
import com.crmod.service.EntityService;
import com.crmod.service.LocationServc;
import com.crmod.service.impl.FloorPlanElevationDao;
import com.crmod.util.Constants;
import com.crmod.util.PropFileUtil;
import com.crmod.util.SOAPLoggingHandler;
import com.crmod.ws.stubs.person.PersonService;
import com.crmod.ws.stubs.person.PersonService_Service;

import com.crmod.ws.stubs.person.ChildFindCriteria;
import com.crmod.ws.stubs.person.Conjunction;
import com.crmod.ws.stubs.person.FindControl;
import com.crmod.ws.stubs.person.FindCriteria;
import com.crmod.ws.stubs.person.ObjectFactory;
import com.crmod.ws.stubs.person.PersonResult;
import com.crmod.ws.stubs.person.ServiceException;
import com.crmod.ws.stubs.person.SortAttribute;
import com.crmod.ws.stubs.person.SortOrder;
import com.crmod.ws.stubs.person.ViewCriteria;
import com.crmod.ws.stubs.person.ViewCriteriaItem;
import com.crmod.ws.stubs.person.ViewCriteriaRow;
import com.fusion.util.PersonFusionUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/META-INF/spring/applicationContext.xml","classpath:/META-INF/spring/app-datasource-config.xml","classpath:/META-INF/spring/app-mail.xml"})

public class PersonFusionDaoTestCase {

	private Logger log = Logger.getLogger(PersonFusionDaoTestCase.class);
	
	@Resource
	LocationServc locationServc;
	
	@Resource(name="entityServiceImpl")
	private EntityService entityService;

	
	@Test 
	public void getAllPending() throws FCRMODException {
		log.debug(">>getAllPending");
		PersonService_Service service = new PersonService_Service();
		PersonService publicService = service.getPersonServiceSoapHttpPort();
		setWSBindingProvider(publicService
				,PropFileUtil.getValue(Constants.FCRMOD_PERSON_URL)
				);
		
		ArrayList<String> findAttributeList= new ArrayList<String>();
		findAttributeList.add("PartyId");
		findAttributeList.add("PersonFirstName");
		findAttributeList.add("PersonLastName");
		findAttributeList.add("Email");
		findAttributeList.add("Phone");
		findAttributeList.add("Relationship");
		findAttributeList.add("Address1");
		findAttributeList.add("Address2");
		findAttributeList.add("City");
		findAttributeList.add("State");
		findAttributeList.add("PostalCode");
		findAttributeList.add("Status");
		findAttributeList.add("PersonTitle");
		findAttributeList.add("CreatedBy");
		findAttributeList.add("LastUpdateDate");


		FindCriteria findCriteria = new FindCriteria();
	    findCriteria.setFetchSize(1);
	    findCriteria.setFetchStart(0);
		   
		log.debug("Applying filter");
	
		ViewCriteria viewCriteria_Root = new ViewCriteria();
		ViewCriteriaRow viewCriteriaRow_Root = new ViewCriteriaRow();			

		
		
	
        
        //OrganizationParty
        ViewCriteriaItem viewCriteriaItem_OrganizationParty = new ViewCriteriaItem();
        viewCriteriaItem_OrganizationParty.setConjunction(Conjunction.AND);
        viewCriteriaItem_OrganizationParty.setAttribute("Relationship");
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
        viewCriteriaItem_OrganizationProfile.setAttribute("OrganizationContact");
        viewCriteriaItem_OrganizationProfile.setOperator("EXISTS");
        ViewCriteriaRow viewCriteriaRow_OrganizationProfile = new ViewCriteriaRow();
        viewCriteriaRow_OrganizationProfile.getItem().add(viewCriteriaItem_OrganizationProfile);
        
        
        viewCriteriaRow_OrganizationProfile.getItem().add(viewCriteriaItem_4);

        ViewCriteriaItem viewCriteriaItem_AccountTypeC = new ViewCriteriaItem();
        viewCriteriaItem_AccountTypeC.setConjunction(Conjunction.AND);
        viewCriteriaItem_AccountTypeC.setAttribute("Realtor_c");
        viewCriteriaItem_AccountTypeC.setOperator("=");
        viewCriteriaItem_AccountTypeC.getValue().add(true);
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
		
		FindCriteria findCriteria = new FindCriteria();
	    findCriteria.setFetchSize(1);
	    findCriteria.setFetchStart(0);
	    
	    if(findAttributeList!=null&&!findAttributeList.isEmpty())
		    findCriteria.getFindAttribute().addAll(findAttributeList);
	    
	    ViewCriteriaRow criteriaCriteriaRow = new ViewCriteriaRow();

	    ViewCriteriaItem sortOrderLastUpdateDate = new ViewCriteriaItem();
	    sortOrderLastUpdateDate.setAttribute("LastUpdateDate");
	    sortOrderLastUpdateDate.setOperator("AFTER");
	    sortOrderLastUpdateDate.getValue().add("2013-05-17T11:48:09.036");
	    criteriaCriteriaRow.getItem().add(sortOrderLastUpdateDate);
	       
	    ViewCriteria viewCriteria = new ViewCriteria();
	    viewCriteria.getGroup().add(criteriaCriteriaRow);
	       
	    findCriteria.setFilter(viewCriteria);

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
			PersonResult personList = publicService
					.findPerson(findCriteria, findControl);
				ArrayList<Agent>  lstAgents=
				  PersonFusionUtil.populateRealtorAgentListFromFusionPersonList
				  (personList,locationServc,entityService);
			
			if(lstAgents!=null&&lstAgents.size()>0)
			{
				log.debug("total results found:"+lstAgents.size());
				//return (ArrayList<T>) lstAgents;
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
		//return null;
	}
	
	public void test()
	{
		  DeptEmpService mSvc = (DeptEmpService)ServiceFactory.getServiceProxy(DeptEmpService.NAME);
	        FindCriteria fc =new FindCriteria();
	        List l = new ArrayList();
	        l.add("Dname");
	        l.add("Loc");
	        l.add("Emp");
	        fc.getFindAttribute().addAll(l);
	        List cfcl = new ArrayList();
	        ChildFindCriteria cfc =        new   ChildFindCriteria();
	        cfc.setChildAttrName("Emp");
	        List<String> cl = new ArrayList<String>();
	        cl.add("Empno");
	        cfc.getFindAttribute().addAll(cl);
	        cfc.setExcludeAttribute(true);
	        cfcl.add(cfc);
	        fc.getChildFindCriteria().add(cfc);
	        DeptResult res = mSvc.findDept(fc, null);
	 
	        // Exclude PurchaseOrderLine from PurchaseOrder.
	        PurchaseOrderService svc =
	            (PurchaseOrderService )ServiceFactory.getServiceProxy(PurchaseOrderService .NAME);
	        FindCriteria fc = (FindCriteria)DataFactory.INSTANCE.create(FindCriteria.class);
	        List l = new ArrayList();
	        fc.setExcludeAttribute(true);
	        l.add("PurchaseOrderLine");
	        fc.setFindAttribute(l);
	        PurchaseOrderResult res = svc.findPurchaseOrder(fc, null);
	 
	        // Retrieve only the 2nd Emp along with Dept with Deptno=10.
	        FindCriteria fc = (FindCriteria)DataFactory.INSTANCE.create(FindCriteria.class);
	        // Create the view criteria item.
	        List value = new ArrayList();
	        value.add(new Integer(10));
	        ViewCriteriaItem vci =             (ViewCriteriaItem)DataFactory.INSTANCE.create(ViewCriteriaItem.class);
	        vci.setValue(value);
	        vci.setAttribute("Deptno");
	        List<ViewCriteriaItem> items = new ArrayList(1);
	        items.add(vci);
	        // Create view criteria row.
	        ViewCriteriaRow vcr = (ViewCriteriaRow) DataFactory.INSTANCE.create(ViewCriteriaRow.class);
	        vcr.setItem(items);
	        // Create the view criteria.
	        List group = new ArrayList();
	        group.add(vcr);
	        ViewCriteria vc = (ViewCriteria)DataFactory.INSTANCE.create(ViewCriteria.class);
	        vc.setGroup(group);
	        // Set filter.
	        fc.setFilter(vc);
	 
	        List cfcl = new ArrayList();
	        ChildFindCriteria cfc =           
	          (ChildFindCriteria)DataFactory.INSTANCE.create(ChildFindCriteria.class);
	        cfc.setChildAttrName("Emp");
	        cfc.setFetchStart(1);
	        cfc.setFetchSize(1);
	        cfcl.add(cfc);
	        fc.setChildFindCriteria(cfcl);
	        DeptResult dres = svc.findDept(fc, null);
	        pw.println("### Dept 10 and 2nd Emp ###");		
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