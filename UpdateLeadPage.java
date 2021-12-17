package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class UpdateLeadPage extends BaseHooks {
	
	public UpdateLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public UpdateLeadPage clearCompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		return this;

	}
	
	public UpdateLeadPage enterCompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("CTS");
		return this;
		

	}
	
	public ViewLeadPage clickUpdate() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);

	}

}
