package com.hdr.service;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.exception.DataException;

import com.hdr.job.AbstractSpringJob;
import com.hdr.model.GenericModel;

public interface EntityService {

	public abstract void setEntityManager(EntityManager em);
	public abstract void setEntityManager(String name);
	public abstract void save(Object o);
	public abstract void delete(Object o);

	public abstract List findByNameQuery(String namedQuery) throws DataException;
	public abstract List findByNameQuery(String namedQuery, Object[] values) throws DataException;
	public abstract List findByQuery(String query,Integer fetchSize) throws DataException;
	public abstract List findByQuery(String query, Object[] values,Integer fetchSize) throws DataException;
	public abstract <T extends GenericModel> T get(Class clazz, Serializable id) throws DataException;
	public abstract EntityManager getEntityManager();
	public abstract Connection getConnection() throws SQLException;
	public abstract void close(CallableStatement statement) ;
	public abstract void close(Connection connection) ;
	public <T extends AbstractSpringJob> Date getLastRunTime(Class<T> jobClazz) throws Exception;
	public abstract Date getLastModifiedDate(Class clazz) throws Exception;
	public abstract Timestamp getLastModifiedDateTimestamp(Class clazz) throws Exception;
	public abstract int executeUpdate(String queryName,HashMap<String,Object> params);
	public abstract void executeUpdate(String queryName,Object[] values);
	public abstract List findByNameQuery(String namedQuery, Object[] values, Integer size)	throws DataException;
	public abstract Object findObjectByNamedQuery(Query query) throws DataException, Exception;
	List executeNativeQuery(String nativeQuery) throws DataException;

}