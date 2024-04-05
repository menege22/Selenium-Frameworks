package testngaasignment;

import org.testng.annotations.Test;

public class TimeOut {
 @Test(timeOut = 3000)

 public void waitFor2Seconds () throws InterruptedException{
	System.out.println("waiting For 2 seconds,will be printed but,fails this test eventually"); 
	
	Thread.sleep(2000);
	
 }
  @Test(timeOut = 1000)
  public void simplePrint() {
	  System.out.println("Printing is succesful");
  }
}
