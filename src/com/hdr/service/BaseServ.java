package com.hdr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hdr.exception.FusionException;
import com.hdr.model.BaseObject;

@Service
public interface BaseServ {
	
	public void create() throws FusionException;
	public List<Object> query(BaseObject o)  throws FusionException;
	public void update() throws FusionException;
	public void delete() throws FusionException;
}
