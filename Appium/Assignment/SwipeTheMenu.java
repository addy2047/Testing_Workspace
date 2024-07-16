package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class SwipeTheMenu {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus CPH2487");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability("appPackage", "com.androidsample.generalstore");
        dc.setCapability("appActivity", "com.androidsample.generalstore.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver<MobileElement> driver = new AndroidDriver<>(url, dc);
        Thread.sleep(3000);

        // Enter the name
        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("maddy");
        Thread.sleep(2000);

        // Open the country dropdown
        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        Thread.sleep(2000);
        // Scroll to the desired country and select it
        driver.findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"France\"));");

        driver.findElement(By.xpath("//android.widget.TextView[@text='France']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.androidsample.generalstore:id/btnLetsShop\"]")).click();
        Thread.sleep(2000);
        
        driver.findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"PG 3\"));");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[2]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}