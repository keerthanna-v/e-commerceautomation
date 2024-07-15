package com.ecommerceAutomation.testCases;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.ecommerceAutomation.pageObjects.ContactUS;
import com.ecommerceAutomation.pageObjects.HomePage;
import com.ecommerceAutomation.pageObjects.RegisterUser;
import com.ecommerceAutomation.utilities.Methods_HomePage;

public class TC_ContactUsForm_006 extends BaseClass {
	 
	@Test
	public void ContactUsForm()
	{
		ExtentTest test;
		RegisterUser reg = new RegisterUser(driver);
		Methods_HomePage mhp = new Methods_HomePage();
		HomePage hp = new HomePage(driver);
		ContactUS cu=new ContactUS(driver);
		test=extent.createTest("ContactUs");
		
		//Verify that home page is visible successfully
		mhp.homepageIsVisible(driver, test);
		
		//click on the contactus btn
		hp.clickContactUs();
		
		//Verify 'GET IN TOUCH' is visible
		mhp.isGetInTouchVisible(driver, test);
		
		//Entering the data
		cu.setName("keerthanna");
		cu.setEmail("ewdb@gmail.com");
		cu.setSubject("djsfu");
		cu.setMessage("idfhh");
		cu.uploadFile("C:\\Users\\keert\\Downloads\\keerthanna-v-resume.docx");
		
		//click on submit
		cu.clickSubmit(js);
		
		//Alert handling
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Success messaage
		mhp.isTextVisible(driver, test, "Success! Your details have been submitted successfully.");
		
		//click on home
		cu.clickHome();
		
		
		
	}

}
