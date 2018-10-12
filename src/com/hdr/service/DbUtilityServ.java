package com.hdr.service;

import org.springframework.stereotype.Service;

@Service
public interface DbUtilityServ {
	public void updateDbStatus(Object o, String integrationStatus, Exception e) throws Exception;
	public void setProjectChildDBStatus(Object o, String integrationStatus, Exception e, Boolean hasChildrenUpdate) throws Exception;
}
