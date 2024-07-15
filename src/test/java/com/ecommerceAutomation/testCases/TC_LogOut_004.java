package com.ecommerceAutomation.testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.ecommerceAutomation.pageObjects.HomePage;
import com.ecommerceAutomation.pageObjects.LoginPage;
import com.ecommerceAutomation.pageObjects.RegisterUser;
import com.ecommerceAutomation.utilities.Methods_HomePage;


public class TC_LogOut_004 extends BaseClass {
	
	@Test
	public void LogOutUser()
	{
		ExtentTest test;
		RegisterUser reg = new RegisterUser(driver);
		Methods_HomePage mhp = new Methods_HomePage();
		LoginPage lp = new LoginPage(driver);
		
		HomePage hp = new HomePage(driver);
		test=extent.createTest("RegisterUser");
		
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
				
		//Verify that 'Logged in as username' is visible
		mhp.isLoggedIn(driver, test);	
		
		//click on logout
		hp.clickLogOut();
		
		//verify navigated to login page
		mhp.isLoginPageVisible(driver, test);
		
	
		
	}

}
