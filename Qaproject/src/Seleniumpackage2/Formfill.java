package Seleniumpackage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formfill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
       browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");	
      
       browserObject.findElement(By.name("name")).sendKeys("dawit");
       
       browserObject.findElement(By.name("email")).sendKeys("dawit@gmail.com");
       browserObject.findElement(By.name("website")).sendKeys("ItLearn360");
       browserObject.findElement(By.name("comment")).sendKeys("This is good website");
       browserObject.findElement(By.name("submit")).click();;
       
       
       
       
	}

}
