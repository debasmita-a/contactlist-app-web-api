package driver;

import org.openqa.selenium.WebDriver;

import enitity.DriverData;

public class LocalDriverImpl implements IDriver{

    @Override
    public WebDriver getDriver(DriverData driverData) {
        WebDriver driver = null;
        if(driverData.getBrowser().equals("chrome")){
            driver = ChromeManager.getDriver();
        }else {
            driver = EdgeManager.getDriver();
        }
        return driver;
    }

}
