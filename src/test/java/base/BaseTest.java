package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.DriverFactory;

public class BaseTest {

	@BeforeMethod
	public void setup() {
		DriverFactory.initDriver();
	}

	@AfterMethod
	public void teardown(){
		DriverFactory.tearDown();
	}
}
