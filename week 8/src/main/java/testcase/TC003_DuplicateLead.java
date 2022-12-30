package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.ViewLeadPage;

public class TC003_DuplicateLead extends BaseClass {
	@BeforeClass
	public void setData() {
		fileName = "LoginCreate";
		sheetIndex=3;
	}

@Test(dataProvider ="fetchData")
public void runDuplicateLead(String Uname,String Pwd,String cName,String fName,String lName,String local,String dep,String des,String email,String NewcName,String NewfName) throws InterruptedException
		
		
		
		
{
	new LoginPage(driver)
	.enterUserName(Uname)
	.enterPassword(Pwd)
	.clickLogin()
	.clickCRMSFA()
	.clickLeads()
	.clickCreateLead()
	.enterCompanyName(cName)
	.enterFirstName(fName)
	.enterLastName(lName)
	.enterLocalName(local)
	.enterDepartment(dep)
    .enterDescription(des)	
    .enterEmail(email)
    .clickCreateLead()
    .getPageTitle()
    .clickDuplicateButton()
    .clearComName()
    .enterNewcName(NewcName)
    .clearFirstName()
    .enterNewfName(NewfName)
    .clickButton()
    .getPTitle();
    
  

}

}
