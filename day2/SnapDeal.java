package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();

		// Go to Mens Fashion
		WebElement fashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(fashion).perform();

		// Go to Sports Shoes
		driver.findElement(By.xpath("//span[text()=\"Sports Shoes\"]")).click();

		// Get the count of the sports shoes
		WebElement shoesCount = driver
				.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following-sibling::div"));
		String s = shoesCount.getText();
		System.out.println("The shoes count is:" + s);

		// Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

		Thread.sleep(5000);

		// sort
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		Thread.sleep(3000);
		WebElement lowTo = driver.findElement(By.xpath("//li[@class='search-li']"));
		lowTo.click();

		Thread.sleep(3000);

		// Select the price range (900-1200)
		WebElement in = driver.findElement(By.xpath("//input[@name='fromVal']"));
		in.clear();
		in.sendKeys("900");
		WebElement out = driver.findElement(By.xpath("//input[@name='toVal']"));
		out.clear();
		out.sendKeys("1200");
		// go
		// driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line
		// btn-theme-secondary']")).click();

		// Filter with color Navy
		WebElement color1 = driver.findElement(By.xpath("//label[@for='Color_s-Navy']"));
		color1.click();
		String b = color1.getText();
		System.out.println("The applied color is" + b);

		Thread.sleep(3000);
		// verify the filters
		WebElement colour = driver.findElement(By.xpath("//label[@for='Color_s-Navy']"));
		String c = colour.getText();
		System.out.println("The applied filter color is" + c);

		if (b.equals(c)) {
			System.out.println("The applied filter is same");
		} else {
			System.out.println("The applied filter is different");
		}
		// Mouse Hover
		WebElement firstShoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(firstShoe).perform();

		// Quick View
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();

		// cost
		WebElement cost = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
		System.out.println("The cost is:" + cost.getText());

		// percentage
		WebElement percentage = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
		System.out.println("The discount is:" + percentage.getText());

		// Take the snapshot of the shoes.
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File(".//snap/shoe.png");
		FileUtils.copyFile(source, dest);
		System.out.println("THe Screen Shot is Taken");

		Thread.sleep(5000);

		driver.close();
		driver.quit();

	}
}
