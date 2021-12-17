package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseHooks;

public class FindLeadsPage extends BaseHooks {
	
	public static String leadID;
	
	public FindLeadsPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public FindLeadsPage clickPhoneTab() {
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;

	}
	
	public FindLeadsPage enterPhoneNumber()
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("425");
		return this;
	}
	
	public FindLeadsPage enterLeadID()
	{
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}
	public FindLeadsPage enterLeadIDfromLookup()
	{
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LookUpLeadsPage.leadID);
		return this;
	}
	
	
	public FindLeadsPage clickFindLeadsButton() throws InterruptedException
	{
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	
	return this;
	
	}
	
	public FindLeadsPage verifyLeadDeleted()
	{
		String text = driver.findElement(By.className("x-paging-info")).getText();
		Assert.assertEquals(text, "No records to display");
		return this;
	
	}
	
	public FindLeadsPage verifyLeadMerged()
	{
		String text = driver.findElement(By.className("x-paging-info")).getText();
		Assert.assertEquals(text, "No records to display");
		return this;
	
	}
	
	public FindLeadsPage getLeadId()
	{
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadID);
		return this;
	
	}
	
	public ViewLeadPage clickFirstRecord() throws InterruptedException
	{
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return new ViewLeadPage(driver);
	
	}

}
