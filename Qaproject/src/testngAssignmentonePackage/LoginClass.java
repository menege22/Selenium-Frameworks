package testngAssignmentonePackage;



import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginClass {
 
	ChromeDriver browserObject;
	
	@Test(priority =1 )
	public void verifinglogin() throws InterruptedException
	{
		System.out.println("verfing login wait 2 second");
		browserObject.get("http://demo.itlearn360.com/");
		browserObject.findElement(By.id("loginlabel")).click();
		
	WebElement username = browserObject.findElement(By.id("user_login"));
	
	WebElement Password = browserObject.findElement(By.id("user_pass"));
	
	WebElement LoginBtn = browserObject.findElement(By.name("wp-submit"));
	  
	Thread.sleep(4000);

	username.sendKeys("Demo12 ");
	
	Password.sendKeys("Test123456$");
	
	LoginBtn.click();
	}
	

	@Test(priority=2)
	   public void verify () throws InterruptedException
	   {
	   WebElement element = browserObject.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a"));
	
		element.click();
		
		Actions action = new Actions(browserObject);
		 
		action.moveToElement(element).build().perform();
	
	
	   System.out.println("Dashboard");
	   
	    String expectedTitle = "Dashboard";
		
		String actualTitle  = browserObject.findElement(By.xpath("//*[@id=\"learn-press-user-info\"]/span/div")).getText();
		
		assertEquals(actualTitle,expectedTitle);
	Thread.sleep(5000);
	}
	  
	@BeforeTest
	
	public void BeforeTest() {  
	
	   System.out.println("---BeforeTest,set browsing");
	System.setProperty("Webdriver.chrome.driver","C:\\ Program Files \\chromedriver3.exe");
	  
	  browserObject = new ChromeDriver();
	}
	 
	
	@BeforeTest
	public void Beforetest()
	{
	System.setProperty("Webdriver.chrome.driver","C:\\ Program Files \\chromedriver3.exe");
	  
	 browserObject = new ChromeDriver();
	}  
	  @AfterTest
	  
	  public void aftertest() {
	    browserObject.close();
	  
	  
	}

	
	
	
	
		}
	
	
	

