package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClassLeaf {
	@BeforeClass
	public void setData()
	{
		fileName="TestNgCreate";
		sheetIndex=2;
	}
	@Test(dataProvider="fetchData",priority=3)

	public void runDuplicateLead(String cName,String fName,String lName,String local,String dep,String des,String email, String des2,String c2,String f2) throws InterruptedException {
		
		

		
Thread.sleep(7000);
//lead
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
		
		//title
		System.out.println("The Page title is :" + driver.getTitle());
		
		//duplicate tab
		driver.findElement(By.linkText("Duplicate Lead")).click();
	
		//clear company name field
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		//add new company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(c2);
		
		//clear first name'
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		//add new first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(f2);
		
		//click create lead
		driver.findElement(By.name("submitButton")).click();
		
		//title
		System.out.println("The Page title is :" + driver.getTitle());

	}
	//@DataProvider(name="fetchData")
	//public String[][] setData(){
		//String[][] data=new String[1][3];
		//data[0][0]="TestLeaf";
		//data[0][1]="kajal";
		//data[0][2]="ambethkar";
		//return data;

}


