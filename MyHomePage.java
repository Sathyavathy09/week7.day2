package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class MyHomePage extends BaseHooks {
	
	public MyHomePage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public MyLeadsPage clickLeadsButton() {
		driver.findElement(By.linkText(prop.getProperty("MyHomePage.linkText.Leads"))).click();
		return new MyLeadsPage(driver);


	}
	

}
