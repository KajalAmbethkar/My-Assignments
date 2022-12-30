package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class HomePage extends BaseClass {

	public HomePage (RemoteWebDriver driver)
	{
		this.driver = driver;
	}
	
	public MyHomePage clickCRMSFA() throws InterruptedException{
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}
}
