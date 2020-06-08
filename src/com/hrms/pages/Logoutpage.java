package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.Basicclass;
import com.hrms.utility.Log;

public class Logoutpage extends Basicclass {

	
	//objects
	
	static By link_welcome= By.id("welcome");
	static By link_logout = By.linkText("Logout");
	
	
	//Functions
	
	public static void logout() throws Exception {
		
		
		driver.findElement(link_welcome).click();
		Thread.sleep(3000);
		driver.findElement(link_logout).click();
		Thread.sleep(3000);
		Reporter.log("logout sucessfull");
		Log.info("Log out complete");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
