package com.crmod.test;

 import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.addressing.client.ActionCallback;
import org.springframework.ws.soap.client.SoapFaultClientException;

import com.crmod.job.impl.AccountIntSyncJob;
import com.crmod.job.impl.CandidateEquityToFusionSyncJob;
import com.crmod.job.impl.ErrorNotificationsEmailSyncJob;
import com.crmod.job.impl.OpportunityFusionToEquitySyncJob;
import com.crmod.model.BaseObject;
import com.crmod.model.CreateOpportunity;
import com.crmod.model.CreateOpportunityResponse;
import com.crmod.model.ErrorLog;
import com.crmod.model.ErrorLogDTO;
import com.crmod.model.FindControl;
import com.crmod.model.FindCriteria;
import com.crmod.model.FindOpporunity;
import com.crmod.model.Opportunity;
import com.crmod.model.OpportunityResponse;
import com.crmod.model.SystemProperty;
import com.crmod.service.EntityService;
import com.crmod.service.OpportunityServc;
import com.crmod.service.SalesPartyServc;
import com.crmod.service.impl.FCRMODWebService;
import com.crmod.util.CommonUtil;
import com.crmod.util.Constants;
import com.crmod.util.PropFileUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/META-INF/spring/applicationContext.xml",
		"classpath:/META-INF/spring/app-datasource-config.xml",
		"classpath:/META-INF/spring/app-mail.xml" })
//@ContextConfiguration({"classpath:/META-INF/spring/app-ws.xml"})
public class JobsTestCase {
	

	
	private static Logger log = Logger.getLogger(JobsTestCase.class);

/*	@Resource
	private AccountSyncJob accountSyncJob ;

	@Resource
	private OpportunitySyncJob opportunitySyncJob ;

	@Resource
	private LeadSyncJob leadSyncJob ;
	
	@Resource
	private IntegrationEventSyncJob integrationEventSyncJob ;*/
	

	@Resource
	OpportunityServc opportunityServc;
	
	@Resource
	SalesPartyServc servc;
	@Resource
	EntityService  entityService;
	
	@Resource
	CandidateEquityToFusionSyncJob candidateEquityToFusionSyncJob;
	
	@Resource
	private AccountIntSyncJob accountSyncJob ;

	
	@Resource
	OpportunityFusionToEquitySyncJob equitySyncJob;
	
	private SimpleDateFormat equityDateFormat = new SimpleDateFormat(Constants.EQUITY_DATE_FORMAT);
	
	
	@Resource
	private OpportunityFusionToEquitySyncJob equitySyncJob2;
	
	
	@Resource
	private ErrorNotificationsEmailSyncJob emailSyncJob;
	
	@Test
	public void testAccount(){
		try {
				accountSyncJob.test();
			
		} catch (Exception e) {
			log.error(e);
			e.printStackTrace();
		}
		
		
	}
	

	
}
