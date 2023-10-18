package Seleniumpackage2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// 2. Initialize Webdriver object through ChromeDriver class.
       		 WebDriver browserObject = new ChromeDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	        Thread.sleep(4000);
	        browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
	        Thread.sleep(4000);
             browserObject.findElement(By.xpath("//*[@id=\"other\"]")).click();
              browserObject.findElement(By.name("submit")).click();
	        
	}

}
