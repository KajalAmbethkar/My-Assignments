package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class CreateLeadPage extends BaseClass{

	
	
public CreateLeadPage(RemoteWebDriver driver) {
		
		this.driver=driver;
	}
	
public CreateLeadPage enterCompanyName(String cName)  {
	
	
	//Thread.sleep(2000);	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	return this;
	}

	public CreateLeadPage enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}

	public CreateLeadPage enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}

	public CreateLeadPage enterLocalName(String local)
	{
		driver.findElement(By.name("firstNameLocal")).sendKeys(local);
		return this;
	}
	public CreateLeadPage enterDepartment(String dep)
	{
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(dep);
		return this;
	}
	public CreateLeadPage enterDescription(String des)
	{
		driver.findElement(By.id("createLeadForm_description")).sendKeys(des);
		return this;
	}
	public CreateLeadPage enterEmail(String email)
	{
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
		return this;
		
	}
	public CreateLeadPage selectState()
	{
		WebElement stateProvince = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select selectStateProvince = new Select(stateProvince);
		selectStateProvince.selectByVisibleText("New York");
		WebElement selectedStateProvince = selectStateProvince.getFirstSelectedOption();

		String selectedDropDownValue = selectedStateProvince.getText();
		System.out.println("State/Province Selected is: " + " " + selectedDropDownValue);
		return this;
	}
	public ViewLeadPage clickCreateLead() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}




}
