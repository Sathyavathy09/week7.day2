package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseHooks;

public class ViewLeadPage extends BaseHooks {

	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public ViewLeadPage verifyFirsName() {

		boolean displayed = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();

		Assert.assertTrue(displayed);

		return this;

	}

	public UpdateLeadPage clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
		return new UpdateLeadPage(driver);

	}
	
	public  MyLeadsPage clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage(driver);

	}

	public DuplicateLeadPage clickDuplicateLead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);

	} 
	public FindLeadsPage clickOnFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);

	} 
	

}
