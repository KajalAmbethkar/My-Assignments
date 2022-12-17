package week6.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class AssignIncident extends BaseClassIncident {
	//@BeforeClass
	//public void setData() {
		//fileName="service";
	//}
@Test
//(dataProvider="fetchData")
	public  void runAssignIncident() throws InterruptedException {
	Thread.sleep(6000);
		
		

		WebElement view = all.findElementByXPath("//iframe");

		driver.switchTo().frame(view);

		//List<WebElement> incidentrow = all.findElementsByXPath("//table[@id='incident_table']/tbody/tr");
		//int sizeR = incidentrow.size();
		//System.out.println(sizeR);
		
		//WebElement rowV = all.findElementByXPath("//table[@id='incident_table']/tbody/tr[" + sizeR + "]/td[@class='vt']");
		//String iNumber = rowV.getText();
		//System.out.println(iNumber);
		Thread.sleep(8000);
		all.findElementByXPath("//input[@class='form-control']").sendKeys(incidentNumber,Keys.ENTER);
		//all.findElementByXPath("//td[@name='number']//input").sendKeys(incidentNumber, Keys.ENTER);
		Thread.sleep(3000);
		all.findElementByXPath("//a[@class='linked formlink']").click();

		
Thread.sleep(10000);
		//WebElement view1 = all.findElementByXPath("//iframe");

		//driver.switchTo().frame(view1);

		//all.findElementByXPath("//span[@class='section_view']").click();
		//driver.findElement(By.xpath("//div[@class='context_item']")).click();
		//driver.findElement(By.xpath("//div[text()='Workspace']")).click();

		driver.findElement(By.xpath("//button[@id='lookup.incident.assignment_group']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
         List<String> windowList = new ArrayList<String>(windowHandles);
         System.out.println(windowList.size());
		System.out.println(windowList);
		Thread.sleep(3000);
		driver.switchTo().window(windowList.get(1));
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("software",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Software']")).click();
		
		driver.switchTo().window(windowList.get(0));
		Thread.sleep(3000);
		WebElement view1 = all.findElementByXPath("//iframe");

	    driver.switchTo().frame(view1);
		
		WebElement a2 = driver.findElement(By.xpath("//input[@id='sys_display.incident.assignment_group']"));
		//a2.sendKeys(incidentNumber);
		//String assigned = a2.getAttribute("value");
		//System.out.println(assigned);
		
		
		
		
		
		all.findElementByXPath("//textarea[@id='activity-stream-textarea']").sendKeys("This is a software group");
		Thread.sleep(10000);
		//WebElement newKey = all.findElementByXPath("//iframe");
		//driver.switchTo().frame(newKey);

		driver.findElement(By.xpath("//button[text()='Update']")).click();
		
		driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
		//WebElement view2 = all.findElementByXPath("//iframe");

	// driver.switchTo().frame(view2);
	
	 WebElement inci = driver.findElement(By.xpath("//input[@name='incident.number']"));
	
	 String att1 = inci.getAttribute("value");
	 System.out.println("The Incident Number is:"+att1);
	
	 WebElement assi = all.findElementByXPath("//input[@id='sys_display.incident.assignment_group']");
	 String att2 = assi.getAttribute("value");
	 System.out.println("The assiged group is:" +att2);
	 
	 if(incidentNumber.equals(att1))
	 {
		 System.out.println("The assigned incident is verified");
	 }
	 else
	 {
		 System.out.println("The assigned incident is not verified");
	 }
		
		
		
	}

}
