package testngaasignment;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Openwebsite<webElement> {

	ChromeDriver browserObject;

	@Test 

	 public void openCnnsite() throws InterruptedException {
	 
	System.setProperty("Webdriver.chrome.driver","C:\\ Program Files \\chromedriver1.exe");
	
	browserObject = new ChromeDriver();
    System.out.println("Open / Close cnn.com in Chrome browser");
	browserObject.manage().window().maximize();

     browserObject.get("https://www.cnn.com/");
    
    Thread.sleep(2000);
    
    browserObject.close();
	
	}
	@Test
	public void openAmazonsite() throws InterruptedException {
	
	System.setProperty("Webdriver.chrome.driver","C:\\ Program Files \\chromedriver1.exe");
	browserObject = new ChromeDriver();
	
	System.out.println("Open/ Close amzone.com in ChromeDriver");
	browserObject.manage().window().maximize();

	browserObject.get("https://www.amazon.com/");
	 
	Thread.sleep(2000);
	
	browserObject.close();
	}
	
	@Test

	public void openyahoosite () throws InterruptedException {
	  
	System.clearProperty("Webdriver.chrome.driver\",\"C:\\\\ Program Files \\\\chromedriver1.exe");
	
	browserObject = new ChromeDriver();
	
    System.out.println("Open/ Close yahoo.com in ChromeDriver");
	browserObject.manage().window().maximize();

    browserObject.get("https://www.yahoo.com/");
     
    Thread.sleep(2000);
    
    browserObject.close();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}