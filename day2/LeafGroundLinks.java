package week2.day2;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// set up browser driver
		WebDriverManager.chromedriver().setup();

		// lanuch the browser
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("https://leafground.com/link.xhtml;jsessionid=node0irrzetq75arqy491ko77chzx424514.node0");

		// maximize the browser
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Take me to dashboard
		driver.findElement(By.xpath("//a['text()=Go to Dashboard']")).click();

		// To navigate back
		String urlToNavigate = "https://leafground.com/link.xhtml;jsessionid=node0irrzetq75arqy491ko77chzx424514.node0";
		driver.navigate().to(urlToNavigate);
		// time to load
		Thread.sleep(2000);
		

		// find my destination without clicking
		WebElement findElement = driver.findElement(By.linkText("Find the URL without clicking me."));

		// String currentUrl = driver.getCurrentUrl();
		// System.out.println("The current url" +currentUrl);

		// broken link
		driver.findElement(By.linkText("Broken?")).click();
		
		

		// To navigate back

		String urlToNavigate1 = "https://leafground.com/link.xhtml;jsessionid=node0irrzetq75arqy491ko77chzx424514.node0";
		driver.navigate().to(urlToNavigate1);
		// time to load
		Thread.sleep(2000);

		// duplicate
		// driver.findElement(null)

		// How many links in this page?
		driver.findElement(By.linkText("How many links in this page?")).click();

		// capture and count the number of links in the page
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		String urlToNavigate2 = "https://leafground.com/link.xhtml;jsessionid=node0irrzetq75arqy491ko77chzx424514.node0";
		driver.navigate().to(urlToNavigate1);
		// time to load
		Thread.sleep(2000);

		// How many links in this layout?
		driver.findElement(By.linkText("How many links in this layout?")).click();
		// capture and count the links in the layout
		List<WebElement> links1 = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		String urlToNavigate3 = "https://leafground.com/link.xhtml;jsessionid=node0irrzetq75arqy491ko77chzx424514.node0";
		driver.navigate().to(urlToNavigate1);
		// time to load
		Thread.sleep(2000);


	}

}
