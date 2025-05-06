package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class EdgeManager {
	
	private EdgeManager() {}

	public static WebDriver getDriver() {
		WebDriverManager.edgedriver().setup();
		return new EdgeDriver();
	}
}
