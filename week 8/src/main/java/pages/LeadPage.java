package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;



public class LeadPage extends BaseClass{

	/*
	 * public LeadPage(RemoteWebDriver driver) { this.driver = driver; }
	 */
	@And("Click on Create Lead")
	public CreateLeadPage clickCreateLead() throws InterruptedException {
		// create lead
		Thread.sleep(2000);
		getDriver().findElement(By.linkText("Create Lead")).click();
		//getDriver().findElement(By.linkText("Créer un prospect")).click();
				 //return new CreateLeadPage(driver); 
				return new CreateLeadPage();
	}
	@Then("Click on find Leads")
	public FindLeadsPage clickOnFindLeads() 
	{
	  getDriver().findElement(By.linkText("Find Leads")).click();
		 //return new FindLeadsPage(driver); 
	 return new FindLeadsPage();
	  
	  }
	  
	@Then("Click find Leads")
	public FindLeadsPage clickfindLeads()
	{
		 getDriver().findElement(By.linkText("Find Leads")).click();
		 return new FindLeadsPage();
		 
	}
}
