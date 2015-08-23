package com.nk.pages;

import java.util.ArrayList;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchResultJobDescriptionPage {
	
	WebDriver uiDriver;
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	/*UI Elements Initialization*/
	
	By hiringOrgani = By.xpath("//div[@class='pHead']");
	By expRequirements = By.xpath("//div[@class='p']/span");
	By location = By.xpath("//div[@class='p']/div[@class='loc']");
	By keySkills = By.xpath("//div[@class='ksTags']");
	By jobDesc = By.xpath("//ul[@class='listing mt10']");
	By otherDetails = By.xpath("//div[@class='sumFoot']");
	By loginToApplyTop = By.xpath("//div[@class='sumAct']/button[@class='loginBtn']");
	By loginToApplyBottom = By.xpath("//div[@class='logReg_Apply sumAct']/button[@class='loginBtn']");
	By registerToApplyTop = By.xpath("//button[@id='trigAAR']");
	By registerToApplyBottom = By.xpath("//button[@id='trigAAR1']");
	By applyWORegsTop = By.xpath("//a[@id='trigAWR']");
	By applyWORegsBottom = By.xpath("//a[@id='trigAWR1']");
	By naukriLogo = By.xpath("//a[@class='nLogo fl']");
	By header = By.xpath("//ul[@class='midSec menu']");		
	By registerNow = By.xpath("//form[@id='formpZero']");
	By jobDescription = By.xpath("//div[@class='JD']");
	By footerLinkSection = By.xpath("//div[@class='footer anchorList']/div[@class='wrap']");
	By partnerSiteSection = By.xpath("//div[@class='footer carousel']/div[@class='wrap']");
	By iconToSaveJob = By.xpath("//span[@id='favId']");
	By salaryRange = By.xpath("//span[@class='sal ']");
	By recruitmentDetails = By.xpath("//div[@class='sumFoot']/span[contains(.,'Posted')]");
	By locationtextbox=By.xpath("//div/div[2]/input[@class='sugInp w135']");
	By locationname=By.xpath("//div[@class='count']/h1/span[3]");
	
	
	public SearchResultJobDescriptionPage(WebDriver driver){
		this.uiDriver = driver;
	}
	
	/*Variable Initialization*/
	boolean flag = false;
	String actual_Result=null;
	String expected_Result=null;
	String actual_Result1=null;
		
	
	/**This method will help us to verify Hiring Organization
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyHiringOrgani(){
		flag = uiDriver.findElement(hiringOrgani).isDisplayed();
		Assert.assertTrue(flag, "Hiring Organization is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Experience Requirements
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyExpRequirements(){
		flag = uiDriver.findElement(expRequirements).isDisplayed();
		Assert.assertTrue(flag, "Experience Requirements is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Location
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLocation(){
		flag = uiDriver.findElement(location).isDisplayed();
		Assert.assertTrue(flag, "Location is not displayed");
		return flag;
	}
	
	/**This method will help us to verify KeySkills
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyKeySkills(){
		flag = uiDriver.findElement(keySkills).isDisplayed();
		Assert.assertTrue(flag, "KeySkills is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Job Description
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyJobDesc(){
		flag = uiDriver.findElement(jobDesc).isDisplayed();
		Assert.assertTrue(flag, "Job Description is not displayed");
		return flag;
	}
	
	/**This method will help us to verify OtherDetails
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyOtherDetails(){
		flag = uiDriver.findElement(otherDetails).isDisplayed();
		Assert.assertTrue(flag, "OtherDetails is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Login To Apply at Top
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLoginToApplyTop(){
		flag = uiDriver.findElement(loginToApplyTop).isDisplayed();
		Assert.assertTrue(flag, "Login To Apply at Top is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Login To Apply at Bottom
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLoginToApplyBottom(){
		flag = uiDriver.findElement(loginToApplyBottom).isDisplayed();
		Assert.assertTrue(flag, "Login To Apply at Bottom is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Register To Apply at Top
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyRegisterToApplyTop(){
		flag = uiDriver.findElement(registerToApplyTop).isDisplayed();
		Assert.assertTrue(flag, "Register To Apply at Top is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Register To Apply at Bottom
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyRegisterToApplyBottom(){
		flag = uiDriver.findElement(registerToApplyBottom).isDisplayed();
		Assert.assertTrue(flag, "Register To Apply at Bottom is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Apply Without Registeration at Top
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyApplyWORegsTop(){
		flag = uiDriver.findElement(applyWORegsTop).isDisplayed();
		Assert.assertTrue(flag, "Apply Without Registeration at Top is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Apply Without Registeration at Bottom
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyApplyWORegsBottom(){
		flag = uiDriver.findElement(applyWORegsBottom).isDisplayed();
		Assert.assertTrue(flag, "Apply Without Registeration at Bottom is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Naukri Logo
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyNaukriLogo(){
		flag = uiDriver.findElement(naukriLogo).isDisplayed();
		Assert.assertTrue(flag, "Naukri Logo is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Header
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyHeader(){
		flag = uiDriver.findElement(header).isDisplayed();
		Assert.assertTrue(flag, "Header is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Register Now form
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyRegisterNow(){
		flag = uiDriver.findElement(registerNow).isDisplayed();
		Assert.assertTrue(flag, "Register Now form is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Job Description
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyJobDescription(){
		flag = uiDriver.findElement(jobDescription).isDisplayed();
		Assert.assertTrue(flag, "Job Description is not displayed");
		return flag;
	}
	
	/**This method will help us to verify FooterLink Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyFooterLinkSection(){
		flag = uiDriver.findElement(footerLinkSection).isDisplayed();
		Assert.assertTrue(flag, "FooterLink Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify PartnerSite Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyPartnerSiteSection(){
		flag = uiDriver.findElement(partnerSiteSection).isDisplayed();
		Assert.assertTrue(flag, "PartnerSite Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Icon To Save Job
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyIconToSaveJob(){
		flag = uiDriver.findElement(iconToSaveJob).isDisplayed();
		Assert.assertTrue(flag, "Icon To Save Job is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Salary Range
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySalaryRange(){
		flag = uiDriver.findElement(salaryRange).isDisplayed();
		Assert.assertTrue(flag, "Salary Range is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Recruitment Details
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyRecruitmentDetails(){
		flag = uiDriver.findElement(recruitmentDetails).isDisplayed();
		Assert.assertTrue(flag, "Recruitment Details is not displayed");
		return flag;
	}
	
	/**
	 * @author manjunathr
	 * @throws Exception
	 */
	public SearchResultJobDescriptionPage verifyLocationName() throws Exception
	{
		try 
		{
			ArrayList<String> locationsmanual=new ArrayList<String>();
			locationsmanual.add("Dehli");
			locationsmanual.add("Mumbai");
			locationsmanual.add("Chennai");
			locationsmanual.add("Gurgaon");
			locationsmanual.add("Noida");
			locationsmanual.add("Kolkata");
			locationsmanual.add("Hyderabad");
			locationsmanual.add("Pune");
			locationsmanual.add("Bangalore");
			locationsmanual.add("Ahmedabad");
			//String parent_window= uiDriver.getWindowHandle();
			
			for (int i = 0; i < locationsmanual.size(); i++)
			{
				actual_Result=uiDriver.findElement(locationtextbox).getText();	
				
				
				Assert.assertEquals(actual_Result, locationsmanual.get(i).toString(), "Both Locations are  not matching");
				
			}
			
		} 
		catch (Exception e) 
		{
			throw new Exception(" FAILED TO GET THE LOCATIONS NAME IN" +" verifylocationname" +e.getLocalizedMessage());
		}
		return this;
	}
		
}
	
	
	
	
	
	


