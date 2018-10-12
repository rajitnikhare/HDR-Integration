package com.hdr.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hdr.model.Account;
import com.hdr.model.CompanyAcklg;
import com.hdr.model.Contract;
import com.hdr.model.Employee;
import com.hdr.model.EmployeeCredentials;
import com.hdr.model.EmployeeEducation;
import com.hdr.model.EmployeeProjects;
import com.hdr.model.EmployeePublicationsNPresentations;
import com.hdr.model.EmployeeTraining;
import com.hdr.model.Project;
import com.hdr.model.ProjectFeeCost;
import com.hdr.model.ProjectLocation;
import com.hdr.model.ProjectSubcons;
import com.hdr.model.PursuitProjectAcklg;
import com.hdr.service.DbUtilityServ;
import com.hdr.service.EntityService;
import com.hdr.util.CommonUtil;

@Service
public class DbUtilityServImpl implements DbUtilityServ{
	
	private static final Logger log = Logger.getLogger(DbUtilityServImpl.class);
	
	
	@Resource(name = "entityServiceImplEBS")
	private EntityService entityServiceEBS;
	
	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityServiceDBaaS;
	
	
	
	@Override
	public void updateDbStatus(Object o, String integrationStatus, Exception e) throws Exception {
		log.info(">>updateDbStatus");
		cast(o,integrationStatus,e);
		log.info("<<updateDbStatus");
		
	}
	private PursuitProjectAcklg cast(Object o, String integrationStatus, Exception e) throws SQLException {
		if(o instanceof PursuitProjectAcklg){
			PursuitProjectAcklg p = (PursuitProjectAcklg)o;
			
		}else if(o instanceof CompanyAcklg){
			CompanyAcklg c = (CompanyAcklg)o;
			c.setProcessState(integrationStatus);
			if(e!=null){
				c.setStatusMessage(CommonUtil.getExceptionMessageWithCauses(e));
				if(c.getRetryCount()!=null){
					c.setRetryCount(c.getRetryCount()+1);	
				}else{
					c.setRetryCount(1l);
				}
				
			}
			entityServiceEBS.save(c);
		}else if(o instanceof ProjectFeeCost){
			ProjectFeeCost c = (ProjectFeeCost) o;
			c.setProcessState(integrationStatus);
			if(e!=null){
				c.setErrorMessage(CommonUtil.getExceptionMessageWithCauses(e));
				if(c.getRetryCount()!=null){
					c.setRetryCount(c.getRetryCount()+1);	
				}else{
					c.setRetryCount(1l);
				}
			}
			entityServiceDBaaS.save(c);
		}else if(o instanceof ProjectSubcons){
			ProjectSubcons c = (ProjectSubcons) o;
			c.setProcessState(integrationStatus);
			if(e!=null){
				c.setErrorMessage(CommonUtil.getExceptionMessageWithCauses(e));
				if(c.getRetryCount()!=null){
					c.setRetryCount(c.getRetryCount()+1);	
				}else{
					c.setRetryCount(1l);
				}
			}
			entityServiceDBaaS.save(c);
		}else if(o instanceof ProjectLocation){
			ProjectLocation c = (ProjectLocation) o;
			c.setProcessState(integrationStatus);
			if(e!=null){
				c.setErrorMessage(CommonUtil.getExceptionMessageWithCauses(e));
				if(c.getRetryCount()!=null){
					c.setRetryCount(c.getRetryCount()+1);	
				}else{
					c.setRetryCount(1l);
				}
			}
			entityServiceDBaaS.save(c);
		}else if(o instanceof Account){
			Account c = (Account) o;
			c.setProcessState(integrationStatus);
			if(e!=null){
				c.setErrorMessage(CommonUtil.getExceptionMessageWithCauses(e));
				if(c.getRetryCount()!=null){
					c.setRetryCount(c.getRetryCount()+1);	
				}else{
					c.setRetryCount(1l);
				}
			}
			entityServiceDBaaS.save(c);
		}else if(o instanceof Project){
			setProjectChildDBStatus(o, integrationStatus, e, false);
		}
			
		else if(o instanceof Employee){
			log.info(">>EmployeeDbStatus");
			Employee c = (Employee) o;
			c.setProcessState(integrationStatus);
			if(e!=null){
				c.setErrorMessage(CommonUtil.getExceptionMessageWithCauses(e));
				if(c.getRetryCount()!=null){
					c.setRetryCount(c.getRetryCount()+1);	
				}else{
					c.setRetryCount(1l);
				}
			}
			entityServiceDBaaS.save(c);
		}	
		
		else if(o instanceof EmployeeEducation){
			log.info(">>EmployeeEducationStatus");
			EmployeeEducation c = (EmployeeEducation) o;
			c.setProcessState(integrationStatus);
			if(e!=null){
				c.setErrorMessage(CommonUtil.getExceptionMessageWithCauses(e));				
				if(c.getRetryCount()!=null){
					
					c.setRetryCount(c.getRetryCount()+1);	
				}else{
					c.setRetryCount(1l);
				}
			}
			entityServiceDBaaS.save(c);
		}	
		
		else if(o instanceof EmployeeTraining){
			log.info(">>EmployeeTrainingStatus");
			EmployeeTraining c = (EmployeeTraining) o;
			c.setProcessState(integrationStatus);
			if(e!=null){
				c.setErrorMessage(CommonUtil.getExceptionMessageWithCauses(e));				
				if(c.getRetryCount()!=null){
					c.setRetryCount(c.getRetryCount()+1);	
				}else{
					c.setRetryCount(1l);
				}
			}
			entityServiceDBaaS.save(c);
		}		
		
		else if(o instanceof EmployeeProjects){
			log.info(">>EmployeeProjectsStatus");
			EmployeeProjects c = (EmployeeProjects) o;
			c.setProcessState(integrationStatus);
			if(e!=null){
				c.setErrorMessage(CommonUtil.getExceptionMessageWithCauses(e));				
				if(c.getRetryCount()!=null){
					c.setRetryCount(c.getRetryCount()+1);	
				}else{
					c.setRetryCount(1l);
				}
			}
			entityServiceDBaaS.save(c);
		}	
		
		else if(o instanceof EmployeeCredentials){
			log.info(">>EmployeeCredentialsStatus");
			EmployeeCredentials c = (EmployeeCredentials) o;
			c.setProcessState(integrationStatus);
			if(e!=null){
				c.setErrorMessage(CommonUtil.getExceptionMessageWithCauses(e));				
				if(c.getRetryCount()!=null){
					c.setRetryCount(c.getRetryCount()+1);	
				}else{
					c.setRetryCount(1l);
				}
			}
			entityServiceDBaaS.save(c);
		}			
		
		else if(o instanceof EmployeePublicationsNPresentations){
			log.info(">>EmployeePublicationsNPresentationsStatus");
			EmployeePublicationsNPresentations c = (EmployeePublicationsNPresentations) o;
			c.setProcessState(integrationStatus);
			if(e!=null){
				c.setErrorMessage(CommonUtil.getExceptionMessageWithCauses(e));				
				if(c.getRetryCount()!=null){
					c.setRetryCount(c.getRetryCount()+1);	
				}else{
					c.setRetryCount(1l);
				}
			}
			entityServiceDBaaS.save(c);
		}else if(o instanceof Contract){
			
			Contract c = (Contract) o;
			c.setProcessState(integrationStatus);
			if(e!=null){
				c.setErrorMessage(CommonUtil.getExceptionMessageWithCauses(e));				
				if(c.getRetryCount()!=null){
					c.setRetryCount(c.getRetryCount()+1);	
				}else{
					c.setRetryCount(1l);
				}
			}
			entityServiceDBaaS.save(c);
		}					
			
		return null;
		
	}
	
	@Override
	public void setProjectChildDBStatus(Object o, String integrationStatus, Exception e, Boolean hasChildrenUpdate) throws SQLException {
		Project c = (Project) o;
		if(!hasChildrenUpdate){
			c.setProcessState(integrationStatus);
			if(e!=null){
				c.setErrorMessage(CommonUtil.getExceptionMessageWithCauses(e));
				if(c.getRetryCount()!=null){
					c.setRetryCount(c.getRetryCount()+1);	
				}else{
					c.setRetryCount(1l);
				}
			}
			entityServiceDBaaS.save(c);
		}else{
			/**
				XXHDR_IN_PROJECT_FEE_COST_STG
				XXHDR_IN_PROJECT_LOCATION_STG
				XXHDR_IN_PROJECT_SUBCONS_STG
				XXHDR_IN_PROJECT_HEADER_STG
			 */
		String q2 =	"update XXHDR_IN_PROJECT_FEE_COST_STG set process_state = '"+integrationStatus+"' where project_id ='"+c.getProjecId().toString()+"' and process_state in('READY','ERROR','IN PROGRESS')";
		String q3 =	"update XXHDR_IN_PROJECT_LOCATION_STG set process_state = '"+integrationStatus+"' where project_id ='"+c.getProjecId().toString()+"' and process_state in('READY','ERROR','IN PROGRESS')";
		String q4 =	"update XXHDR_IN_PROJECT_SUBCONS_STG set process_state = '"+integrationStatus+"' where project_id ='"+c.getProjecId().toString()+"' and process_state in('READY','ERROR','IN PROGRESS')";
		
		Connection conn = null;
		PreparedStatement statement= null;
		ResultSet set = null;
		try {
			conn=  entityServiceDBaaS.getConnection();
			
			statement = conn.prepareStatement(q2);
			set= statement.executeQuery();
			statement.close();
			set.close();
			
			statement = conn.prepareStatement(q3);
			set= statement.executeQuery();
			statement.close();
			set.close();
			
			statement = conn.prepareStatement(q4);
			set= statement.executeQuery();
			statement.close();
			set.close();
			
			
			
		} catch (Exception e2) {
			log.error("Error occured while setting sync_status from Project and Child",e);
		}finally {
			if(conn!=null){
				try {
					conn.close();
					
				} catch (SQLException e1) {
					throw e1;
				}
			}
		}
		
		
		}
		
	}

}
