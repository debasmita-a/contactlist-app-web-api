package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface IDriver {

    public WebDriver getDriver(String browser);
    public RemoteWebDriver getDriver(String browser, String remoteUrl);
}
