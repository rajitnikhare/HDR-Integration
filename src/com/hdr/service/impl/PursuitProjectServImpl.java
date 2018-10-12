package com.hdr.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;

import com.hdr.constants.IOpportunityConstants;
import com.hdr.exception.FusionException;
import com.hdr.model.BaseModel;
import com.hdr.model.BaseObject;
import com.hdr.model.DeliveryProject;
import com.hdr.model.PursuitProjectAcklg;
import com.hdr.service.PursuitProjectService;
import com.hdr.util.Constants;
import com.hdr.util.PropFileUtil;
import com.hdr.ws.stubs.opportunity.Conjunction;
import com.hdr.ws.stubs.opportunity.FindControl;
import com.hdr.ws.stubs.opportunity.FindCriteria;
import com.hdr.ws.stubs.opportunity.FindOpportunity;
import com.hdr.ws.stubs.opportunity.ObjectFactory;
import com.hdr.ws.stubs.opportunity.Opportunity;
import com.hdr.ws.stubs.opportunity.OpportunityService;
import com.hdr.ws.stubs.opportunity.OpportunityService_Service;
import com.hdr.ws.stubs.opportunity.ServiceException;
import com.hdr.ws.stubs.opportunity.SortAttribute;
import com.hdr.ws.stubs.opportunity.SortOrder;
import com.hdr.ws.stubs.opportunity.ViewCriteria;
import com.hdr.ws.stubs.opportunity.ViewCriteriaItem;
import com.hdr.ws.stubs.opportunity.ViewCriteriaRow;

/**Oracle Sales Cloud Web service handler class for Pursuit Project (Opportunities). 
 * @author Romesh Soni
 *
 */
@Service
@Repository("pursuitProjectServImpl")
public class PursuitProjectServImpl  extends AbstractFCRMODWebService  implements PursuitProjectService{
	
	
	private static final ObjectFactory factory =  new ObjectFactory(); 
	
	private static final Logger log = Logger
			.getLogger(PursuitProjectServImpl.class);

	
	
	
	/**
	 * Get all those Pursuit Projects from OSC which needs to be synched to EBS.
	 * @return 
	 * @throws FusionException 
	 */
	public List<Object> getPendingToEBSPursuitProjects(BaseModel bo) throws FusionException
	{
		log.info(">>getPendingToEBSPursuitProjects");
		
		ArrayList <String>lstFindAttributes = 
		  getCommonFindAttribsForPursuitProjectAndDeliveryProjectJobs();
		
		
		//filter 1 by last update date
		bo.setOperator(Constants.FUSION_DATE_AFTER_OPERATOR);
		bo.setViewCriteriaAttributeName(Constants.FUSION_LAST_UPDATE_COL_NAME);
		//bo.setViewCriteriaAttributeValue("2015-11-26T08:52:29.0Z");
		bo.setViewCriteriaAttributeValue(bo.getViewCriteriaAttributeValue());
		bo.setListOfAttribute(lstFindAttributes);
		
		//filter 2 - modified user should not be integration user
		String integrationUserToIgnore = PropFileUtil.getValue(Constants.FCRMOD_USERNAME);
		bo.setOperator2("<>");
		bo.setViewCriteriaAttributeName2("LastUpdatedBy");
		//bo.setViewCriteriaAttributeValue2(integrationUserToIgnore);
		bo.setViewCriteriaAttributeValue2(integrationUserToIgnore);
		
		//sorting by last update date ascending
		bo.setSortAttribute(Constants.FUSION_LAST_UPDATE_COL_NAME);
		bo.setSortDescending(false);
		
		List<Object> lst = query(bo); 
		
		log.info("<<getPendingToEBSPursuitProjects");
		
		return lst;
		
	}
	
	
	public ArrayList<String> getCommonFindAttribsForPursuitProjectAndDeliveryProjectJobs()
	{
		ArrayList <String>lstFindAttributes = new ArrayList<String>();
		//lstFindAttributes.add("OperatingUnit_c");
		lstFindAttributes.add("MarketingChargeNumber_c");
		lstFindAttributes.add("Name");
		lstFindAttributes.add("EstimatedProjectStartDate_c");
		lstFindAttributes.add("EstimatedProjectEndDate_c");
		lstFindAttributes.add("ProjectManagers_c");
		lstFindAttributes.add("ProjectManagers_Id_c");
		lstFindAttributes.add("BillableCompanyId_c");
		lstFindAttributes.add("OptyId");
		lstFindAttributes.add("MarketSectors_c");
		lstFindAttributes.add("EstimatedNetFees_c");
		lstFindAttributes.add("WinProbability_c");
		lstFindAttributes.add("BusinessClass_c");
		lstFindAttributes.add("ContractType_c");
		lstFindAttributes.add("GoNoGo_c");
		lstFindAttributes.add("CreationDate");
		
		lstFindAttributes.add("CurrencyCode");
		lstFindAttributes.add("TotalContractCapacitys_c");
		lstFindAttributes.add("AwardTypes_c");
		lstFindAttributes.add("NoCapacityLimit_c");
		lstFindAttributes.add("UnableToPredict_c");
		lstFindAttributes.add("HDRPotentialCapacityNets_c");
		lstFindAttributes.add("HDRPotentialCapacityGrosss_c");
		lstFindAttributes.add("ContractName_Id_c");
		lstFindAttributes.add("BusinessUnit_c");
		lstFindAttributes.add("DeliveryMethod_c");
		lstFindAttributes.add("StatusCode");
		lstFindAttributes.add("ProjectManagerEffectiveStart_c");
		lstFindAttributes.add("EstBookingDate_c");
		lstFindAttributes.add("BillableAccountID_c");
		lstFindAttributes.add("MarketingChargeNumbers_c");
		lstFindAttributes.add("EBSPursuitProjectId_c");
		
		/**
		 * @author jeevan
		 * New Field Added
		 * Dated: 06-JAN-2016
		 */
		lstFindAttributes.add("Currency_c");
		
		lstFindAttributes.add("PursuitProjectNumber_c");
		
		lstFindAttributes.add("LastUpdateDate");		
		
		return lstFindAttributes;
	}

	@Override
	public List<Object> query(BaseObject o) throws FusionException {
		if(o!=null){
			try {
				
				OpportunityService publicService= getService();
				
			

				FindCriteria findCriteria = new FindCriteria();
				FindControl findControl = new FindControl();
				findCriteria.setFetchSize(o.getFetchSize());
				findCriteria.setFetchStart(o.getFetchStart());
				
				findCriteria.getFindAttribute().addAll(o.getListOfAttribute());
				
				ViewCriteriaItem filterItem1 = new ViewCriteriaItem();
				filterItem1.setConjunction(Conjunction.AND);
				filterItem1.setUpperCaseCompare(false);
				filterItem1.setAttribute(o.getViewCriteriaAttributeName());
				filterItem1.setOperator(o.getOperator());
				filterItem1.getValue().add(o.getViewCriteriaAttributeValue());
				
				ViewCriteriaItem filterItem2=null;
				//second filter
				if(o.getViewCriteriaAttributeName2()!=null)
				{
					filterItem2 = new ViewCriteriaItem();
					filterItem2.setConjunction(Conjunction.AND);
					filterItem2.setUpperCaseCompare(false);
					filterItem2.setAttribute(o.getViewCriteriaAttributeName2());
					filterItem2.setOperator(o.getOperator2());
					filterItem2.getValue().add(o.getViewCriteriaAttributeValue2());
				}
				
				if(o.getViewCriteriaAttributeNameInner()!=null)
				{
				//THIS IS INNER
				ViewCriteriaItem viewCriteriaItemInner = new ViewCriteriaItem();
				viewCriteriaItemInner.setConjunction(Conjunction.AND);
				viewCriteriaItemInner.setUpperCaseCompare(false);
				viewCriteriaItemInner.setAttribute(o.getViewCriteriaAttributeNameInner());
				viewCriteriaItemInner.setOperator(o.getOperatorInner());
				viewCriteriaItemInner.getValue().add(o.getViewCriteriaAttributeValueInner());
				
				
				ViewCriteriaRow viewCriteriaRowInner = new ViewCriteriaRow();
				viewCriteriaRowInner.setConjunction(Conjunction.AND);
				viewCriteriaRowInner.setUpperCaseCompare(false);
				viewCriteriaRowInner.getItem().add(viewCriteriaItemInner);
				
				ViewCriteria viewCriteriaInner = new ViewCriteria();
				viewCriteriaInner.setConjunction(Conjunction.AND);
				viewCriteriaInner.getGroup().add(viewCriteriaRowInner);
				//THIS IS INNER
				
				
				
				filterItem1.setNested(viewCriteriaInner);
				}
				
				ViewCriteriaRow viewCriteriaRowHeader = new ViewCriteriaRow();
				viewCriteriaRowHeader.setConjunction(Conjunction.AND);
				viewCriteriaRowHeader.setUpperCaseCompare(false);
				viewCriteriaRowHeader.getItem().add(filterItem1);
				
				if(filterItem2!=null)
					viewCriteriaRowHeader.getItem().add(filterItem2);
				
				
				
				ViewCriteria criteriaHeader = new ViewCriteria();
				criteriaHeader.setConjunction(Conjunction.AND);
				criteriaHeader.getGroup().add(viewCriteriaRowHeader);
				
				
				
				findCriteria.setFilter(criteriaHeader);
				
				//sorting needed? 
				if(o.getSortAttribute()!=null)
				{
					SortAttribute so = new SortAttribute();
					so.setDescending(o.isSortDescending());
					so.setName(o.getSortAttribute());
					SortOrder s = new SortOrder();
					s.getSortAttribute().add(so);
					findCriteria.setSortOrder(s);
				}
				
				findCriteria.setExcludeAttribute(false);
				findControl.setRetrieveAllTranslations(true);
				
				
				FindOpportunity findOpportunity = factory.createFindOpportunity();
				findOpportunity.setFindControl(findControl);
				findOpportunity.setFindCriteria(findCriteria);
				/*SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });
				pursuitProjectWsTemplate.setDefaultUri(CommonUtil.getSystemPropertyValue(Constants.FCRMOD_SALESPARTY_URL));
				FindOpportunityResponse findOpportunityResponse = (FindOpportunityResponse) pursuitProjectWsTemplate.marshalSendAndReceive(findOpportunity, new ActionCallback("http://xmlns.oracle.com/apps/crmCommon/salesParties/salesPartiesService/findOpportunity"));
				
				*/
				//setWSBindingProvider(publicService, CommonUtil.getSystemPropertyValue(Constants.FCRMOD_SALES_ACCOUNT_URL));;
				
				List<Opportunity> optyList = publicService.findOpportunity(findCriteria, findControl);
			/*	if (findOpportunityResponse.getResult() != null && findOpportunityResponse.getResult().size()>0) {
					return  extracted(findOpportunityResponse.getResult());
				}*/
				if(optyList!=null && optyList.size()>0){
					return extracted(optyList);
				}

			} catch (Exception e) {
				e.printStackTrace();
				throw new FusionException(e);
			} 
		}
		
		return null;
		 
		
	}
	
	private OpportunityService getService() {
		
		OpportunityService_Service service = new OpportunityService_Service();
		SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });
		OpportunityService publicService = service.getOpportunityServiceSoapHttpPort(securityFeatures);
		//OpportunityService publicService = service.getOpportunityServiceSoapHttpPort();
		setWSBindingProvider(publicService,PropFileUtil.getValue(Constants.FCRMOD_OPPORTUNITY_URL));
	
		return publicService;
	}



	@Override
	public void updatePursuitProjectAcklg(PursuitProjectAcklg c) throws FusionException {
		if(c!=null){
			try {

				OpportunityService publicService = getService();
				ObjectFactory factory = new ObjectFactory();
				
				
				Opportunity opty = new Opportunity();
				opty.setOptyId(new Long(c.getOscOpportunityId()));
				
				BigDecimal ebsProjectId = new BigDecimal(c.getEbsProjectId());
				if(c.getProjectNumber()!=null)opty.setMarketingChargeNumbersC(factory.createOpportunityMarketingChargeNumbersC(c.getProjectNumber()));
				if(c.getEbsProjectId()!=null)opty.setEBSPursuitProjectIdC(factory.createOpportunityEBSPursuitProjectIdC( c.getEbsProjectId()));
				//if(c.getProjectNumber()!=null && StringUtils.isNotBlank(c.getProjectNumber()))opty.setPursuitProjectNumberC(factory.createOpportunityPursuitProjectNumberC(BigDecimal.valueOf(Long.valueOf(c.getProjectNumber()))));
				publicService.updateOpportunity(opty);
				
				
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		
	}
	
	/* When you get delivery project acknowledgment, you need to update opty and associate a delivery project to it.
	 * This function will do this job.  
	 */
	@Override
	public Opportunity findOpportuntiyForDeliveryProjectAck(DeliveryProject c) throws FusionException {
		
		log.info(">>findOpportuntiyForDeliveryProjectAck");
		
		//BigDecimal deliveredProjectId = c.getDeliveredProjectId();
		BigDecimal oscOptyId = c.getOscOpportunityId();
		//BigDecimal pursuitProjectId = c.getPursuitProjectId();
		Opportunity oscOpportunity=null;
		if(oscOptyId!=null)
		{
			//Get the Opty from Sales Cloud
			oscOpportunity = getOptyByOptyIdForDeliveryProjectFlow(oscOptyId.toString());
		}
		
	/*	if(oscOpportunity==null)
		{
			//Query Opportunity using PURSUIT_PROJECT_ID and get the Opportunity
			oscOpportunity = getOptyByPursuitProjectIdForDeliveryProjectFlow(pursuitProjectId);
		}*/
		
		return oscOpportunity;
	}

	/**
	 * Get opportunity by OptyId
	 * @return 
	 * @throws FusionException 
	 */
	@Override
	public Opportunity getOptyByOptyIdForDeliveryProjectFlow(String optyId) throws FusionException
	{
		log.info(">>getOptyByOptyIdForDeliveryProjectFlow optyId: "+ optyId);
		
		BaseModel bo = new BaseModel();

		ArrayList <String>lstFindAttributes = 
		  getCommonFindAttribsForPursuitProjectAndDeliveryProjectJobs();
		
		//to set in delivery project
		lstFindAttributes.add("DeliveryMethod_c");
		lstFindAttributes.add("HDRDivision_c");

		
		
		//filter 1 by last update date
		bo.setOperator(Constants.FUSION_EQUALS_OPERATOR);
		bo.setViewCriteriaAttributeName("OptyId");
		bo.setViewCriteriaAttributeValue(optyId);
		bo.setListOfAttribute(lstFindAttributes);
		bo.setFetchSize(1);
		bo.setFetchStart(0);
		
		
		List<Object> lst = query(bo);
		
		if(lst!=null&&!lst.isEmpty())
		{
			log.debug("Opty found");
			Opportunity opty1 = (Opportunity)lst.get(0);
			return opty1;
		}
		else 
		{   log.debug("Opty not found");
		System.out.println();	
		return null;
			
		}	
	}
	
	/**
	 * Get opportunity by Pursuit project Id (marketing charge number in osc)
	 * @return 
	 * @throws FusionException 
	 */
	@Override
	public Opportunity getOptyByPursuitProjectIdForDeliveryProjectFlow(BigDecimal pursuitProjectId) throws FusionException
	{
		log.info(">>getOptyByPursuitProjectIdForDeliveryProjectFlow pursuitProjectId: "+ pursuitProjectId);
		
		BaseModel bo = new BaseModel();

		ArrayList <String>lstFindAttributes = 
		  getCommonFindAttribsForPursuitProjectAndDeliveryProjectJobs();
		
		//filter 1 by last update date
		bo.setOperator(Constants.FUSION_EQUALS_OPERATOR);
		bo.setViewCriteriaAttributeName(IOpportunityConstants.OSC_API_PURSUIT_PROJECT_ID);
		bo.setViewCriteriaAttributeValue(pursuitProjectId.toString());
		bo.setListOfAttribute(lstFindAttributes);
		bo.setFetchSize(1);
		bo.setFetchStart(0);

		
		List<Object> lst = query(bo);
		
		if(lst!=null&&!lst.isEmpty())
		{
			log.debug("Opty found");
			Opportunity opty1 = (Opportunity)lst.get(0);
			return opty1;
		}
		else 
		{   log.debug("Opty not found");
			return null;
		}	
	}
	
	@Override
	public void updateOpportunityStatusToWON(Long optyId,BigDecimal deliveryProjectNum) throws ServiceException {
		
		log.debug(">>updateOpportunityStatusToWON");
		
		OpportunityService publicService = getService();
		ObjectFactory factory = new ObjectFactory();
		
		
		Opportunity opty = new Opportunity();
		opty.setOptyId(optyId);
		if(deliveryProjectNum!=null)opty.setEBSProjectIDC(factory.createOpportunityEBSProjectIDC(String.valueOf(deliveryProjectNum)));
		String WONSTATUS = IOpportunityConstants.OSC_OPPORTUNITY_STATUS.WON.getVal();
		opty.setStatusCode(factory.createOpportunityStatusCode(WONSTATUS));
		
		publicService.updateOpportunity(opty);
		
		log.debug("Opty updated successfully");
		
	}

	
	
	@SuppressWarnings("unchecked")
	private List<Object> extracted(List<Opportunity> optyList) {
		return (List<Object>)(List<?>) optyList;
	}

	@Override
	public void create() throws FusionException {
		
	}

	@Override
	public void update() throws FusionException {
		
	}

	@Override
	public void delete() throws FusionException {
		
	}


	@Override
	public List<Opportunity> get(BaseObject bo) throws Exception {
		if(bo!=null){
			try {

				OpportunityService publicService  =  getService(); 
				ViewCriteriaItem criteriaItem = new ViewCriteriaItem();
				criteriaItem.setAttribute(bo.getViewCriteriaAttributeName());
				criteriaItem.setOperator(bo.getOperator());
				criteriaItem.getValue().add(bo.getViewCriteriaAttributeValue());
				criteriaItem.setConjunction(Conjunction.AND);
				
				
				ViewCriteriaRow criteriaRow = new ViewCriteriaRow();
				criteriaRow.setConjunction(Conjunction.AND);
				criteriaRow.getItem().add(criteriaItem);
				
				
				ViewCriteria criteria = new ViewCriteria();
				criteria.setConjunction(Conjunction.AND);
				criteria.getGroup().add(criteriaRow);
				
				FindControl findControl = new FindControl();
				FindCriteria findCriteria = new FindCriteria();
				
				findControl.setRetrieveAllTranslations(false);
				findCriteria.setExcludeAttribute(false);
				findCriteria.setFetchSize(bo.getFetchSize());
				findCriteria.setFetchStart(bo.getFetchStart());
				findCriteria.setFilter(criteria);
				findCriteria.getFindAttribute().addAll(bo.getListOfAttribute());
				
				List<Opportunity> out = publicService.findOpportunity(findCriteria, findControl);
				if(out!=null && out.size()>0){
					return out;
				}
			System.out.println();
			} catch (Exception e) {
				throw e;
			}
		}
		return null;
	}


	@Override
	public List<Opportunity> updateAndAssociateEBSProject(Object o,String projectId) throws ServiceException, Exception {
		try {
			Opportunity optyOSC = (Opportunity) o;
			OpportunityService publicService  =  getService();
			Opportunity opty = factory.createOpportunity();
			opty.setOptyId(optyOSC.getOptyId());
			opty.setEBSProjectIDC(factory.createOpportunityEBSProjectIDC(projectId));
			publicService.updateOpportunity(opty);
			log.debug("Opty updated with EBS Preoject successfully");
		} catch (Exception e) {
			throw e;
		}
		 
		
		
		return null;
	}


	


	
}
