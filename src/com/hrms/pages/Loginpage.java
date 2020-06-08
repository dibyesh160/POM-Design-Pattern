package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.Basicclass;
import com.hrms.utility.Log;

public class Loginpage extends Basicclass {
	//objects
	static By txt_username = By.name("txtUsername");
	static By txt_password = By.name("txtPassword");
	static By btn_login = By.name("Submit");
	
	
	// Functions
	
 public static  void login(String un, String pw) throws Exception {
	 
	 driver.findElement(txt_username).sendKeys(un);
	 driver.findElement(txt_password).sendKeys(pw);
	 driver.findElement(btn_login).click();
	 Thread.sleep(3000);
	 Reporter.log("login sucessfull");
	 Log.info("login compelete");
	 
 }
	
	
	
	
	
	

}