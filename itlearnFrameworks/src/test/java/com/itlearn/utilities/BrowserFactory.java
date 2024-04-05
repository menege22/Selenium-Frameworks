package com.itlearn.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver,String browser,String url)
	{
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(browser.equals("IE"))
		{
					System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
					driver= new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
