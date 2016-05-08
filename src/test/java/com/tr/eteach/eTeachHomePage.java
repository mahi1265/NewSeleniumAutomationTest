package com.tr.eteach;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.tr.pages.SearchResultPage;

public class eTeachHomePage {
WebDriver driver;
boolean flag = false;
String txt = null;
WebElement element = null;
public eTeachHomePage(WebDriver driver) {
	this.driver = driver;
}

By imgeteachSIteLogo = By.xpath("//a[@class='logosm-hold']");
By txtJobKeyword = By.id("Keywords");
By btnJobSearch = By.id("sjobsearch");


public boolean isSiteLogoDisplayed() throws Exception{
	try {
		flag = driver.findElement(imgeteachSIteLogo).isDisplayed();
		if (flag) {
			System.out.println("Site logo is displayed");
		}else {
			System.out.println("Site logo is displayed");
		}
	} catch (Exception e) {
		throw new Exception("FAILED IN VERIFYING SITE LOGO::"+"isSiteLogoDisplayed"+e.getLocalizedMessage());
	}
	return flag;
		
}

public eTeachHomePage enterJobTitle(String jobtitle){
	try {
		element = driver.findElement(txtJobKeyword);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "Jobtitle field is not displayed");
		element.sendKeys(jobtitle);
	} catch (Exception e) {
		
				}
	
	return this;
}



public  SearchResultPage searchJobs(){
	try {
		element = driver.findElement(btnJobSearch);
		flag = element.isDisplayed();
		Assert.assertTrue(flag, "Find better button is not displayed");
		element.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	} catch (Exception e) {
		
				}
	
	return new SearchResultPage(driver);
}
}


