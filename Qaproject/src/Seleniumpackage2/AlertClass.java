package Seleniumpackage2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
			
			// 2. Initialize Webdriver object through ChromeDriver class.
	       		 WebDriver browserObject = new ChromeDriver();
			// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
		        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
		         
		        browserObject.findElement(By.id("alert")).click();
		        
		        Alert alert = browserObject.switchTo().alert();
		        System.out.println(alert.getText());
		        Thread.sleep(4000);
		         
		        alert.accept();
		        
		        browserObject.findElement(By.id("confirm")).click();
		        Alert alert1 = browserObject.switchTo().alert();
		        System.out.println(alert1.getText());
		        Thread.sleep(4000);
		        
		        alert.dismiss();
		        
		        browserObject.findElement(By.id("prompt")).click();
		        Alert alert2 = browserObject.switchTo().alert();
		        Thread.sleep(4000);
                
		        
		         alert.sendKeys("Mr Dawit");
		          
		         alert.accept();
		 
		        
	}

}
