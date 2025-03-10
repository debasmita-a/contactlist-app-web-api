package driver;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverImpl implements IDriver {

    static WebDriver driver;

    @Override
    public static WebDriver getDriver(String browser){
        switch (browser.toLowerCase().trim()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;

            default:
                break;
        }
        return driver;
    }

    @Override
    public static WebDriver getDriver(String browser, String remoteUrl) throws MalformedURLException {
       
        switch (browser.toLowerCase().trim()) {
            case "chrome":
                driver = new RemoteWebDriver(new URI(remoteUrl).toURL(), new Capabilities());
                break;
            case "edge":
               // driver = new EdgeDriver();
                break;

            default:
                break;
        }

        return driver;
    }

}
