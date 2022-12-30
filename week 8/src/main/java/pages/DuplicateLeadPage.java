package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class DuplicateLeadPage extends BaseClass {
	
	
	/*
	 * public DuplicateLeadPage(RemoteWebDriver driver) {
	 * 
	 * this.driver=driver; }
	 */
	 
	@And("Clear the CompanyName")
	public DuplicateLeadPage clearCompanyName()
	{
	
		getDriver().findElement(By.id("createLeadForm_companyName")).clear();
		
		return this;
	}
	@When("Enter new CompanyName as (.*)$")
	public DuplicateLeadPage enterNewCompanyNameAsAccenture(String NewcName) 
	
	{
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(NewcName);
		
		return this;
	}
	@When("Clear the FirstName Field")
public DuplicateLeadPage clearFirstName()
{
	getDriver().findElement(By.id("createLeadForm_firstName")).clear();
	return this;
}
	@When("And Enter new FirstName as (.*)$")
public DuplicateLeadPage enterNewfName(String NewfName)
{
	getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(NewfName);
	return this;
}
	@When("Click on Create Lead Button")
public ViewLeadPage clickButton()
{
	getDriver().findElement(By.name("submitButton")).click();
 //return new ViewLeadPage(driver); 
return new ViewLeadPage();
}
}
