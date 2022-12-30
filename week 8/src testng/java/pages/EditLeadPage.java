package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class EditLeadPage extends BaseClass{
public EditLeadPage(RemoteWebDriver driver) {
		
		this.driver=driver;
	}
public EditLeadPage clearComapnyName() 
{
	
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	return this;
}
public EditLeadPage editCompanyName(String editCName) 
{

	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(editCName);
	return this;
}
	
	public ViewLeadPage clickSubmitButton()
	{
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		return new ViewLeadPage(driver);
	}
	
}

