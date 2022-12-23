package CucumberSalesSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CreateAccount extends SalesForceBaseClass {
	
	@And("Click on Accounts tab")
	public void account() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']/input"));
		search.click();
		search.sendKeys("Accounts",Keys.ENTER);
		
		//Click Content Link
		driver.findElement(By.xpath("//mark[text()='Accounts']")).click();
	}
	@And("Click on New button for accounts")
	public void newAccount() throws InterruptedException
	{
		Thread.sleep(8000);
		WebElement newAcc = driver.findElement(By.xpath("//div[text()='New']"));
		// Java Script
					driver.executeScript("arguments[0].click();",newAcc);
	}
	@Then("Enter Account Name as (.*)$")
	public void enterAsAccountName(String newN) throws InterruptedException
	{
		Thread.sleep(8000);
	driver.findElement(By.xpath("//div[@class='slds-grid slds-size_1-of-1 label-stacked']//input[@class='slds-input']")).sendKeys(newN);
	}

	@And("Select Ownership as Public")
	public void ownerShip() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement owner = driver.findElement(By.xpath("//lightning-combobox[@class='slds-form-element_stacked slds-form-element']/label[text()='Ownership']"));
		// Java Script
		driver.executeScript("arguments[0].click();",owner);
	
	Thread.sleep(5000);
		WebElement ownership = driver.findElement(By.xpath("//span[text()='Public']"));
		// Java Script
		driver.executeScript("arguments[0].click();",ownership);

	}

@And("Save the Account")
public void accountSave() throws InterruptedException
{
	Thread.sleep(5000);
	WebElement acc = driver.findElement(By.xpath("//button[text()='Save']"));
	// Java Script
			driver.executeScript("arguments[0].click();",acc);

}
@Then("Verify the account")
public void accountVerify() throws InterruptedException
{ 
	
	Thread.sleep(5000);
	WebElement accVerify = driver.findElement(By.xpath("//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']"));
System.out.println(accVerify.getText());


}
}


