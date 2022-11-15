package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		// lead
		driver.findElement(By.linkText("Leads")).click();

		// find leads
		driver.findElement(By.linkText("Find Leads")).click();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// phone tab
		driver.findElement(By.linkText("Phone")).click();

		// phone number field
		driver.findElement(By.name("phoneNumber")).sendKeys("99");

		// inspecting the first element in the table(1st)
		WebElement findElement = driver
				.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));

		// capture the id
		String num = findElement.getAttribute("text");
		System.out.println("The text is " + num);
		findElement.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// delete element
		driver.findElement(By.linkText("Delete")).click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// find leads
		driver.findElement(By.linkText("Find Leads")).click();

		// Lead Id
		WebElement findElement2 = driver.findElement(By.xpath("//div[@id='x-form-el-ext-gen246']/input"));
		String s1 = num;
		findElement2.sendKeys(s1);
		System.out.println("The text is " + s1);
		
		//find lead
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		if (num == s1) {

			System.out.println("The Id was successfully deleted");

		}

		else {
			System.out.println("The Id was not deleted");
		}
		
		driver.close();

	}

}


