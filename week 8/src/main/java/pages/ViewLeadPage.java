package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewLeadPage extends BaseClass {
	
	/*
	 * public ViewLeadPage(RemoteWebDriver driver) {
	 * 
	 * this.driver=driver; }
	 */
	 
	@Then("Verify Edit Name")
public ViewLeadPage verifyFirstName() {
	WebElement verify =getDriver().findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
	String na=verify.getText();
	System.out.println(na);
	return this;
	
}
@Then("Click Edit Lead Button")
public EditLeadPage clickEditLeadButton()
{
	getDriver().findElement(By.linkText("Edit")).click();
	 //return new EditLeadPage(driver); 
	return new EditLeadPage();
}
public ViewLeadPage verifyEditName()
{
	WebElement newName =getDriver().findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
	String n1=newName.getText();
	System.out.println(n1);
	if(n1.contains("Kajal"))
	{
	System.out.println("Name Verified");	
	}
	else
	{
		System.out.println("Not verified");
	}
	//return new ViewLeadPage(driver);
	return this;
}

@Then("Get the page title of the resulting page")
public ViewLeadPage getPageTitle()
{
System.out.println(getDriver().getTitle());
return this;
}

@When("Click on Duplicate button")
public DuplicateLeadPage clickOnDuplicateButton()

{
	getDriver().findElement(By.linkText("Duplicate Lead")).click();
	 //return new DuplicateLeadPage(driver); 
	return new DuplicateLeadPage();
}
@Then("Get the Title of Resulting Page")
public ViewLeadPage getPTitle()
{
	System.out.println(getDriver().getTitle());
	return this;
}
@When("Get the company number")
public ViewLeadPage GetTheCompanyNumber()
{
	WebElement number1 = getDriver().findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
	String text = number1.getText();
	String n= text.replaceAll("[^0-9]", "");
	//convert string to int
	number=Integer.valueOf(n);
	System.out.println(number);
	 //return new ViewLeadPage(driver); 
	return new ViewLeadPage();
	
}
@Then("Click the delete button")
public LeadPage Clickthedeletebutton()
{
	getDriver().findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Delete']")).click();
	System.out.println("Hence Deleted");
	return new LeadPage();
}
}



