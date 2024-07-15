package com.ecommerceAutomation.testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.ecommerceAutomation.pageObjects.HomePage;
import com.ecommerceAutomation.pageObjects.LoginPage;
import com.ecommerceAutomation.utilities.Methods_HomePage;

public class TC_ValidLogin_002 extends BaseClass {
	
	@Test
	public void ValidLogin()
	{
		ExtentTest test;
		Methods_HomePage mhp = new Methods_HomePage();
		HomePage hp=new HomePage(driver);
		LoginPage lp = new LoginPage(driver);
		test=extent.createTest("ValidLogin");
		
		//Verify the homepage is displayed
		mhp.homepageIsVisible(driver, test);
		
		//clicking the Signup/Login btn
		hp.clickLoginOrSignUP();
		
		//checking the "Login to your account" is visible
		mhp.isLogintoAccountVisible(driver, test);
		
	    //Entering the Email and password
		lp.setEmail("dshbhb@gmail.com");
		lp.setPassword("Keerthanna@29");
		lp.clickLogin();
		
		//checking the user is logged in or not
		mhp.isLoggedIn(driver, test);
		
		
		
		
	}

}
