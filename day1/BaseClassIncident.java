package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;
import week6.day2.ReadExcel;

public class BaseClassIncident {
	public ChromeDriver driver;
	public static String incidentNumber;
	public int sheetIndex;
	public String fileName;
	public static Shadow all;
	@BeforeClass
	public void setData()
	{
		fileName="incident";
		sheetIndex=0;
		
	}
	@Test(dataProvider="fetchData")
   // @Parameters({"url","userName","password"})
	//@BeforeMethod
	public void PreCondition(String url,String cname,String pwd,String input) throws InterruptedException

	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		//Go to developer.servicenow.com
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
		 //Enter Incident in filter navigator and press enter
		WebElement filter = all.findElementByXPath("//input[@id='filter']");
		filter.sendKeys(input);
		Thread.sleep(2000);
		filter.sendKeys(Keys.ENTER);
		// Click on Create new option and fill the manadatory fields
		Thread.sleep(5000);

	}

	@AfterMethod
	public void PostCondition() {
		//driver.close();
	}
	@DataProvider(name="fetchData")
public String[][] getData() throws IOException {
		return ReadService.readData(fileName,sheetIndex);
}}

