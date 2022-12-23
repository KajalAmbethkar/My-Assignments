package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadForm extends BaseClassLeadForm {

	/*
	 * @And("Enter the username for create as (.*)$") public void username( String
	 * uName) { driver.findElement(By.id("username")).sendKeys(uName); }
	 * 
	 * @And("Enter the password for create as (.*)$") public void password(String
	 * pwd) { driver.findElement(By.id("password")).sendKeys(pwd); }
	 * 
	 * @When("Click on the login button for create") public void clickl() {
	 * driver.findElement(By.className("decorativeSubmit")).click(); }
	 * 
	 * @Then ("Verify the homepage is displayed") public void HomePage() { boolean
	 * displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
	 * if(displayed) { System.out.println("Homepage is displayed"); } else {
	 * System.out.println("not displayed"); }}
	 */

	@Then("Click on CRM")
	public void clickOnCRM() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@And("Click on Leads")
	public void lead() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();

	}

	@And("Click on Create Lead")
	public void createlead() throws InterruptedException {
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
	}

	@And("Enter the Company Name Feild as (.*)$")
	public void cName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}

	@And("Enter the First Name as (.*)$")
	public void fName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@And("Enter the Last Name as (.*)$")
	public void lName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}

	@When("Enter the local first name as (.*)$")
	public void local(String local) {
		driver.findElement(By.name("firstNameLocal")).sendKeys(local);
	}

	@And("Enter the department as (.*)$")
	public void depart(String dep) {
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dep);
	}

	@And("Enter the description as (.*)$")
	public void des(String des) {
		driver.findElement(By.id("createLeadForm_description")).sendKeys(des);
	}

	@And("Enter your email as (.*)$")
	public void email(String email) {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
	}

	@And("Select State")
	public void state() {
		WebElement stateProvince = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select selectStateProvince = new Select(stateProvince);
		selectStateProvince.selectByVisibleText("New York");
		WebElement selectedStateProvince = selectStateProvince.getFirstSelectedOption();

		String selectedDropDownValue = selectedStateProvince.getText();
		System.out.println("State/Province Selected is: " + " " + selectedDropDownValue);

	}

	@When("Click the Create Button")
	public void click() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Get the page title of the resulting page")
	public void title() {
		String title = driver.getTitle();
		System.out.println("Resulting Page title is: " + " " + title);

	}

	@Then("Get the company number")
	public void number() {

		WebElement number1 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String text = number1.getText();
		number = text.replaceAll("[^0-9]", "");
		System.out.println(number);
	}
}
