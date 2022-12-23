package CucumberSalesSteps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewOpportunity extends SalesForceBaseClass{
	

	
		
	/*
	 * @And("Enter UserName as (.*)$") public void user(String uName) { WebElement
	 * eleusername = driver.findElement((By.id("username")));
	 * eleusername.sendKeys(uName); }
	 * 
	 * @And("Enter Password as (.*)$") public void pass(String pwd) {
	 * driver.findElement(By.id("password")).sendKeys(pwd); }
	 * 
	 * @When("Click Login") public void login() {
	 * driver.findElement(By.id("Login")).click(); // Implicit wait
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 * 
	 * }
	 * 
	 * @Then("Verify Home Page") public void verify() { boolean displayed =
	 * driver.findElement(By.xpath("//span[text()='Home']/parent::h1")).isDisplayed(
	 * ); if(displayed) { System.out.println("Homepage is displayed"); } else {
	 * System.out.println("not displayed"); }}
	 */

	//span[text()='Home']/parent::h1
		@And("Click on toggle menu button from the left corner")
		public void toggle()
		{
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		}
		
		
	@And("Click view All")
	public void viewAll()
	{
	driver.findElement(By.xpath("//button[text()='View All']")).click();
	}
	@And("Click Sales from App Launcher")
	public void sales()
	{
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
	}
	@Then("Click Opportunity")
	public void opp()
	{
		WebElement oppor = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", oppor);
	}
	@Then("Click on New button")
	public void newButton()
	{
		WebElement tab = driver.findElement(By.xpath("//div[text()='New']"));

		//Java Script
				driver.executeScript("arguments[0].click();",tab);
	}

	@And("Enter Opportunity name as (.*)$")
	public void name(String n)
	{
		WebElement na = driver.findElement(By.xpath("//input[@name='Name']"));
		na.sendKeys(n);
		name=na.getAttribute("value");
		//name=na.sendKeys(n);
		//String name=na.getText();
		System.out.println(name);
		
		
	}
	@And("Choose close date as Today")
	public void calender() throws InterruptedException
	{
		WebElement calendar = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']/input"));
		// Java Script
				driver.executeScript("arguments[0].click();",calendar);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//span[text()='20']")).click();
	}
	@Then("Select Stage as Need Analysis")
	public void selectStageAsNeedAnalysis() {
	{
		WebElement stage = driver.findElement(By.xpath("//span[text()='--None--']"));
		// Java Script
		driver.executeScript("arguments[0].click();",stage);
	//Thread.sleep(10000);
	WebElement need = driver.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Needs Analysis']"));
	// Java Script
	driver.executeScript("arguments[0].click();",need);
	}}
	@When("Click on save")
	public void save() throws InterruptedException
	{
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	@Then("VerifyOppurtunity Name")
	public void verifyName() throws InterruptedException
	{
		Thread.sleep(5000);
		WebElement msg = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']/a"));
	String s=msg.getText();
	String s1=s.replaceAll("\"", "");
	System.out.println(s1);



	if(name.equals(s1))
	{
		System.out.println("Opportunity is verified");
	}
	else
	{
		System.out.println("Not verified");
		}
	}}



