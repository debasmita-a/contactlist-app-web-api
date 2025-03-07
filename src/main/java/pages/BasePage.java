package pages;

import org.openqa.selenium.By;

import driver.DriverManager;

public class BasePage {
	
	public void waitAndSendKeys(By by, String value) {
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}
	
	public void waitAndClick(By by) {
		DriverManager.getDriver().findElement(by).click();
	}

}
