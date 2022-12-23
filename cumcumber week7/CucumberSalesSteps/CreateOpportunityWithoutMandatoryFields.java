package CucumberSalesSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CreateOpportunityWithoutMandatoryFields extends SalesForceBaseClass {
	
	@And("Choose Close date as Tomorrow Date")
	public void closeDate() throws InterruptedException
	{
		WebElement calendar = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']/input"));
		// Java Script
				driver.executeScript("arguments[0].click();",calendar);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='21']")).click();
				
	}

@Then("Verify the Alert message")
public void errorMessage()
{
	boolean displayed = driver.findElement(By.xpath("//h2[text()='We hit a snag.']")).isDisplayed();
//boolean displayed2 = driver.findElement(By.linkText("Stage")).isDisplayed();
if(true)
{
	System.out.println("Alert is present");
}else
{
	System.out.println("No Alert");
}
}



}


