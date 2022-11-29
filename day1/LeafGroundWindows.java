package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		// Click and Confirm new Window Opens
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		System.out.println(windowHandles);
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(windows.get(0));
		System.out.println(driver.getTitle());

		// Find the number of opened tabs
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windows1 = new ArrayList<String>(windowHandles2);
		driver.switchTo().defaultContent();
		driver.switchTo().window(windows1.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(windows1.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(windows.get(0));

		//// Close all windows except Primary
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();

		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> windows2 = new ArrayList<String>(windowHandles3);
		driver.switchTo().window(windows2.get(1));
		driver.close();
		driver.switchTo().window(windows2.get(2));
		driver.close();
		System.out.println("window closed");
		driver.switchTo().window(windows2.get(3));
		driver.close();
		driver.switchTo().window(windows2.get(0));
		System.out.println("All the windows are closed");

		// Wait for 2 new tabs to open
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> windows3 = new ArrayList<String>(windowHandles4);
		driver.switchTo().window(windows3.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(windows3.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(windows3.get(0));
		

	}

}
