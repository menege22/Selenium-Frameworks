package seleniumpackage3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver1.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.b
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	     browserObject.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	
	     //fillthe registraion
	      
	     browserObject.findElement(By.id("ap_customer_name")).sendKeys("Dawit");
	     Thread.sleep(3000);
	     browserObject.findElement(By.id("ap_email")).sendKeys("Dawit22545@gmail.com");
	     Thread.sleep(3000);

	     browserObject.findElement(By.name("password")).sendKeys("Da2222");
	     Thread.sleep(3000);

	     browserObject.findElement(By.name("passwordCheck")).sendKeys("Da2222");
	     Thread.sleep(3000);

	     browserObject.findElement(By.id("continue")).click();;
	     Thread.sleep(3000);

	      System.out.println("verify Amazone");
	
	}
         
	  
}
