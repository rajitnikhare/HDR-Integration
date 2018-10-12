package com.hdr.service.impl;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.IContractConstants;
import com.hdr.constants.IOpportunityConstants;
import com.hdr.exception.FusionException;
import com.hdr.model.BaseObject;
import com.hdr.model.Contract;
import com.hdr.service.AccountServ;
import com.hdr.service.ContractServ;
import com.hdr.service.PursuitProjectService;
import com.hdr.util.Constants;
import com.hdr.util.DateUtils;
import com.hdr.ws.stubs.accountService.Account;
import com.hdr.ws.stubs.customeObject.AmountType;
import com.hdr.ws.stubs.customeObject.Conjunction;
import com.hdr.ws.stubs.customeObject.ContractC;
import com.hdr.ws.stubs.customeObject.FindControl;
import com.hdr.ws.stubs.customeObject.FindCriteria;
import com.hdr.ws.stubs.customeObject.ObjectFactory;
import com.hdr.ws.stubs.customeObject.SalesCustomObjectService;
import com.hdr.ws.stubs.customeObject.SalesCustomObjectService_Service;
import com.hdr.ws.stubs.customeObject.ServiceException;
import com.hdr.ws.stubs.customeObject.ViewCriteria;
import com.hdr.ws.stubs.customeObject.ViewCriteriaItem;
import com.hdr.ws.stubs.customeObject.ViewCriteriaRow;
import com.hdr.ws.stubs.opportunity.Opportunity;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;


/**Sales Cloud Web service Handler class for "Contracts_c" Custom Object.
 * @author Romesh Soni
 *
 */
@Service
@Repository("ContractServimpl")
public class ContractServImpl extends AbstractFCRMODWebService implements ContractServ 
{
	private static final Logger log = Logger.getLogger(ContractServImpl.class);
	
	private static final ObjectFactory factory = new ObjectFactory();
	
	@Resource
	private PursuitProjectService pursuitProjectServiceWS;
	

	@Resource
	private AccountServ accountServ;
	
	
	
	@Override
	public ContractC find(BaseObject o) throws FusionException {
		if(o!=null){
			try {
				log.info(">>findContract");
				SalesCustomObjectService service = getService();
				
				FindCriteria findCriteria = new FindCriteria();
				FindControl findControl = new FindControl();
				findCriteria.setFetchSize(o.getFetchSize());
				findCriteria.setFetchStart(o.getFetchStart());
				findCriteria.getFindAttributes().addAll(o.getListOfAttribute());
				findCriteria.setExcludeAttribute(false);
				
				
				ViewCriteriaItem criteriaItem = new ViewCriteriaItem();
				criteriaItem.setConjunction(Conjunction.AND);
				criteriaItem.setUpperCaseCompare(false);
				criteriaItem.setAttribute(o.getViewCriteriaAttributeName());
				criteriaItem.setOperator(o.getOperator());
				criteriaItem.getValues().add(o.getViewCriteriaAttributeValue());
				
				ViewCriteriaRow viewCriteriaRow = new ViewCriteriaRow();
				viewCriteriaRow.setConjunction(Conjunction.AND);
				viewCriteriaRow.setUpperCaseCompare(false);
				viewCriteriaRow.getItems().add(criteriaItem);
				
				ViewCriteria criteria = new ViewCriteria();
				criteria.setConjunction(Conjunction.AND);
				criteria.getGroups().add(viewCriteriaRow);
				
				findCriteria.setFilter(criteria);
				findControl.setRetrieveAllTranslations(true);
				
				
				 List<Object> out=service.findEntity(findCriteria,findControl, IContractConstants.CONTRACT_CUSTOM_OBJECT_NAME); 
				 if(out!=null && out.size()>0){
					 return (ContractC) out.get(0);
				 }
				
				log.info("<<findContract");
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		
		return null;
	}
	
	@Override
	public List<Object> findContract(BaseObject bo) throws ServiceException
	{
		log.info(">>findContract");
		
		SalesCustomObjectService service = getService();

		FindCriteria findCriteria = new FindCriteria();
		FindControl findControl = new FindControl();
		findCriteria.setFetchSize(bo.getFetchSize());
		findCriteria.setFetchStart(bo.getFetchStart());
		findCriteria.getFindAttributes().addAll(bo.getListOfAttribute());
		
		ViewCriteriaItem criteriaItemHeader = new ViewCriteriaItem();
		criteriaItemHeader.setConjunction(Conjunction.AND);
		criteriaItemHeader.setUpperCaseCompare(false);
		criteriaItemHeader.setAttribute(bo.getViewCriteriaAttributeName());
		criteriaItemHeader.setOperator(bo.getOperator());
		criteriaItemHeader.getValues().add(bo.getViewCriteriaAttributeValue());

		
		ViewCriteriaRow viewCriteriaRowHeader = new ViewCriteriaRow();
		viewCriteriaRowHeader.setConjunction(Conjunction.AND);
		viewCriteriaRowHeader.setUpperCaseCompare(false);
		viewCriteriaRowHeader.getItems().add(criteriaItemHeader);
		
		
		
		ViewCriteria criteriaHeader = new ViewCriteria();
		criteriaHeader.setConjunction(Conjunction.AND);
		criteriaHeader.getGroups().add(viewCriteriaRowHeader);
		
		
		
		findCriteria.setFilter(criteriaHeader);
		findCriteria.setExcludeAttribute(false);
		findControl.setRetrieveAllTranslations(true);
		
		
		 List<Object> contractList=service.findEntity(findCriteria,
				  findControl, IContractConstants.CONTRACT_CUSTOM_OBJECT_NAME); 
		 
		 if(contractList!=null&&!contractList.isEmpty())
		 {
			 log.info("Contract(s) found.");
		 }
		 else
			 log.info("No Contract(s) found.");
		
		
		
		log.info("<<findContract");
		
		return contractList;
	}
	
	@Override
	public void createContract(Contract contract) throws FusionException{
		if(contract!=null){
			try {
				log.info(">>createContract");
				SalesCustomObjectService service = getService();
				ContractC contractForOSC = setFieldsForContractOSC(contract);
				service.createEntity(contractForOSC, "Contract_c");
				log.info("<<createContract");
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		
	}
	
	public void updateContract(Contract contract) throws Exception{
		if(contract!=null){
			try {
				log.info(">>updateContract");
				SalesCustomObjectService service = getService();
				ContractC contractForOSC = setFieldsForContractOSC(contract);
				service.mergeEntity(contractForOSC, "Contract_c");
				log.info("<<updateContract");
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
	}
	

	public void populateDataFromContractFromSdbToProjectInOsc(Contract contractfromsdb) throws ServiceException{
		
		log.info(">>populateDataFromContractFromSdbToProjectInOsc");
	}
	
	public Contract findContractBasedOnContractEbsId(Long contractEbsId) throws ServiceException{
		
		log.info(">>findContractBasedOnContractEbsId");
		
		Contract contract = null;
		
		
		return contract;
	}
	
	private ContractC setFieldsForContractOSC(Contract c) throws Exception {
		//get values from opportunity object
		ContractC contracrOSC = factory.createContractC();
		Opportunity opty  = null;
		
		contracrOSC.setIntegratedContractC(true);
		/**
		 * Finding Opportunity
		 */
		if(c.getOscOpportunityId()!=null){
			opty = getOptyByOptyId(c.getOscOpportunityId());
			if(opty==null){
				throw new Exception("Opty with Id: "+c.getOscOpportunityId() +" not found in OSC for Contract with EBS Id: "+c.getEbsContractId());
			}
		}
		/**
		 * Finding Account
		 */
	/*	Account ebsBillableAccount = null;
		if(c.getEbsBillableAccountId()!=null){
				 ebsBillableAccount = getEBSBillableAccountByEBSAccountId(c.getEbsBillableAccountId());
				if(ebsBillableAccount==null){
					throw new Exception("Account with EBS Account Id: "+c.getEbsBillableAccountId() +" not found in OSC for Contract with EBS Id: "+c.getEbsContractId());
				}
		}*/
		
		/**
		 * Finding Parent Account Account
		 */
		Account ebsParentAccount = null;
		if(c.getEbsPartyId()!=null){
				 ebsParentAccount = getEBSParentAccount(c.getEbsPartyId());
				if(ebsParentAccount==null){
					throw new Exception("Parent Account with EBS Party Id: "+c.getEbsPartyId() +" not found in OSC for Contract with EBS Id: "+c.getEbsContractId());
				}
		}
		
		
		/**
		 * EBS Contract Id
		 */
		contracrOSC.setRecordName(c.getEbsContractId().toString());
		/**
		 * EBS Contract Number
		 */
		if(checkString(c.getContractNumber()))contracrOSC.setContractNumberC(factory.createContractCContractNumberC(c.getContractNumber()));
		/**
		 * Contract Name
		 */
		if(checkString(c.getContractName()))contracrOSC.setContractNameC(factory.createContractCContractNameC(c.getContractName()));
		/**
		 * FEDERAL_MASTER_CONTRACT_NO
		 */
		if(checkLong(c.getFederalMasterContractNo()))contracrOSC.setFederalContractNumberC(factory.createContractCFederalContractNumberC(String.valueOf(c.getFederalMasterContractNo())));
		/**
		 * CONTRACT_AWARD_TYPE
		 */
		if(checkString(c.getContractAwardType()))contracrOSC.setContractAwardTypesC(factory.createContractCContractAwardTypesC(c.getContractAwardType()));
		/**
		 *
		 * HDR_ACCOUNT
		 */
		if(checkLong(c.getHdrAccount()))contracrOSC.setHDRCompanyC(factory.createContractCHDRCompanyC(c.getHdrAccount().toString()));
		/**
		 * MASTER_CONTRACT_NAME
		 */
		if(checkString(c.getMasterContractName()))contracrOSC.setMasterContractC(factory.createContractCMasterContractC(c.getMasterContractName()));
		/**
		 * EBS_MASTER_CONTRACT_ID
		 */
		if(checkLong(c.getEbsMasterContractId()))contracrOSC.setMasterContractIdC(factory.createContractCMasterContractIdC(BigDecimal.valueOf(c.getEbsMasterContractId())));
		/**
		 * EBS_BILLABLE_ACCOUNT_ID
		 * 
		 */
		//if(checkLong(c.getEbsBillableAccountId()))contracrOSC.setBillableCompanyIdC(factory.createContractCBillableCompanyIdC(BigDecimal.valueOf(c.getEbsBillableAccountId())));
    
		/**
		 * EBS_BILLABLE_CUSTOMER_NO
		 */
		//:TODO MAPPING NOT SURE
		/**
		 * EBS_PURSUIT_PROJECT_ID
		 */
		if(checkLong(c.getEbsPursuitProjectId()))contracrOSC.setContractProjectIdC(factory.createContractCContractProjectIdC(BigDecimal.valueOf(c.getEbsPursuitProjectId())));
		/**
		 * EBS PARENT ACCOUNT
		 */
		if(ebsParentAccount!=null && ebsParentAccount.getOrganizationName()!=null)contracrOSC.setParentCompaniesC(factory.createContractCParentCompaniesC(ebsParentAccount.getOrganizationName()));
		
		/**
		 * From Account
		 * BILLABLE_ACCOUNT_NAME
		 * The script will populate from Opty Id
		 * Confirmed by Tushar on Both Create and Update
		 * 
		 */
		//if(ebsBillableAccount!=null && ebsBillableAccount.getPartyId()!=null)contracrOSC.setBillableCompanyIdC(factory.createContractCBillableCompanyIdC(BigDecimal.valueOf( ebsBillableAccount.getPartyId())));
		//if(ebsBillableAccount!=null && ebsBillableAccount.getOrganizationName()!=null)contracrOSC.setBillableCompanyC(factory.createContractCBillableCompanyC(ebsBillableAccount.getOrganizationName()));
		
		/**
		 * START DATE
		 * The script will populate from Opty Id
		 * Confirmed by Tushar on Both Create and Update
		 */
		//if(checkDate(c.getStartDate()))contracrOSC.setStartDateC(factory.createContractCStartDateC(getFusionDate(c.getStartDate())));
		/**
		 * END_DATE
		 * The script will populate from Opty Id
		 * Confirmed by Tushar on Both Create and Update
		 */
		//if(checkDate(c.getEndDate()))contracrOSC.setEndDateC(factory.createContractCEndDateC(getFusionDate(c.getEndDate())));
		/**	
		 *TOTAL_CONTRACT_VAL_TO_DT_GROSS
		 */
		if(checkBigDecimal(c.getTotalContractValToDtGross()))contracrOSC.setTotalContractValueToDateGrossC(factory.createContractCTotalContractValueToDateGrossC(getAmountBD(c.getTotalContractValToDtGross())));
		/**
		 * TOTAL_REMAINING_CAPACITY
		 * 
		 */
		if(checkBigDecimal(c.getTotalRemainingCapacity()))contracrOSC.setTotalRemainingCapacityC(factory.createContractCTotalRemainingCapacityC(getAmountBD(c.getTotalRemainingCapacity())));
		/**From Opportunity
		 * OPPORTUNITY_NAME         
		 * 
		 */
		//if(opty!=null && opty.getName()!=null)contracrOSC.setOpportunityC(factory.createContractCOpportunityC(opty.getName()));
		/**From EBS 
		 * OSC_OPPORTUNITY_ID
		 */
		if(checkString(c.getOscOpportunityId()))contracrOSC.setOpportunityIdC(factory.createContractCOpportunityIdC(BigDecimal.valueOf(Long.valueOf(c.getOscOpportunityId()))));
		
		/**
		 * From Opportunity
		 * HDR Role
		 * The script will populate from Opty Id
		 * Confirmed by Tushar on Both Create and Update
		 */
		//if(checkString(opty.getHDRRoleC()))contracrOSC.setHDRRoleC(factory.createContractCHDRRoleC(opty.getHDRRoleC()));
		/**
		 * From Opportunity
		 * BUSINESS CLASS
		 * The script will populate from Opty Id
		 * Confirmed by Tushar on Both Create and Update
		 */
		//if(checkString(opty.getBusinessClassC()))contracrOSC.setBusinessClassC(factory.createContractCBusinessClassC(opty.getBusinessClassC()));
		/**
		 * From Opportunity
		 * MARKET SECTOR
		 * The script will populate from Opty Id
		 * Confirmed by Tushar on Both Create and Update
		 */
		//if(checkString(opty.getMarketSectorsC()))contracrOSC.setMarketSectosC(factory.createContractCMarketSectosC(opty.getMarketSectorsC()));
		/**
		 * From Opportunity
		 * PrimaryClient_c
		 * We will use iD to associate
		 * The script will populate from Opty Id
		 * Confirmed by Tushar on Both Create and Update
		 */
		//if(checkBigDecimal(opty.getPrimaryClientIdC().getValue()))contracrOSC.setPrimaryCompanyIdC(factory.createContractCPrimaryCompanyIdC(opty.getPrimaryClientIdC().getValue()));
		/**
		 * From Opportunity
		 * NAICS Code
		 * The script will populate from Opty Id
		 * Confirmed by Tushar on Both Create and Update
		 */
		//if(checkString(opty.getNAICSCodesC().getValue()))contracrOSC.setNAICSC(factory.createContractCNAICSC(opty.getNAICSCodesC().getValue()));
		/**
		 * From Opportunity
		 * NAICS Description
		 * The script will populate from Opty Id
		 * Confirmed by Tushar on Both Create and Update
		 */
		//if(checkString(opty.getNAICSDescriptionC().getValue()))contracrOSC.setNAICSDescriptionC(factory.createContractCNAICSDescriptionC(opty.getNAICSDescriptionC().getValue().getBytes()));
		/**
		 * From Opportunity
		 * Total Contract Capacity
		 * The script will populate from Opty Id
		 * Confirmed by Tushar on Both Create and Update
		 */
		//if(opty.getTotalContractCapacitysC()!=null && opty.getTotalContractCapacitysC().getValue()!=null)contracrOSC.setTotalContractCapacityC(factory.createContractCTotalContractCapacityC(getAmountBD(opty.getTotalContractCapacitysC().getValue())));
		/**
		 * From Opportunity
		 * HDR Potential Capacity (Gross)
		 * The script will populate from Opty Id
		 * Confirmed by Tushar on Both Create and Update
		 */
		//if(opty.getHDRPotentialCapacityGrosssC()!=null && opty.getHDRPotentialCapacityGrosssC().getValue()!=null)contracrOSC.setHDRPotentialCapacityGrossC(factory.createContractCHDRPotentialCapacityGrossC(getAmountBD(opty.getHDRPotentialCapacityGrosssC().getValue())));
		/**
		 * From Opportunity
		 * HHDR Potential Capacity (Net)
		 * The script will populate from Opty Id
		 * Confirmed by Tushar on Both Create and Update
		 */
		//if(opty.getHDRPotentialCapacityNetsC()!=null && opty.getHDRPotentialCapacityNetsC().getValue()!=null)contracrOSC.setHDRPotentialCapacityNetC(factory.createContractCHDRPotentialCapacityNetC(getAmountBD(opty.getHDRPotentialCapacityNetsC().getValue())));
			
		if(c.getContractOscId()!=null)contracrOSC.setId(c.getContractOscId());
		return contracrOSC;
	}



	private boolean checkBigDecimal(BigDecimal value) {
		return value!=null;
	}

	private AmountType getAmount(Long long1) {
		AmountType a = new AmountType();
	 	a.setValue(BigDecimal.valueOf(long1));
	 	return a;
	}
	private AmountType getAmountBD(BigDecimal bd) {
		AmountType a = new AmountType();
	 	a.setValue(bd);
	 	return a;
	}

	
	private XMLGregorianCalendar getFusionDate(Date date) {
		Timestamp currentTimestamp = new Timestamp((date).getTime());
		String currentTimeAsString = DateUtils.formatGivenTimestampToFusionFormat(currentTimestamp);
		return DateUtils.getXMLGregorianCalendar(currentTimeAsString);
	}

	private boolean checkDate(Date date) {
		return date!=null;
	}

	private boolean checkLong(Long federalMasterContractNo) {
		return federalMasterContractNo!=null;
	}

	private boolean checkString(String value) {
		return value !=null && StringUtils.isNotBlank(value);
	}
	
	
	private Account getEBSParentAccount(Long ebsPartyId) throws FusionException {
		log.info(">>getEBSParentAccount");
		if(ebsPartyId!=null){
			ArrayList <String>lstFindAttributes = new ArrayList<String>();
			BaseObject bo = new BaseObject();
			bo.setFetchSize(1);
			bo.setFetchStart(0);
			lstFindAttributes.add("PartyId");
			lstFindAttributes.add("OrganizationName");
			bo.setOperator(Constants.FUSION_EQUALS_OPERATOR);
			bo.setViewCriteriaAttributeName("OrganizationDEO_EBSPartyId_c");
			bo.setViewCriteriaAttributeValue(ebsPartyId.toString());
			bo.setListOfAttribute(lstFindAttributes);
			Account output = accountServ.find(bo);
			log.info("<<getEBSParentAccount");
			if(output!=null){
				return output;
			}
		}
	
		return null;
	}


	private Account getEBSBillableAccountByEBSAccountId(Long ebsBillableAccountId) throws FusionException {
		log.info(">>getEBSBillableAccountByEBSAccountId");
		if(ebsBillableAccountId!=null){
			ArrayList <String>lstFindAttributes = new ArrayList<String>();
			BaseObject bo = new BaseObject();
			bo.setFetchSize(1);
			bo.setFetchStart(0);
			lstFindAttributes.add("PartyId");
			lstFindAttributes.add("OrganizationName");
			bo.setOperator(Constants.FUSION_EQUALS_OPERATOR);
			bo.setViewCriteriaAttributeName("OrganizationDEO_EBSAccountId_c");
			bo.setViewCriteriaAttributeValue(ebsBillableAccountId.toString());
			bo.setListOfAttribute(lstFindAttributes);
			Account output = accountServ.find(bo);
			log.info("<<getEBSBillableAccountByEBSAccountId");
			if(output!=null){
				return output;
			}
		}
		
		return null;
	}
	
	public Opportunity getOptyByOptyId(String optyId) throws Exception
	{
		log.info(">>GetOptyByOptyId");
		
		
		ArrayList <String>lstFindAttributes = new ArrayList<String>();
		BaseObject bo = new BaseObject();
		lstFindAttributes.add("Name");
		lstFindAttributes.add("OptyId");
		lstFindAttributes.add("HDRRole_c");
		lstFindAttributes.add("BusinessClass_c");
		lstFindAttributes.add("MarketSectors_c");
		lstFindAttributes.add("PrimaryClient_c");
		lstFindAttributes.add("NAICSCodes_c");
		lstFindAttributes.add("NAICSDescription_c");
		lstFindAttributes.add("TotalContractCapacitys_c");
		lstFindAttributes.add("HDRPotentialCapacityGrosss_c");
		lstFindAttributes.add("HDRPotentialCapacityNets_c");
		lstFindAttributes.add("PrimaryClient_Id_c");
		bo.setOperator("=");
		bo.setViewCriteriaAttributeName(IOpportunityConstants.OPPORTUNITY_FIELD_OPTYID);
		bo.setViewCriteriaAttributeValue(optyId);
		bo.setListOfAttribute(lstFindAttributes);
		bo.setFetchSize(1);
		bo.setFetchStart(0);
		
	    List<Opportunity> lst = pursuitProjectServiceWS.get(bo);
	    log.info("<<GetOptyByOptyId");
		
		if(lst!=null && lst.size()>0){
			return lst.get(0);
		}else{
			throw new Exception("No opportunity with opty id:"+optyId+"  found for contract");
		}
	}
	
	
	public SalesCustomObjectService getService()
	{
				
		SalesCustomObjectService_Service objectService_Service = new SalesCustomObjectService_Service();
		SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });
		SalesCustomObjectService service = objectService_Service.getSalesCustomObjectServiceSoapHttpPort(securityFeatures);
		setWSBindingProvider(service,"https://caye-test.crm.us2.oraclecloud.com:443/opptyMgmtExtensibility/SalesCustomObjectService");
		return service;
	}


}
