package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittogarh {

	public static void main(String[] args) {
			
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.chittorgarh.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				driver.manage().window().maximize();
				
				//2.Click on stock market
				driver.findElement(By.xpath("//a[@title='Stock Market']")).click();
				
				//3. Click on NSE bulk Deals
				driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
				
				//4. Get all the Security names
				List<WebElement> rowElement=driver.findElements(By.xpath("//div[@class='table-responsive']/table/tbody/tr"));
				int rowSize=rowElement.size();
			
				System.out.println("The number of rows:"+rowElement.size());
				
				
			   List<WebElement> columnElement=driver.findElements(By.xpath("//div[@class='table-responsive']/table/thead/tr/th"));
			   int columnSize=columnElement.size();
			   System.out.println("The number of columns:" + columnElement.size());	
			   
			   
			   Set<String> newSet = new LinkedHashSet<>();
				for(int i=1;i<=rowSize;i++)
			   {
				
			
					String unique=driver.findElement(By.xpath("//div[@class='table-responsive']/table/tbody/tr[" + i + "]/td[3]").getText();
					System.out.println(unique);
					newSet.add(unique);
					
			   }
				
				

				
					
					
					
					
				}}

				
				
			   

