package com.ecommerceAutomation.testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.ecommerceAutomation.pageObjects.HomePage;
import com.ecommerceAutomation.pageObjects.RegisterUser;
import com.ecommerceAutomation.utilities.Methods_HomePage;

public class TC_RegisterExistingUser_005 extends BaseClass {
	
	@Test
	public void RegisterExistingUser()
	{
		ExtentTest test;
		RegisterUser reg = new RegisterUser(driver);
		Methods_HomePage mhp = new Methods_HomePage();
		HomePage hp = new HomePage(driver);
		test=extent.createTest("RegisterUser");
		
		//Verify that home page is visible successfully
		mhp.homepageIsVisible(driver, test);
		
		//click the signup or login btn
		hp.clickLoginOrSignUP();
		
		//Verify 'New User Signup!' is visible
		mhp.isNewUserSignUpVisible(driver, test);
		
		//Entering the existing User

	     reg.setEmail("dshbhb@gmail.com");
	     reg.setName("Keerthanna");
	     reg.signup();
	     
	     //verify the error is  displayed
	     mhp.isEmailAlreadyExistVisible(driver, test);
	     
		
	}

}
