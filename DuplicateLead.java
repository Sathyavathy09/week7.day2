package testcases;

import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class DuplicateLead extends BaseHooks{
	
	@Test
	public void runDuplicateLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);

		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMFSA()
		.clickLeadsButton()
		.clickOnFindLeads()
		.clickPhoneTab()
		.enterPhoneNumber()
		.clickFindLeadsButton()
		.clickFirstRecord()
		.clickDuplicateLead()
		.clickCreateLeadToDuplicate();
		
	}

}
