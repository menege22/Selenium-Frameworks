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
	     browserObject.get("www.amazone.com ");
	
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
