package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;

public class TC004_DeletePage extends BaseClass {
		@BeforeClass
		public void setData() {
			fileName = "LoginCreate";
			//sheetIndex=3;
		}

	@Test(dataProvider ="fetchData")
	public void runDeletePage()
	{
		new LoginPage(driver)
		
	}

}
