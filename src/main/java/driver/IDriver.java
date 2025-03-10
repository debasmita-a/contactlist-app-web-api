package driver;

import org.openqa.selenium.WebDriver;

import enitity.DriverData;

public interface IDriver {

    public WebDriver getDriver(DriverData driverData);
}
