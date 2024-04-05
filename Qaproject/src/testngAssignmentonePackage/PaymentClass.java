package testngAssignmentonePackage;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PaymentClass {
	ChromeDriver browserObject;

	@Test
	public void login()  
	{
		browserObject.get("http://demo.itlearn360.com/");
		
		browserObject.findElement(By.id("loginlabel")).click();
		
		browserObject.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	WebElement username = browserObject.findElement(By.id("user_login"));
	
	WebElement Password = browserObject.findElement(By.id("user_pass"));
	
	WebElement LoginBtn = browserObject.findElement(By.name("wp-submit"));
	 
	browserObject.manage().window().maximize();

	
	username.sendKeys("Demo12 ");
	
	Password.sendKeys("Test123456$");
	
	LoginBtn.click();
	
	//}
	// @Test
	//   public void verify () 
	 //  {
	   WebElement element = browserObject.findElement(By.xpath("//*[@id=\"login-list\"]/li[1]/a"));
	
		element.click();
		
		
	   System.out.println("Dashboard");
	   
	    String expectedTitle = "Dashboard";
		
		String actualTitle  = browserObject.findElement(By.xpath("//*[@id=\\\"learn-press-user-info\\\"]/span/div")).getText();
		
		assertEquals(actualTitle,expectedTitle);
		
	   }	
	    @Test
	    public void offerAcadamic()
	    {
	 
	   WebElement offeracadBtn = browserObject.findElement(By.xpath("//*[@id=\\\"learn-press-user-profile\\\"]/ul/li[3]/a"));

	   offeracadBtn.click();
	  
	
	   
	   WebElement subscribBtn = browserObject.findElement(By.className("btn btn-primary"));
	  
        subscribBtn.click();
	    
   
	   }
	    
	    @Test 
	    public void paysubscription() {
	    
	    browserObject.findElement(By.xpath("//*[@id=\"learn-press-payment\"]/ul/li/label")).click();
	    
	    browserObject.findElement(By.xpath("//*[@id=\"learn-press-checkout-place-order\"]")).click();
	    //enter credit card number and make a payment
	    browserObject.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")).sendKeys("2345 6777 7532 222");
	    //enter expiration date
	    browserObject.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[2]/span[1]/span/span/input")).sendKeys("11/27");
	    // enter cvv number
	    browserObject.findElement(By.xpath("//*[@id=\"root\"]/form/div/div[2]/span[2]/span[2]/span/span/input")).sendKeys("200");
	    //click paybutton
	    browserObject.findElement(By.id("payment-button")).click();
	    }
	@BeforeTest
	
	public void BeforeTest() {  
	
	   System.out.println("---BeforeTest,set browsing");
	System.setProperty("Webdriver.chrome.driver","C:\\ Program Files \\chromedriver3.exe");
	  
	  browserObject = new ChromeDriver();
	}
	
   // @AfterTest 
	
	//public void AfterTest() {
		 
	//	 System.out.println("--Aftertest,Closing the browsing window");
		 
	//	browserObject.close();
	//}
}
