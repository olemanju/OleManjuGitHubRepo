package com.nk.pages;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.nk.util.BasePageObject;

public class JobSeekerLoginPage extends BasePageObject
{

	//WebDriver  uiDriver;
	private static Logger log=Logger.getLogger(Logger.class.getName());
	By Login=By.id("login_Layer");
	By User=By.id("eLogin");
	By Pass=By.id("pLogin");
	By Button=By.xpath("//form[@id='lgnFrm']//div[7]//button");
	By Regi=By.xpath(".//*[@id='lgnFrm']/div[8]/a");
	By forgetpasswordlnk=By.partialLinkText("Forgot Password?");
	boolean flag=false;
	
	//Constructor
	public JobSeekerLoginPage(WebDriver driver) 
	{
		//this.uiDriver=driver;
		super(driver);
	}
	/**************************************************************************************************************************************/
	/**
	 * @author Shailesh kumar
	 * @return boolean
	 * @throws Exception
	 **This method is help us to verify Login icon
	 */
	 
	public boolean verifyLogin() throws Exception {
		log.info(">>>Verifying Login is present or not>>>>>>>>");
		try 
		{
			flag=uiDriver.findElement(Login).isDisplayed();
			Assert.assertTrue(flag, "Login is present");
			
		}
		catch (Exception e) 
		{
		 throw new Exception("Failed while verifying Login"+e.getLocalizedMessage());
			
		}
		return flag;
	}
	/**************************************************************************************************************************************/
	public void loginPopup() throws Exception
	{
		log.info(">>>>>Verifying User Login<<<<<");
		try 
		{
			uiDriver.findElement(Login).click();
			
			
			
		} catch (Exception e) 
		{
			throw new Exception("Failed to Click Loginbutton"+"\n"+e.getLocalizedMessage());
			
		}
	}
	
	/**************************************************************************************************************************************/
	public void username(String Username) throws Exception{
		log.info(">>>Passing the Username>>>>>");
		try 
		{
			uiDriver.findElement(User).sendKeys(Username);
		} catch (Exception e)
		{
			throw new Exception("Failed to Pass User Name"+"\n"+e.getLocalizedMessage());
			
		}
		}
	/**************************************************************************************************************************************/
	public void password(String Password) throws Exception{
		log.info(">>>>Passing the Password<<<<");
		try 
		{
			
			uiDriver.findElement(Pass).sendKeys(Password);
		} 
		catch (Exception e)
		{
			throw new Exception("Passes Password is incorrect"+"\n"+e.getLocalizedMessage());
			
			}
	}
	/**************************************************************************************************************************************/
	/**
	 * @return void
	 * @author Shailesh kumar
	 * @param loginbutton
	 **This method is help us to click on the Login button
	 *@throws Exception;
	 */
	public MyNaukriPage loginButton() throws Exception{
		log.info(">>>Verifying User Login>>>");
		try {
			uiDriver.findElement(Button).click();
			Thread.sleep(4000);
		} catch (Exception e) 
		{
			throw new Exception("User is failed to Login"+"\n"+e.getLocalizedMessage());
			
			}
		return new MyNaukriPage(uiDriver);
		}
	/**************************************************************************************************************************************/
	public void Register() throws Exception{
		log.info(">>>>clicking register>>>>");
		try {
			uiDriver.findElement(Regi).click();
		
		} catch (Exception e) {
			throw new Exception("Register is failed to click"+"\n"+e.getLocalizedMessage());
			// TODO: handle exception
		}
	}
	
	/**************************************************************************************************************************************/
	public LoginNaukriPage clickOnForgetPasswordLink() throws Exception
	{
		log.info("Click on Forget Password link");
		try 
		{
			uiDriver.findElement(forgetpasswordlnk).click();
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE FORGET PASSWORDLINK");
		}
		return new LoginNaukriPage(uiDriver);
	}
}