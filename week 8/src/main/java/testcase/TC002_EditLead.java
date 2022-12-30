package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC002_EditLead extends BaseClass{
	@BeforeClass
	public void setData()
	{
		fileName ="LoginCreate";
		sheetIndex=2;
	}
@Test(dataProvider ="fetchData")
	
	public void runCreateLead(String uName,String pwd,String fName,String editCName) throws InterruptedException {
	
	new LoginPage(driver)
	.enterUserName(uName)
	.enterPassword(pwd)
	.clickLogin()
	.clickCRMSFA()
	.clickLeads()
	.clickFindLeads()
	.enterFirstName(fName)
	.clickLead()
	.clickFirstLead()
	.clickEditLeadButton()
	.clearComapnyName()
	.editCompanyName(editCName)
	.clickSubmitButton()
	.verifyEditName();

}

}

