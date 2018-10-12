package com.hdr.job;

import org.apache.log4j.Logger;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.scheduling.quartz.QuartzJobBean;

@DisallowConcurrentExecution
@PersistJobDataAfterExecution
public abstract class AbstractQuartzJob extends QuartzJobBean {
	private static final Logger log = Logger.getLogger(AbstractQuartzJob.class);
	
	@Override
	protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
		try {			
			executeJob(context);
		} catch (Exception e) {
			log.error("Error in scheduler:",e);
		}
	}
	
	/**
	 * Perform the job
	 * 
	 * @param context
	 */
	protected abstract void executeJob(JobExecutionContext context);
}
