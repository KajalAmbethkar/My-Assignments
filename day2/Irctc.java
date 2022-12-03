package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();

		// from station
		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		Thread.sleep(200);
		fromStation.sendKeys("MAS", Keys.ENTER);

		// To Station
		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("CBE", Keys.ENTER);
		Thread.sleep(200);

		// Sort on Date
		driver.findElement(By.id("chkSelectDateOnly")).click();

		// Train Name list
		List<WebElement> trainEles = driver.findElements(
				By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]/a"));
		int size = trainEles.size();
		System.out.println(size);
		

		// To get all names of the train
		List<String> trainsName = new ArrayList<String>();
		// To get all the names
		for (WebElement trainEle : trainEles) {
			trainsName.add(trainEle.getText());
			

		}
		
		// List to Set to avoid duplicates
		Set<String> train = new HashSet<String>(trainsName);
		int size1=train.size();
		System.out.println(size1);
		System.out.println(train);
		if (trainsName.size() == train.size()) {
			System.out.println("There are no Duplicates");
		} else {
			System.out.println("There are Duplicates");
		}
	}

}
