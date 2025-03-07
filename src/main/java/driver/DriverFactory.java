package driver;

import static config.ConfigFactory.getConfig;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	
	static WebDriver driver = null;
	
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
