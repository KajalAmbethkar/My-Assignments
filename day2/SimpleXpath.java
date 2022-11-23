package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleXpath {
	
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
		WebElement eleusername = driver.findElement(By.xpath("//input[@id='username']"));
		eleusername.sendKeys("Demosalesmanager");

		// enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		// to click and go inside
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//crm
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		

		//lead
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// create lead
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();

		// company name
		driver.findElement(By.xpath("//input[@id ='createLeadForm_companyName']")).sendKeys("TestLeaf");

		// first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kajal");

		// last name
		driver.findElement(By.xpath ("//input[@id='createLeadForm_lastName']")).sendKeys("Ambethkar");
		
		//create lead
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
	}

}
