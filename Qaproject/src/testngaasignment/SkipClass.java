package testngaasignment;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipClass {

	@Test
	public void test1() {
		System.out.println("I am test1 and I will pass");
	}
		
	@Test
	public void test2() {
		System.out.println("I am test2 and I will skip");
		throw new SkipException("I am Skipping");
	}
	@Test
	public void test3() {
		System.out.println("I am tset3 and I will fail");
		assertEquals(true,false);
	}
	@Test(enabled=false)
	public void test4() {
	System.out.println("This will be skipped");	
	}
	
}
