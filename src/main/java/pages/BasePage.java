package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverManager;

public class BasePage {
	
	public void waitAndSendKeys(By by, String value, int timeout) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(value);
	}
	
	public void waitAndClick(By by) {
		DriverManager.getDriver().findElement(by).click();
	}

}
