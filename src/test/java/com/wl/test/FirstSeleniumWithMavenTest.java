package com.wl.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstSeleniumWithMavenTest {
	WebDriver driver;
    @BeforeTest
	public void setup(){
		driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
		}
	@Test
	public void homepageverification(){
		String exptitle="Google";
		String actualtile =driver.getTitle();
		System.out.println(actualtile);
		Assert.assertEquals(actualtile, exptitle, "Title is not matching");
		WebElement search=driver.findElement(By.id("lst-ib"));
		search.sendKeys("Bangalore");
	}
	@AfterTest
	public void teardown(){	
		driver.quit();
	}
		
	}
	

