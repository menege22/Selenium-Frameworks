package testngAssignmentonePackage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DashboardClass {

	
ChromeDriver browserObject;

	@Test
	public void login() throws InterruptedException
	{
		browserObject.get("http://demo.itlearn360.com/");
		browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		browserObject.findElement(By.id("loginlabel")).click();

	WebElement username = browserObject.findElement(By.id("user_login"));
	
	WebElement Password = browserObject.findElement(By.id("user_pass"));
	
	WebElement LoginBtn = browserObject.findElement(By.name("wp-submit"));
	 
	browserObject.manage().window().maximize();
 

	username.sendKeys("Demo12 ");
	
	Password.sendKeys("Test123456$");
	
	LoginBtn.click();
//	browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	
	
    @AfterTest 
	
	public void AfterTest() {
		 
		 System.out.println("--Aftertest,Closing the browsing window");
		 
		browserObject.close();
	}
	
}

	


