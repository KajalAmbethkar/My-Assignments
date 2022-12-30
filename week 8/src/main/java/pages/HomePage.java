package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class HomePage extends BaseClass {

	
	/* public HomePage (RemoteWebDriver driver) { this.driver = driver; } */
	 
	@Then("Click on CRM")
	public MyHomePage clickCRMSFA() throws InterruptedException{
		//Thread.sleep(2000);
		
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		//return new MyHomePage(driver);
		return new MyHomePage();
	}
	@Then("Verify the homepage is displayed.")
	public HomePage verifyTheHomepageIsDisplayed()
	{
		boolean displayed = getDriver().findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed) {
			System.out.println("Homepage is displayed");
		} else {
			System.out.println("not displayed");
		}
		return this;
	}


}
