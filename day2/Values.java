package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Values {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://html.com/tags/table/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.manage().window().maximize();
			
			
			List<WebElement> manageShare = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
			manageShare.size();
			int manRow=manageShare.size();
			
			
			System.out.println(manRow);
			Thread.sleep(2000);
			for(int i=1;i<=manRow;i++)
			{
				System.out.println(driver.findElement(By.xpath("//div[@class='render']/table/tbody/tr[" + i + "]")).getText());
				
			}
			
	}

}
