package Seleniumpackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
     browserObject.get("https://www.facebook.com/");
        // 4. we use gettitle from the website
     System.out.println("This is"+ browserObject.getTitle() + "website");
     // 5. we use getcurrentUrl method to get the url of the webpage
     System.out.println("Url is :" + browserObject.getCurrentUrl());
      // 6.navigation method to move the next website http://www.instegram.com/"
     browserObject. navigate().to("https://www.instagram.com/");
      
      System.out.println("This is" + browserObject.getTitle()+ "Website");
      
     System.out.println("Url is :" + browserObject.getCurrentUrl());
     
     browserObject.navigate().to("https://twitter.com/");
     
     browserObject.navigate().back();
     
      System.out.println("This is" + browserObject.getTitle()+ "Website");
      
      
      System.out.println("Url is :" + browserObject.getCurrentUrl());
      
      browserObject.navigate().back();
      
      browserObject.navigate().forward();
       System.out.println("This is" + browserObject.getTitle() + "website");
       
       System.out.println("Url is :" + browserObject.getCurrentUrl());
	}

}
