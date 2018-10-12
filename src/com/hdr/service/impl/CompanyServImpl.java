package com.hdr.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.ICompanyConstants;
import com.hdr.exception.FusionException;
import com.hdr.model.BaseModel;
import com.hdr.model.BaseObject;
import com.hdr.model.CompanyAcklg;
import com.hdr.model.LocationAcklg;
import com.hdr.service.CompanyServ;
import com.hdr.util.CommonUtil;
import com.hdr.util.Constants;
import com.hdr.util.PropFileUtil;
import com.hdr.ws.stubs.accountService.Account;
import com.hdr.ws.stubs.accountService.AccountService;
import com.hdr.ws.stubs.accountService.AccountService_Service;
import com.hdr.ws.stubs.accountService.Conjunction;
import com.hdr.ws.stubs.accountService.DataObjectResult;
import com.hdr.ws.stubs.accountService.FindControl;
import com.hdr.ws.stubs.accountService.FindCriteria;
import com.hdr.ws.stubs.accountService.ObjectFactory;
import com.hdr.ws.stubs.accountService.ServiceException;
import com.hdr.ws.stubs.accountService.ViewCriteria;
import com.hdr.ws.stubs.accountService.ViewCriteriaItem;
import com.hdr.ws.stubs.accountService.ViewCriteriaRow;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;

@Service
@Repository("companyServImpl")
public class CompanyServImpl  extends AbstractFCRMODWebService  implements CompanyServ{
	
	private static final Logger log = Logger.getLogger(CompanyServImpl.class);
	
	private static final com.hdr.ws.stubs.accountService.ObjectFactory factory =  new ObjectFactory();

	@Override
	public List<Object> findByEBSIntegrationStatus(BaseModel o) throws FusionException {
		if(o!=null){
			try {
				//AccountService_Service service = new AccountService_Service();
				//AccountService publicService = service.getAccountServiceSoapHttpPort();
				//setWSBindingProvider(publicService, "https://caye-test.crm.us2.oraclecloud.com:443/crmCommonSalesParties/AccountService");
				AccountService publicService = getService();
				
				
				ViewCriteriaItem criteriaItemA = new ViewCriteriaItem();
				criteriaItemA.setConjunction(Conjunction.AND);
				criteriaItemA.setAttribute(ICompanyConstants.ACCOUNT_FIELD_TYPE);
				criteriaItemA.setOperator(Constants.FUSION_EQUALS_OPERATOR);
				criteriaItemA.getValue().add(ICompanyConstants.ACCOUNT_TYPE_PROSPECT.ZCA_PROSPECT.getVal());
				
				ViewCriteriaItem criteriaItemB = new ViewCriteriaItem();
				criteriaItemB.setConjunction(Conjunction.AND);
				criteriaItemB.setAttribute(ICompanyConstants.ACCOUNT_FIELD_EBS_INTEGRATION_STATUS);
				criteriaItemB.setOperator(Constants.FUSION_EQUALS_OPERATOR);
				criteriaItemB.getValue().add(ICompanyConstants.ACCOUNT_FUSION_INTEGRATION_STATUS.TO_BE_PROCESSED.getVal());

				
				ViewCriteriaRow criteriaRowA = new ViewCriteriaRow();
				criteriaRowA.setConjunction(Conjunction.AND);
				criteriaRowA.getItem().add(criteriaItemA);
				
				
				ViewCriteriaRow criteriaRowB = new ViewCriteriaRow();
				criteriaRowB.setConjunction(Conjunction.AND);
				criteriaRowB.getItem().add(criteriaItemB);
				
				
				
				ViewCriteria criteria = new ViewCriteria();
				criteria.setConjunction(Conjunction.AND);
				criteria.getGroup().add(criteriaRowA);
				criteria.getGroup().add(criteriaRowB);
				
				
				FindControl findControl = new FindControl();
				findControl.setRetrieveAllTranslations(false);
				
				FindCriteria findCriteria = new FindCriteria();
				//findCriteria.setFetchSize(10);
				findCriteria.setFetchSize(o.getFetchSize());
				findCriteria.setFetchStart(o.getFetchStart());
				findCriteria.setFilter(criteria);
				
				
			     DataObjectResult acctList = publicService.findAccount(findCriteria, findControl);
			     if(acctList!=null && acctList.getValue()!=null && acctList.getValue().size()>0){
			    	return  acctList.getValue();
			     }
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		return null;
	}

	@Override
	public void updateEBSIntegrationStaus(String status, Long id) throws FusionException {
		if(status!=null && id!=null){
			try {
				//AccountService_Service service = new AccountService_Service();
				//AccountService publicService = service.getAccountServiceSoapHttpPort();
				//setWSBindingProvider(publicService, "https://caye-test.crm.us2.oraclecloud.com:443/crmCommonSalesParties/AccountService");
				AccountService publicService = getService();
				Account a = factory.createAccount();
				a.setPartyId(id);
				a.setOrganizationDEOEBSIntegrationStatusC(factory.createAccountOrganizationDEOEBSIntegrationStatusC(status));
				publicService.updateAccount(a);
				
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		
		
		
	}

	@Override
	public void updateCompanyAcklg(CompanyAcklg c) throws FusionException {
		if(c!=null){
			try {
				AccountService publicService = getService();
				boolean isParent = false;
		
				/*if(c.getOscPartyId()==null && c.getEbsAccountId()!=null && c.getEbsAccountId().toString()!=null){
					Account a = findPartyIdByEBSId(c.getEbsAccountId(),false);
					if(a!=null){
						c.setOscPartyId(a.getPartyId());	
					}else{
						log.info("No Account found with EBS id: "+c.getEbsAccountId());
						throw new Exception("Since OSC ids where missing, queried OSC with EBS is:"+c.getEbsAccountId()+" , but fund no records with this ID");
					}
					
				}else{
					log.info("This condition means that Deloitte has failed to send EBS specific Ids");
					throw new Exception("Deloitte has failed to send EBS specific Ids at child level");
				}*/
				
				if(c.getEbsAccountId()!=null){
					isParent = false;
				}else{
					isParent = true;
				}
				
				Account a = factory.createAccount();
				if(isParent){
					if(c.getEbsPartyId()!=null)a.setOrganizationDEOEBSPartyIdC(factory.createAccountOrganizationDEOEBSPartyIdC(c.getEbsPartyId().toString()));;
					if(c.getRegistryId()!=null)a.setOrganizationDEOEBSRegIdC(factory.createAccountOrganizationDEOEBSRegIdC(c.getRegistryId()));
					a.setOrganizationDEOEBSIntegrationStatusC(factory.createAccountOrganizationDEOEBSIntegrationStatusC(Constants.ACCOUNT_FUSION_INTEGRATION_STATUS.Completed.toString()));
				}else{
					if(c.getEbsAccountId()!=null) a.setOrganizationDEOEBSAccountIdC(factory.createAccountOrganizationDEOEBSAccountIdC(c.getEbsAccountId().toString()));
					if(c.getAccountNumber()!=null)a.setOrganizationDEOEBSAccountNumberC(factory.createAccountOrganizationDEOEBSAccountNumberC(String.valueOf(c.getAccountNumber())));
					a.setOrganizationDEOEBSIntegrationStatusC(factory.createAccountOrganizationDEOEBSIntegrationStatusC(Constants.ACCOUNT_FUSION_INTEGRATION_STATUS.Completed.toString()));
				}
				
				a.setPartyId(c.getOscPartyId());
				/**
				 * TYPE id profile class is BILLING
				 */
				if("ACTIVE".equalsIgnoreCase(c.getProfileClass()))a.setType(factory.createAccountType(ICompanyConstants.ACCOUNT_TYPE_PROSPECT.ZCA_CUSTOMER.getVal()));
				publicService.updateAccount(a);
				if(!isParent)updateParentCompanyAcklg(c,publicService);
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		
	}

	private Account findPartyIdByEBSId(Long ebsIs, boolean isParent) throws ServiceException {
		BaseObject bo = new BaseObject();
		bo.setFetchSize(1);
		bo.setFetchStart(0);
		if(isParent){
			bo.setViewCriteriaAttributeName(ICompanyConstants.ACCOUNT_FIELD_EBS_PARTY_ID);	
		}else{
			bo.setViewCriteriaAttributeName(ICompanyConstants.ACCOUNT_FIELD_EBS_ACCOUNT_ID);	
		}
		
		bo.setOperator(Constants.FUSION_EQUALS_OPERATOR);
		bo.setViewCriteriaAttributeValue(ebsIs.toString());
		
		
		List<String> findAttribList =  new ArrayList<String>();
		findAttribList.add(ICompanyConstants.ACCOUNT_FIELD_PARTY_ID);
		bo.setListOfAttribute(findAttribList);
		
		List<Object> out = findAccount(bo);
		if(out!=null && !out.isEmpty()){
			return (Account)out.get(0);
		}
		return null;
	}

	@Override
	public void updateParentCompanyAcklg(CompanyAcklg c, AccountService publicService) throws FusionException {
		if(c!=null){
			try {
				if(publicService==null){
					 publicService = getService();
				}
				Account a = factory.createAccount();
				
				/*if(c.getOscParentId()==null && c.getEbsPartyId()!=null && c.getEbsPartyId().toString()!=null){
					Account pA = findPartyIdByEBSId(c.getEbsPartyId(),true);
					if(pA!=null){
						c.setOscParentId(pA.getPartyId());	
					}else{
						log.info("No Parent Account found with EBS parent id: "+c.getEbsPartyId());
						throw new Exception("Since OSC ids where missing, queried OSC with Parent EBS id:"+c.getEbsPartyId()+" , but fund no records with this ID");
					}
				}else{
					log.info("This condition means that Deloitte has failed to send EBS specific Ids");
					throw new Exception("Deloitte has failed to send EBS specific Ids at Parent level");
				}*/
				a.setPartyId(c.getOscParentId());
				/**
				 * EBS id of Parent
				 */
				if(c.getEbsPartyId()!=null) a.setOrganizationDEOEBSPartyIdC(factory.createAccountOrganizationDEOEBSPartyIdC(c.getEbsPartyId().toString()));
				/**
				 * Integration Status = 'Completed'
				 */
				a.setOrganizationDEOEBSIntegrationStatusC(factory.createAccountOrganizationDEOEBSIntegrationStatusC(Constants.ACCOUNT_FUSION_INTEGRATION_STATUS.Completed.toString()));
				/**
				 * Registry Id
				 */
				if(c.getRegistryId()!=null)a.setOrganizationDEOEBSRegIdC(factory.createAccountOrganizationDEOEBSRegIdC(c.getRegistryId()));
				/**
				 * Type if profile class is billing
				 */
				if("ACTIVE".equalsIgnoreCase(c.getProfileClass()))a.setType(factory.createAccountType("ZCA_CUSTOMER"));
				publicService.updateAccount(a);
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		
	}
	
	@Override
	public Account getById(Long id) throws FusionException {
		if(id!=null){
			try {
				//AccountService_Service service = new AccountService_Service();
				//AccountService publicService = service.getAccountServiceSoapHttpPort();
				//setWSBindingProvider(publicService, "https://caye-test.crm.us2.oraclecloud.com:443/crmCommonSalesParties/AccountService");
				AccountService publicService = getService();
				
				DataObjectResult out = publicService.getAccount(id);
				if(out!=null && out.getValue()!=null){
					return (Account) out.getValue().get(0);
				}
				
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		return null;
	} 


	@Override
	public List<Object> findAccount(BaseObject bo) throws ServiceException
	{
		log.info(">>findAccount");
		
		AccountService service = getService();

		FindCriteria findCriteria = new FindCriteria();
		FindControl findControl = new FindControl();
		findCriteria.setFetchSize(bo.getFetchSize());
		findCriteria.setFetchStart(bo.getFetchStart());
		findCriteria.getFindAttribute().addAll(bo.getListOfAttribute());
		
		ViewCriteriaItem criteriaItemHeader = new ViewCriteriaItem();
		criteriaItemHeader.setConjunction(Conjunction.AND);
		criteriaItemHeader.setUpperCaseCompare(false);
		criteriaItemHeader.setAttribute(bo.getViewCriteriaAttributeName());
		criteriaItemHeader.setOperator(bo.getOperator());
		criteriaItemHeader.getValue().add(bo.getViewCriteriaAttributeValue());

		
		ViewCriteriaRow viewCriteriaRowHeader = new ViewCriteriaRow();
		viewCriteriaRowHeader.setConjunction(Conjunction.AND);
		viewCriteriaRowHeader.setUpperCaseCompare(false);
		viewCriteriaRowHeader.getItem().add(criteriaItemHeader);
		
		
		
		ViewCriteria criteriaHeader = new ViewCriteria();
		criteriaHeader.setConjunction(Conjunction.AND);
		criteriaHeader.getGroup().add(viewCriteriaRowHeader);
		
		
		
		findCriteria.setFilter(criteriaHeader);
		findCriteria.setExcludeAttribute(false);
		findControl.setRetrieveAllTranslations(true);
		
		
		 DataObjectResult list=service.findAccount(findCriteria, findControl);
		 
		 List<Object> objectList = list.getValue();
		 if(objectList!=null&&!objectList.isEmpty())
		 {
			 log.info("Account(s) found");
		 }
		 else
			 log.info("No account found");
		
		
		
		log.info("<<findEmployee");
		
		return objectList;
	}
	
	private AccountService getService() {
		
		AccountService_Service service = new AccountService_Service();
		SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });
		AccountService publicService = service.getAccountServiceSoapHttpPort(securityFeatures);
		setWSBindingProvider(publicService,"https://caye-test.crm.us2.oraclecloud.com:443/crmCommonSalesParties/AccountService");
		return publicService;
	}



	
	
}
