package testngAssignmentonePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchCourseClass {

ChromeDriver browserObject;
	
	@Test
	public void login() throws InterruptedException
	{
		System.out.println(" login wait 2 second");
		browserObject.get("http://demo.itlearn360.com/");
		browserObject.findElement(By.id("loginlabel")).click();
		
	WebElement username = browserObject.findElement(By.id("user_login"));
	
	WebElement Password = browserObject.findElement(By.id("user_pass"));
	
	WebElement LoginBtn = browserObject.findElement(By.name("wp-submit"));
	  
	Thread.sleep(2000);

	username.sendKeys("Demo12 ");
	
	Password.sendKeys("Test123456$");
	
	LoginBtn.click();
	 
	// BRowsing selenium Certificate cousrse
	 
     WebElement searchcourse = browserObject.findElement(By.xpath("//*[@id=\"search_course\"]"));
	
	 WebElement SearechBtn  = browserObject.findElement(By.xpath("//*[@id=\"primary_menu\"]/nav[1]/form/button"));
	 
	 searchcourse.sendKeys("Selenium Certificate");
	 
	 SearechBtn.click();
	 
	Thread.sleep(3000);
      
	}
	
		  @BeforeTest
	 public void Beforetest() throws InterruptedException
		{
		
	System.setProperty("Webdriver.chrome.driver","C:\\ Program Files \\chromedriver3.exe");
		  
		  browserObject = new ChromeDriver();
		  browserObject.manage().window().maximize();
		
		  Thread.sleep(5000);

		}
		
       @AfterTest
	 public void Aftertest() 
		  {
			  browserObject.close();
		  }
		  
		}
	

