package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class NewIncident extends BaseClassIncident {

	@Test

	public void runNewIncident() throws InterruptedException {

		{

			WebElement newKey = all.findElementByXPath("//iframe");

			driver.switchTo().frame(newKey);

			WebElement newKey1 = all.findElementByXPath("//button[text()='New']");
			newKey1.click();

			WebElement number = driver.findElement(By.xpath("//input[@id='incident.number']"));
			incidentNumber=number.getAttribute("value").replace("+", "");
			
		
			//incidentNumber=number.getAttribute("value").replace("+", "")
			System.out.println(incidentNumber);
			driver.findElement(By.xpath("//input[@id='incident.short_description']"))
					.sendKeys("This is my firstIncident");
			// submit
			all.findElementByXPath("//button[text()='Submit']").click();
			
			Thread.sleep(5000);
			WebElement incident = all.findElementByXPath("//input[@class='form-control']");
			incident.sendKeys(""+incidentNumber);
					incident.sendKeys(Keys.ENTER);
			
			Thread.sleep(2000);
			
			WebElement verify = all.findElementByXPath("//a[@class='linked formlink']");
			String ver = verify.getText();
		
			System.out.println("The incident is:" + ver);
			if (incidentNumber.equals(ver)){
				System.out.println("Verified successfully");
			} else {
				System.out.println("Verification Unsuccessful");

			}
		}
	}

}
