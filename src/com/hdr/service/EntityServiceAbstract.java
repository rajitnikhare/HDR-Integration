package com.hdr.service;

import java.io.Serializable;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Parameter;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.exception.DataException;
import org.hibernate.service.jdbc.connections.spi.ConnectionProvider;
import org.springframework.transaction.annotation.Transactional;

import com.hdr.model.GenericModel;

public  abstract class EntityServiceAbstract implements EntityService {

	private static Logger log = Logger.getLogger(EntityServiceAbstract.class);
	
	@PersistenceContext(unitName="persistenceUnit")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/* (non-Javadoc)
	 * @see com.crmod.service.EntityService#save(T)
	 */
	@Override
	@Transactional
	public  void save(Object o) {
		o = entityManager.merge(o);
	}
	
	/* (non-Javadoc)
	 * @see com.crmod.service.EntityService#delete(T)
	 */
	@Override
	@Transactional
	public  void delete(Object o) {
		entityManager.remove(o);
	}
	
	@Transactional
	public int executeUpdate(String queryName,HashMap<String,Object> params)
	{
		
		Query q=getEntityManager().createNamedQuery(queryName);
		
		if(params!=null&&!params.isEmpty()){
			
			      Set s=params.entrySet();

		        // Move next key and value of HashMap by iterator
		        Iterator it=s.iterator();
		        Map.Entry m;
		        while(it.hasNext())
		        {
		            // key=value separator this by Map.Entry to get key and value
		            m=null;
		        	m =(Map.Entry)it.next();
		            String key=(String)m.getKey();
		            log.debug("key:"+key+", value:"+m.getValue());
		            Parameter p = null;
					try {
						p = q.getParameter(key);
					} catch (Exception e) {
						log.warn(e.getMessage());
					}
		            if (p != null && p.getName().equalsIgnoreCase(key)) q.setParameter(key, m.getValue());
		        }
		}
		
		
		int iRowsUpdted = q.executeUpdate();
		
		return iRowsUpdted;
		
				/*getEntityManager()
				.createQuery(query).executeUpdate();*/
		
		
		
	}
	/* (non-Javadoc)
	 * @see com.crmod.service.EntityService#findByNameQuery(java.lang.String)
	 */
	@Override
	@Transactional()
	public List findByNameQuery(String namedQuery) throws DataException  {
		return findByNameQuery(namedQuery,null);
	}
	
	/* (non-Javadoc)
	 * @see com.crmod.service.EntityService#findByNameQuery(java.lang.String, java.lang.Object[])
	 */
	@Override
	@Transactional
	public List findByNameQuery(String namedQuery,Object[] values) throws DataException {
		return findByNameQuery(namedQuery,values,null);
	}
	
	
	@Override
	@Transactional
	public List findByNameQuery(String namedQuery,Object[] values,Integer size) throws DataException {
		Query q = entityManager.createNamedQuery(namedQuery);
		if (size != null){
			 q.setMaxResults(size);
		}else{
			q.setMaxResults(100);
		}
	    if (values != null) {
	        for (int i = 0; i < values.length; i++) {
	            q.setParameter(i + 1, values[i]);
	        }
	    }
	    return q.getResultList();
	}
	
	/* (non-Javadoc)
	 * @see com.crmod.service.EntityService#get(java.lang.Class, java.io.Serializable)
	 */
	@Override
	@Transactional
	public <T extends GenericModel> T  get(Class clazz,Serializable id) throws DataException  {
		return (T) entityManager.find(clazz, id);
	}

	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void setEntityManager(String name) {
		
	}

	@Override
	public List findByQuery(String query,Integer fetchSize) throws DataException {
		return findByQuery(query, null);
	}

	@Override
	public List findByQuery(String namedQuery, Object[] values,Integer fetchSize)	throws DataException {
		Query q = entityManager.createQuery(namedQuery);
		
		if(fetchSize!=null)
		q.setMaxResults(fetchSize);
		
	    if (values != null) {
	        for (int i = 0; i < values.length; i++) {
	            q.setParameter(i + 1, values[i]);
	        }
	    }
	    return q.getResultList();
	}

	@Override
	public List executeNativeQuery(String nativeQuery)	throws DataException {
		Query q = entityManager.createNativeQuery(nativeQuery);
		
	    return q.getResultList();
	}
	
	@Transactional
	public void executeUpdate(String queryName,Object[] values)	{
		Query q=getEntityManager().createNamedQuery(queryName);
	    if (values != null) {
	        for (int i = 0; i < values.length; i++) {
	            q.setParameter(i + 1, values[i]);
	        }
	    }
		q.executeUpdate();
	}

	
	@Override
	@Transactional
	public Connection getConnection() throws SQLException{
		Session session = (Session) entityManager.getDelegate();
		SessionFactoryImplementor sfi = (SessionFactoryImplementor) session.getSessionFactory();
		ConnectionProvider cp = sfi.getConnectionProvider();
		Connection  c = cp.getConnection();
		return c;
	}
	
	@Override
	public void close(Connection connection){
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {
				log.error(" Error while closing the connection",e); 
			}
		} 
	}
	
	@Override
	public void close(CallableStatement statement){
		if (statement != null) {
			try {
				statement.close();
			} catch (Exception e) {
				log.error(" Error while closing the statement ",e); 
			}
		} 
	}
}
