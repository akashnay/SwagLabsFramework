package com.tests;

import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.LoginPage;

public class Login_Test extends BaseClass{
	
	LoginPage login;
	
	@Test
	public void loginToApplication_Test() throws InterruptedException
	{
		openBrowser();
		login =new LoginPage();
		login.loginApp();
		Thread.sleep(2000);
		closeBrowser();
	}

}
