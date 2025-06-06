package driver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import config.ConfigFactory;
import enitity.DriverData;

public class RemoteDriverImpl implements IDriver {

    @Override
    public WebDriver getDriver(DriverData driverData) {
        WebDriver driver = null;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        try {
            if (driverData.getBrowser().equals("chrome")) {
                capabilities.setBrowserName("CHROME");
                System.out.println(ConfigFactory.getConfig().remoteURL());
                driver = new RemoteWebDriver(new URI(ConfigFactory.getConfig().remoteURL()).toURL(), capabilities);
            } else {
                capabilities.setBrowserName("EDGE");
                driver = new RemoteWebDriver(new URI(driverData.getRemoteURL()).toURL(), capabilities);
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }

}
