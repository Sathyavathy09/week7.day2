
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import base.BaseHooks;

public class HomePage extends BaseHooks {

	public HomePage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	public HomePage verifyCRMSFAdisplayed() {

		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();

		Assert.assertTrue(displayed);
		return this;

	}

	public MyHomePage clickCRMFSA() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		return new MyHomePage(driver);

	}

}