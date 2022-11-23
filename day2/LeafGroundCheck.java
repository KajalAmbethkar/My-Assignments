package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheck {
	public static void main(String[] args) throws InterruptedException
	{
		// set up browser driver
				WebDriverManager.chromedriver().setup();

				// lanuch the browser
				ChromeDriver driver = new ChromeDriver();

				// load the url
				driver.get("https://leafground.com/checkbox.xhtml");

				// maximize the browser
				driver.manage().window().maximize();

				// implicit wait
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//basic
				driver.findElement(By.xpath("//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget']/span")).click();
				

				Thread.sleep(3000);
				
				
				//Notification
				//To identify the state of the check box
				boolean check = driver.findElement(By.xpath("//span[@class='ui-chkbox-label' and text()='Ajax']")).isSelected();
				
				//To check if checkbox is selected or not
				if(check==false)
					driver.findElement(By.xpath("//span[@class='ui-chkbox-label' and text()='Ajax']")).click();
				
				//To deselect
				boolean check1 = driver.findElement(By.xpath("//span[@class='ui-chkbox-label' and text()='Ajax']")).isSelected();
				
				Thread.sleep(2000);
				
				//To check if checkbox is selected or not
				if(check1==true)
				driver.findElement(By.xpath("//span[@class='ui-chkbox-label' and text()='Ajax']")).click();
				
				
		
                //choose your favourite language
				driver.findElement(By.xpath("//div[@class='ui-chkbox ui-widget']/following-sibling::label")).click();
				
				Thread.sleep(2000);
				
				//tri state button"
				driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']")).click();
				
				//toggle button
				driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
				
				// disabled button
				boolean enabled=driver .findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isEnabled();
				if (enabled) {
					System.out.println("Yes!The Button is Disabled");
				} else {
					System.out.println("No!The button is enabled");
				}
				
				Thread.sleep(3000);
				//Mutiple select
				driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right']")).click();
                 Thread.sleep(3000);
				//Miami
				driver.findElement(By.xpath("//li[@class='ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item ui-corner-all ui-selectcheckboxmenu-unchecked']/div")).click();
				//london
				driver.findElement(By.xpath("//li[@class='ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item ui-corner-all ui-selectcheckboxmenu-unchecked'][2]/div")).click();
				//paris
				driver.findElement(By.xpath("//li[@class='ui-selectcheckboxmenu-item ui-selectcheckboxmenu-list-item ui-corner-all ui-selectcheckboxmenu-unchecked'][3]/div")).click();
}
}
