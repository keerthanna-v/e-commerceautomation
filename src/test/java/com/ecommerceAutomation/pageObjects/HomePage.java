package com.ecommerceAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;
	Select dropdown;


	public HomePage(WebDriver driver)
	
	{
	    this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators
	
	//Sign up / Login button in home page
		@FindBy(xpath = "//a[contains(text(),' Signup / Login')]")
		WebElement btnLoginOrSignUp;
	//Logout
		@FindBy(xpath = "//a[contains(text(),'Logout')]")
		WebElement btnLogOut;
		
	//Contact Us
		@FindBy(xpath = "//a[contains(text(),' Contact us')]")
		WebElement btnContactUs;
		
	// Test Cases
		@FindBy(xpath = "//a[contains(text(),' Test Cases')]")
		WebElement btnTestCases;
		
		
	//actions
		public void clickLoginOrSignUP()
		{
			btnLoginOrSignUp.click();
		}
		public void clickLogOut()
		{
			btnLogOut.click();
		}
		public void clickContactUs()
		{
			btnContactUs.click();
		}
		public void clickTestCases()
		{
			btnTestCases.click();
		}
	
}
