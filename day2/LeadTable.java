package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadTable {
	
	public static void main(String[] args)
	{
		// set up browser driver
		WebDriverManager.chromedriver().setup();

		// lanuch the browser
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// maximize the browser
		driver.manage().window().maximize();

		// enter the username
		WebElement eleusername = driver.findElement((By.id("username")));
		eleusername.sendKeys("Demosalesmanager");

		// enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		// to click and go inside
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		// lead
		driver.findElement(By.linkText("Leads")).click();
		
		//inspecting the first element in the table
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		
	}

}
