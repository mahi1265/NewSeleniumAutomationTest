package com.wl.test;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tr.eteach.eTeachHomePage;
import com.tr.pages.SearchResultPage;


public class eTeachHomePageTest {

	WebDriver driver;
	eTeachHomePage homePage=null;
	@BeforeTest
	
	public void setUp(){
		
		driver= new FirefoxDriver();
		driver.get("http://www.eteachinternational.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
		public void verifyeTeachHomePage() throws Exception{
		homePage =new eTeachHomePage(driver);
		boolean flag=homePage.isSiteLogoDisplayed();
		Assert.assertTrue("Site logo is not displayed",flag);
		homePage.enterJobTitle("English Teacher");
		SearchResultPage SearchResultPage = homePage.searchJobs();
		
		
	}
	@AfterTest
	public void teardown(){	
		driver.quit();
	}
	
}
