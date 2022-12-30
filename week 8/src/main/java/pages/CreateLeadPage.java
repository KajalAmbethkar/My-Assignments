package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClass{

	
	
	
	/*
	 * public CreateLeadPage(RemoteWebDriver driver) {
	 * 
	 * this.driver=driver; }
	 */
@And("Enter the Company Name Feild as (.*)$")	
public CreateLeadPage enterCompanyName(String cName)  {
	
	
	//Thread.sleep(2000);	
	getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	return this;
	}
@And("Enter the First Name as (.*)$")
	public CreateLeadPage enterFirstName(String fName) {
	getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys("Kajal");
		return this;
	}
@And("Enter the Last Name as (.*)$")
	public CreateLeadPage enterLastName(String lName) {
	getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys("ambethkar");
		return this;
	}
@And("Enter the local first name as (.*)$")
	public CreateLeadPage enterLocalName(String local)
	{
	getDriver().findElement(By.name("firstNameLocal")).sendKeys("Kaja");
		return this;
	}
@And("Enter the department as (.*)$")
	public CreateLeadPage enterDepartment(String dep)
	{
	getDriver().findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
		return this;
	}
@And("Enter the description as (.*)$")
	public CreateLeadPage enterDescription(String des)
	{
	getDriver().findElement(By.id("createLeadForm_description")).sendKeys("I am a software engineer");
		return this;
	}
@And("Enter your email as (.*)$")
	public CreateLeadPage enterEmail(String email)
	{
	getDriver().findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kajal@testleaf.com");
		return this;
		
	}
@And("Select State")
	public CreateLeadPage selectState()
	{
		WebElement stateProvince = getDriver().findElement(By.name("generalStateProvinceGeoId"));
		Select selectStateProvince = new Select(stateProvince);
		selectStateProvince.selectByVisibleText("New York");
		WebElement selectedStateProvince = selectStateProvince.getFirstSelectedOption();

		String selectedDropDownValue = selectedStateProvince.getText();
		System.out.println("State/Province Selected is: " + " " + selectedDropDownValue);
		return this;
	}
@When("Click the Create Button")
	public ViewLeadPage clickCreateLead() {
	getDriver().findElement(By.name("submitButton")).click();
		/* return new ViewLeadPage(driver); */
		return new ViewLeadPage();
	}

	

}
