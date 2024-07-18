package com.ecommerceAutomation.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUS {

	WebDriver driver;



	public ContactUS(WebDriver driver)
	
	{
	    this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Locator
	@FindBy(xpath = "//input[@name='name']")
	WebElement txtName;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@name='subject']")
	WebElement txtSubject;
	
	@FindBy(xpath = "//textarea[@name='message']")
	WebElement txtMessage;
	
	@FindBy(xpath ="//input[@type='file']")
	WebElement btnChooseFile;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//span[contains(text(),'Home')]")
	WebElement btnHome;
	
	//Actions
	public void setName(String name)
	{
		txtName.sendKeys(name);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
		
	}
	public void setSubject(String subject)
	{
		txtSubject.sendKeys(subject);
	}
	public void setMessage(String message)
	{
		txtMessage.sendKeys(message);
	}
	public void uploadFile(String filelocation)
	{
		btnChooseFile.sendKeys(filelocation);
	}
	public void clickSubmit(JavascriptExecutor js)
	{
		//js.executeScript("arguments[0].click()",btnSubmit);
	}
	public void clickHome()
	{
		btnHome.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

