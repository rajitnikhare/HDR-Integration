package com.hdr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hdr.exception.FusionException;
import com.hdr.model.BaseObject;
import com.hdr.model.DeleteEmployeeProject;
import com.hdr.model.Employee;
import com.hdr.ws.stubs.customeObject.ServiceException;

@Service
public interface EmployeeServ {
	
	List<Object> findEmployee(BaseObject bo) throws ServiceException;
	
	/**
	 * 
	 * Data Load
	 */
	public Object mergeForDataLoad(Object o) throws FusionException;
	public Object createForDataLoad(Employee p)throws FusionException;
	public Object delete(DeleteEmployeeProject o) throws FusionException;
	
	public Object find(BaseObject o ) throws FusionException;
	public Employee create(Employee o ) throws FusionException;
	public Employee merge(Employee o ) throws FusionException;
	
	public Object findEmployeeChild(BaseObject o ) throws FusionException;


}