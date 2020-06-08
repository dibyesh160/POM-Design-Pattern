package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.pages.Loginpage;
import com.hrms.pages.Logoutpage;
import com.hrms.utility.Basicclass;
import com.hrms.utility.Log;

public class TC_01 {
@Test
	public static void  TC_001() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Basicclass.startup();
		Loginpage.login("Admin", "admin123");
		
		Logoutpage.logout();
		
		Basicclass.teardown();
		
	}
	
	
	
	
}
