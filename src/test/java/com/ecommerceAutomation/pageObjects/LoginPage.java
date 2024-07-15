package com.ecommerceAutomation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	WebDriver driver;
	Select dropdown;


	public LoginPage(WebDriver driver)
	
	{
	    this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locators
	
	@FindBy(xpath="//input[@data-qa=\"login-email\"]")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@data-qa='login-password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[@data-qa='login-button']")
	WebElement btnLogin;
	
	//actions
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		btnLogin.click();
		
	}
}
