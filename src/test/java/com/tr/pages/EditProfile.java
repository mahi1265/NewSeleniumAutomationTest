package com.tr.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditProfile {

	WebDriver driver;
	boolean flag = false;
	String txt = null;
	WebElement element = null;
	public EditProfile(WebDriver driver) {
		this.driver = driver;
	}
	
By txtExperience=By.xpath("//*[contains(text(),'Experience')]");
By 	txtCurrentLocation=By.xpath("//*[contains(text(),'Current Location')]");
// By txtCurrentLocation=By.xpath("div[@Class='h_big']//div[Contains(.,'Current Location')"]);
By txtPreferredLocation=By.xpath("//*[contains(text(),'Preferred Location')]");
By txtNationality=By.xpath("//*[contains(text(),'Nationality')]");
By txtIndustry=By.xpath("//*[contains(text(),'Industry')]");
By txtJobType=By.xpath("//*[contains(text(),'Desired Job Type')]") ;
By txtFunction=By.xpath("//*[contains(text(),'Function')]");
By txtNoticePeriod=By.xpath("//*[contains(text(),'Notice Period')]");
By txtRoles=By.xpath("//*[contains(text(),'Roles')]");
By txtWorkHistory=By.xpath("//*[contains(text(),'Work History:')]");
By txtEducation=By.xpath("//*[contains(text(),'Education')]");

	
	public boolean isExperienceSectionDisplayed() throws Exception {
    try {
    	flag=driver.findElement(txtExperience).isDisplayed();
    	if (flag) {
			System.out.println("Experiecnce section is appearing");
		} else {
			System.out.println("Experiecnce section  is not appearing");
		}		
	} catch (Exception e) {
		throw new Exception("FAILED IN VERIFYING EXPERIENCE SECTION::"+"isExperienceSectionDisplayed"+e.getLocalizedMessage());

	}
		return flag;
		
	}
		
	public boolean isCurrentLocationSectionDisplayed() throws Exception {
	    try {
	    	flag=driver.findElement(txtCurrentLocation).isDisplayed();
	    	if (flag) {
				System.out.println("Current Location section is appearing");
			} else {
				System.out.println("Current Location  is not appearing");
			}		
		} catch (Exception e) {
			throw new Exception("FAILED IN VERIFYING CURRENT LOCATION::"+"isCurrentLocationSectionDisplayed"+e.getLocalizedMessage());

		}
			return flag;
			
		}
	
	public boolean isPreferredLocationSectionDisplayed() throws Exception {
	    try {
	    	flag=driver.findElement(txtPreferredLocation).isDisplayed();
	    	if (flag) {
				System.out.println("Preferred Location section is appearing");
			} else {
				System.out.println("Preferred Location SECTION  is not appearing");
			}		
		} catch (Exception e) {
			throw new Exception("FAILED IN VERIFYING PREFERRED LOCATION::"+"isPreferredLocationSectionDisplayed"+e.getLocalizedMessage());

		}
			return flag;
			
		}
		
	
	
	public boolean isNationalitySectionDisplayed() throws Exception {
	    try {
	    	flag=driver.findElement(txtNationality).isDisplayed();
	    	if (flag) {
				System.out.println("Nationality  section is appearing");
			} else {
				System.out.println("Nationality section  is not appearing");
			}		
		} catch (Exception e) {
			throw new Exception("FAILED IN VERIFYING NATIONALITY::"+"isNationalitySectionDisplayed"+e.getLocalizedMessage());

		}
			return flag;
			
		}
		
	
	public boolean isIndustrySectionDisplayed() throws Exception {
	    try {
	    	flag=driver.findElement(txtIndustry).isDisplayed();
	    	if (flag) {
				System.out.println("Industry  section is appearing");
			} else {
				System.out.println("Industry section  is not appearing");
			}		
		} catch (Exception e) {
			throw new Exception("FAILED IN VERIFYING INDUSTRY::"+"isIndustrySectionDisplayed"+e.getLocalizedMessage());

		}
			return flag;
			
		}
	
	public boolean isJobTypeSectionDisplayed() throws Exception {
	    try {
	    	flag=driver.findElement(txtJobType).isDisplayed();
	    	if (flag) {
				System.out.println("Desired Job Type  section is appearing");
			} else {
				System.out.println("Desired Job Type section  is not appearing");
			}		
		} catch (Exception e) {
			throw new Exception("FAILED IN VERIFYING DESIRED JOB TYPE::"+"isJobTypeSectionDisplayed"+e.getLocalizedMessage());

		}
			return flag;
			
		}
	
	public boolean isFunctionSectionDisplayed() throws Exception {
	    try {
	    	flag=driver.findElement(txtFunction).isDisplayed();
	    	if (flag) {
				System.out.println("Function  section is appearing");
			} else {
				System.out.println("Function section  is not appearing");
			}		
		} catch (Exception e) {
			throw new Exception("FAILED IN VERIFYING FUNCTION::"+"isFunctionSectionDisplayed"+e.getLocalizedMessage());

		}
			return flag;
			
		}
	
	public boolean isNoticePeriodSectionDisplayed() throws Exception {
	    try {
	    	flag=driver.findElement(txtNoticePeriod).isDisplayed();
	    	if (flag) {
				System.out.println("Notice Period  section is appearing");
			} else {
				System.out.println("Notice Period  is not appearing");
			}		
		} catch (Exception e) {
			throw new Exception("FAILED IN VERIFYING NOTICE PERIOD::"+"isNoticePeriodSectionDisplayed"+e.getLocalizedMessage());

		}
			return flag;
			
		}
	
	public boolean isRolesSectionDisplayed() throws Exception {
	    try {
	    	flag=driver.findElement(txtRoles).isDisplayed();
	    	if (flag) {
				System.out.println("Roles section is appearing");
			} else {
				System.out.println("Roles is not appearing");
			}		
		} catch (Exception e) {
			throw new Exception("FAILED IN VERIFYING ROLES::"+"isRolesSectionDisplayed"+e.getLocalizedMessage());

		}
			return flag;
			
		}
	
	public boolean isWorkHistorySectionDisplayed() throws Exception {
	    try {
	    	flag=driver.findElement(txtWorkHistory).isDisplayed();
	    	if (flag) {
				System.out.println("Work HIstory section is appearing");
			} else {
				System.out.println("Work HIstory section is not appearing");
			}		
		} catch (Exception e) {
			throw new Exception("FAILED IN VERIFYING WORK HISTORY::"+"isWorkHistorySectionDisplayed"+e.getLocalizedMessage());

		}
			return flag;
			
		}
	
	public boolean isEducationSectionDisplayed() throws Exception {
	    try {
	    	flag=driver.findElement(txtEducation).isDisplayed();
	    	if (flag) {
				System.out.println("Education section is appearing");
			} else {
				System.out.println("Education section is not appearing");
			}		
		} catch (Exception e) {
			throw new Exception("FAILED IN VERIFYING EDUCATION::"+"isEducationSectionDisplayed"+e.getLocalizedMessage());

		}
			return flag;
			
		}
	
}
