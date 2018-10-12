package com.hdr.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
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
import com.hdr.service.EntityServiceAbstract;

@Repository("entityServiceImplEBS")
public class EntityServiceEBSServerImpl extends EntityServiceAbstract {
	
	private Logger log = Logger.getLogger(EntityServiceEBSServerImpl.class.getName()); 

	@PersistenceContext(unitName="persistenceUnitEBS")
	private EntityManager entityManager;

	@Autowired(required = true)
	public void setEntityService() {
		super.setEntityManager(entityManager);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Transactional("ebsServer")
	public Connection getConnection() throws SQLException{
		Session session = (Session) entityManager.getDelegate();
		SessionFactoryImplementor sfi = (SessionFactoryImplementor) session.getSessionFactory();
		ConnectionProvider cp = sfi.getConnectionProvider();
		Connection  c = cp.getConnection();
		return c;
	}
	
	@Override
	@Transactional("ebsServer")
	public  void save(Object o) {
		o = entityManager.merge(o);
	}

	@Override
	public <T extends AbstractSpringJob> Date getLastRunTime(Class<T> jobClazz)
			throws Exception {
		return null;
	}

	@Override
	public Date getLastModifiedDate(Class clazz) throws Exception {
		return null;
	}

	@Override
	public Timestamp getLastModifiedDateTimestamp(Class clazz) throws Exception {
		return null;
	}

	@Override
	public Object findObjectByNamedQuery(Query query) throws DataException,
			Exception {
		return null;
	}

}
