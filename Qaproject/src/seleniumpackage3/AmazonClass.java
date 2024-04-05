package seleniumpackage3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonClass {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver2.exe" );
		// 2. Initialize Webdriver object through ChromeDriver class.b
	        ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.google.com/ link using get method.
	        browserObject.get("https://www.amazon.com/");
	        browserObject.manage().window().maximize();
			//browserObject.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;

	           // dell laptop search
	        browserObject.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
	        browserObject.findElement(By.id("nav-search-submit-button")).submit();
	        
	        
	         
	      // WebElement checkboxcustomerreview = browserObject.findElement(By.xpath("//*[@id=\"p_72/1248879011\"]/span/a/section/i"));
	        // check box
	        

	        browserObject.findElement(By.id("low-price")).sendKeys("500");
	       
	        browserObject.findElement(By.id("high-price")).sendKeys("600");

	        browserObject.findElement(By.className("a-button-input")).click();
		   
	        
	      
	       JavascriptExecutor js = (JavascriptExecutor) browserObject;
	       
	       js.executeScript("window.scrollBy(0,500)", "");
	      
		   WebElement checkboxBrand =  browserObject.findElement(By.xpath("//*[@id=\"p_89/Dell\"]/span/a/div/label/i"));
		   

	      
		   WebElement checkboxDisplaysize= browserObject.findElement(By.xpath("//*[@id=\"p_n_size_browse-bin/2423841011\"]/span/a/div/label/i"));
	       
	       WebElement checkboxcomputerprocesstype = browserObject.findElement(By.xpath("//*[@id=\"p_n_feature_four_browse-bin/3081486011\"]/span/a/div/label/i"));
	        
	       WebElement checkboxcomputerRammemory = browserObject.findElement(By.xpath("//*[@id=\"p_n_feature_thirty-three_browse-bin/23720421011\"]/span/a/div/label/i"));
 
	     
	      // checkboxcustomerreview.click();
	      // Thread.sleep(4000);
	       
	       checkboxBrand.click();
	       Thread.sleep(5000);

	      checkboxDisplaysize.click();
	       Thread.sleep(5000);

	     

	      checkboxcomputerprocesstype.click();
	      Thread.sleep(5000);

	        checkboxcomputerRammemory.click();
	        Thread.sleep(5000);
	       
 
	       
	       
	       
	       
	       
	       
	       
	}

	 {
	}
	
	
	
	
	

}
