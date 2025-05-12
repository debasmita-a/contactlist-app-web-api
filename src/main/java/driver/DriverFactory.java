package driver;

import static config.ConfigFactory.getConfig;

import java.util.Map;
import java.util.Objects;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import api.UserAPI;
import enitity.DriverData;

public class DriverFactory {

	static WebDriver driver = null;

	/**
	 * This should return a WebDriver OR a RemoteWebDriver instance based on whether
	 * remote is true or false.
	 * 
	 * @return WebDriver
	 */
	public static WebDriver initDriver() {
		DriverData driverData = new DriverData(getConfig().browser(), getConfig().runMode());
		if (getConfig().runMode().equals("local")) {
			driver = new LocalDriverImpl().getDriver(driverData);
		} else {
			driver = new RemoteDriverImpl().getDriver(driverData);
		}
		DriverManager.setDriver(driver);
		Map<String, String> SESSIONDATA = UserAPI.getSessionData();
		DriverManager.getDriver().get(getConfig().url());
		// With API Login :::
		//Map<String, String> SESSIONDATA = UserAPI.getSessionData();
	    
	    Cookie tokenCookie = new Cookie.Builder("token", SESSIONDATA.get("token"))
	        .domain("thinking-tester-contact-list.herokuapp.com") 
	        .path("/")
	        .build();
	    driver.manage().addCookie(tokenCookie);
	    
	    ((JavascriptExecutor)DriverManager.getDriver()).executeScript("window.localStorage.setItem('id', '" + SESSIONDATA.get("id") + "');");
	    
	    DriverManager.getDriver().navigate().refresh();
	    DriverManager.getDriver().get(getConfig().url() + "/contactList");
		DriverManager.getDriver().manage().window().maximize();
		return DriverManager.getDriver();
	}

	public static void tearDown() {
		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
