package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class FindLeadsPage extends BaseClass{
	public static String name;

public FindLeadsPage(RemoteWebDriver driver) {
		
		this.driver=driver;
	}

public FindLeadsPage enterFirstName(String fName) throws InterruptedException
{
	
	WebElement firstName = driver.findElement(By.id("ext-gen248"));
	firstName.sendKeys(fName);
	name=firstName.getAttribute("value");
	System.out.println(name);
	return this;
}
	public FindLeadsPage clickLead() throws InterruptedException
	{
		Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	return this;
	}
	//return new FindNamePage(driver);


public ViewLeadPage clickFirstLead() throws InterruptedException
{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tbody//a")).click();
	return new ViewLeadPage(driver);
}


}



 