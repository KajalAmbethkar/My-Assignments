package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;
import io.cucumber.java.en.And;

public class LoginPage extends BaseClass {

	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// @FindBy(how=How.ID, using="username")
	// WebElement eleUsername;

	// FindBys both condition should satisfy (And Condition)
	//@FindBys({ @FindBy(how = How.ID, using = "username"), @FindBy(how = How.XPATH, using = "//input[@name='USERNAME']")

			// When you use wrong path then it will fail
			// @FindBy(how=How.XPATH, using="//input[@name='USERNAME123']")
	//})

	//WebElement eleUsername;;
	
	
	//This is all so it is OR condition(any one should satisfy)
	
	
	  @FindAll ( {
	  
	  @FindBy(how = How.ID, using = "username123"),
	  
	  @FindBy(how = How.XPATH, using = "//input[@name='USERNAME']") })
	  WebElement eleUsername;;
	 
	public LoginPage enterUserName(String uName) {
		// driver.findElement(By.id("username"))
		// when u use this it throws null pointer exception
		eleUsername.sendKeys(uName);
		return this;
	}

	@FindBy(how = How.ID, using = "password")
	WebElement elePassword;

	public LoginPage enterPassword(String pwd) {
		// driver.findElement(By.id("password"))
		elePassword.sendKeys(pwd);
		return this;
	}

	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	WebElement eleLogin;

	public HomePage clickLogin() {
		// driver.findElement(By.className("decorativeSubmit"))
		eleLogin.click();
		return new HomePage(driver);
		// return new HomePage();
	}

}
