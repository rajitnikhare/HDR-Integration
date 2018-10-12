package com.hdr.service;

import java.math.BigDecimal;
import java.util.List;

import com.hdr.exception.FusionException;
import com.hdr.model.BaseModel;
import com.hdr.model.BaseObject;
import com.hdr.model.DeliveryProject;
import com.hdr.model.PursuitProjectAcklg;
import com.hdr.ws.stubs.opportunity.Opportunity;
import com.hdr.ws.stubs.opportunity.ServiceException;


/**
 * @author Romesh Soni
 *
 */
public interface PursuitProjectService  extends BaseServ{
	
public List<Object> getPendingToEBSPursuitProjects(BaseModel o) throws FusionException;
public void updatePursuitProjectAcklg(PursuitProjectAcklg c) throws FusionException;
public Opportunity findOpportuntiyForDeliveryProjectAck(DeliveryProject c) throws FusionException;
public Opportunity getOptyByOptyIdForDeliveryProjectFlow(String optyId) throws FusionException;
public Opportunity getOptyByPursuitProjectIdForDeliveryProjectFlow(BigDecimal pursuitProjectId) throws FusionException;
public void updateOpportunityStatusToWON(Long optyId, BigDecimal deliveryProjectNum) throws ServiceException;	
public List<Opportunity> get(BaseObject bo)  throws ServiceException, Exception;	
public List<Opportunity> updateAndAssociateEBSProject(Object o,String projectId)  throws ServiceException, Exception;	

}
