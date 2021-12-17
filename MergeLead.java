package testcases;

import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class MergeLead extends BaseHooks{
	
	@Test
	public void runMergeLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);

		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMFSA()
		.clickLeadsButton()
		.clickOnMergeLeads()
		.clickFindFromLead()
		.enterFirstNameFrom()
		.clickFindLead()
		.getLeadId()
		.clickReturnRecord()
		.clickFindToLead()
		.enterFirstNameTo()
		.clickFindLead()
		.clickReturnRecord()
		.clickOnMerge()
		.clickOnFindLeads()
		.enterLeadIDfromLookup()
		.clickFindLeadsButton()
		.verifyLeadMerged();
		
		
	}

}
