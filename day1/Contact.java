package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		// enter the username
		WebElement eleusername = driver.findElement((By.id("username")));
		eleusername.sendKeys("Demosalesmanager");

		// enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// to click and go inside
		driver.findElement(By.className("decorativeSubmit")).click();

		// to click crmfsa
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Contacts
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		// Merge Contacts
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		// widget from
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a")).click();

		// New window for contact
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());

		// to get the value
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(windows.get(0));
		System.out.println(driver.getTitle());

		Thread.sleep(5000);

		// widget to
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdTo']/following-sibling::a")).click();

		// New Window for To contact

		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> windows1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(windows1.get(1));
		System.out.println(driver.getTitle());

		// to get the to value
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(windows1.get(0));
		System.out.println(driver.getTitle());

		// merge
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();

		// to handle configuration alert
		String text = driver.switchTo().alert().getText();

		// to click ok
		Alert alert = driver.switchTo().alert();

		alert.accept();
		System.out.println(driver.getTitle());

	}

}
