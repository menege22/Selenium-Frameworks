package com.itlearn.testcases;

import org.testng.annotations.Test;

import com.itlearn.pages.BaseClass;
import com.itlearn.pages.LoginPage;

public class LoginTest extends BaseClass {
	
	@Test
	public void verify()
	{
		LoginPage lp=new LoginPage(driver);
		String user="Demo12";
		String pass = "Test123456$";
		lp.loginPortal(user, pass);
	}

}
