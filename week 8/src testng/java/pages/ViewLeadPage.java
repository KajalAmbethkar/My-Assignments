package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {
	


public ViewLeadPage(RemoteWebDriver driver) {
		
		this.driver=driver;
	}
	
public void verifyFirstName() {
	WebElement verify = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
	String na=verify.getText();
	System.out.println(na);
	
}
public EditLeadPage clickEditLeadButton()
{
	driver.findElement(By.linkText("Edit")).click();
	return new EditLeadPage(driver);
}
public ViewLeadPage verifyEditName()
{
	WebElement newName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
	String n1=newName.getText();
	System.out.println(n1);
	if(n1.contains("Kajal"))
	{
	System.out.println("Name Verified");	
	}
	else
	{
		System.out.println("Not verified");
	}
	//return new ViewLeadPage(driver);
	return this;
}
public ViewLeadPage getPageTitle()
{
System.out.println(driver.getTitle());
return this;
}

public DuplicateLeadPage clickDuplicateButton()
{
	driver.findElement(By.linkText("Duplicate Lead")).click();
	return new DuplicateLeadPage(driver);
}
public ViewLeadPage getPTitle()
{
	System.out.println(driver.getTitle());
	return this;
}
}

