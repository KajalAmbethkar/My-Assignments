package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args)
	
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Amazon search bar
		driver.findElement(By.className("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		List<WebElement> allmobiles = driver.findElements(By.className("a-price-whole"));
	List<Integer> price = new ArrayList<Integer>();
		for (WebElement eachMobile : allmobiles) {
			
			System.out.println(eachMobile.getText());
			String text = eachMobile.getText().replace(",", "").replace("₹", "");
			int price1=Integer.parseInt(text);
			price.add(price1);
		}
		Collections.sort(price);
		System.out.println("The least price is"  +price.get(0));
		
	}}

		
		
		
			
			
		
		
		
	


