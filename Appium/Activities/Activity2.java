package Activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2 {
    AndroidDriver driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        UiAutomator2Options capabilities  = new UiAutomator2Options();
        capabilities.setDeviceName("Emulator");
        capabilities.setPlatformName("Android");
        capabilities.setAutomationName("UiAutomator2");
        capabilities.setAppPackage("com.android.calculator2");
        capabilities.setAppActivity(".Calculator");

        URL appserver = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(appserver , capabilities );
    }

    @Test
    public void test() {

    }
    @AfterClass
    public void quit(){
        driver.quit();
    }
}

