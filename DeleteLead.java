package testcases;

import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class DeleteLead extends BaseHooks{
	
	@Test
	public void runDeleteLead() throws InterruptedException {
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
		.getLeadId()
		.clickFirstRecord()
		.clickDeleteButton()
		.clickOnFindLeads()
		.enterLeadID()
		.clickFindLeadsButton()
		.verifyLeadDeleted();
		
		
		
	}

}

