package week4.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CherCher {

	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//Switch to frame
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[text()='Topic :']/following-sibling::input")).sendKeys("Good Morning");
		
		//Switch to inner frame
		driver.switchTo().frame("frame3");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().defaultContent();
		
         //Switch to drop down frame
		driver.switchTo().frame("frame2");
		Thread.sleep(5000);
	    WebElement dropDown = driver.findElement(By.xpath("//select[@Class='col-lg-3']"));
	    Select tool=new Select(dropDown);
	    tool.selectByVisibleText("Avatar");
	    
        


	}

}
