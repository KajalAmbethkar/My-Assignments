package week6.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClassLeaf
{
	@BeforeClass
	public void setData()
	{
		fileName="TestNgCreate";
		sheetIndex=1;
	}

@Test(dataProvider="fetchData",priority=1)

	public void runCreateLead(String cName,String fName,String lName,String local,String dep,String des,String email, String des2) throws InterruptedException
	{
		// lead
		driver.findElement(By.linkText("Leads")).click();

		// create lead
		driver.findElement(By.linkText("Create Lead")).click();

		// company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);

		// first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);

		// last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		
		//source
		WebElement Tool = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown=new Select(Tool);
		dropdown.selectByIndex(1);


		// first name (local)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(local);

		// department feild
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dep);

		// description feild
		driver.findElement(By.id("createLeadForm_description")).sendKeys(des);

		// e-mail id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);

		// state
		  WebElement eleTool = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(eleTool);
		dd.selectByVisibleText("New York");
		
		// create button
		driver.findElement(By.name("submitButton")).click();
		
		
		//edit
		driver.findElement(By.linkText("Edit")).click();
		
		//clear description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//update important notes
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys(des2);
		
		//update button using xpath
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//title
				System.out.println("The Page title is :" + driver.getTitle());
				if(driver.getTitle().contains("View Lead | opentaps CRM")){
					System.out.println("I confirm the title has teatleaf");
				}else
				{
					System.out.println("The title does not have word testleaf");
				}
		
		
		
	
//@DataProvider(name="fetchData")
//public String[][] setData() throws IOException{
	//String[][] data=new String[2][3];
	//data[0][0]="TestLeaf";
	//data[0][1]="kajal";
	//data[0][2]="ambethkar";
	//data[1][0]="Qeagle";
	//data[1][1]="Hari";
	//data[1][2]="k";
//return  data;

}}











