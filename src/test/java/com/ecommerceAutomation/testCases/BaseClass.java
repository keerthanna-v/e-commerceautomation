package com.ecommerceAutomation.testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.ecommerceAutomation.pageObjects.HomePage;
import com.ecommerceAutomation.pageObjects.RegisterUser;
import com.ecommerceAutomation.utilities.Methods_HomePage;

public class BaseClass {
	
	public WebDriver driver;
	public String BaseURL="https://automationexercise.com";
	public ExtentSparkReporter spark;
	public ExtentReports extent;
	public JavascriptExecutor js;
	public int newvar;

	
	
	@BeforeClass
	public void setUp() 
	{
		
		driver = new ChromeDriver();
		driver.get(BaseURL);
		driver.manage().window().maximize();
		js = (JavascriptExecutor)driver;
		extent = new ExtentReports();
		spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/target/ExtentReport.html");
		extent.attachReporter(spark);
		extent.setSystemInfo("User Name", "Keerthanna");
		spark.config().setDocumentTitle("Automation report ");
		                // Name of the report
		spark.config().setReportName("E-commerce Automation report");
		                // Dark Theme
		spark.config().setTheme(Theme.DARK);
	
	}
	
	
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		extent.flush();
		driver.quit();
	}
}
