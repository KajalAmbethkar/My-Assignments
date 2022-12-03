package week4.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.java.swing.plaf.windows.resources.windows;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		
		//Mouseover on Brands and Search L'Oreal Paris
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions brandAction=new Actions(driver);
		brandAction.moveToElement(brands).perform();
		
		
		Thread.sleep(9000);
		//Click L'Oreal Paris
		WebElement loreal = driver.findElement(By.xpath("//a[text()=\"L'Oreal Paris\"]"));
		loreal.click();
		//Check the title contains L'Oreal Paris(Hint-GetTitle)
		//Set<String> lorealWin=driver.getWindowHandles();
		//List<String> lorealWindows=new ArrayList<String>(lorealWin);
		//driver.switchTo().window(lorealWindows.get(1));
		System.out.println( driver.getTitle());
		String title=driver.getTitle();
		String exceptedTitle="L'Oreal Paris";
		
		if(title.contains(exceptedTitle))
				{
			System.out.println("Title Matched");
				}
		else
		{
			System.out.println("Title Unmatched");
		
				}
		
		
		
		//Click sort By and select customer top rated
		driver.findElement(By.xpath("//button[@class=' css-n0ptfk'][1]")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();

		// Click Category and click Hair->Click haircare->Shampoo
		driver.findElement(By.xpath("//div[@class='filter-open css-1kwl9pj']")).click();
		driver.findElement(By.xpath("//div[@class=' css-b5p5ep']/span[text()='Hair']")).click();
		driver.findElement(By.xpath("//div[@class=' css-b5p5ep']/span[text()='Hair Care']")).click();
		//driver.findElement(By.xpath("//label[@class=\"control control-checkbox\"]//span[text()='Shampoo']"))
		Thread.sleep(3000);
		WebElement shampoo1 = driver.findElement(By.xpath("//span[text()='Shampoo']"));
		shampoo1.click();
		
		
	
	
		//Click->Concern->Color Protection
		
		//driver.findElement(By.xpath("//div[@class='filter-open css-1kwl9pj']/span")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		
		//check whether the Filter is applied with Shampoo
		WebElement filter = driver.findElement(By.xpath("//span[@class='filter-value'][1]"));
		
		String orginal=filter.getText();
		System.out.println("The filtered applied is:" +orginal);
		String visible="Shampoo";
		if(orginal.equals(visible))
		{
			System.out.println("Shampoo filter is applied");
		}
		else
		{
			System.out.println("Shampoo filter is not applied");
		}
		
		//Click on L'Oreal Paris Colour Protect Shampoo
		driver.findElement(By.xpath("//div[text()=\"L'Oreal Paris Colour Protect Shampoo\"]")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> windowHandles1=new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandles1.get(1));
		System.out.println("The title is:" +driver.getTitle());
		
		Thread.sleep(3000);
		//GO to the new window and select size as 175ml
		WebElement size = driver.findElement(By.xpath("//div[@class='css-11wjdq4']/select"));
		
	Select dd=new Select(size);
	dd.selectByVisibleText("175ml");
	System.out.println("175ml is selected");
	
	//Print the MRP of the product
	WebElement price = driver.findElement(By.xpath("//span[@class='css-1jczs19']"));
	String price1 = price.getText();
//	price1=price1.replace("$", "");
	//int price2=Integer.parseInt(price1);
	
	System.out.println("The price of the product is " +price1);
	
	//Click on ADD to BAG
	driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
	
	//Go to Shopping Bag 
	driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
	
	Thread.sleep(3000);
	
	//Print the Grand Total amount
	WebElement gran = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
	driver.switchTo().frame(gran);
	String grandTotal = driver.findElement(By.xpath("//div[contains(@class,'css-i1x59x')]/preceding-sibling::div/span")).getText();
//    String grand= grandTotal.getText().replace("₹", "");
//	int price3 = Integer.parseInt(grand);

	
	System.out.println("The Grand Total is :" +grandTotal);
	
	//Click to Proceed
	driver.findElement(By.xpath("//div[@class='css-15vhhhd e25lf6d4']")).click();
	
	//) Click on Continue as Guest
	driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	
	//close
	driver.findElement(By.xpath("//div[@class='css-1801j3v eqr1d9n11']")).click();
	Thread.sleep(9000);
	//Check if this grand total is the same in step 14
	String total = driver.findElement(By.xpath("//p[@class='css-5t7v9l eka6zu20']")).getText();
//	String s2=grand2.getText().replace("₹", "");
//	int price4 = Integer.parseInt(s2);

	
	System.out.println("The total is:" +total);
	Thread.sleep(2000);
	
	if(grandTotal.equals(total))
	{
		System.out.println("The last total is same" +grandTotal);
	}
	else
	{
		System.out.println("The last total is different");
	}
//	//Thread.sleep(3000)	;
	//driver.close();	
		
		
		
		
		

	}

}


