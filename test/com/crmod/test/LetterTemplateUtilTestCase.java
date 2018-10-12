package com.crmod.test;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.ServletContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.crmod.sync.SyncObject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/META-INF/spring/applicationContext.xml","classpath:/META-INF/spring/app-datasource-config.xml","classpath:/META-INF/spring/app-mail.xml"})
//@ContextConfiguration({"classpath:/META-INF/spring/app-ws.xml"})
public class LetterTemplateUtilTestCase {
	
	@Autowired ServletContext servletContext=null;
	
	@Resource
	private SyncObject syncObject ;
	
/*	@Resource
	TemporaryFolderService tempDirService;*/
	
	
	@Test
	public void testLetterTemplateFunctionality() {
		
	/*	try 
		{
			tempDirService.getTemporaryFolderForWork();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		try 
		{
			
			
			HashMap<String,String> opportunityDataMap = new HashMap<String, String>();
			opportunityDataMap.put("LetterTemplateName", "2_FinancingFEM_85yrs");
			opportunityDataMap.put("date", "22-22-2222");
			opportunityDataMap.put("CompanionFirst", "CPF");
			opportunityDataMap.put("CompanionLast", "CPL");
			opportunityDataMap.put("FirstName", "FIRST NAME");
			opportunityDataMap.put("LastName", "LAST NAME");
			opportunityDataMap.put("Street1", "STREET 1");
			opportunityDataMap.put("Street2", "STREET 2");
			opportunityDataMap.put("City", "city");
			opportunityDataMap.put("State", "stat");
			opportunityDataMap.put("email", "soni.romesh@gmail.com");
			
			
		/*	LetterTemplateUtil util = new LetterTemplateUtil(syncObject
					
					, ILetterTemplateConstants.FILE_EXTENSION.docx
					, opportunityDataMap,tempDirService);
			
			util.getLetterTemplateToAttach();*/
			
		} catch (Exception e) {
			
		}
	}
}
