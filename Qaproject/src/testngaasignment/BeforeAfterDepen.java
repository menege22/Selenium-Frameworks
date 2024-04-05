package testngaasignment;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterDepen {

	ChromeDriver browserObject;
	
	 @Test
	 public void performLogin() throws InterruptedException {
	 
	 System.out.println("performing Login and wait for 2 seconds");
	 
	 
	 browserObject.get("https://admin-demo.nopcommerce.com/login");
	 
	 WebElement username = browserObject.findElement(By.name("Email"));
	  
	 WebElement password = browserObject.findElement(By.name("Password"));
	 
	 WebElement submitBtn =browserObject.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
	  
	 username.clear();
	 
	 username.sendKeys("admin@yourstore.com");
	 password.clear();
	 password.sendKeys("admin");
	  
	 submitBtn.click();
	 
	 System.out.println("End Results: Form Submitted");

	 Thread.sleep(2000);
	 }
	 
	 @Test(dependsOnMethods = "performLogin")
	   public void assertHomePage()  throws InterruptedException {
	     System.out.println("--using Assert-checking HomePage Text else,this test will fail");
	 
	     String expectedTextFromPage ="Dashboard";
	     
	     String actualTextFromHomePage = browserObject.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
	     
	    assertEquals(actualTextFromHomePage,expectedTextFromPage);
     
         Thread.sleep(2000);
	 
	 }
	 
	  @BeforeTest
	  
	  public void beforeTest() {
		 
	  System.out.println("--@beforeTest, set the browser,Maximize the window");
	  
	  System.setProperty("Webdriver.chrome.driver","C:\\ Program Files \\chromedriver1.exe");
	  
	  browserObject = new ChromeDriver();
	  browserObject.manage().window().maximize();
	  }
	  @AfterTest
	  
	  public void aftertest() {
		 
	  System.out.println("--@afterTest, Closing the browsing window");
	 
	  browserObject.close();
	  }
}  






















