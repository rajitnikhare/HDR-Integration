package com.hdr.dao.ebs;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hdr.constants.IErrorLogConstants;
import com.hdr.job.impl.PursuitProjectOSCToEBSSyncJob;
import com.hdr.model.PursuitProject;
import com.hdr.service.EntityService;
import com.hdr.util.DateUtils;
import com.hdr.util.ErrorMsgUtil;



/**Dao for Pursuit Project against EBS DB.
 * @author Romesh Soni
 *
 */
@Service
public class PursuitProjectEBSDao {


private static final Logger log = Logger.getLogger(PursuitProjectEBSDao.class);
	
@Resource(name = "entityServiceImplEBS")
private EntityService entityServiceEBS;
		
@Resource
private ErrorLogDao errorLogDao;

	
	/**After saving PursuitProjects/Opportunities in EBS Db, 
	 * call this submit concurrent request procedure.
	 * 
	 * @param batchKey
	 * @throws Exception
	 */
	public  void callPursuitProjectConcurrentRequest(String batchKey
        ) throws Exception 
    {
		
		log.debug(">>callPursuitProjectConcurrentRequest batchKey: "+ batchKey);
		
		String query = 
		"SELECT xxhdr_bd_interface_call_pkg.submit_conc_request ("
		         +"'PURSUIT PROJECT','"+ batchKey +"',180,'N','N') FROM DUAL";

		//String querytest = "select get_garbage_function(1) from dual";
		
		entityServiceEBS.executeNativeQuery(query);
		
	
		log.debug("<<callPursuitProjectConcurrentRequest");
		
    }
	
	/**Function used to save (in pursuit project stag table) opportunities downloaded from OSC
	 * @param lstPursuitProject
	 */
	public String savePursuitProjectsInDb(List<PursuitProject> lstPursuitProject) {

		log.info(">>savePursuitProjectsInDb");

		if (lstPursuitProject == null || lstPursuitProject.isEmpty()) {
			log.debug("Nothing to save");
			return null;
		}

		String lastUpdateDateOfLastProcessedRecord = null;
		
		for (PursuitProject pursuitProject : lstPursuitProject) 
		{
			
			try 
			{
				log.info("Object detaiis: "+ pursuitProject);
				entityServiceEBS.save(pursuitProject);
			} catch (Exception e) {
				
				int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
				String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
				String customMsg="Error while trying to save Pursuit Project in table. Trace: ";
				emsg = customMsg+emsg;
				log.error(emsg);
				String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.FUSION_TO_EBS.toString();
				String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
				String tableName = IErrorLogConstants.TABLE_NAMES.PURSUIT_PROJECT_STG.getVal();
				//you dont have a record_id when you are trying to save a record in db.
				String primaryFieldName = "OSC_OPPORTUNITY_ID";
				String primaryFieldValue = pursuitProject.getOscOpportunityId();
				
				errorLogDao.logSyncError(objectName
						, direction
						, emsg
						, primaryFieldName
						, primaryFieldValue
						, PursuitProjectOSCToEBSSyncJob.class.getSimpleName()
						,tableName
						);
				
			}
			finally
			{
				Timestamp lastUpdateDate=  pursuitProject.getOscLastUpdateDate();
				//lastUpdateDateOfLastProcessedRecord = DateUtils.formatGivenTimestampToFusionFormat(lastUpdateDate);
				lastUpdateDateOfLastProcessedRecord = lastUpdateDate.toString();
				//log.debug("lastUpdateDate:"+ lastUpdateDate);
				//log.debug("lastUpdateDateOfLastProcessedRecord:"+ lastUpdateDateOfLastProcessedRecord);
				
			}
			
			
			
		}

		log.info("<<savePursuitProjectsInDb");
		
		return lastUpdateDateOfLastProcessedRecord;

	}	
	
}
