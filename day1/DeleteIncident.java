package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class DeleteIncident extends BaseClassIncident {
@Test
	public  void runDeleteIncident() throws InterruptedException {
	
		
		WebElement newKey = all.findElementByXPath("//iframe");
		driver.switchTo().frame(newKey);
		//WebElement num = driver.findElement(By.xpath("//table//tbody//tr[14]//td[3]"));
		//String a=num.getText();
		//System.out.println(a);
	Thread.sleep(5000);
		WebElement search = all.findElementByXPath("//input[@class='form-control']");
		search.sendKeys(""+incidentNumber);
		Thread.sleep(4000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		all.findElementByXPath("//a[@class='linked formlink']").click();
		Thread.sleep(5000);
		
		//Capture Incident Number
		WebElement incident = driver.findElement(By.xpath("//input[@id='incident.number']"));
		incident.sendKeys(incidentNumber);
		//String num1=incident.getAttribute("value");
		//System.out.println(num1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		
		//noti
		
		WebElement delete = driver.findElement(By.xpath("//button[@class='btn btn-destructive']"));
		//driver.switchTo().alert().getText();
		delete.click();
		
		Thread.sleep(8000);
	

	    
		WebElement del = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String d=del.getText();
		System.out.println("The message is:"+d);
		
		if(d.contains("No records to display"))
		{
			System.out.println("The incident deleted is verified");
		}
		else
		{
			System.out.println("Not verified");
			
		}
		
		//search
		//all.findElementByXPath("//input[@class='form-control']").sendKeys(num1,Keys.ENTER);
		


	}

}
