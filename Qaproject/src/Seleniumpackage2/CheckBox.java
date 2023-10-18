package Seleniumpackage2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		// 2. Initialize Webdriver object through ChromeDriver class.
       		 WebDriver browserObject = new ChromeDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	         
	        WebElement checkboxBike = browserObject.findElement(By.xpath("//input[@value='Bike']"));
	        
	        WebElement checkboxCar = browserObject.findElement(By.xpath("/html/body/form/input[8]"));
	        

	        WebElement checkboxBoat = browserObject.findElement(By.xpath("/html/body/form/input[9]"));
	        

	        WebElement checkboxHorse = browserObject.findElement(By.xpath("/html/body/form/input[10]"));
	        

	        checkboxBike.click();
	        Thread.sleep(4000);

	        checkboxCar.click();
	        Thread.sleep(4000);

	        checkboxBoat.click();
	        Thread.sleep(4000);

	        checkboxHorse.click();
	        Thread.sleep(4000);

	        
	        browserObject.findElement(By.name("submit")).click();
	        
	}

}
