package com.hdr.sync.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.mail.MessagingException;

import org.apache.commons.collections.map.HashedMap;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.IContractConstants;
import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.dbaas.ErrorLogDBAASDao;
import com.hdr.job.impl.CompanyODSToOSCSyncJob;
import com.hdr.model.BaseObject;
import com.hdr.model.Contract;
import com.hdr.service.ContractServ;
import com.hdr.service.DbUtilityServ;
import com.hdr.service.EntityService;
import com.hdr.service.MailServ;
import com.hdr.sync.SyncObject;
import com.hdr.util.CommonUtil;
import com.hdr.util.Constants;
import com.hdr.util.ErrorMsgUtil;
import com.hdr.util.PropFileUtil;
import com.hdr.ws.stubs.customeObject.ContractC;
/**
 * 
 * @author jeevan
 *
 */
@Repository("syncContractODSToOSC")
@Service
public class SyncContractODSToOSC implements SyncObject{
	/**
	 * Registering Logger for SyncContract.class
	 */
	private static final Logger log = Logger.getLogger(SyncContractODSToOSC.class);

	@Resource
	private ContractServ contractWS;
	
	@Resource
	private ErrorLogDBAASDao errorLogDbaaSDao;
	
	@Resource
	private DbUtilityServ dbUtil;
	
	@Resource
	private MailServ mailServ;
	

	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityServiceDBaaS;

	@Resource(name = "entityServiceImplEBS")
	private EntityService entityServiceEBS;

	/**
	 * Main Method
	 */
	@Override
	public void syncObject() throws Exception {
		process();
	}

	private void process() throws Exception {
		/**
		 * We will get unprocessed contract where (PROCESS_STATE = 'READY') or (PROCESS_STATE='ERROR' and RETRY_COUNT<3)
		 */
		log.info(">> Fetching Unproccesed Records from Database");
		List<Contract> contractHeaderList = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_CONTRACT_HEADER);
		boolean isErrorred=false;
		while(contractHeaderList!=null && contractHeaderList.size()>0){
				for (Contract p : contractHeaderList) {
					try {
						dbUtil.updateDbStatus(p, Constants.SYNC_STATUS.IN_PROGRESS.getVal(), null);
						Contract preparedContract =prepareObjectWithSuitableOperation(p);
						if(Constants.HDR_OPERATION.CREATE.toString().equalsIgnoreCase(preparedContract.getOperation())){
							contractWS.createContract(preparedContract);
						}else{
							contractWS.updateContract(preparedContract);
						}
						dbUtil.updateDbStatus(p, Constants.SYNC_STATUS.COMPLETED.getVal(), null);
					} catch (Exception e) {
					 isErrorred = true;
					 log.error("Error occured while update/Insert for contract",e);
					 dbUtil.updateDbStatus(p, Constants.SYNC_STATUS.ERROR.getVal(), e);
					 //Error Handling Happens here
					 setErrorLog(e,"Error while syncing Contract from ODS to OSC . Trace: ",p);
					}
				}
		contractHeaderList=null;
		contractHeaderList = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_CONTRACT_HEADER);
		}
		
		if(isErrorred){sentNotificationMail();}
	}
	
		@SuppressWarnings({ "unchecked", "rawtypes" })
		private void sentNotificationMail() throws MessagingException {
		log.info("BUGLIST:1987: 1.. Initiating Mail...");
		Map m = new HashedMap();
		m.put("objectName", "CONTRACT");
		m.put("direction", "ODS to OSC");
		m.put("error_log_table", "ODS_OSC_ERROR_LOG");
		m.put("tableName", "XXHDR_IN_CONTRACT_STG");
		m.put("hostAddress", PropFileUtil.getValue(Constants.FCRMOD_URL));
		m.put("loginId",  PropFileUtil.getValue(Constants.FCRMOD_USERNAME));
		log.info("BUGLIST:1987: 2.. Mail Content Prepared...");
		try {
			mailServ.sendMail(CommonUtil.getSystemPropertyValue("EMAIL_NOTIFICATION_FROM"),CommonUtil.getSystemPropertyValue("EMAIL_NOTIFICATION_TO").split(","), m.get("direction")+ " - " +m.get("objectName"), "template/summary_email_notification_job_cr.vm",m);	
		} catch (Exception e) {
			log.error("Error occured while sending out notification mail",e);
			log.info("BUGLIST:1987: 3 Error occured: " +e );
		}
		
	}
	/**
	 * 
	 * @param contractHeader
	 * @return
	 * @throws Exception
	 */
	private Contract prepareObjectWithSuitableOperation(Contract contractHeader) throws Exception {
		if(contractHeader!=null){
			Long ebsId = contractHeader.getEbsContractId();
			/**
			 * We will query Oracle Sales Cloud to See if this contract header is present
			 * 
			 */	
			if(ebsId==null){
				throw new Exception("EBS can not be null");
			}
			 BaseObject o =getQueryParam(String.valueOf(ebsId));
			 ContractC out = contractWS.find(o);
				if(out!=null){
				/**
				 *  Then Strategize the merge
				 */
				  contractHeader.setContractOscId(out.getId());
				  contractHeader.setOperation(Constants.HDR_OPERATION.UPDATE.toString());
				}else{
					/**
					 * This is a brand new header we will simply create contract with all the child
					 */
					contractHeader.setOperation(Constants.HDR_OPERATION.CREATE.toString());
				}
				return contractHeader;
		}
		return null;
	}
	
	/**
	 * 
	 * @param ebsId
	 * @return
	 */
	private BaseObject getQueryParam(String ebsId) {
		BaseObject o = new BaseObject();
		o.setViewCriteriaAttributeName(IContractConstants.CONTRACT_FIELD_RECORD_NAME);
		o.setViewCriteriaAttributeValue(ebsId);
		o.setOperator(Constants.FUSION_EQUALS_OPERATOR);
		o.setFetchSize(1);
		o.setFetchStart(0);
		List<String> findAttribList = new ArrayList<String>();
		findAttribList.add(IContractConstants.CONTRACT_FIELD_RECORD_NAME);
		findAttribList.add(IContractConstants.CONTRACT_FIELD_ID);
		o.setListOfAttribute(findAttribList);
		
		return o;
	}
	/**
	 * 
	 * @param e
	 * @param customMessage
	 * @param p
	 */
	private void setErrorLog(Exception e, String customMessage, Contract p) {
		int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
		String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
		emsg = customMessage+emsg;
		log.error(emsg);
				
		String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.ODS_TO_FUSION.toString();
		String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.CONTRACT.getVal();
		String tableName = IErrorLogConstants.TABLE_NAMES.CONTRACT_ODS_OSC_STG.getVal();
		String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
		String primaryKeyValue = null;
		if(p!=null)primaryKeyValue = p.getEbsContractId().toString();
		errorLogDbaaSDao.logSyncError(objectName, direction, emsg, primaryKey, primaryKeyValue, CompanyODSToOSCSyncJob.class.getSimpleName(),tableName);
	}
}
