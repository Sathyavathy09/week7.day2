package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseHooks;

public class LoginPage extends BaseHooks {
	
	public LoginPage(ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPage enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;

	}

	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;

	}

	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);

	}

}
