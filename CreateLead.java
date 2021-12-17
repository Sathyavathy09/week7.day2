package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class CreateLead extends BaseHooks {
	
	@BeforeTest
	public void setValue() {
		excelFileName = "CreateLead";
		sheetName = "CreateLead";

	}
	
	@Test(dataProvider = "sendData")
	public void runCreateLead(String userName, String passWord, String company,String firstName, String lastName)
	
	{
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername(prop.getProperty("Username"))
		.enterPassword(prop.getProperty("Password"))
		.clickLoginButton()
		.verifyCRMSFAdisplayed()
		.clickCRMFSA()
		.clickLeadsButton()
		.clickCreateLeads()
		.enterCompany(company)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.clickSubmitButton()
		.verifyFirsName();
		
		
	}

}
