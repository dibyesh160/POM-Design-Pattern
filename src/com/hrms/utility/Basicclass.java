package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Basicclass {

	public static WebDriver driver;
	
	//Open Browser
	public static void startup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		Reporter.log("Apllication Open");
		Log.info("Application open");
	}
	
	public static void teardown() {
		driver.close();
		Reporter.log("Application close");
		Log.info("Application closed");
	}
	
	
	
	
	
}
