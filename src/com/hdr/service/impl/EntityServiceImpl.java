package com.hdr.service.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.exception.DataException;
import org.hibernate.service.jdbc.connections.spi.ConnectionProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hdr.job.AbstractSpringJob;
import com.hdr.model.GenericModel;
import com.hdr.model.Job;
import com.hdr.service.EntityServiceAbstract;

@Repository("entityServiceImplDBaaS")
public class EntityServiceImpl extends EntityServiceAbstract {
	
	private Logger log = Logger.getLogger(EntityServiceImpl.class.getName());
	
	@PersistenceContext(unitName="persistenceUnit")
	private EntityManager entityManager;

	@Autowired(required = true)
	public void setEntityService() {
		super.setEntityManager(entityManager);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@Transactional("local")
	public Connection getConnection() throws SQLException{
		Session session = (Session) entityManager.getDelegate();
		SessionFactoryImplementor sfi = (SessionFactoryImplementor) session.getSessionFactory();
		ConnectionProvider cp = sfi.getConnectionProvider();
		Connection  c = cp.getConnection();
		return c;
	}

	
	
	@Override
	/**Read the polling info table for last run time of "jobClazz"
	 * @param jobClazz
	 * @return
	 * @throws Exception
	 */
	public <T extends AbstractSpringJob> Date getLastRunTime(Class<T> jobClazz) throws Exception {
		
		String query =
				"select max(lastRun) from "
						+ Job.class.getName()
						+ " WHERE jobName='"+ jobClazz.getSimpleName() +"'";
		//log.debug("query:"+query);
		Timestamp cal = (Timestamp) 
				getEntityManager()
				.createQuery(query)
						.getSingleResult();
						;
						
		if (cal != null){
			Calendar c = Calendar.getInstance();
			c.setTimeInMillis(cal.getTime());
			return c.getTime();
		}
		return null ;
	}
	@Override
	public Date getLastModifiedDate(Class clazz) throws Exception {
	
		String query =
				"select max(modifiedDate) from " + clazz.getName() ;
		//+" where crmRowId=100000004039319";
		//log.debug("query:"+query);
		Timestamp cal = (Timestamp) 
				getEntityManager()
				.createQuery(query)
						.getSingleResult();
						;
						
		if (cal != null){
			Calendar c = Calendar.getInstance();
			c.setTimeInMillis(cal.getTime());
			return c.getTime();
		}
		return null ;
		
	}

	@Override
	public Timestamp getLastModifiedDateTimestamp(Class clazz) throws Exception {
	
		String query =
				"select max(modifiedDate) from " + clazz.getName(); 
				//+" where crmRowId=100000004039319";
		//log.debug("query:"+query);
		Timestamp timestamp = (Timestamp) 
				getEntityManager()
				.createQuery(query)
						.getSingleResult();
						;
						
		
		return timestamp;
		
	}
	
	
	@Override
	public Object findObjectByNamedQuery(Query query) throws DataException,
			Exception {//G1
		Object obj = null;
		try{
	
		if(query != null){
			obj = query.getSingleResult();
		}
		}catch(Exception t){
			throw t;
		}
		return obj;
	}

	@Override
	public <T extends GenericModel> T get(Class clazz, Serializable id)throws DataException {
	
		return (T) entityManager.find(clazz, id);
	}

}
