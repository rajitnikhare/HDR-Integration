/*package com.crmod.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.mail.MessagingException;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.crmod.mail.MailManager;
import com.crmod.service.impl.EmailTemplateDao;
import com.crmod.ws.stubs.salescustomobject.EmailTemplatesC;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/META-INF/spring/applicationContext.xml","classpath:/META-INF/spring/app-datasource-config.xml","classpath:/META-INF/spring/app-mail.xml"})
@Transactional
public class SendMailTestCase {

	@Resource
	private MailManager mailManager ;
	
	private Logger log = Logger.getLogger(SendMailTestCase.class);
	
	@Test
	public void sendMail() throws MessagingException{
		Map data = new HashMap();
		data.put("jobName", "Email notification");
		mailManager.sendMail("no_reply@serenecorp.com", new String[]{"gpatwa@serenecorp.com","mjayasimha@serenecorp.com"},"Email notification", "template/job_status.vm", data );
	}
	
	
	@Test
	public void sendEmailByType() throws  Exception{
		EmailTemplateDao emailTemplateDao = new EmailTemplateDao();
		EmailTemplatesC emailTemplatesC =  emailTemplateDao.getEmailTemplateByType("OSC");
		String emailBody = new String(emailTemplatesC.getEmailBodyC().getValue());
		Map data = new HashMap();
		data.put("body", emailBody);
		log.info(emailBody);
		mailManager.sendMail("gpatwa@serenecorp.com","mjayasimha@serenecorp.com", new String[]{"gpatwa@serenecorp.com","mjayasimha@serenecorp.com"},emailTemplatesC.getEmailSubjectC().getValue(), "template/oppt_template.vm", data );
	}
	
}
*/