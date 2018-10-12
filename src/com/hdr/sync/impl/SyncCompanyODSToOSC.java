package com.hdr.sync.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.map.HashedMap;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.ICompanyConstants;
import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.dbaas.ErrorLogDBAASDao;
import com.hdr.exception.FusionException;
import com.hdr.job.impl.CompanyODSToOSCSyncJob;
import com.hdr.model.Account;
import com.hdr.model.BaseObject;
import com.hdr.service.AccountServ;
import com.hdr.service.DbUtilityServ;
import com.hdr.service.EntityService;
import com.hdr.service.MailServ;
import com.hdr.sync.SyncObject;
import com.hdr.util.CommonUtil;
import com.hdr.util.Constants;
import com.hdr.util.ErrorMsgUtil;
import com.hdr.util.PropFileUtil;

@Repository("syncCompanyODSToOSC")
@Service
public class SyncCompanyODSToOSC implements SyncObject {

	/**
	 * Registering Logger for SyncCompanyObject.class
	 */
	private static final Logger log = Logger.getLogger(SyncCompanyODSToOSC.class);

	@Resource
	private AccountServ accountServ;

	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityServiceDBaaS;

	@Resource(name = "entityServiceImplEBS")
	private EntityService entityServiceEBS;
	
	@Resource
	private ErrorLogDBAASDao errorLogDbaaSDao;
	
	@Resource
	private DbUtilityServ dbUtil;
	
	
	@Resource
	private MailServ mailServ;

	/**
	 * Main Method
	 */
	@Override
	public void syncObject() throws Exception {
		process(true);//This will process parent account
		process(false);// This will process child account
	}

	@SuppressWarnings("unchecked")
	private void process(boolean isParent) {

		log.info(">>syncCompanyODStoOSC");
		try {
			/**
			 * Query All the account from DBaas where (Sync_status ='READY' or Sync_status='FAILED' and retry_count<3)
			 * 
			 */
			boolean isErrored = false;
			/**
			 * GET_UNPROCESSED_ACCOUNT : select o from com.hdr.model.Account o where ((PROCESS_STATE='READY') or (PROCESS_STATE='ERROR' and RETRY_COUNT<3))
			 */
			String queryFlag  = null;
			if(isParent){
				queryFlag = Constants.GET_UNPROCESSED_PARENT_ACCOUNT;
			}else{
				queryFlag = Constants.GET_UNPROCESSED_CHILD_ACCOUNT;
			}
			List<Account> unprocessedAccounts = entityServiceDBaaS.findByNameQuery(queryFlag);
			log.info("checking  whether data is there or not");
			while (unprocessedAccounts != null &&  unprocessedAccounts.size() > 0) {
				for (Account accountFromDBAS : unprocessedAccounts){
					try {
						dbUtil.updateDbStatus(accountFromDBAS,Constants.SYNC_STATUS.IN_PROGRESS.getVal(),null);
						upload(accountFromDBAS);
						dbUtil.updateDbStatus(accountFromDBAS,Constants.SYNC_STATUS.COMPLETED.getVal(),null);
					} catch (Exception e) {
						isErrored = true;
						log.error("Error Occured While Syncing Account from DBAS to OSC:"+ e);
						dbUtil.updateDbStatus(accountFromDBAS,Constants.SYNC_STATUS.ERROR.getVal(),e);
						log.error(e);
						setErrorLog(e,"Error while syncing Company from ODS to OSC . Trace: ",accountFromDBAS);	
					}
				}
				unprocessedAccounts=null;
				unprocessedAccounts = entityServiceDBaaS.findByNameQuery(queryFlag);
			}
			if(isErrored){sentNotificationMail();}
			
		} catch (Exception e) {
			log.error("Error occured while syncing account from DBAS to OSC", e);
		}
		log.info("<<syncCompanyODStoOSC");
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void sentNotificationMail() {
		Map m = new HashedMap();
		m.put("objectName", "COMPANY");
		m.put("direction", "ODS to OSC");
		m.put("error_log_table", "ODS_OSC_ERROR_LOG");
		m.put("tableName", "XXHDR_IN_ACCOUNT_STG");
		m.put("hostAddress", PropFileUtil.getValue(Constants.FCRMOD_URL));
		m.put("loginId",  PropFileUtil.getValue(Constants.FCRMOD_USERNAME));
		try {
			mailServ.sendMail(CommonUtil.getSystemPropertyValue("EMAIL_NOTIFICATION_FROM"),CommonUtil.getSystemPropertyValue("EMAIL_NOTIFICATION_TO").split(","), m.get("direction")+ " - " +m.get("objectName"), "template/summary_email_notification_job_cr.vm",m);	
		} catch (Exception e) {
			log.error("Error occured while sending out notification mail",e); 		
		}
		
	}

	/**
	 * 
	 * @param e
	 * @param customMessage
	 * @param accountFromDBAS
	 */
	private void setErrorLog(Exception e, String customMessage, Account accountFromDBAS) {
		int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
		String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
		String customMsg="Error while syncing Company from ODS to OSC . Trace: ";
		emsg = customMessage+emsg;
		log.error(emsg);
				
		String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.ODS_TO_FUSION.toString();
		String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.COMPANY.getVal();
		String tableName = IErrorLogConstants.TABLE_NAMES.COMPANY_ODS_OSC_STG.getVal();
		String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
		String primaryKeyValue = null;
		if(accountFromDBAS!=null)primaryKeyValue = accountFromDBAS.getClientAcctEbsId().toString();
		errorLogDbaaSDao.logSyncError(objectName, direction, emsg, primaryKey, primaryKeyValue, CompanyODSToOSCSyncJob.class.getSimpleName(),tableName);
	}
	/**
	 * 
	 * @param accountFromDBAS
	 * @throws Exception
	 */
	private void upload(Account accountFromDBAS) throws Exception {
		try {
			log.info("starting of uploadAccountfromDBASToOscByEbsId ......");
			log.info(">>determining if account is a child or a parent..");
			determine(accountFromDBAS);
			log.info(">>determining if account is a child or a parent complete..");
			com.hdr.ws.stubs.accountService.Account accountC = null;
			if(accountFromDBAS.isChild()){
				findChildAssociateParentAndDetermineOperation(accountFromDBAS);
				}else{
				findParentAndDetermineOperation(accountFromDBAS);
			}
			if("CREATE".equalsIgnoreCase(accountFromDBAS.getOperation())){
				accountServ.create(accountFromDBAS);
			}else{
				accountServ.update(accountFromDBAS);
			}
			
			
		} catch (Exception e) {
			throw e;
		}

	}

	private void findParentAndDetermineOperation(Account accountFromDBAS) throws FusionException {
		com.hdr.ws.stubs.accountService.Account accountC;
		Long ebsPartyId = accountFromDBAS.getClientAcctEbsPartyId();
		if (ebsPartyId != null) {
			accountC = accountServ.find(getQueryParam("PARENT", ebsPartyId));
			if (accountC != null) {
				accountFromDBAS.setParentOscId(accountC.getPartyId());
				accountFromDBAS.setOperation("UPDATE");
			} else {
				accountFromDBAS.setOperation("CREATE");
			}
		}
	}

	private void findChildAssociateParentAndDetermineOperation(Account accountFromDBAS) throws FusionException, Exception {
		com.hdr.ws.stubs.accountService.Account accountC;
		Long ebsId = accountFromDBAS.getClientAcctEbsId();
		if(ebsId!=null){
			accountC = accountServ.find(getQueryParam("CHILD",ebsId));
			if(accountC!=null){
				accountFromDBAS.setChildOscId(accountC.getPartyId());
				accountFromDBAS.setOperation("UPDATE");
			}else{
				accountFromDBAS.setOperation("CREATE");
			}
		}
		
		Long ebsPartyId = accountFromDBAS.getClientAcctEbsPartyId();
		if(ebsPartyId!=null){
			accountC = accountServ.find(getQueryParam("PARENT",ebsPartyId));
			if(accountC!=null){
				accountFromDBAS.setParentOscId(accountC.getPartyId());
			}else{
				throw new Exception("No Party (Parent) was fount with id: "+ ebsPartyId);
			}
  }
	}
	/**
	 * 
	 * @param a
	 * @throws Exception
	 */
	private void determine(Account a) throws Exception {
		try {
			/**LOGIC
			 * if EBS Account Id is present and EBS Party Id blank, account is a child
			 * if EBS Account Id is present and EBS Party Id present, account is a child
			 * if EBS Account Id is absent  and EBS Party Id is present,account is a parent
			 */
			if(a.getClientAcctEbsId()!=null){
				 a.setChild(true);
			}else{
				a.setChild(false);
			}
		} catch (Exception e) {
			throw new Exception("Error occured while determing if account is a parent or child: ",e);
		}
		
	}

	/**
	 * 
	 * @param hier
	 * @param id
	 * @return
	 */
	private BaseObject getQueryParam(String hier, Long id) {
		BaseObject o = null;
		if(hier!=null){
			o = new BaseObject();
			o.setFetchSize(1);
			o.setFetchStart(0);
			if("CHILD".equalsIgnoreCase(hier)){
				o.setViewCriteriaAttributeName(ICompanyConstants.ACCOUNT_FIELD_EBS_ACCOUNT_ID);
			}else if("PARENT".equalsIgnoreCase(hier)){
				o.setViewCriteriaAttributeName(ICompanyConstants.ACCOUNT_FIELD_EBS_PARTY_ID);
			}
			o.setViewCriteriaAttributeValue(id.toString());
			o.setOperator(Constants.FUSION_EQUALS_OPERATOR);
			List<String> findAttrib = new ArrayList<String>();
			findAttrib.add(ICompanyConstants.ACCOUNT_FIELD_PARTY_ID);
			o.setListOfAttribute(findAttrib);;
		}
		return o;
		
	}


}
