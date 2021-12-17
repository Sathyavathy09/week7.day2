package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class LookUpLeadsPage extends BaseHooks {
	public  static List<String>  allhandles;
	public static String leadID;

	public LookUpLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public LookUpLeadsPage enterFirstNameFrom() {
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sathya");
		return this;
		

	}
	
	public LookUpLeadsPage getLeadId() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		
		return this;

	}
	public LookUpLeadsPage enterFirstNameTo() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Swathi");
		return this;
		
	}
	

	
	public LookUpLeadsPage clickFindLead() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		return this;

	}
	
	public LookUpLeadsPage getLeadID() throws InterruptedException {
	leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		return this;

	}
	
	
	
	public MergeLeadPage clickReturnRecord() throws InterruptedException
	{	Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
		return new MergeLeadPage(driver);
	}
}