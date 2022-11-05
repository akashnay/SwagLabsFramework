package com.tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.base.BaseClass;
import com.pom.LoginPage;
import com.utilities.Reports;

public class LoginTest_Report extends BaseClass{
	LoginPage login;
	ExtentReports reports;
	ExtentTest test;
	
	@Test
	public void LoginTestReport() throws InterruptedException
	{
		reports=Reports.addReport();
		test=reports.createTest("LoginTestReport");
		
		openBrowser();
		login =new LoginPage();
		login.loginApp();
		Thread.sleep(2000);
		closeBrowser();
	}

}
