package com.hdr.sync.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.dbaas.ErrorLogDBAASDao;
import com.hdr.job.impl.CompanyODSToOSCSyncJob;
import com.hdr.model.BaseObject;
import com.hdr.model.Employee;
import com.hdr.service.DbUtilityServ;
import com.hdr.service.EmployeeServ;
import com.hdr.service.EntityService;
import com.hdr.sync.SyncObject;
import com.hdr.util.Constants;
import com.hdr.util.ErrorMsgUtil;
import com.hdr.ws.stubs.customeObject.EmployeesC;

@Repository("dataLoadSyncEmployeeODSToOSC")
@Service
public class DataLoadSyncEmployeeODSToOSC implements SyncObject{
	/**
	 * Registering Logger for SyncCompanyObject.class
	 */
	private static final Logger log = Logger.getLogger(DataLoadSyncEmployeeODSToOSC.class);
	
	@Resource
	private EmployeeServ employeeWS;
	
	@Resource
	private DbUtilityServ dbutil;

	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityServiceDBaaS;

	@Resource(name = "entityServiceImplEBS")
	private EntityService entityServiceEBS;
	
	
	@Resource
	private ErrorLogDBAASDao errorLogDbaaSDao;
	
	/**
	 * Main Method
	 */
	@Override
	public void syncObject() throws Exception {
		process();
	}

	private void process() throws Exception {
		
		List<Employee> employeeHeaderList = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_EMPLOYEES_HEADER);
		
		while(employeeHeaderList!=null && employeeHeaderList.size()>0){
				for (Employee p : employeeHeaderList) {
					try {
						dbutil.updateDbStatus(p,Constants.SYNC_STATUS.IN_PROGRESS.getVal(),null);
						String e = p.getLegacyId();
						if(e==null || StringUtils.isBlank(e)){
							throw new Exception("Legacy Id is blank or null for records with employee id:"+ p.getEmployeeId());
						}
						/**
						 * We will query Oracle Sales Cloud to See if this project header is present using Legacy id
						 */	
						BaseObject o =getQueryParam(e);
						Object out =  employeeWS.find(o);
						if (out != null){	
							EmployeesC eOsc =  (EmployeesC) out;
							p.setOscId(eOsc.getId());
							employeeWS.mergeForDataLoad(p);
						}else{
							employeeWS.createForDataLoad(p);
							//throw new Exception("This records is skipped as it is a create operation");
						}					
					 dbutil.updateDbStatus(p,Constants.SYNC_STATUS.COMPLETED.getVal(),null);
					} catch (Exception e) {
					 dbutil.updateDbStatus(p,Constants.SYNC_STATUS.ERROR.getVal(),e);
					  setErrorLog(e,"Error while Data Load Employee from ODS to OSC . Trace: ",p);
					 log.error("Error occured while preparing child",e);
					 
					}
				}
				employeeHeaderList = null;
				employeeHeaderList = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_EMPLOYEES_HEADER);
				
		}
		
	}



	
	
	/**
	 * 
	 * @param e
	 * @param customMessage
	 * @param p
	 */
	private void setErrorLog(Exception e, String customMessage, Employee p) {
		int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
		String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
		emsg = customMessage+emsg;
		log.error(emsg);
				
		String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.ODS_TO_FUSION.toString();
		String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.EMPLOYEE.getVal();
		String tableName = IErrorLogConstants.TABLE_NAMES.EMPLOYEE_ODS_OSC_STG.getVal();
		String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
		String primaryKeyValue = null;
		if(p!=null)primaryKeyValue = p.getEmployeeId().toString();
		errorLogDbaaSDao.logSyncError(objectName, direction, emsg, primaryKey, primaryKeyValue, CompanyODSToOSCSyncJob.class.getSimpleName(),tableName);
	}
	
	private BaseObject getQueryParam(String e) {
		BaseObject o = new BaseObject();
		o.setViewCriteriaAttributeName("EmployeeLegacySystemID_c");		
		o.setOperator("=");
		o.setViewCriteriaAttributeValue(e);
		o.setFetchSize(2);
		o.setFetchStart(0);
		List<String> findAttribList = new ArrayList<String>();
		findAttribList.add("Id");
		findAttribList.add("EmployeeID_c");
		o.setListOfAttribute(findAttribList);
		return o;
	}

	
}

