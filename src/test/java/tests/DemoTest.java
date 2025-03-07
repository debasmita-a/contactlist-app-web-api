package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import config.ConfigFactory;
import driver.DriverFactory;

public class DemoTest {
	
	@Test
	public void setup() {
		WebDriver driver = DriverFactory.initDriver();
		driver.get(ConfigFactory.getConfig().url());
	}

}
