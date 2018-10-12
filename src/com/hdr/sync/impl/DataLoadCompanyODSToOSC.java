package com.hdr.sync.impl;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.dao.dbaas.ErrorLogDBAASDao;
import com.hdr.executor.job.impl.DataLoadCompanyExecutorServImpl;
import com.hdr.model.Account;
import com.hdr.service.AccountServ;
import com.hdr.service.DbUtilityServ;
import com.hdr.service.EntityService;
import com.hdr.sync.SyncObject;
import com.hdr.util.Constants;

@Repository("dataLoadCompanyODSToOSC")
@Service
public class DataLoadCompanyODSToOSC implements SyncObject{
	/**
	 * Registering Logger for SyncCompanyObject.class
	 */
	private static final Logger log = Logger.getLogger(DataLoadCompanyODSToOSC.class);

	@Resource
	private AccountServ accountWS;
	
	@Resource
	private DbUtilityServ dbutil;
	
	
	@Resource
	private ErrorLogDBAASDao errorLogDbaaSDao;
	

	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityServiceDBaaS;

	@Resource(name = "entityServiceImplEBS")
	private EntityService entityServiceEBS;
	
	@Resource
	private ApplicationContext context;

	/**
	 * Main Method
	 */
	@Override
	public void syncObject() throws Exception {
		process();
	}

	private void process() throws Exception {
		int countFlag = 0;
		boolean recordCount = false;
		List<Account> accountList = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_ACCOUNT_DATALOAD,new Object[]{Constants.SYNC_STATUS.READY.getVal()},500);
		while(accountList!=null && accountList.size()>0){
				recordCount = true;
				for (Account p : accountList) {
					try {
						p.setProcessState(Constants.SYNC_STATUS.READY.getVal()+countFlag);
						entityServiceDBaaS.save(p);
					} catch (Exception e) {
						 log.error("Error occured while preparing child",e);
					     dbutil.updateDbStatus(p, Constants.SYNC_STATUS.ERROR.getVal(),new Exception("Error occured while preparing data for multi process data load"));
					   //Error Handling Happens here
					  //setErrorLog(e,"Error while syncing Project from ODS to OSC . Trace: ",p);
					}
				}
				countFlag++;
				accountList=null;
				accountList = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_ACCOUNT_DATALOAD,new Object[]{Constants.SYNC_STATUS.READY.getVal()},500);
		}
		//
		if(recordCount)initiateExecutor(countFlag);
	}

	private void initiateExecutor(int countFlag) throws Exception {
		ExecutorService executor = null;
		try {
		
			executor = Executors.newFixedThreadPool(countFlag);
		for (int i = 0; i <= countFlag; i++) {
			try {
				DataLoadCompanyExecutorServImpl obj = (DataLoadCompanyExecutorServImpl) context.getBean("dataLoadCompanyExecutorServImpl");
				obj.setSync_status(Constants.SYNC_STATUS.READY.getVal()+i);
				executor.submit(obj);
				
			} catch (Exception e) {
				executor.shutdown();
				throw new Exception("Error occured while submitting",e);
			
			}
		}
		executor.shutdown();
		try {
			executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
			} catch (InterruptedException e) {
			  throw new Exception("Error ocuured while threads were waitied for termination. : ",e);
			}
		} catch (Exception e) {
			throw e;
		}
	}

}
