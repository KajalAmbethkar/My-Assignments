package CucumberSalesSteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSales extends SalesForceBaseClass {
	
	@And("Enter UserName as (.*)$")	
	public void user(String uName)
	{
		WebElement eleusername = driver.findElement((By.id("username")));
		eleusername.sendKeys(uName);
	}
	@And("Enter Password as (.*)$")
	public void pass(String pwd)
	{
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("Click Login")
	public void login()
	{
		driver.findElement(By.id("Login")).click();
		// Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	@Then("Verify Home Page")
	public void verify()
	{
		boolean displayed = driver.findElement(By.xpath("//span[text()='Home']/parent::h1")).isDisplayed();
		if(displayed) { System.out.println("Homepage is displayed"); } else {
			  System.out.println("not displayed");
	}}
@But("Verify the error message")
public void error()
{
	String text = driver.findElement(By.xpath("//div[@id='error']")).getText();
	System.out.println(text);
}


}


