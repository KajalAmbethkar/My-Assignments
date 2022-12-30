package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC004_DeletePage extends BaseClass {
		@BeforeClass
		public void setData() {
			fileName = "LoginCreate";
			sheetIndex=4;
		}

	@Test(dataProvider ="fetchData")
	public void runDeletePage(String uName,String pwd) throws InterruptedException
	{
		new LoginPage(driver)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads();
		
		
		
	}

}
