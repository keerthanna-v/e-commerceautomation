package com.ecommerceAutomation.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ecommerceAutomation.pageObjects.RegisterUser;

public class Methods_HomePage {

	SoftAssert softassert = new SoftAssert();
	
	// Whether homepage is visible or not
	public void homepageIsVisible(WebDriver driver,ExtentTest test )
	{
		softassert.assertTrue(driver.getTitle().equalsIgnoreCase("Automation Exercise"),"home page is visible successfully");
	    if(driver.getTitle().equalsIgnoreCase("Automation Exercise"))
	    {
		test.log(Status.PASS,"home page is visible successfully");
	    }
	    else
	    {
	    	test.log(Status.FAIL,"home page is not visible");
	    }
	}
	
	public void isTextVisible(WebDriver driver,ExtentTest test,String text)
	{
		softassert.assertTrue(driver.getPageSource().contains(text));
	    if(driver.getPageSource().contains(text))
	    {
	    	test.log(Status.PASS,text+" is visbible");
	    }
	    else
	    {
	    	test.log(Status.FAIL,text+" is not visible");	    	
	    }
		
	}
	
	// Whether user logged  in or not
	public void isLoggedIn(WebDriver driver,ExtentTest test)
	{
		isTextVisible(driver, test, "Logged in as");
	    
	}
	
	//Whether isaccount created
	public void isAccountCreated(WebDriver driver,ExtentTest test)
	{
		isTextVisible(driver, test, "Account Created!");

	}
	
	//Whether is account deleted
	public void isAccountDeleted(WebDriver driver,ExtentTest test)
	{
		isTextVisible(driver, test, "Account Deleted!");	
	}
	
	public void isNewUserSignUpVisible(WebDriver driver,ExtentTest test)
	{
		isTextVisible(driver, test,"New User Signup!");	
	}
    
	public void isLogintoAccountVisible(WebDriver driver,ExtentTest test)
	{
		isTextVisible(driver, test, "Login to your account");
	}
	public void isInvalidEmailOrPasswordVisible(WebDriver driver,ExtentTest test)
	{
		isTextVisible(driver, test, "Your email or password is incorrect!");
	}
	
	public void isLoginPageVisible(WebDriver driver,ExtentTest test)
	{
	
		softassert.assertTrue(driver.getTitle().equalsIgnoreCase("Automation Exercise - Signup / Login"),"Login page is visible successfully");
	    if(driver.getTitle().equalsIgnoreCase("Automation Exercise - Signup / Login"))
	    {
		test.log(Status.PASS,"login page is visible successfully");
	    }
	    else
	    {
	    	test.log(Status.FAIL,"Login page is not visible");
	    }
	}
	
	public  void isEmailAlreadyExistVisible(WebDriver driver,ExtentTest test)
	{
		isTextVisible(driver, test, "Email Address already exist!");
	}
	public void isGetInTouchVisible(WebDriver driver,ExtentTest test)
	{
		isTextVisible(driver, test, "Get In Touch");
	}
	public void isTestCaseVisible(WebDriver driver,ExtentTest test)
	{
		
		softassert.assertTrue(driver.getTitle().equalsIgnoreCase("Automation Practice Website for UI Testing - Test Cases"),"Testcase page is visible successfully");
			    if(driver.getTitle().equalsIgnoreCase("Automation Practice Website for UI Testing - Test Cases"))
			    {
				test.log(Status.PASS,"Testcase page is visible successfully");
			    }
			    else
			    {
			    	test.log(Status.FAIL,"Testcase page is not visible");
			    }
	}
	
	public void deleteAccount(RegisterUser reg,WebDriver driver,ExtentTest test)
	{	  
	    //Deleting the Account
	    reg.clickDelete();
	    
	    //checking the account deleted message
	    isAccountDeleted(driver, test);
	    
	    //clicking on the delete button
	    reg.clickDeleteContinue();
	   
	    //checking the homepage is visible or not 
	     homepageIsVisible(driver, test);
	}
	
}



