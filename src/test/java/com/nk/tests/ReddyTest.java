package com.nk.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.nk.pages.HomePage;
import com.nk.pages.JobSeekerLoginPage;
import com.nk.pages.LoginNaukriPage;
import com.nk.pages.MyNaukriPage;
import com.nk.util.BaseTestObject;

public class ReddyTest extends BaseTestObject
{
	boolean flag=false;

	public HomePage objHomePage;
	public JobSeekerLoginPage objJobSeekerLoginPage;
	public MyNaukriPage objMyNaukriPage;
	public LoginNaukriPage objLoginNaukriPage;

	@Parameters({"browserType","url"})
	@Test
	public void verifyhomesitelogo() throws Exception
	{
		objHomePage=new HomePage(uiDriver);
		flag=objHomePage.verifySiteLogo();
		Assert.assertTrue(flag,"Sitelogo is not displayed");
		objJobSeekerLoginPage=objHomePage.clickOnLoginbutton();
		objJobSeekerLoginPage.username("manjuec.ole@gmail.com");
		objJobSeekerLoginPage.password("olemanju");
		objMyNaukriPage=objJobSeekerLoginPage.loginButton();
		objLoginNaukriPage=objMyNaukriPage.verifyMyNaukriLinkAndClickOnLogOut();
		//objHomePage=objLoginNaukriPage.clickOnSiteLogo();
		
	}
	
}
