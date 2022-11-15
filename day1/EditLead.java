package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
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

				// to click crmfsa
				driver.findElement(By.linkText("CRM/SFA")).click();

				// lead
				driver.findElement(By.linkText("Leads")).click();

				// create lead
				driver.findElement(By.linkText("Create Lead")).click();

				// company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

				// first name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kajal");

				// last name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ambethkar");
				
				//source
				WebElement Tool = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select dropdown=new Select(Tool);
				dropdown.selectByIndex(1);


				// first name (local)
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kaj");

				// department feild
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");

				// description feild
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi.This is Kajal");

				// e-mail id
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kajalambethkar1990@gmail.com");

				// state
				  WebElement eleTool = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select dd = new Select(eleTool);
				dd.selectByVisibleText("New York");
				
				// create button
				driver.findElement(By.name("submitButton")).click();
				
				//title
				System.out.println("The Page title is :" + driver.getTitle());
				if(driver.getTitle().contains("Testleaf")) {
					System.out.println("I confirm the title has teatleaf");
				}else
				{
					System.out.println("The title does not have word testleaf");
				}
	
				//edit
				driver.findElement(By.linkText("Edit")).click();
				//clear description
				driver.findElement(By.id("updateLeadForm_description")).clear();
				//update important notes
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Train your self well");
				
				driver.findElement(By.name("submitButton")).click();
				
				
				
				

	}

}
