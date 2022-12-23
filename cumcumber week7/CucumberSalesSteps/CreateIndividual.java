package CucumberSalesSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateIndividual extends SalesForceBaseClass{
	@And("click Individuals from App Launcher")
	public void clickIndi() throws InterruptedException
	{
		Thread.sleep(3000);
	    //Type Content on the Search box
		WebElement search = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']/input"));
		search.click();
		search.sendKeys("Individuals",Keys.ENTER);
		
		//Click Content Link
		driver.findElement(By.xpath("//mark[text()='Individuals']")).click();
	}
	@Then("Verify the Individual")
	public void verifyTheIndividual() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']")).click();
	}
	
	@And("Click on New Individual")
	public void newIndi() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement newI = driver.findElement(By.xpath("//span[text()='New Individual']"));
		//Java Script
		driver.executeScript("arguments[0].click();",newI);
	
	}
	
	
	@And("Enter the Last Name as (.*)$")
	public void enterTheLastNameAsKumar(String las) throws InterruptedException {
	//Thread.sleep(3000);
		WebElement lName = driver.findElement(By.xpath("//input[@class='lastName compoundBLRadius compoundBRRadius form-element__row input']"));
		//Thread.sleep(3000);
		lName.sendKeys(las);
	}

  @When("Click Save") public void save() throws InterruptedException {
  Thread.sleep(5000); 
	 driver.findElement(By. xpath("//div[@class='button-container-inner slds-float_right']//span[text()='Save']/parent::button" )).click();//Java Script 
	  //driver.executeScript("arguments[0].click();",sav);
  
  }
  
	/*
	 * @Then("Verify the Individual") public void verifyI() { WebElement ver =
	 * driver.findElement(By.
	 * xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"
	 * ));
	 * 
	 * System.out.println(ver.getText()); }
	 */ }
  
 