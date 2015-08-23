package com.nk.tests;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.eclipse.jetty.util.log.Log;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nk.common.NKCommon;
import com.nk.pages.CustomerSupportPage;
import com.nk.pages.HomePage;
import com.nk.pages.JobSearchNaukriPage;
import com.nk.pages.JobSeekerLoginPage;
import com.nk.pages.LoginNaukriPage;
import com.nk.pages.MyNaukriPage;
import com.nk.pages.RecruitNaukriPage;
import com.nk.pages.ResumeNaukriPage;
import com.nk.pages.SearchResultJobDescriptionPage;
import com.nk.pages.TermsAndConditions;
import com.nk.util.BaseTestObject;

public class HomePageTests extends BaseTestObject
{
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	WebDriver uiDriver;
	
	static HomePage Objhomepage;
	static JobSeekerLoginPage objJobSeekerLoginPage;
	static ResumeNaukriPage objResumeNaukriPage;
	static RecruitNaukriPage objRecruitNaukriPage;
	static LoginNaukriPage objLoginNaukriPage;
	static CustomerSupportPage objCustomerSupportPage;
	static MyNaukriPage objMyNaukriPage;
	static SearchResultJobDescriptionPage objSearchResultJobDescriptionPage;
	
	static TermsAndConditions objTermsandConditions;
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
	/*************************************************************************************************************************************/	
	@AfterClass
	public void teardown()
	{
		uiDriver.quit();
		//super.teardown();
	}
	/*************************************************************************************************************************************/	
	@Test(priority=1,enabled=true)
	public void verifySiteLogo() throws Exception
	{
		Log.info("Verification of site logo");
		
		try {
			Objhomepage= new HomePage(uiDriver);
			boolean isDisplayed=Objhomepage.verifySiteLogo();
			//Assert.assertTrue(isDisplayed,"Home page site logo is not displayed:");
			
			Objhomepage= Objhomepage.clickOnSiteLogo();
			Objhomepage.verifyHomePageTitle();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED VERIFYSITELOGO"+e.getLocalizedMessage() );
		}
	}
	/*************************************************************************************************************************************/	
	/**
	 * 
	 * @throws Exception
	 */
		@Test(priority=2,enabled=false)
		public void verifyHeadertabs() throws Exception
		{
			Log.info("Verifying the Header tabs");
			try 
			{
				 Objhomepage= new HomePage(uiDriver);
				Objhomepage.getHeaderLinksName();
				Objhomepage.verifyHomePageTitle();
			} 
			catch (Exception e)
			{
				throw new Exception("FAILED WHILE VERIFYING THE HEADER LINKS " +e.getLocalizedMessage());
			}
		}
	/*************************************************************************************************************************************/	
		@Test(priority=3,enabled=true)
		public void verifyJobsbyLocationslinks() throws Exception
		{
			Log.info("Verifcation of Jobs by locations");
			try
			{
				Objhomepage= new HomePage(uiDriver);
			//	Objhomepage.getJobsBYLocationsName();
				
				
			} catch (Exception e) 
			{
				throw new Exception("FAILED WHILE VERIFYING THE LOCATIONS LIST" + e.getLocalizedMessage());
			}
		}
	/*************************************************************************************************************************************/		
		@Test(priority=4,enabled=false)
		
		public void verifyNaukriFastForwardlink() throws Exception
		{
			Log.info("Verifcation of Naukri Fastforward image link");
			
			try 
			{
				String Parent_window= uiDriver.getWindowHandle();
				Objhomepage= new HomePage(uiDriver);
				Objhomepage.clickOnNaukriFastForwardImageLink();
				//objResumeNaukriPage.verifyFastForwardHomePageTitle();
				//objResumeNaukriPage.verifyGetResumeText();
				uiDriver.close();
				uiDriver.switchTo().window(Parent_window);
				//closechildwindow();
				
			} catch (Exception e) 
			{
				throw new Exception("FAILED WHILE CLICKING ON Naukri Fast forward" + e.getLocalizedMessage());
			}
		}
	/*************************************************************************************************************************************/
		
@Test(priority=5,enabled=false)
		
		public void verifyTermsandconditions() throws Exception
		{
			Log.info("Verifcation of Terms and conditionslink");
			
			try 
			{
				String Parent_window= uiDriver.getWindowHandle();
				Objhomepage= new HomePage(uiDriver);
			//	objTermsandConditions = Objhomepage.clickOnTermsAndConditionsLink();
				objTermsandConditions.verifyTermstext();
				uiDriver.close();
				uiDriver.switchTo().window(Parent_window);
				//Objhomepage= new HomePage(uiDriver);
				
				
				
				//closechildwindow();
			} catch (Exception e) 
			{
				throw new Exception("FAILED WHILE CLICKING ON Terms and conditions" + e.getLocalizedMessage());
			}
		}
/*************************************************************************************************************************************/		
@Test(priority=6,enabled=false)
public void verifyyourorder() throws Exception
{
	
	try {
		
		String parent=uiDriver.getWindowHandle();
		Objhomepage= new HomePage(uiDriver);
		
		objRecruitNaukriPage= Objhomepage.clickOnNaukriCallsLink();
		objRecruitNaukriPage.verifyourorder();
		
		objLoginNaukriPage=objRecruitNaukriPage.clickONClickhere();
		objLoginNaukriPage.verifyFortgetpassword();
		
		//closechildwindow();
		uiDriver.close();
		uiDriver.switchTo().window(parent);
		
	} catch (Exception e) 
	{
		throw new Exception("FAILED WHILE verifyyourorder ON " + e.getLocalizedMessage());
	}
	
}
/*************************************************************************************************************************************/
@Test(priority=7,enabled=false)
public void fillCustomerservicefor() throws Exception
{
	try
	{
		String parent=uiDriver.getWindowHandle();
		Objhomepage= new HomePage(uiDriver);
		objResumeNaukriPage=Objhomepage.clickOnNotGettingEnoughProfilesLink();
		objResumeNaukriPage.verifyResumeDisplayText();
		//objResumeNaukriPage.getPageTitle();
		uiDriver.close();
		uiDriver.switchTo().window(parent);
		
		
		
	} 
	catch (Exception e) 
	{
		throw new Exception("FAILED ENTERING CUSTOMER SERVICE FORM" + "\n fillCustomerservicefor" +e.getLocalizedMessage());
	}
}

/*************************************************************************************************************************************/
@Test(priority=8,enabled=false)
public void verifyLogin() throws Exception
{
	Log.info("Clicking on Login Button");
	try 
	{
		Objhomepage= new HomePage(uiDriver);
		objJobSeekerLoginPage=Objhomepage.clickOnLoginbutton();
		objJobSeekerLoginPage.verifyLogin();
		objJobSeekerLoginPage.username("manjuec.ole@gmail.com");
		objJobSeekerLoginPage.password("olemanju");
		objMyNaukriPage=objJobSeekerLoginPage.loginButton();
		objLoginNaukriPage=objMyNaukriPage.verifyMyNaukriLinkAndClickOnLogOut();
		Objhomepage=objLoginNaukriPage.clickOnSiteLogo();
		
	} 
	catch (Exception e) 
	{
		throw new Exception("FAILED WHILE CLICKING ON LOGIN BUTTON AND VERIFIED LOGIN FUNCTION" + "\n verifyLogin " + e.getLocalizedMessage());
	}
	}

@Test(priority=9, enabled=false)

public void verifyResetPasswordScreen() throws Exception
{
	Log.info("Verification of Reset Password screen");
	try 
	{
		Objhomepage= new HomePage(uiDriver);
		objJobSeekerLoginPage=Objhomepage.clickOnLoginbutton();
		objLoginNaukriPage=objJobSeekerLoginPage.clickOnForgetPasswordLink();
		objLoginNaukriPage.verifyResetYourPasswordText();
		objLoginNaukriPage.verifyIremeberMyEmailId();
		objLoginNaukriPage.enterEmailID("manjuec.oe@gmail.com");
		objLoginNaukriPage.clickOnSubmitButton();
		Thread.sleep(4000);
		
	} 
	catch (Exception e) 
	{
		throw new Exception("FAILED VERIFY RESET PASSWORD TEST CASE"+ "\n verifyResetPasswordScreen" + e.getLocalizedMessage());
	}
}
@Test (priority=10, enabled=false)
public void getlocationstext() throws Exception
{
	try
	{
		Objhomepage= new HomePage(uiDriver);
		//o=Objhomepage.clickOnJobsBYLocationsName();
		objSearchResultJobDescriptionPage.verifyLocationName();
		
	} 
	catch (Exception e) 
	{
	throw new Exception("FAILED GET LOCATION TEXT TEST CASE" + "\n getlocationstext" +e.getLocalizedMessage() );
	}
	
}

@Test (priority=11, enabled=false)
public void getcategorylistnames() throws Exception
{
	try
	{
		Objhomepage= new HomePage(uiDriver);
		objSearchResultJobDescriptionPage=Objhomepage.getJobsByCategoryLists();
		//objSearchResultJobDescriptionPage.verifyLocationName();
		
	} 
	catch (Exception e) 
	{
	throw new Exception("FAILED GET LOCATION TEXT TEST CASE" + "\n getlocationstext" +e.getLocalizedMessage() );
	}
	
}
}
