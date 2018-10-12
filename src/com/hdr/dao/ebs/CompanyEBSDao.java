package com.hdr.dao.ebs;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hdr.service.EntityService;



/**Dao for Pursuit Project against EBS DB.
 * @author Romesh Soni
 *
 */
@Service
public class CompanyEBSDao {


private static final Logger log = Logger.getLogger(CompanyEBSDao.class);
	
@Resource(name = "entityServiceImplEBS")
private EntityService entityServiceEBS;
		
	
	/**After saving PursuitProjects/Opportunities in EBS Db, 
	 * call this submit concurrent request procedure.
	 * 
	 * @param batchKey
	 * @throws Exception
	 */
	public  void callCompanyConcurrentRequest(String batchKey
        ) throws Exception 
    {
		log.debug(">>callCompanyConcurrentRequest batchKey: "+ batchKey);
		
		String query = 
		"SELECT xxhdr_bd_interface_call_pkg.submit_conc_request ("
		         +"'CUSTOMER','"+ batchKey +"',180,'N','N') FROM DUAL";

		String querytest = "select get_garbage_function(1) from dual";
		entityServiceEBS.executeNativeQuery(query);
		log.debug("<<callCompanyConcurrentRequest");
		
    }
	
	
}
