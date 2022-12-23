package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLeadForm extends BaseClassLeadForm {
	/*
	 * //public ChromeDriver driver;
	 * 
	 * @Given("Launch the Chrome Browser") public void launchBrowser() {
	 * WebDriverManager.chromedriver().setup(); driver=new ChromeDriver(); }
	 * 
	 * @And("Load the URL and Maximize") public void loadURL() {
	 * driver.get("http://leaftaps.com/opentaps/control/main");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 * 
	 * }
	 */
	@And("Enter the username as (.*)$")
	public void enterUserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}

	@And("Enter the password as (.*)$")
	public void enterpassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("Click on the login button")
	public void clickOnTheLoginButton() {

		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verify the homepage is displayed.")
	public void verifyHomePage() {
		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
		if (displayed) {
			System.out.println("Homepage is displayed");
		} else {
			System.out.println("not displayed");
		}

	}
	
}
