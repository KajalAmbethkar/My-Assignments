package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		
		//search Box
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBox.sendKeys("oneplus 9 pro");
		searchBox.sendKeys(Keys.ENTER);
		
		//price of the first phone
		WebElement phonePrice = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		String price = phonePrice.getText().replace(",", "").replace("₹", "");
		int price1=Integer.parseInt(price);
		System.out.println("The price of the mobile is:" +price);
		
		//rating of the first phone
		String rating = driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-small a-star-small-4 aok-align-bottom']")).getAttribute("innerText");
		System.out.println("The rating of the first phone:" +rating);
		
		//link
		 driver.findElement(By.xpath("//u[text()='+1 colors/patterns']")).click();
		 String windowHandle = driver.getWindowHandle();
			
			//System.out.println(windowHandle);
			driver.switchTo().window(windowHandle);
			System.out.println(driver.getTitle());
			
			//Taking Screenshot
			File source = driver.getScreenshotAs(OutputType.FILE);
			File dest=new File("./snaps/phone.png");
			FileUtils.copyFile(source, dest);
			System.out.println("THe Screen Shot is Taken");
			
			//Add the mobile to the cart
			driver.findElement(By.xpath("//span[@id='submit.add-to-cart'][1]")).click();
			System.out.println("The Phone is added to the cart");
			
			//To compare the price
			WebElement comparePrice = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
			String secondPrice=comparePrice.getText();
			int price2=Integer.parseInt(secondPrice);
			System.out.println("The sub total is :" +price2);
			if(price1==price2)
			{
				System.out.println("The price is correct");
			}
			else
			{
				System.out.println("The price is in correct");
			}
			
			
	
	driver.quit();
	}
	}


