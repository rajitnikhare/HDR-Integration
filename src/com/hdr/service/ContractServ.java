package com.hdr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hdr.exception.FusionException;
import com.hdr.model.BaseObject;
import com.hdr.model.Contract;
import com.hdr.ws.stubs.customeObject.ContractC;
import com.hdr.ws.stubs.customeObject.ServiceException;
/**
 * 
 * @author ::
 *
 */
@Service
public interface ContractServ {

	public void createContract(Contract contract) throws Exception;

	public void updateContract(Contract contract) throws Exception;

	public List<Object> findContract(BaseObject bo) throws ServiceException;
	
	public ContractC find(BaseObject o) throws FusionException;
	
	

}
