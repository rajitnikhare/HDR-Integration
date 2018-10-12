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
import com.hdr.executor.job.impl.DataLoadProjectCostFeeExecutorServImpl;
import com.hdr.service.EntityService;
import com.hdr.sync.SyncObject;
import com.hdr.util.Constants;

@Repository("deleteProjectCostFee")
@Service
public class DeleteProjectCostFee implements SyncObject{
	/**
	 * Registering Logger for SyncCompanyObject.class
	 */
	private static final Logger log = Logger.getLogger(DeleteProjectCostFee.class);

	

	
	
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
		List<com.hdr.model.DeleteProjectCostFee> accountList = entityServiceDBaaS.findByNameQuery("GET_UNPROCESSED_PROJECT_COST_FEE_FOR_DELETE",new Object[]{Constants.SYNC_STATUS.READY.getVal()},50);
		while(accountList!=null && accountList.size()>0){
				recordCount = true;
				for (com.hdr.model.DeleteProjectCostFee p : accountList) {
					try {
						  p.setProcessState(Constants.SYNC_STATUS.READY.getVal()+countFlag);
						  entityServiceDBaaS.save(p);
					} catch (Exception e) {
						 log.error("Error occured while preparing child",e);
						 p.setProcessState("ERROR");
						 entityServiceDBaaS.save(p);
					   //Error Handling Happens here
					  //setErrorLog(e,"Error while syncing Project from ODS to OSC . Trace: ",p);
					}
				}
				countFlag++;
				accountList=null;
				accountList = entityServiceDBaaS.findByNameQuery("GET_UNPROCESSED_PROJECT_COST_FEE_FOR_DELETE",new Object[]{Constants.SYNC_STATUS.READY.getVal()},50);
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
				DataLoadProjectCostFeeExecutorServImpl obj = (DataLoadProjectCostFeeExecutorServImpl) context.getBean("dataLoadProjectCostFeeExecutorServImpl");
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
