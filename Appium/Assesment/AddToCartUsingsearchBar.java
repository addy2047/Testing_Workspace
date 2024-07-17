package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class AddToCartUsingsearchBar {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus CPH2487");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability("appPackage", "com.mirraw.android.jewellery");
        dc.setCapability("appActivity", "com.mirraw.android.ui.activities.SplashActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver<MobileElement> driver = new AndroidDriver<>(url, dc);

        // Define a FluentWait
        Wait<AndroidDriver<MobileElement>> wait = new FluentWait<>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(2, TimeUnit.SECONDS)
                .ignoring(Exception.class);

        
        WebElement firstImageView = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//android.widget.ImageView[@resource-id=\"com.mirraw.android.jewellery:id/img_view\"])[1]")));
        firstImageView.click();
        Thread.sleep(1000);
        
        WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"com.mirraw.android.jewellery:id/search_src_text\"]")));
        searchBar.sendKeys("Diamond");
        driver.pressKey(new KeyEvent(AndroidKey.ENTER)); 
        Thread.sleep(1000);
       
        WebElement searchResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.mirraw.android.jewellery:id/searchResultTextView\" and @text=\"Gold Plated American  Diamonds Necklace  Sets For Women\"]")));
        searchResult.click();
        Thread.sleep(1000);
        
        WebElement addToCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text=\"Add to Cart\"]")));
        addToCartButton.click();
        Thread.sleep(1000);
       
        WebElement goToCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.RelativeLayout[@resource-id=\"com.mirraw.android.jewellery:id/go_to_cart_LL\"]")));
        goToCartButton.click();
        Thread.sleep(1000);
       
        WebElement placeOrderButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.mirraw.android.jewellery:id/placeOrderButton\"]")));
        placeOrderButton.click();
        Thread.sleep(1000);
       
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        Thread.sleep(1000);
     
        driver.quit();
    }
}