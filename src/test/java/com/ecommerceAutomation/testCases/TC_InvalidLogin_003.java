package com.ecommerceAutomation.testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.ecommerceAutomation.pageObjects.HomePage;
import com.ecommerceAutomation.pageObjects.LoginPage;
import com.ecommerceAutomation.utilities.Methods_HomePage;

public class TC_InvalidLogin_003 extends BaseClass{
    @Test
	public void InvalidLogin() {
		
		ExtentTest test;
		Methods_HomePage mhp = new Methods_HomePage();
		HomePage hp=new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		test=extent.createTest("ValidLogin");
		
		//Verify the home page
		mhp.homepageIsVisible(driver, test);
		
		//clicking on the click on the signup/login btn
		hp.clickLoginOrSignUP();
		
		//Verify 'Login to your account' is visible
		mhp.isLogintoAccountVisible(driver, test);
			
		//Entering the invalid data
		lp.setEmail("uysgd@gmail.com");
		lp.setPassword("fiub");
		lp.clickLogin();
		
		//Verify error 'Your email or password is incorrect!' is visible
		mhp.isInvalidEmailOrPasswordVisible(driver, test);
		
		
	}
}
