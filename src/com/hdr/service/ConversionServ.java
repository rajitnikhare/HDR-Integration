package com.hdr.service;

import org.springframework.stereotype.Service;

import com.hdr.exception.FusionException;

@Service
public interface ConversionServ {
	
	public Object find(Object o) throws FusionException;
	public Object update(Object o) throws FusionException;
	public Object create(Object o) throws FusionException;
	
}
