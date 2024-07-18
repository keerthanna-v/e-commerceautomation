package com.ecommerceAutomation.pageObjects;

import java.time.Duration;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterUser {
	
	WebDriver driver;
	Select dropdown;


	public RegisterUser(WebDriver driver)
	
	{
	    this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	// Locators
	
	
	//name in the signup section
	@FindBy(xpath = "//input[@type=\"text\"]")
	WebElement txtName;
	
	//email in the signup section
	@FindBy(xpath = "//form[@action=\"/signup\"]//input[@type=\"email\"]")
	WebElement txtEmail;
	
	//signup button
	@FindBy(xpath = "//button[contains(text(),\"Signup\")]")
	WebElement btnSignup;
	
	//MR radio button
	@FindBy(xpath="//input[@type=\"radio\" and @value=\"Mr\"]")
	WebElement rdoMr;
	
	//MRs radio button
	@FindBy(xpath="//input[@type=\"radio\" and @value=\"Mrs\"]")
	WebElement rdoMrs;
	
	//password text
	@FindBy(id="password")
	WebElement txtPassword;
	
	//Day dropdown
	@FindBy(id="days")
	WebElement ddlDays;
	
	//months dropdown
	@FindBy(id="months")
	WebElement ddlMonths;
	
	//year dropdown
	@FindBy (id="years")
	WebElement ddlYear;
	
	//newsletter checkbox
	@FindBy (xpath="//input[@id=\"newsletter\"]")
	WebElement chkNewsletter;
	
	//Receive special offers from our partners! checkbox
	@FindBy (xpath="//input[@id='optin']")
	WebElement chkoptin;
	
	//Firstname
	@FindBy(id="first_name")
	WebElement txtFirstName;
	
	//LastName
	@FindBy(id="last_name")
	WebElement txtLastName;
	
	//Company
	@FindBy(id="company")
	WebElement txtCompany;
	
	//Address1
	@FindBy(id="address1")
	WebElement txtAddress1;
	
	//Address2
	@FindBy(id="address2")
	WebElement txtAddress2;
	
	//Country
	@FindBy(id="country")
	WebElement ddlCountry;
	
	//state
	@FindBy (id="state")
	WebElement txtState;
	
	@FindBy (id="city")
	WebElement txtCity;
	
	//Zipcode
	@FindBy(id="zipcode")
	WebElement txtZipcode;
	
	//mobilenumber
	@FindBy(id="mobile_number")
	WebElement txtMobileNumber;
	
	//Create account btn
	@FindBy(xpath = "//button[@data-qa='create-account']")
	WebElement btnCreateAccount;
	
	//continue button
	@FindBy(xpath="//a[@data-qa='continue-button']")
	WebElement btnContinue;
	
	//delete button
	@FindBy(xpath = "//a[contains(text(),' Delete Account')]")
	WebElement btnDelete;
	
	//delete continue btn
	@FindBy(xpath="//a[contains(text(),'Continue')]")
	WebElement btnDeleteContinue;
	
	
	
	
	//Actions
	
	
	
	public void setName(String name)
	{
		txtName.sendKeys(name);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void signup()
	{
		btnSignup.click();
	}
	
	public void selectTitle(String title)
	{
		if (title.equalsIgnoreCase("MR"))
		{
			rdoMr.click();
		}
		else
		{
			rdoMrs.click();
		}
	}
	
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void setDay(String day)
	{
		dropdown = new Select(ddlDays);
		dropdown.selectByValue(day);
	}
	
	public void setMonth(String Month)
	{
		dropdown = new Select(ddlMonths);
		dropdown.selectByValue(Month);
	}
	public void setYear(String year)
	{
		dropdown = new Select(ddlYear);
		dropdown.selectByValue(year);
	}
/*	public void selectNewsletter(JavascriptExecutor js)
	{
	

		js.executeScript("arguments[0].click()",chkNewsletter);
	}
	public  void selectOption(JavascriptExecutor js)
	{
		js.executeScript("arguments[0].click()",chkoptin);
	
	}
	*/
	public void setFirstName(String fname)
	{
		txtFirstName.sendKeys(fname);
	}
	public void setLastName(String lname)

	{
		txtLastName.sendKeys(lname);
		
	}
	public void setCompany(String company)
	{
		txtCompany.sendKeys(company);
	}
	
	public void setAddress1(String address1)

	{
		txtAddress1.sendKeys(address1);
	}
	public void setAddress2(String address2)

	{
		txtAddress2.sendKeys(address2);
	}
	public void selectCountry(String country)

	{
		dropdown=new Select(ddlCountry);
		dropdown.selectByValue(country);
	}
	
	public void setState(String State)
	{
	      txtState.sendKeys(State);	
	}
	public void setCity(String city)
	{
	      txtCity.sendKeys(city);	
	}
	
	public void setZipcode(String zipcode)

	{
		txtZipcode.sendKeys(zipcode);
	}
	public void setMobileNumber(String mobilenumber)

	{
		txtMobileNumber.sendKeys(mobilenumber);
	}
	//public void clickCreateAccount(JavascriptExecutor js)
	{
		//js.executeScript("arguments[0].click()",btnCreateAccount);
	}//
	
	public void clickContinue()
	{
		btnContinue.click();
	}
	public void clickDelete()
	{
		//wait.until(ExpectedConditions.elementToBeClickable(btnDelete)).click();
		btnDelete.click();
	}
	public void clickDeleteContinue() 
	{
	      btnDeleteContinue.click();	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
