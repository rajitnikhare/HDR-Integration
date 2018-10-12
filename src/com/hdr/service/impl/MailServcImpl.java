package com.hdr.service.impl;



import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.stereotype.Service;
import org.springframework.ui.velocity.VelocityEngineUtils;

import com.hdr.service.MailServ;


@Service
public class MailServcImpl implements MailServ {
	private static final Logger log = Logger.getLogger(MailServcImpl.class);
	
	@Resource
	private VelocityEngine velocityEngine;
	
	private String userName;
	
	private String password;
	
	private String auth;
	
	private String starttls;
	
	private String port;
	
	private String host;
	
	@Override
	public boolean sendMail(String fromEmailId, String[] toEmailId,String subject, String templateName, Map data) throws MessagingException {
		
			log.info(">>MailServcImpl.sendMail()..");
				
				/**
				 * Set Property
				 */
				Properties props = setProperty();
				log.info("BUGLIST:1987: 4 Property Set");
				/**
				 * Set Session
				 */
				Session session = setSession(props);
				log.info("BUGLIST:1987: 5 Session Set");
				log.info("BUGLIST:1987: 5.1 UserName: "+userName +", Password: "+password +", Auth: "+auth +", Starttls: "+ starttls +",Port: "+port+", Host: "+host);

				try {

					Message message = new MimeMessage(session);
					message.setFrom(new InternetAddress(fromEmailId));
					StringBuilder sb = new StringBuilder();
					InternetAddress[] a = getToSendAddress(toEmailId, sb);
					message.addRecipients(Message.RecipientType.TO,a);
					message.setSubject(subject);
					message.setContent(VelocityEngineUtils.mergeTemplateIntoString(velocityEngine, templateName, data),"text/html");
					log.info("BUGLIST:1987: 6 Initiated Send");
					Transport.send(message);
					log.info("BUGLIST:1987: 7 Sending Done...");
					log.info("Email notification sent successfully...");
					log.info("<<MailServcImpl.sendMail()..");
					return true;

				} catch (MessagingException e) {
					log.info("BUGLIST:1987: 7 Error Occured"+ e);
					log.error(e);
					throw e;
				}
		
	}

	/**
	 * @param mailing_list_arr
	 * @param sb
	 * @return
	 * @throws AddressException
	 */
	private InternetAddress[] getToSendAddress(String[] mailing_list_arr,
			StringBuilder sb) throws AddressException {
		for (int i = 0; i < mailing_list_arr.length; i++) {
			sb.append(mailing_list_arr[i]);
			if(i!=mailing_list_arr.length-1){
				sb.append(",");
			}
		}
		InternetAddress[] a = InternetAddress.parse(sb.toString());
		return a;
	}

	/**
	 * @param username
	 * @param password
	 * @param props
	 * @return
	 */
	private Session setSession(Properties props) {
		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(userName, password);
					}
				});
		return session;
	}

	/**
	 * @param host
	 * @return
	 */
	private Properties setProperty() {
		Properties props = new Properties();
		props.put("mail.smtp.auth",auth);
		props.put("mail.smtp.starttls.enable",starttls);
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", port);
		return props;
	}

	public VelocityEngine getVelocityEngine() {
		return velocityEngine;
	}

	public void setVelocityEngine(VelocityEngine velocityEngine) {
		this.velocityEngine = velocityEngine;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getStarttls() {
		return starttls;
	}

	public void setStarttls(String starttls) {
		this.starttls = starttls;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
	


}
