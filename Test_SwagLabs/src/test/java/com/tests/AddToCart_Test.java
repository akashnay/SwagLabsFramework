package com.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;
import com.pom.HomePage;
import com.pom.LoginPage;

public class AddToCart_Test extends BaseClass{
	HomePage homePageObj;
	LoginPage login;
	
	@BeforeMethod
	public void launchApp() throws InterruptedException
	{
		openBrowser();
		login =new LoginPage();
		login.loginApp();
		//Thread.sleep(2000);
		
		homePageObj=new HomePage();
		
		
	}
	
	@Test
	public void addItemsToCart_Test() throws InterruptedException
	{
		homePageObj.clickOnBagToCart();
		homePageObj.clickOnBlackTShirtToCart();
		homePageObj.clickOnCartBtn();
		SoftAssert softAssert=new SoftAssert();
		String currentURL=driver.getCurrentUrl();
		String expectedURL="https://www.saucedemo.com/cart.html";
		softAssert.assertEquals(currentURL, expectedURL, "Got Wrong URl...");
		softAssert.assertAll();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void closeApp()
	{
		closeBrowser();
	}
}
