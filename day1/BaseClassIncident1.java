package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class BaseClassIncident1 extends BaseClassIncident {
	
	@BeforeClass
	public void setData()
	{
		fileName="incident";
		sheetIndex=0;
		
	}
@Test(dataProvider="fetchData")
	public void runBaseClassIncident1(String url,String cname,String pwd,String input) throws InterruptedException
	{
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.manage().window().maximize();

	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(cname);
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();

	Thread.sleep(15000);
	all= new Shadow(driver);
	WebElement all1 = all.findElementByXPath("//div[text()='All']");
	all1.click();
	Thread.sleep(2000);
	// Enter Incident in filter navigator and press enter
	WebElement filter = all.findElementByXPath("//input[@id='filter']");
	filter.sendKeys(input);
	Thread.sleep(2000);
	filter.sendKeys(Keys.ENTER);
	// Click on Create new option and fill the manadatory fields
	Thread.sleep(5000);
	}
}
