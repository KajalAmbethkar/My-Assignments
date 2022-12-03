package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();

		//To MOuse over Men
		WebElement mens = driver.findElement(By.xpath("//span[@class='catText']"));
		
		Actions builder=new Actions(driver);
		builder.moveToElement(mens).perform();
		
		
		//To click shirt
		WebElement shirts=driver.findElement(By.xpath("//span[text()='Shirts']"));
		builder.moveToElement(shirts).click(shirts).perform();
		
		//First shirt Mouse Over
		WebElement firstShirt = driver.findElement(By.xpath("//picture[@class='picture-elem']"));
		builder.moveToElement(firstShirt).perform();
		
		//quick view
		WebElement quickView = driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div"));
		builder.moveToElement(quickView).click(quickView).perform();
		


	}

}
