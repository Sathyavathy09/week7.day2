package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class CreateLeadPage extends BaseHooks {
	
	public CreateLeadPage(ChromeDriver driver)
	{
		this.driver = driver;
	}

	public CreateLeadPage enterCompany(String company) {

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		return this;

	}

	public CreateLeadPage enterFirstName(String firstName) {

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		return this;
	}

	public CreateLeadPage enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		return this;
	}

	public CreateLeadPage phoneNumeber() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("425");
		return this;
	}

	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();

		return new ViewLeadPage(driver);
	}
}
