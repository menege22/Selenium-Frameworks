package com.itlearn.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.itlearn.utilities.BrowserFactory;
import com.itlearn.utilities.Configuration;

public class BaseClass {

	public WebDriver driver;
	Configuration obj= new Configuration(); 
		
	
	@BeforeClass
	public void setup()
	{
		driver= BrowserFactory.startApplication(driver, obj.getBrowser(), obj.getUrl());
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	 public void captureScreenShot(WebDriver driver,String testName) throws IOException
	 {
		 // Convert webdriver object to TakesScreenshot interface
		 TakesScreenshot screenshot= ((TakesScreenshot)driver);
		 
		 // Step 2 :call getScreenshotAs method to capture image file
		 
		 File src= screenshot.getScreenshotAs(OutputType.FILE);
		 File srcpath=new File("."+"//ScreenShot//"+ testName + ".png");
		 
		 // Step 3 : copy image file to destination 
		 FileUtils.copyFile(src, srcpath);
		 
	 }
}
