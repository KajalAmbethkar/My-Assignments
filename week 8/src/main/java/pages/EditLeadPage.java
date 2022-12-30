package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class EditLeadPage extends BaseClass {

	
	/*
	 * public EditLeadPage(RemoteWebDriver driver) {
	 * 
	 * this.driver=driver; }
	 */
	  
	 
	@Then("Clear Comapny")
	public EditLeadPage clearComapny() {

		getDriver().findElement(By.id("updateLeadForm_companyName")).clear();
		return this;
	}

	@Then("Edit Company Name as (.*)?$")
	public EditLeadPage editCompanyNameAsTestLeaf(String EditCName)

	{

		getDriver().findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}

	@And("Click Submit Button")
	public ViewLeadPage clickSubmitButton() {
		getDriver().findElement(By.xpath("//input[@name='submitButton']")).click();
		//return new ViewLeadPage(driver);
		return new ViewLeadPage();
	}
}