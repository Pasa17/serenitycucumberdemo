package demo.planit.utility;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class MyRemoteDriver implements DriverSource {


    EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
    String remoteURL= variables.getProperty("custom.remote.url");

    @Override
    public WebDriver newDriver(){
        WebDriver driver;

        try {
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
            driver =  new RemoteWebDriver(new URL(remoteURL), capabilities);
            driver.manage().window().maximize();

            return driver;

        }
        catch (IOException e) {
            throw new Error(e);
        }

    }


    @Override
    public boolean takesScreenshots() {
        return true;
    }

}
