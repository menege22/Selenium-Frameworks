package com.itlearn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="loginlabel") WebElement logclick;
	@FindBy(name="log") WebElement user;
	@FindBy(name="pwd") WebElement pass;
	@FindBy(id="wp-submit") WebElement login;
	
	@FindBy(xpath="//*[@id=\"gk-login-toggle\"]/i") WebElement logoutimage;
	@FindBy(xpath="//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a") WebElement logout;
	
	
	public void loginPortal(String username,String password)
	{
		logclick.click();
		user.sendKeys(username);
		pass.sendKeys(password);
		login.click();
	}
	
	public void logout()
	{
		logoutimage.click();
		logout.click();
	}
	
}
