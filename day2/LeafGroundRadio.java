package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class LeafGroundRadio {

	public static void main(String[] args) {
		// set up browser driver
				WebDriverManager.chromedriver().setup();

				// lanuch the browser
				ChromeDriver driver = new ChromeDriver();

				// load the url
				driver.get("https://leafground.com/radio.xhtml");

				// maximize the browser
				driver.manage().window().maximize();
				
				//your favourite browser
				WebElement radio1 = driver.findElement(By.xpath("//label[text()='Chrome']"));
				radio1.click();
				System.out.println(radio1.isSelected());
				
				
				
				WebElement radio = driver.findElement(By.xpath("//label[text()='Safari']"));
				System.out.println(radio.isSelected());
				
				WebElement age=driver.findElement(By.xpath("//label[text()='1-20 Years']"));
				
				

	}

}
