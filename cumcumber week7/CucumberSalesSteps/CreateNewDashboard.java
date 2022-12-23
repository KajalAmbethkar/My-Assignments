package CucumberSalesSteps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewDashboard extends SalesForceBaseClass{
	@And("click Dashboards from App Launcher")
	public void dashBoard() throws InterruptedException
	{
		Thread.sleep(3000);
	    //Type Content on the Search box
		WebElement search = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']/input"));
		search.click();
		search.sendKeys("Dashboard",Keys.ENTER);
		
		//Click Content Link
		driver.findElement(By.xpath("//mark[text()='Dashboard']")).click();
	}
@And("Click on the New Dashboard option")
public void newDash() throws InterruptedException
{
	WebElement newDash = driver.findElement(By.xpath("//div[text()='New Dashboard']"));
	// Java Script
	Thread.sleep(3000);
		driver.executeScript("arguments[0].click();",newDash);
}

@And("Enter Name as (.*)$")
public void enterNameAsSalesforce(String nam) throws InterruptedException 
{   Thread.sleep(5000);
driver.switchTo().frame(0);
	WebElement oppName = driver.findElement(By.xpath("//input[@id='dashboardNameInput']"));
	oppName.sendKeys(nam);
	name=oppName.getAttribute("value");
	System.out.println(name);
}
@When("Click on Create Button")
public void button() throws InterruptedException
{
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//button[text()='Create']")).click();
	WebElement create = driver.findElement(By.xpath("//button[text()='Create']"));
	// Java Script
			driver.executeScript("arguments[0].click();",create);
			Thread.sleep(4000);
}
@And("Click on Save")
public void newSave() throws InterruptedException
{
	
	WebElement save = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
	driver.switchTo().frame(save);
	WebElement newSave = driver.findElement(By.xpath("//div[@role='group']/button[text()='Save']"));
// Java Script
driver.executeScript("arguments[0].click();",newSave);
System.out.println("DashBoard saved");
}
@Then("Verify the Dashboard Name")
public void verifyTheDashboardName() throws InterruptedException {
	{ /*
		 * Thread.sleep(10000); WebElement dash = driver.findElement(By.
		 * xpath("//div[@class='slds-theme--success slds-notify--toast slds-notify slds-notify--toast forceToastMessage']//span[text()='Dashboard saved']"
		 * ));
		 * 
		 * //String da=dash.getText(); System.out.println(dash.getText());
		 */
	
	
	Thread.sleep(5000);
	//WebElement save1 = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
	//driver.switchTo().frame(save1);
	WebElement done = driver.findElement(By.xpath("//button[text()='Done']"));
	// Java Script
	driver.executeScript("arguments[0].click();",done);
WebElement verify = driver.findElement(By.xpath("//div[@class='slds-page-header__name']//span[text()='Sales Force Automation by Kajal']"));
String s=verify.getText();
System.out.println(s);
if(s.equals(name))
{
	System.out.println("Saved and verified");
}
else
{
	System.out.println("Noy verified");
}


}}

}

