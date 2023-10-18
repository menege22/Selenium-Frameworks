package Seleniumpackage2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
          browserObject.get("http://www.google.com/");
          
         WebElement blogLink =  browserObject.findElement(By.linkText("Gmail"));
         
          if (blogLink.isDisplayed()) {
        	   System.out.println("Gmail lnk Displayed using LinkText");
          } else
           {
        	  System.out.println("Unable to find gmail");
        	    
        	  browserObject.close();
          }
          
	}

}
