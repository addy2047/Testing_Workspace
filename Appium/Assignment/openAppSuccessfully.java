package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class openAppSuccessfully {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus CPH2487");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability("appPackage", "io.appium.android.apis");
        dc.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        try {
            System.out.println("Attempting to connect to Appium server...");
            AndroidDriver<MobileElement> driver = new AndroidDriver<>(url, dc);
            System.out.println("Connected to Appium server successfully!");

            Thread.sleep(5000);

            driver.quit();
            System.out.println("Driver quit successfully.");
        } catch (Exception e) {
            System.err.println("Failed to connect to Appium server:");
            e.printStackTrace();
        }
    }
}