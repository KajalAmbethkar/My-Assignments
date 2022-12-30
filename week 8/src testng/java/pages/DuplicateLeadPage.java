package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class DuplicateLeadPage extends BaseClass {
public DuplicateLeadPage(RemoteWebDriver driver) {
		
		this.driver=driver;
	}
	
	public DuplicateLeadPage clearComName()
	
	{
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		return this;
	}
	public DuplicateLeadPage  enterNewcName(String NewcName)
	{
driver.findElement(By.id("createLeadForm_companyName")).sendKeys(NewcName);
		
		return this;
	}
public DuplicateLeadPage clearFirstName()
{
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	return this;
}
public DuplicateLeadPage enterNewfName(String NewfName)
{
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(NewfName);
	return this;
}
public ViewLeadPage clickButton()
{
driver.findElement(By.name("submitButton")).click();
return new ViewLeadPage(driver);
}
}
