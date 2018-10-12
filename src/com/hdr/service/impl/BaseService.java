package com.hdr.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hdr.service.EntityService;

@Service
public class BaseService {

	@Resource(name="entityServiceImplDBaaS")
	private EntityService entityService ;
	
	public void getUnProccessedData(Class clazz){
		
	}
}
