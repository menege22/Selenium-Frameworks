package seleniumtraning;

import org.openqa.selenium.chrome.ChromeDriver;

public class FillFormout {

	public static <Webelement> void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver2.exe" );
			// 2. Initialize Webdriver object through ChromeDriver class.
		        ChromeDriver browserObject = new ChromeDriver();
			// 3. Open the http://www.google.com/ link using get method.
	     browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
	      //form fill
	      
	     browserObject.findElement(By.name("name")).sendKeys("moses");
	     browserObject.findElement(By.name("email")).sendKeys("moses@gmail.com");
	     browserObject.findElement(By.name("website")).sendKeys("Itlearn360");
	     browserObject.findElement(By.name("comment")).sendKeys("hi moses");
	      
	     //radiobutton
	      
	     browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	     Thread.sleep(4000);
	     browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
	     Thread.sleep(4000);

	     browserObject.findElement(By.xpath("//input[@value='Other']")).click();
	     Thread.sleep(4000);

	     //checkbox
	      
	   WebElement checkboxBike = browserObject.findElement(By.xpath("/html/body/form/input[7]"));
	   WebElement checkboxCar  = browserObject.findElement(By.xpath("/html/body/form/input[8]"));
	   WebElement checkboxBoat = browserObject.findElement(By.xpath("//input[@value='boat']"));
	   WebElement checkboxHorse = browserObject.findElement(By.xpath("//input[@value='horse']"));
	     
	     
	   checkboxBike.click();
	   Thread.sleep(4000);
	   
	   checkboxCar.click();
	   Thread.sleep(4000);

	   checkboxBoat.click();
	   Thread.sleep(4000);

	   
	   checkboxHorse. click();
	   Thread.sleep(4000);
	    
	   //dropdownbox
	   
	   Select countryselect = new Select(browserObject.findElement(By.name("country")));
	   
	   countryselect.selectByVisibleText("USA");
	   Thread.sleep(4000);
	   

	   Thread.sleep(4000);

	   countryselect.selectByIndex(03);
	   Thread.sleep(4000);

	   Select skillselect = new Select(browserObject.findElement(By.name("skill")));
	    
	  skillselect.selectByVisibleText("Quality Assurance");
	   Thread.sleep(4000);

	  skillselect.selectByVisibleText("Programming");
	   Thread.sleep(4000);

	  System.out.println("selectByVisibleText(\"Programming\"");
	   
	  browserObject.findElement(By.name("submit")).click();
	   
        // Alertclass
	  
	    browserObject.findElement(By.id("alert")).click();
	      
     Alert alert  =  browserObject.switchTo().alert();
	   Thread.sleep(4000);

     System.out.println(alert.getText());
	   Thread.sleep(4000);

     alert.accept();
     
      browserObject.findElement(By.id("confirm")).click();
	   Thread.sleep(4000);

      Alert alert1 = browserObject.switchTo().alert();
      
      System.out.println(alert.getText());
	   Thread.sleep(4000);

      
      alert.dismiss();
      
      browserObject.findElement(By.id("prompt")).click();
	   Thread.sleep(4000);

      Alert alert2 = browserObject.switchTo().alert();
	   Thread.sleep(4000);

      System.out.println(alert.getText());
	   Thread.sleep(4000);

      alert.sendKeys("Mr dawit");
	  
      alert.accept();
	   
	   
	   
       
	}
	
 
}
