package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC00_LoginPage extends BaseClass {
	
	@BeforeClass
	public void setData()
	{
		fileName ="LoginCreate";
		sheetIndex=0;
	}
	
	@Test(dataProvider ="fetchData")
	public void runLoginPage(String uName,String pwd)
	{
		new LoginPage(driver)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin();
		
		
	}

}
