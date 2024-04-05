package testngaasignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataType

  {

ChromeDriver browserObject;

 @Test(dataProvider= "dp")
 public void checking(String userName,String Password,String msg) throws InterruptedException {
	 
 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver1.exe");
 
 
 browserObject = new ChromeDriver();
 browserObject.get("https://admin-demo.nopcommerce.com/login");
 
 WebElement username = browserObject.findElement(By.name("Email"));
 
 WebElement password = browserObject.findElement(By.name("Password"));
 
 WebElement submitBtn =browserObject.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
  
 username.clear();
 
 username.sendKeys("admin@yourstore.com");
 password.clear();
 password.sendKeys("admin");
  
 submitBtn.click();
 
 System.out.println("End Results: Form Submitted");

 Thread.sleep(2000);
 }
 
 
 @DataProvider
 
 public Object[] [] dp()
 {
	 return new Object [][] {
		 new Object [] { "admin","admin123","Wrong Credential"},
		 new Object [] {"admin","adminhhp","Wrong Credential"},
		 new Object [] {"admin@yourstore.com","admin","Test Passed"},
	 };
 }
 
 
 
}








