package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginPage extends BaseClass{
	
	
	/*
	 * public LoginPage(RemoteWebDriver driver) { this.driver = driver; }
	 */
	 
	 
	@And("Enter the username as (.*)$")
	public LoginPage enterUserName(String uName) {
		getDriver().findElement(By.id("username")).sendKeys("DemoSalesManager");
		return this;
	}
	@Given("Enter the password as (.*)$")
	public LoginPage enterThePasswordAsPwd(String pwd) {
		getDriver().findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	@When("Click on the login button")
	public HomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		//return new HomePage(driver);
		return new HomePage();
	}
}

