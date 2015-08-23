package com.nk.tests;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nk.pages.HomePage;
import com.nk.pages.ResumeNaukriPage;
import com.nk.pages.TermsAndConditions;

public class TermsandConditionsTests
{
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	WebDriver uiDriver;
	
	HomePage Objhomepage;
	ResumeNaukriPage objResumeNaukriPage;
	TermsAndConditions objTermsandConditions;
	String BASE_URL = "http://www.naukri.com/";
	/*************************************************************************************************************************************/
	
	@BeforeClass
	public void setup()
	{
		//super.setup();
		uiDriver= new FirefoxDriver();
		uiDriver.get(BASE_URL);
		uiDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		uiDriver.manage().window().maximize();
	}
	
	/*@Test
	public void verifyTermsandCOnditionTest() throws Exception{
		
		Objhomepage = new HomePage(uiDriver);
		obj = Objhomepage.clickOnTermsAndConditionsLink();
		objTermsandConditions.verifyTermstext();
	}*/
	
	/*************************************************************************************************************************************/	
	@AfterClass
	public void teardown()
	{
		uiDriver.quit();
		//super.teardown();
	}

}
