package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node01qey7o6oowt9dc09s8l9hc4bu437441.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		// Draggable
		WebElement drag = driver.findElement(By.xpath("//div[@id='form:conpnl']"));
		Point location= drag.getLocation();
		System.out.println(location);
		Actions dragBuilder = new Actions(driver);
		dragBuilder.dragAndDropBy(drag, 300, 150).perform();
		Point loc=drag.getLocation();
		System.out.println(loc);
		if(location==loc)
		{
			System.out.println("The drag is not done");
		}
		else
		{
			System.out.println("Dragged");
		}
		
Thread.sleep(2000);
		// Dropable
		WebElement source = driver.findElement(By.xpath("//div[@id='form:drag_content']/p"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='form:drop']"));
		Actions dropBuilder = new Actions(driver);
		dropBuilder.dragAndDrop(source, dest).perform();
		
		
		Thread.sleep(2000);
		//Draggable colums
		//WebElement columns = driver.findElement(By.xpath("//div[@id='form:drag_content']/p"));
		//WebElement columns1 = driver.findElement(By.xpath("//div[@id='form:drop']"));
		//Actions columnBuilder = new Actions(driver);
		//dropBuilder.dragAndDrop(columns, columns1).perform();
		//System.out.println("The columns are interchanged");
		Thread.sleep(2000);
		WebElement columns = driver.findElement(By.xpath("//span[text()='Category']"));
		Point col=columns.getLocation();
		System.out.println(col);
		WebElement columns1 = driver.findElement(By.xpath("//span[text()='Quantity']"));
		Point col1=columns1.getLocation();
		System.out.println(col1);
		Actions dropBuilder1 = new Actions(driver);
		Thread.sleep(2000);
		dropBuilder1.dragAndDrop(columns1, columns).perform();
		
		
		
		
		
		//Draggable rows
		WebElement row1 = driver.findElement(By.xpath("//tbody[@class='ui-datatable-data ui-widget-content ui-sortable']/tr[2]"));
		WebElement  row2 = driver.findElement(By.xpath("//tbody[@class='ui-datatable-data ui-widget-content ui-sortable']/tr[2]"));
		Actions rowBuilder=new Actions(driver);
		rowBuilder.dragAndDrop(row1, row2).perform();

	}
}
