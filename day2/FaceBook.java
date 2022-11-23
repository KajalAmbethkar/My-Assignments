package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// set up browser driver
		WebDriverManager.chromedriver().setup();

		// lanuch the browser
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("https://en-gb.facebook.com/");

		// maximize the browser
		driver.manage().window().maximize();

		// create new account
		driver.findElement(By.linkText("Create New Account")).click();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// first name
		driver.findElement(By.name("firstname")).sendKeys("kajal");

		// last name
		driver.findElement(By.name("lastname")).sendKeys("Ambethkar");

		// Mobile Number or e-mail
		driver.findElement(By.name("reg_email__")).sendKeys("kajalambethkar@gmail.com");

		// Password
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234");


		// Birthday--- Date
		Select drop = new Select(driver.findElement(By.name("birthday_day")));
		drop.selectByVisibleText("13");

		// Birthday --- Month
		Select drop1 = new Select(driver.findElement(By.name("birthday_month")));
		drop1.selectByVisibleText("Sep");
		
		//Birthday----- year
		Select drop2=new Select(driver.findElement(By.name("birthday_year")));
		drop2.selectByVisibleText("1983");
		
		
		//female
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input[1]")).click();

	}
}
