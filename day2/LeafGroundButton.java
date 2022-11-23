package week2.day2;

import java.awt.Dimension;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {

		// set up browser driver
		WebDriverManager.chromedriver().setup();

		// lanuch the browser
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("https://www.leafground.com");

		// maximize the browser
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// element
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Element']"));

		// Java Script
		driver.executeScript("arguments[0].click();", findElement);

		// implicit wa
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// button element
		driver.findElement(By.xpath("//span[text()='Button']")).click();

		// click and confirm
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']/span")).click();

		// element
		WebElement findElement2 = driver.findElement(By.xpath("//span[text()='Element']"));

		// Java Script
		driver.executeScript("arguments[0].click();", findElement2);

		// implicit wa
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// button element
		driver.findElement(By.xpath("//span[text()='Button']")).click();

		// disabled button
		boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if (enabled) {
			System.out.println("Yes!The Button is Disabled");
		} else {
			System.out.println("No!The button is enabled");
		}

		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Actions actions=new Actions(driver);

		//Find the position of the Submit button
		WebElement findElement3 = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left mr-2']/span[2]"));
		
		
		int getX=findElement3.getLocation().getX();
		System.out.println("The X coordinates :"+getX);
		
		
		int getY=findElement3.getLocation().getY();
		System.out.println("The Y coordinates :"+getY);
		
		actions.moveByOffset(getX+1, getY+1).click();
		actions.build().perform();
		 
		System.out.println("Clicked Successfully Submit button");
		
		
		//Find the Save button color
		WebElement findElement4 = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left ui-button-secondary mr-2 mb-2']/span[2]"));
		//obtain color in rbga
		String s=findElement4.getCssValue("color");
		//convert rbga to hex
		String c=Color.fromString(s).asHex();
		System.out.println("The rbga is is" +s);
		System.out.println("The color is" +c);
		
		//find the height and width of the button
		WebElement size = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-right']/span[2]"));
		
		org.openqa.selenium.Dimension size2 = size.getSize();
		
		System.out.println("the size is" +size2);
		
		//mouse over and color change
		WebElement findElement5 = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-button-raised ui-button-success mr-2 mb-2']/span"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(findElement5).perform();
		
		//click on image button 
		driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-button-warning']/span")).click();
		
		
		driver.findElement(By.xpath("//h5[text()='How many rounded  buttons are there ?']/parent::div"));
		

	}

}
