package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;

public class TC001_CreateLead extends BaseClass{

	@BeforeClass
	public void setData()
	{
		fileName ="LoginCreate";
		sheetIndex=1;
	}
	
	@Test(dataProvider ="fetchData")
	
	public void runCreateLead(String uName,String pwd,String cName,String fName,String lName,String local,String dep,String des,String email) throws InterruptedException {
//		LoginPage lp = new LoginPage();
//		lp.enterUserName();
//		lp.enterPassword();
//		lp.clickLogin();
//		
//		HomePage hp = new HomePage();
//		hp.clickCRMSFA();
//		
//		MyHomePage mhp = new MyHomePage();
//		mhp.clickLeads();
		
		new LoginPage(driver)
		.enterUserName(uName)
		.enterPassword(pwd) 
		.clickLogin()	// new HomePage()
		.clickCRMSFA() // new MyHomePage()
		.clickLeads()	// new LeadsPage()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterLocalName(local)
		.enterDepartment(dep)
		.enterDescription(des)
		.enterEmail(email)
		.selectState()
		.clickCreateLead()
		.getEmployeeId();
		
		 
	}
}
