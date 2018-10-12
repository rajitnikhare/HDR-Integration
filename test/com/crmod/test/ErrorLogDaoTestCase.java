package com.crmod.test;

import javax.annotation.Resource;


import org.jboss.logging.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.crmod.job.impl.ErrorNotificationEmailJob;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/META-INF/spring/applicationContext.xml","classpath:/META-INF/spring/app-datasource-config.xml","classpath:/META-INF/spring/app-mail.xml"})

public class ErrorLogDaoTestCase {

	
	private Logger log = Logger.getLogger(ErrorLogDaoTestCase.class);
	@Resource
	ErrorNotificationEmailJob dao;
	
	@Test
	public void testGetUnprocessedRecordsTest() throws Exception
	{
		dao.getUnProcessedErrorLogsForSendingNotification();
	}

}
