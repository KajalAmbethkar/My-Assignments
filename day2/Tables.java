package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

		List<WebElement> rowElement = driver.findElements(By.xpath("//div[@class='render']/table//tr"));
		int rowSize = rowElement.size();

		List<WebElement> rowElement1 = driver.findElements(By.xpath("//div[@class='related-pages']/table/tbody/tr"));
		int rowSize1 = rowElement1.size();

		
		int totalRow = rowSize + rowSize1;
		System.out.println("The total rows in the page is:" + totalRow);

		List<WebElement> columnElement = driver.findElements(By.xpath("//div[@class='render']/table/thead//th"));
		int columnSize = columnElement.size();

		List<WebElement> columnElement1 = driver.findElements(By.xpath("//div[@class='related-pages']/table/tbody//th"));
		int columnSize1 = columnElement1.size();

		int totalColumns = columnSize + columnSize1;
		System.out.println("The total columns in the page is:" + totalColumns);

	}

}
