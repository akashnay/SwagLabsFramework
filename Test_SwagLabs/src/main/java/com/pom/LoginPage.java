package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(xpath="//input[@id='user-name']") private WebElement userName;
	@FindBy(xpath="//input[@id='password']") private WebElement password;
	@FindBy(xpath="//input[@id='login-button']") private WebElement loginBtn;
	
	public LoginPage()
	{
		//super();
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername()
	{
		userName.sendKeys(prop.getProperty("standard_user"));
	}
	public void enterPassword()
	{
		password.sendKeys(prop.getProperty("secret_sauce"));
	}
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}
	
	public void loginApp()
	{
		userName.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginBtn.click();
	}
}
