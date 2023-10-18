package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adminlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		// 2. Initialize WebDriver object through ChromeDriver class.
	      WebDriver  browserObject = new ChromeDriver();
		// 3. Open the web page https://www.facebook.com/
	        browserObject.get("https://admin-demo.nopcommerce.com/login");
	        browserObject.findElement(By.id("Email")).clear();
	        browserObject.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	        browserObject.findElement(By.id("Password")).clear();
	        browserObject.findElement(By.id("Password")).sendKeys("admin");
	        
	        browserObject.findElement(By.className("button-1")).click();
	}  
	
	
	     
}
