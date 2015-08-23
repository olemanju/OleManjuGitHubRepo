package com.nk.common;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NKCommon 

{
	
WebDriver uiDriver;
	
	public NKCommon(WebDriver driver)
	{
		this.uiDriver = driver;
	}	
	
    public void closepopUp(){
	
	    String mainWindow = uiDriver.getWindowHandle();
	    Set<String> allWindowHandles = uiDriver.getWindowHandles();
	    for (String currentWindowHandle : allWindowHandles) {
		if (!currentWindowHandle.equals(mainWindow)) {
			uiDriver.switchTo().window(currentWindowHandle);
			uiDriver.close();
		    }
	     }
	     uiDriver.switchTo().window(mainWindow);
       }

}
