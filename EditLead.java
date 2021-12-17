package testcases;

import org.testng.annotations.Test;

import base.BaseHooks;
import pages.LoginPage;

public class EditLead extends BaseHooks {
	
	@Test
	public void runEditLead() throws InterruptedException
	{
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
		.clickEditButton()
		.clearCompanyName()
		.enterCompanyName()
		.clickUpdate();
		
		
	}

}
