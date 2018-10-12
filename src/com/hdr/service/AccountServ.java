package com.hdr.service;

import org.springframework.stereotype.Service;

import com.hdr.exception.FusionException;
//import com.hdr.ws.stubs.accountService.Account;
import com.hdr.model.Account;
import com.hdr.model.BaseObject;


@Service
public interface AccountServ {

	public com.hdr.ws.stubs.accountService.Account find(BaseObject o) throws FusionException;
	public com.hdr.ws.stubs.accountService.Account findTopNumber(BaseObject o) throws FusionException;
	public void update(Account a) throws FusionException;
	public void create(Account a) throws FusionException;
	public void updateDataload(Account a) throws FusionException;
	
	


}
