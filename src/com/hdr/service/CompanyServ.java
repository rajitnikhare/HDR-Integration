package com.hdr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hdr.exception.FusionException;
import com.hdr.model.BaseModel;
import com.hdr.model.BaseObject;
import com.hdr.model.CompanyAcklg;
import com.hdr.ws.stubs.accountService.Account;
import com.hdr.ws.stubs.accountService.AccountService;
import com.hdr.ws.stubs.accountService.ServiceException;

@Service
public interface CompanyServ{
	
	
	public List<Object> findByEBSIntegrationStatus(BaseModel o) throws FusionException;
	
	public void updateEBSIntegrationStaus(String status, Long id) throws FusionException;
	
	public Account getById(Long id) throws FusionException;
	
	public void updateCompanyAcklg(CompanyAcklg c) throws FusionException;
	
	public void updateParentCompanyAcklg(CompanyAcklg c, AccountService publicService) throws FusionException;

	public List<Object> findAccount(BaseObject bo) throws ServiceException;
	
	
	
}
