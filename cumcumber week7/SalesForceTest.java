package Marathon;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceTest extends BaseClassContent {

	@BeforeClass
	public void setData() {
		fileName="sales1";
		sheetIndex=0;
	}
	@Test(dataProvider="fetchData")
	public void runSalesForceTest(String question,String Answers) throws InterruptedException  {
		
		
		//toogle menu
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//view all
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		Thread.sleep(3000);
	    //Type Content on the Search box
		WebElement search = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow slds-input-has-icon slds-input-has-icon_left-right']/input"));
		search.click();
		search.sendKeys("content",Keys.ENTER);
		
		//Click Content Link
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		
		//Click on Chatter Tab
		WebElement chatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
		
		
		
		//Java Script
		driver.executeScript("arguments[0].click();",chatter);
				
				Thread.sleep(3000);
				//Verify Chatter title on the page
				String s=driver.getTitle();
				System.out.println("The title of the page is:" +s);
				String a="Chatter Home | Salesforce";
				 if(s.equals(a))
				{
					System.out.println("The title is verified");
				}
				else
				{
					System.out.println("Not verified");
				}
				
				//Click Question tab
				Thread.sleep(3000);
				 driver.findElement(By.xpath("//span[text()='Question']")).click();
				

			
						
						//Type Question with data (coming from excel)
						WebElement ques1 = driver.findElement(By.xpath("//textarea[@role='textbox']"));
				ques1.sendKeys(question);
				//String text=ques1.getAttribute("text");
				//System.out.println(text);
						
						//) Type Details with data (coming from excel)
						WebElement que1 = driver.findElement(By.xpath("//div[@class='slds-rich-text-editor__textarea slds-grid ql-container']/div"));
						que1.sendKeys(Answers);
						//String text = que.getText();
						//System.out.println(text);
						//Click Ask
						WebElement ask = driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand cuf-publisherShareButton qe-questionPostDesktop MEDIUM']"));
						
						//Java Script
						driver.executeScript("arguments[0].click();",ask);
						Thread.sleep(3000);
						//Confirm the question appears
						WebElement questionverify = driver.findElement(By.xpath("//span[@class='uiOutputText']/parent::div"));
						String text2 = questionverify.getText();
						System.out.println(text2);
						
						if(text2.contains("What is a software?"))
						{
							System.out.println("The question is same");
						}
						else
						{
							System.out.println("The question is different");
						}
						
						}
						
						
						
				}
				
	

