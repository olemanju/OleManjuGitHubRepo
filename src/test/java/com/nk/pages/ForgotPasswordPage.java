package com.nk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.nk.common.NKConstants;

public class ForgotPasswordPage {
	WebDriver uiDriver;
	String text=null;
	By title=By.tagName("//h1");
	By Rememberusername=By.id("rd_un");
	By forgot=By.id("forgotusername");
	
	public ForgotPasswordPage(WebDriver driver){
		this.uiDriver=driver;
	}

	/*************************************************************************************************************************************/
	public void resetPasswordTitle()
	{
		text=uiDriver.findElement(title).getText().toLowerCase();
		Assert.assertEquals(text, NKConstants.FORGOTPASSWORD_RESETPASSWORD, "Reset Password Title is not displayed");
	}
	
	/*************************************************************************************************************************************/
	public void rememberUserNamePage(){
		uiDriver.findElement(Rememberusername).click();
		boolean flag=uiDriver.findElement(forgot).isDisplayed();
		Assert.assertTrue(flag, "I Remember my user name field is not displayed");
		}
	
	/*************************************************************************************************************************************/
	public void passingUserName(String username){
		uiDriver.findElement(forgot).sendKeys(username);
		
	}
	
	
}
