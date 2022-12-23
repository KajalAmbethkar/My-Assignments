package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeadForm extends BaseClassLeadForm {
	/*
	 * @And("Click on Leads") public void leads() {
	 * driver.findElement(By.linkText("Leads")); }
	 */
@And("Click on Lead")
public void lead()
{
	driver.findElement(By.xpath("//a[text()='Leads']")).click();
}


@And("Click on find Lead")
	public void findL() throws InterruptedException
	{
	Thread.sleep(5000);
		driver.findElement(By.linkText("Find Leads")).click();
	}
@Then("Click on LeadId")
public void clickOnLeadIdAs()  throws InterruptedException{
	{ Thread.sleep(5000);
		WebElement find= driver.findElement(By.xpath("//input[@name='id']"));
		//find.sendKeys(String.valueOf(int1));
		find.sendKeys(number);
		Thread.sleep(3000);
		find.sendKeys(Keys.ENTER);
		Thread.sleep(2000);}}
		/*
		 * number= find.getText(); System.out.println("The text is " + number);
		 */
		@When("Click the first lead")
		public void firstLead() throws InterruptedException
		{
		//
		//driver.findElement(By.xpath("//a[@class='linktext']//ancestor::td")).click();
			driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tbody//a")).click();
		Thread.sleep(20000);
	}

	/*
	 * @And("Enter the number as (.*)$") public void phoneNum(String num) {
	 * driver.findElement(By.name("phoneNumber")).sendKeys(num); }
	 * 
	 * @And("Inspect first lead") public void firstLead() { //WebElement findElement
	 * = driver //.findElement(By.
	 * xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")); //
	 * capture the id
	 * 
	 * }
	 */
	
@Then("Click the delete button")
public void clickTheDeleteButton()  throws
	  InterruptedException {
	//Thread.sleep(4000);
	  
	 // driver.findElement(By.linkText("Delete")).click();
	driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[text()='Delete']")).click();
	System.out.println("Hence Deleted");}
	  
@Then("Find Lead")
public void findLead() throws InterruptedException  {
	Thread.sleep(2000);
	  driver.findElement(By.linkText("Find Leads")).click(); }
	  
	  @And("See if the lead is present") 
	  public void isPresent() throws InterruptedException {
	  
	
			  WebElement find1= driver.findElement(By.xpath("//input[@name='id']"));
	find1.sendKeys(number);
	Thread.sleep(2000);
	find1.sendKeys(Keys.ENTER);
	
	  
	  //System.out.println("The text is " + s1); }
	  
	  
	  }
	 @Then("Verify the lead is deleted")
	 public void deleteLead() throws InterruptedException
	 {
		 Thread.sleep(3000);
boolean displayed = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
if(true)
{
	System.out.println("The lead is delted");
}
else
{
	System.out.println("Not deleted");
}
	 }

}
	 