package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLeadForm extends BaseClassLeadForm{
	@And("Click on Duplicate button")
	public void duplicate()
	{
		driver.findElement(By.linkText("Duplicate Lead")).click();	
	}
@And("Clear the CompanyName")
	public void Company()
	{
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	}
@And("Enter new CompanyName as (.*)$")
public void newCompany(String newName)
{
driver.findElement(By.id("createLeadForm_companyName")).sendKeys(newName);
}
@And("Clear the FirstName Field")
public void firstName()
{
	driver.findElement(By.id("createLeadForm_firstName")).clear();
}
@When("And Enter new FirstName as (.*)$")
public void EnterNewFirstName(String firstNew) {
{
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstNew);
}
}
@When("Click on Create Lead Button")
public void clickOnCreateLeadButton()
{
	driver.findElement(By.name("submitButton")).click();
}}
/*
 * @Then("Get the Title of Resulting Page") public void titleOfResulting() {
 * boolean displayed1 =
 * driver.findElement(By.xpath("//div[text()='View Lead']")).isDisplayed();
 * if(displayed1) { System.out.println("Homepage is displayed"); } else {
 * System.out.println("not displayed"); }} }
 */