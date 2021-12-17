package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class MyLeadsPage extends BaseHooks {
	
	public MyLeadsPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public CreateLeadPage clickCreateLeads() {
		driver.findElement(By.linkText(prop.getProperty("MyLeadsPage.linkText.CreateLead"))).click();
		return new CreateLeadPage(driver);

}
	
	public FindLeadsPage clickOnFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);

}
	
	public MergeLeadPage clickOnMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage(driver);

}
	
}
