package com.hdr.service;

import java.util.Map;

import javax.mail.MessagingException;

import org.springframework.stereotype.Service;

@Service
public interface MailServ {

	public boolean sendMail(String fromEmailId, String[] toEmailId,String subject, String templateName, Map data) throws MessagingException;

}
