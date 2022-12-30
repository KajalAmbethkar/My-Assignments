package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FindLeadsPage extends BaseClass{
	public static String name;

	
	
	/*
	 * public FindLeadsPage(RemoteWebDriver driver) {
	 * 
	 * this.driver=driver; }
	 */
	 
	 
	@And("Enter First Name as (.*)$")
public FindLeadsPage enterFirstName(String fName) throws InterruptedException
{
	
	WebElement firstName = getDriver().findElement(By.id("ext-gen248"));
	firstName.sendKeys(fName);
	name=firstName.getAttribute("value");
	System.out.println(name);
	return this;
}
	@Then("Click Lead")
	public FindLeadsPage clickLead() throws InterruptedException
	{
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("//button[text()='Find Leads']")).click();
	return this;
	}
	//return new FindNamePage(driver);
	@Then("Click first lead")
	public ViewLeadPage clickFirstLead()  throws InterruptedException

{
	Thread.sleep(2000);
	getDriver().findElement(By.xpath("//table[@class='x-grid3-row-table']//tbody//a")).click();
	// return new ViewLeadPage(driver); 
	return new ViewLeadPage();
}
	@And("Click on LeadId")
public FindLeadsPage enterLeadId() throws InterruptedException
{
	WebElement find= getDriver().findElement(By.xpath("//input[@name='id']"));
	//find.sendKeys(String.valueOf(int1));
	find.sendKeys(String.valueOf(number));
	Thread.sleep(3000);
	find.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	return this;
}
	@And("Click LeadId")
	public FindLeadsPage clickLeadId() throws InterruptedException
	{
		WebElement find= getDriver().findElement(By.xpath("//input[@name='id']"));
				find.sendKeys(String.valueOf(number));
				find.sendKeys(Keys.ENTER);
				Thread.sleep(2000);
				return this;
		
	}
}



 