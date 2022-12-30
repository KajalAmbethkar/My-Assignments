package base;

import java.io.File;
import java.io.FileInputStream;
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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

//import utils.ReadExcel;

public class BaseClass {
	public RemoteWebDriver driver;
	public String fileName;
	public int sheetIndex;
	public static Properties prop2;
	public static Properties prop3;
	
	@BeforeMethod()
	public void preCondition() throws IOException {
		
		//Only Chrome Browser
		
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		 
		
		//Only Edge Browser
		/*
		 * WebDriverManager.edgedriver().setup(); driver = new EdgeDriver();
		 * driver.manage().window().maximize();
		 */
		
		

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(new File("src/main/resources/config.properties"));
		prop.load(fis);
		String url = prop.getProperty("url");
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		String lang = prop.getProperty("lang");
		prop2 = new Properties();
		FileInputStream fis2 = new FileInputStream(new File("src/main/resources/"+lang+".properties"));
		prop2.load(fis2);
		/*
		 * String browser = prop.getProperty("browser"); prop3 = new Properties();
		 * FileInputStream fis3 = new FileInputStream(new
		 * File("src/main/resources/"+lang+".properties")); prop3.load(fis3);
		 */
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/*
		 * driver.findElement(By.id("username")).sendKeys("DemoCSR");
		 * driver.findElement(By.id("password")).sendKeys("crmsfa");
		 * driver.findElement(By.className("decorativeSubmit")).click();
		 */
	}

	@AfterMethod()
	public void postCondition() {
		//driver.close();
	}

	
	  @DataProvider(name ="fetchData") 
	  public String[][] getData() throws IOException
	  { 
		 return ReadExcel.readData(fileName,sheetIndex);
		  }
	 
	 
}
