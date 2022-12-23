package Marathon;

import java.io.IOException;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import week6.day2.ReadExcel;

public class BaseClassContent {
	//public ChromeDriver Driver;
	public RemoteWebDriver driver;
	public int sheetIndex;
	public String fileName;
	@Parameters({"url","username","password","browser"})
	@BeforeMethod
	public void PreCondition(String url,String uName,String pwd,String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
         WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
	         driver=new EdgeDriver();
		}

        
		ChromeOptions option = new ChromeOptions();
        
		option.addArguments("--disable-notifications");
        
		//driver = new ChromeDriver(option);

		// load the url
		driver.get(url);
		// maximize the browser
		driver.manage().window().maximize();
		
		// enter the username
		WebElement eleusername = driver.findElement((By.id("username")));
		eleusername.sendKeys(uName);

		// enter the password
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		//login button
		driver.findElement(By.id("Login")).click();
		// Implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void PostCondition()
	{
		driver.close();
	}
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		return ReadKey.readData(fileName,sheetIndex);
		//return ReadKey.readData(sheetIndex);
				
	}}



