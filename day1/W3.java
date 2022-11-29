package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class W3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().sendKeys("Kajal");
		driver.switchTo().alert().accept();
		String msg=driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
		if(msg.contains("Kajal"))
		{
			System.out.println("Successful");
		}
		else {
			System.out.println("Unsuccessful");
		}
		System.out.println(msg);}

}
