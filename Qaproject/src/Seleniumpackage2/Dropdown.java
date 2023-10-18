package Seleniumpackage2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// 2. Initialize Webdriver object through ChromeDriver class.
       		 WebDriver browserObject = new ChromeDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	         
	        Select countryselect = new Select(browserObject.findElement(By.name("country")));
	        
	        countryselect.selectByVisibleText("USA");
	         Thread.sleep(4000);
	        countryselect.selectByIndex(3);
	        
	        Select skillselect = new Select(browserObject.findElement(By.name("skill")));
	        
	        skillselect.selectByVisibleText("Quality Assurance");
	         Thread.sleep(4000);

	        skillselect.selectByVisibleText("Programming");
	         Thread.sleep(4000);

	        skillselect.selectByVisibleText("Database");
	         Thread.sleep(4000);

	        browserObject.findElement(By.name("submit")).click();
	        
	        
	}

}
