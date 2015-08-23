package com.nk.pages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchHomePage {
	WebDriver uiDriver;
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	/* UI Elements Initialization*/
	By skillsAutoBox = By.xpath("//div[@id='skill']//input[@class='sugInp']");
	By searchButton = By.xpath("//button[@id='qsbFormBtn']");
	
	public SearchHomePage(WebDriver driver){
		this.uiDriver = driver;
	}
	
	/*Variable Initialization */
	boolean flag = false;
	
	
	/**This method will help us to verify Skills Auto Suggest Box
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySkillsAutoBox(){
		flag = uiDriver.findElement(skillsAutoBox).isDisplayed();
		Assert.assertTrue(flag, "Skills AutoBox is not displayed");
		return flag;
				
	}	
	
	/**This method will help us to verify Search Button
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySearchButton(){
		flag = uiDriver.findElement(searchButton).isDisplayed();
		Assert.assertTrue(flag, "Search Button is not displayed");
		return flag;
				
	}	
	
	
	
	
	/**This method will help us to Enter Skills in Skills Auto Suggest Box
	 * @author Senthil
	 * @param skill
	 * @return void
	 * @throws Exception 
	 */
	public void enterSkillsAutoBox(String skill) throws Exception{
		Log.info("Before entering Skills in Skills Auto Suggest Box");
		try{
			verifySkillsAutoBox();
			uiDriver.findElement(skillsAutoBox).sendKeys(skill);
			uiDriver.findElement(skillsAutoBox).sendKeys(Keys.ARROW_DOWN);
			uiDriver.findElement(skillsAutoBox).sendKeys(Keys.ENTER);
			Log.info("After entering Skills in Skills Auto Suggest Box");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE ENTERING SKILLS IN SKILLS AUTO SUGGEST BOX:::"+"\n enterSkillsAutoBox(skill)"+e.getLocalizedMessage());
		}
				
	}
	
	/**This method will help us to Click on Search button
	 * @author Senthil
	 * @return void
	 * @throws Exception 
	 */
	public void clickOnSearchButton() throws Exception{
		Log.info("Before Clicking on Search button");
		try{
			verifySearchButton();
			uiDriver.findElement(searchButton).click();
			Log.info("After Clicking on Search button");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON SEARCH BUTTON:::"+"\n clickOnSearchButton()"+e.getLocalizedMessage());
		}
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
