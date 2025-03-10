package driver;

import org.openqa.selenium.WebDriver;

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
		driver =  getConfig().browser().equals("chrome") ? ChromeManager.getDriver()
				: EdgeManager.getDriver();
		DriverManager.setDriver(driver);
		DriverManager.getDriver().get(getConfig().url());
		DriverManager.getDriver().manage().window().maximize();
		return DriverManager.getDriver();
	}
	
	public static void tearDown() {
		//TODO
	}

}
