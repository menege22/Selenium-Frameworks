package testngaasignment;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertClass {

	@Test
	public void checkGooglesite() {
		
	ChromeDriver browserObject;
	
    System.setProperty("Webdriver.chrome.driver","C:\\ Program Files \\chromedriver3.exe");
    
    browserObject = new ChromeDriver();
    browserObject.get("https://www.google.com/");
    
    String expectedTitle = "Google";
    
    String actualTitle = ( browserObject).getTitle();
    
    assertEquals(actualTitle,expectedTitle);
	}
}
