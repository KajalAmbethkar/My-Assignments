package Marathon;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceKeys extends BaseClassContent {
	 @BeforeClass
	public void setData() {
	fileName="sales1";
	sheetIndex=1;
	}
	 @Test(dataProvider="fetchData")
	public  void runSalesForceKeys(String name,String amt) throws InterruptedException {
		
		// toogle menu
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// view all
		//driver.findElement(By.xpath("//button[text()='View All']")).click();

		// sales
		//driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
		WebElement search = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']"));
		search.sendKeys("sales");
		search.sendKeys(Keys.ENTER);

		/*
		 * // opp WebElement findElement =
		 * driver.findElement(By.xpath("//span[text()='Opportunities']")); // Java
		 * Script driver.executeScript("arguments[0].click();", findElement);
		 */
		// Click View All Key Deals in Key Deals
		WebElement allKeys = driver.findElement(By.xpath("//span[text()='View All Key Deals']"));
		driver.executeScript("arguments[0].click();", allKeys);
		Thread.sleep(3000);
		WebElement tab = driver.findElement(By.xpath("//div[text()='New']"));

		//Java Script
				driver.executeScript("arguments[0].click();",tab);
		Thread.sleep(2000);
		WebElement n = driver.findElement(By.xpath("//input[@name='Name']"));
		
		n.sendKeys(name);
		//String s1=n.getText();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//lightning-combobox[@class='slds-form-element_stacked slds-form-element']//div")).click();
		Thread.sleep(5000);
		WebElement customer = driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='New Customer']"));
		// Java Script
				driver.executeScript("arguments[0].click();",customer);
		WebElement amount = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow']//input"));
		// Java Script
		driver.executeScript("arguments[0].click();",amount);
		amount.sendKeys(amt);
		
		WebElement calendar = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-input-has-icon slds-input-has-icon_right']/input"));
		// Java Script
				driver.executeScript("arguments[0].click();",calendar);
				
				WebElement month = driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon slds-button_icon-container']//span[text()='Next Month']"));
				// Java Script
				driver.executeScript("arguments[0].click();",month);
				
				WebElement date = driver.findElement(By.xpath("//span[text()='20']"));
				// Java Script
				driver.executeScript("arguments[0].click();",date);
				
				WebElement stage = driver.findElement(By.xpath("//span[text()='--None--']"));
				// Java Script
				driver.executeScript("arguments[0].click();",stage);
	//Thread.sleep(10000);
	WebElement need = driver.findElement(By.xpath("//span[@class='slds-media__body']/span[text()='Needs Analysis']"));
	// Java Script
	driver.executeScript("arguments[0].click();",need);
	
	//WebElement primary = driver.findElement(By.xpath("//input[@id='combobox-input-602']"));
	// Java Script
		//driver.executeScript("arguments[0].click();",primary);
		
		//WebElement boot = driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input slds-combobox__input-value']"));
		// Java Script
		//driver.executeScript("arguments[0].click();",boot);
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='Save']")).click();
		// Java Script
				//driver.executeScript("arguments[0].click();",submit);
				
				Thread.sleep(5000);
				WebElement msg = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']/a"));
		String s=msg.getText();
		System.out.println(s);
		
		
		
		
	}
}
