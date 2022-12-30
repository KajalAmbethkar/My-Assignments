package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;



public class MyHomePage extends BaseClass{
	
	public MyHomePage(RemoteWebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.LINK_TEXT,using="Leads")
	WebElement eleLeads;
	
	public LeadPage clickLeads() {
		//driver.findElement(By.linkText("Leads"))
		eleLeads.click();
		return new LeadPage(driver);
	}

}
