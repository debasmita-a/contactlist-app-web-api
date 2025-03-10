package driver;

import org.openqa.selenium.WebDriver;

import enitity.DriverData;

import static config.ConfigFactory.getConfig;

public class DriverFactory {
	
	static WebDriver driver = null;
	/**
	 * This should return a WebDriver OR a RemoteWebDriver instance based on
	 * whether remote is true or false.
	 * 
	 * @return WebDriver
	 */
	public static WebDriver initDriver() {
		DriverData driverData = new DriverData(getConfig().browser(), getConfig().runMode());
		if(getConfig().runMode().equals("local")){
			driver = new LocalDriverImpl().getDriver(driverData);
		}else{
			driver = new RemoteDriverImpl().getDriver(driverData);
		}
		DriverManager.setDriver(driver);
		DriverManager.getDriver().get(getConfig().url());
		DriverManager.getDriver().manage().window().maximize();
		return DriverManager.getDriver();
	}
	
	public static void tearDown() {
		//TODO
	}

}
