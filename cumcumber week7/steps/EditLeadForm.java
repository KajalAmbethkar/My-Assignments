package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadForm extends BaseClassLeadForm {
	@Then("Click on edit button")
	public void edit()
	{
		driver.findElement(By.linkText("Edit")).click();
	}
	@And("Clear the Description Field")
	public void clear()
	{
		driver.findElement(By.id("updateLeadForm_description")).clear();
	}
	@And("Fill ImportantNote Field with Any text as (.*)$")
	public void feild(String text)
	{
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys(text);
	}
	@When ("Click on update button")
	public void update()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Get the Title of Resulting Page")
	public void titleEdit()
	{
		boolean displayed1 = driver.findElement(By.xpath("//div[text()='View Lead']")).isDisplayed();
		if(displayed1) { System.out.println("Homepage is displayed"); } else {
			  System.out.println("not displayed"); }}
	}


