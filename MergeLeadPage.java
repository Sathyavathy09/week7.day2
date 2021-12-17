package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class MergeLeadPage extends BaseHooks {

	public MergeLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public LookUpLeadsPage clickFindFromLead() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return new LookUpLeadsPage(driver);

	}
	
	public LookUpLeadsPage clickFindToLead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return new LookUpLeadsPage(driver);

	}
	
	public ViewLeadPage clickOnMerge() {
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return new ViewLeadPage(driver);
		

	}

}