package com.hdr.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.hdr.exception.FusionException;
import com.hdr.model.BaseObject;
import com.hdr.model.DeleteProjectCostFee;
import com.hdr.model.DeleteProjectLocation;
import com.hdr.model.Project;
import com.hdr.ws.stubs.customeObject.ProjectsC;

@Service
public interface ProjectServ {
	
	public Object find(BaseObject o ) throws FusionException;
	
	public Object create(Project o ) throws FusionException;
	
	public Object merge(Project o ) throws FusionException;
	
	public Object delete(DeleteProjectLocation o ) throws FusionException;
	public Object delete(DeleteProjectCostFee o) throws FusionException;
	
	/**
	 * This is purely for data load
	 */
	public Object mergeForDataload(Object o)  throws FusionException;
	public Object createForDataload(Object o) throws FusionException;
	
	public Object findProjectChild(BaseObject o ) throws FusionException;
	
	public ProjectsC findProjectByEBSIdForDeliveryProjectSync(BigDecimal deliveryProjectId) throws FusionException;

	void mergeProject(ProjectsC project) throws FusionException;
	
	
	
}
