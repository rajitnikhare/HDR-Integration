package com.hdr.service.impl;




import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.tool.FactorImports;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.ICompanyConstants;
import com.hdr.exception.FusionException;
import com.hdr.model.BaseObject;
import com.hdr.service.AccountServ;
import com.hdr.util.Constants;
import com.hdr.ws.stubs.accountService.Account;
import com.hdr.ws.stubs.accountService.AccountService;
import com.hdr.ws.stubs.accountService.AccountService_Service;
import com.hdr.ws.stubs.accountService.Conjunction;
import com.hdr.ws.stubs.accountService.DataObjectResult;
import com.hdr.ws.stubs.accountService.FindControl;
import com.hdr.ws.stubs.accountService.FindCriteria;
import com.hdr.ws.stubs.accountService.ObjectFactory;
import com.hdr.ws.stubs.accountService.PrimaryAddress;
import com.hdr.ws.stubs.accountService.ViewCriteria;
import com.hdr.ws.stubs.accountService.ViewCriteriaItem;
import com.hdr.ws.stubs.accountService.ViewCriteriaRow;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;


@Service
@Repository("accountServImpl")
public class AccountServImpl extends AbstractFCRMODWebService implements AccountServ {
	
	
	private static final Logger log = Logger.getLogger(AccountServImpl.class);

	private static final ObjectFactory objFactory = new ObjectFactory();

	
	
	
	
	@Override
	public Account find(BaseObject o) throws FusionException {
		if(o!=null){
			try {
				AccountService publicService = getService();
				
				FindCriteria findCriteria = new FindCriteria();
				findCriteria.setFetchSize(o.getFetchSize());
				findCriteria.setFetchStart(o.getFetchStart());
				/**
				 * Create View Criteria Item ---item
				 */
				ViewCriteriaItem viewCriteriaItem = new ViewCriteriaItem();
				viewCriteriaItem.setConjunction(Conjunction.AND);
				viewCriteriaItem.setUpperCaseCompare(false);
				viewCriteriaItem.setAttribute(o.getViewCriteriaAttributeName());
				viewCriteriaItem.setOperator(o.getOperator());
				viewCriteriaItem.getValue().add(o.getViewCriteriaAttributeValue());
				/**
				 * Create View Criteria Row ---group
				 */
				ViewCriteriaRow viewCriteriaRow = new ViewCriteriaRow();
				viewCriteriaRow.setConjunction(Conjunction.AND);
				viewCriteriaRow.setUpperCaseCompare(false);
				viewCriteriaRow.getItem().add(viewCriteriaItem);
				/**
				 * Create View Criteria---filter
				 */
				ViewCriteria viewCriteria = new ViewCriteria();
				viewCriteria.setConjunction(Conjunction.AND);
				viewCriteria.getGroup().add(viewCriteriaRow);


				findCriteria.setFilter(viewCriteria);
				findCriteria.setExcludeAttribute(false);
				if(o.getListOfAttribute()!=null && o.getListOfAttribute().size()>0){
					findCriteria.getFindAttribute().addAll(o.getListOfAttribute());
				}
				
				FindControl findControl = new FindControl();
				findControl.setRetrieveAllTranslations(true);
				
				DataObjectResult out = publicService.findAccount(findCriteria, findControl);
				if(out!=null && out.getValue()!=null && out.getValue().size()>0){
					return (Account) out.getValue().get(0);
					
				}
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		return null;
	}

	@Override
	public void update(com.hdr.model.Account a) throws FusionException {
		if(a!=null){
			try {
				AccountService publicService =  getService();
				Account acct =objFactory.createAccount();
				setAccountField(a, acct);
				publicService.updateAccount(acct);
			} catch (Exception e) {
				throw new FusionException(e);
			}
			
		}
		
	}
	
	/**
	 * WIP
	 */
	@Override
	public void create(com.hdr.model.Account a) throws FusionException {
		if(a!=null){
			try {
				AccountService publicService =  getService();
				Account acct =objFactory.createAccount();
				setAccountField(a, acct);
				publicService.createAccount(acct);
			} catch (Exception e) {
				throw new FusionException(e);
			}
			
		}
		
	}
	/**
	 * 
	 * @param a
	 * @param acct
	 */
	private void setAccountField(com.hdr.model.Account a, Account acct) {
		/**
		 * ID to update the child or Parent
		 */
		if(a.isChild()){
			if("UPDATE".equalsIgnoreCase(a.getOperation())) acct.setPartyId(a.getChildOscId());	
			/**	
			 * Associating the parent account if this account is a child and has a parent
			 */
			if(a.getParentOscId()!=null)acct.setParentAccountPartyId(objFactory.createAccountParentAccountPartyId(a.getParentOscId()));
			if(a.getClientAcctEbsId()!=null)acct.setOrganizationDEOEBSAccountIdC(objFactory.createAccountOrganizationDEOEBSAccountIdC(String.valueOf(a.getClientAcctNumber())));
			acct.setOrganizationName(a.getClientAcctName());
			/**
			 * Registry Id
			 */
			if(a.getRegistryId()!=null)acct.setOrganizationDEOEBSRegIdC(objFactory.createAccountOrganizationDEOEBSRegIdC(String.valueOf(a.getRegistryId())));
			/**
			 *Account Number 
			 */
			if(a.getClientAcctNumber()!=null)acct.setOrganizationDEOEBSAccountNumberC(objFactory.createAccountOrganizationDEOEBSAccountNumberC(String.valueOf(a.getClientAcctNumber())));
		}else{
			if("UPDATE".equalsIgnoreCase(a.getOperation())) acct.setPartyId(a.getParentOscId());
			acct.setOrganizationName(a.getClientPrtyName());
			if(a.getClientAcctEbsPartyId()!=null)acct.setOrganizationDEOEBSPartyIdC(objFactory.createAccountOrganizationDEOEBSPartyIdC(String.valueOf(a.getClientAcctEbsPartyId())));
		}
		
		/**
		 * If Type  =  Active Then Account Type= 'Billing'
		 */
		if("ACTIVE".equalsIgnoreCase(a.getType()))acct.setType(objFactory.createAccountType(ICompanyConstants.ACCOUNT_TYPE_PROSPECT.ZCA_CUSTOMER.getVal()));
		
		/**
		 * Market Sector
		 */
		acct.setOrganizationDEOMarketSectorC(a.getPrimaryMarketSector());
		/**
		 * 
		 * Address Related Details
		 */
		PrimaryAddress addressOsc  =  objFactory.createPrimaryAddress();
		acct.setPrimaryAddress(addressOsc);
		/**
		 * Address Line 1
		 * 
		 */
		addressOsc.setAddressLine1(objFactory.createPrimaryAddressAddressLine1(a.getAddressLie1()));
		/**
		 * City
		 */
		addressOsc.setCity(objFactory.createPrimaryAddressCity(a.getCity()));
		/**
		 * State
		 */
		addressOsc.setState(objFactory.createPrimaryAddressState(a.getState()));
		/**
		 * Postal Code
		 */
		addressOsc.setPostalCode(objFactory.createPrimaryAddressPostalCode(a.getPostalCode()));
		/**
		 * Country
		 *TODO: COUNTR IS MANDARE < WAS ADDED BY ME WITHOUT INFORMING PRAMOD IN DATABASE< BUT I DO NOT SEE IN STUBS NOW 
		 */
		addressOsc.setCountry(a.getCountry());
	}
	
	@Override
	public void updateDataload(com.hdr.model.Account a) throws FusionException {
		if(a!=null){
			try {

				AccountService publicService =  getService();
				Account acct =objFactory.createAccount();
				acct.setPartyId(a.getChildOscId());
				acct.setOrganizationDEOEBSAccountIdC(objFactory.createAccountOrganizationDEOEBSAccountIdC(String.valueOf(a.getClientAcctEbsId())));
				publicService.updateAccount(acct);
				
			
			} catch (Exception e) {
				throw new FusionException(e);
			}
			
		}
		
	}
	
	/**
	 * 
	 * @return
	 */
	private AccountService getService() {
		AccountService_Service service = new AccountService_Service();
		SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });
		AccountService publicService = service.getAccountServiceSoapHttpPort(securityFeatures);
		setWSBindingProvider(publicService,"https://caye-test.crm.us2.oraclecloud.com:443/crmCommonSalesParties/AccountService");
		return publicService;
		
	}

	@Override
	public Account findTopNumber(BaseObject o) throws FusionException {
		if(o!=null){
			try {
				AccountService publicService = getService();
				
				FindCriteria findCriteria = new FindCriteria();
				findCriteria.setFetchSize(o.getFetchSize());
				findCriteria.setFetchStart(o.getFetchStart());
				
				findCriteria.setExcludeAttribute(false);
				if(o.getListOfAttribute()!=null && o.getListOfAttribute().size()>0){
					findCriteria.getFindAttribute().addAll(o.getListOfAttribute());
				}
				
				FindControl findControl = new FindControl();
				findControl.setRetrieveAllTranslations(true);
				
				DataObjectResult out = publicService.findAccount(findCriteria, findControl);
				if(out!=null && out.getValue()!=null && out.getValue().size()>0){
					return (Account) out.getValue().get(0);
					
				}
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		return null;
	}
	
	


	
	}
