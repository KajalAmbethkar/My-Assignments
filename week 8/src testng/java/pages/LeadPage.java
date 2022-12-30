package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;



public class LeadPage extends BaseClass{

	public LeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage clickCreateLead() {
		// create lead
				driver.findElement(By.linkText("Create Lead")).click();
return new CreateLeadPage(driver);
	}
	
	
	  public FindLeadsPage clickFindLeads() {
		  
	  driver.findElement(By.linkText("Find Leads")).click();
	  return new FindLeadsPage(driver);
	  }
	  

}
