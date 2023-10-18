package Seleniumpackage2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillTheform {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. setup the property of chromedriver to open google page through chrome web browser.
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.
	        WebDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
     browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");	
    
     browserObject.findElement(By.name("name")).sendKeys("dawit");
     Thread.sleep(4000);

     browserObject.findElement(By.name("email")).sendKeys("dawit@gmail.com");
     Thread.sleep(4000);

     browserObject.findElement(By.name("website")).sendKeys("ItLearn360");
     Thread.sleep(4000);

     browserObject.findElement(By.name("comment")).sendKeys("This is good website");
     Thread.sleep(4000);

     
     
     //radio button
      
     browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
     Thread.sleep(4000);
     browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
     Thread.sleep(4000);
      browserObject.findElement(By.xpath("//*[@id=\"other\"]")).click();

       //checkbox
       

       WebElement checkboxBike = browserObject.findElement(By.xpath("/html/body/form/input[7]"));
       
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

       
       
       //dropdown
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
        //alert
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
