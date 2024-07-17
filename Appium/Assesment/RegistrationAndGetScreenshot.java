package appium;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class RegistrationAndGetScreenshot {

    public static void main(String[] args) throws InterruptedException, IOException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus CPH2487");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability("appPackage", "com.mirraw.android.jewellery");
        dc.setCapability("appActivity", "com.mirraw.android.ui.activities.SplashActivity");
        dc.setCapability("noReset", true);
        dc.setCapability("fullReset", false);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver<MobileElement> driver = new AndroidDriver<>(url, dc);

        // Set an implicit wait to handle dynamic element loading
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            // Interact with elements using explicit waits
            WebDriverWait wait = new WebDriverWait(driver, 20);
            
            
            
            
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text=\"Homepage\"]"))).click();
            Thread.sleep(1000);  
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"))).click();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.mirraw.android.jewellery:id/menusRecyclerView\"]/android.widget.RelativeLayout"))).click();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ExpandableListView[@resource-id=\"com.mirraw.android.jewellery:id/listView\"]/android.widget.RelativeLayout[2]"))).click();
            Thread.sleep(1000); 
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.mirraw.android.jewellery:id/textTitle\" and @text=\"Necklaces\"]"))).click();
            Thread.sleep(1000);
            driver.findElementByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Pearl Necklace In White\"));");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.mirraw.android.jewellery:id/searchResultTextView\" and @text=\"Pearl Necklace In White\"]"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ToggleButton[@resource-id=\"com.mirraw.android.jewellery:id/img8\"]"))).click();
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
            Thread.sleep(1000);
            
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text=\"Add to Cart\"]"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.RelativeLayout[@resource-id=\"com.mirraw.android.jewellery:id/go_to_cart_LL\"]"))).click();
            Thread.sleep(1000);
            
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.mirraw.android.jewellery:id/placeOrderButton\"]"))).click();
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
            Thread.sleep(1000);
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
            Thread.sleep(1000);
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
            Thread.sleep(1000);
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"))).click();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.mirraw.android.jewellery:id/menuNameTextView\"]"))).click();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.mirraw.android.jewellery:id/tv_name\"]"))).click();
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"com.mirraw.android.jewellery:id/edt_emailmobile\"]"))).sendKeys("adityahimgrajiya56@gmail.com");
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.mirraw.android.jewellery:id/btn_genearteotp\"]"))).click();
            Thread.sleep(2000); 
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"com.mirraw.android.jewellery:id/userPassword\"]"))).sendKeys("adityahimgrajiya");
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"com.mirraw.android.jewellery:id/userConfirmPassword\"]"))).sendKeys("adityahimgrajiya");
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"com.mirraw.android.jewellery:id/userMobileNumber\"]"))).sendKeys("9313877851");
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text=\"REGISTER\"]"))).click();
            Thread.sleep(4000);
            
            getScreenShot(driver, "err");
            
            // Take screenshot after registration
//            TakesScreenshot ts = (TakesScreenshot) driver;
//            File srcFile = ts.getScreenshotAs(OutputType.FILE);
//            File targetFile = new File("registration_success.png");
//            try {
//                Files.copy(srcFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            
            // Take screenshot after registration
//            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            File targetFile = new File("registration_success.png");
//            Files.copy(srcFile.toPath(), targetFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
//
//            System.out.println("Screenshot taken and saved as registration_success.png");

            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"))).click();
            Thread.sleep(1000);
            
            
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.mirraw.android.jewellery:id/menusRecyclerView\"]/android.widget.RelativeLayout"))).click();
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ExpandableListView[@resource-id=\"com.mirraw.android.jewellery:id/listView\"]/android.widget.RelativeLayout[2]"))).click();
            Thread.sleep(1000); 
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.mirraw.android.jewellery:id/textTitle\" and @text=\"Necklaces\"]"))).click();
            Thread.sleep(1000);
            driver.findElementByAndroidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Pearl Necklace In White\"));");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.mirraw.android.jewellery:id/searchResultTextView\" and @text=\"Pearl Necklace In White\"]"))).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ToggleButton[@resource-id=\"com.mirraw.android.jewellery:id/img8\"]"))).click();
            
            Thread.sleep(1000);
            
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text=\"Add to Cart\"]"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.RelativeLayout[@resource-id=\"com.mirraw.android.jewellery:id/go_to_cart_LL\"]"))).click();
            Thread.sleep(1000);
            
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.mirraw.android.jewellery:id/placeOrderButton\"]"))).click();
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
            Thread.sleep(1000);
            
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (WebDriverException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }

	public static void getScreenShot(WebDriver driver, String imgname) {
		
		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("D:\\img\\"+imgname+".png");

		try {
			FileUtils.copyFile(source, dest);
			System.out.println("screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
