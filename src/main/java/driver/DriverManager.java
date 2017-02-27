package driver;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

/**
 * Created by aliaksandr on 26.02.17.
 */
public class DriverManager {

    private static IOSDriver driver;

    private static DriverManager instance;

    private DriverManager(URL remoteAddress, DesiredCapabilities desiredCapabilities)  {
        driver = new IOSDriver(remoteAddress,desiredCapabilities);
    }

    public static DriverManager getInstance(URL remoteAddress, DesiredCapabilities desiredCapabilities) {
        if (instance == null) {
            instance = new DriverManager(remoteAddress, desiredCapabilities);
        }
        return instance;
    }

    public static WebDriver getWebDriver() {
        return driver;
    }
}
