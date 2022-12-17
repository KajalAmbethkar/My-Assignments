package week6.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Marathon.ReadKey;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassLeaf {
	
	public ChromeDriver driver;
	public String fileName;
	public int sheetIndex;
	@Parameters({"url","name","pwd"})
	@BeforeMethod(alwaysRun = true)
	public void PreCondition(String url,String name,String pwd)
	{
		// set up browser driver
				WebDriverManager.chromedriver().setup();

				// lanuch the browser
				 driver = new ChromeDriver();

				// load the url
				driver.get(url);
				
				//wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				// maximize the browser
				driver.manage().window().maximize();
				
				// enter the username
				WebElement eleusername = driver.findElement((By.id("username")));
				eleusername.sendKeys(name);

				// enter the password
				driver.findElement(By.id("password")).sendKeys(pwd);
				
				
				// to click and go inside
				driver.findElement(By.className("decorativeSubmit")).click();

				// to click crmfsa
				driver.findElement(By.linkText("CRM/SFA")).click();


	}
	@AfterMethod(alwaysRun = true)
public void PostCondition()
{
	driver.close();
}
	@DataProvider(name="fetchData")
	public String[][] getData() throws IOException {
		return ReadLeaf.readData(fileName,sheetIndex);
}}



