package com.ecommerceAutomation.testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.ecommerceAutomation.pageObjects.HomePage;
import com.ecommerceAutomation.utilities.Methods_HomePage;

public class TC_VerifyTestCasePage_007 extends BaseClass{
	@Test
	public void verifyTestCasePage()
	{
		ExtentTest test;
		Methods_HomePage mhp = new Methods_HomePage();
		HomePage hp = new HomePage(driver);
		test=extent.createTest("VerifyTestcasepage");
		//Verify that home page is visible successfully
		mhp.homepageIsVisible(driver, test);
		
		//Click on testcases in home
		hp.clickTestCases();
		
		//Verify the tescase page with page title
		mhp.isTestCaseVisible(driver, test);
		
		
	}

}
