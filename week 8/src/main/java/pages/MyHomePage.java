package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;



public class MyHomePage extends BaseClass{
	
	
	/*
	 * public MyHomePage(RemoteWebDriver driver) {
	 * 
	 * this.driver=driver; }
	 */
	@Then("Click on Leads")
	public LeadPage clickOnLeads() throws InterruptedException {
	
	/*@And("Click on leads")
	public LeadPage clickLeads()*/  
		Thread.sleep(3000);
		getDriver().findElement(By.linkText("Leads")).click();
		//getDriver().findElement(By.linkText("Prospects")).click();
		//return new LeadPage(driver);
		return new LeadPage();
	}

}
