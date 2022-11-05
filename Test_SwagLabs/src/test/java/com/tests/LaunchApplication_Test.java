package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.BaseClass;

public class LaunchApplication_Test extends BaseClass{
	
	

	@Test
	public void launchAppTest() throws InterruptedException
	{
		
		//Open SwagLabs Application
		openBrowser();
		String actualTitle=driver.getTitle();
		String expectedTitle="Swag Labs";
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(actualTitle, expectedTitle,"Got Wrong Title...");
		
		Thread.sleep(2000);
		
		
		
		//Open SwagLabs Application
		closeBrowser();
		softAssert.assertAll();
	}
}
