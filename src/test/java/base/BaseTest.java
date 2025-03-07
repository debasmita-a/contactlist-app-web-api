package base;

import org.testng.annotations.BeforeTest;

import driver.DriverFactory;

public class BaseTest {

	@BeforeTest
	public void setup() {
		DriverFactory.initDriver();
	}
}
