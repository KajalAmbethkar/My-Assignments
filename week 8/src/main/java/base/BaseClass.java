package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class BaseClass extends AbstractTestNGCucumberTests {

	private static final ThreadLocal<RemoteWebDriver> tlDriver = new ThreadLocal<RemoteWebDriver>();
//	public static RemoteWebDriver driver;
	public String fileName;
	public static int sheetIndex;
	public static int number;
	public static Properties prop2;

	// Encapsultion (getters and setters)
	public void setDriver(RemoteWebDriver driver) {
		tlDriver.set(driver);
	}

	public RemoteWebDriver getDriver() {
		return tlDriver.get();
	}

	@BeforeMethod()
	public void preCondition() throws IOException {

		
			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			tlDriver.set(new ChromeDriver());
			setDriver(new ChromeDriver());
			getDriver().manage().window().maximize();
			getDriver().get("http://leaftaps.com/opentaps");
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}

	

	@AfterMethod()
	public void postCondition() {
		// getDriver().close();
	}

	@DataProvider(name = "fetchData", indices = 0, parallel = true)
	public String[][] getData() throws IOException {
		return ReadExcel.readData(fileName, sheetIndex);
	}

}