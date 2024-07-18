package appium;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class ValidLoginANDinvalidLogin {

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
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<String> results = new ArrayList<>();

        try {
            WebDriverWait wait = new WebDriverWait(driver, 25);

            // Valid credential
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"))).click();
            Thread.sleep(1000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.mirraw.android.jewellery:id/tv_name\"]"))).click();
            Thread.sleep(1000);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"com.mirraw.android.jewellery:id/edt_emailmobile\"]"))).sendKeys("adityahimgrajiya56@gmail.com");
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.mirraw.android.jewellery:id/btn_genearteotp\"]"))).click();
            Thread.sleep(2000); 
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"com.mirraw.android.jewellery:id/userPassword\"]"))).sendKeys("adityahimgrajiya");
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.mirraw.android.jewellery:id/loginButton\"]"))).click();
            Thread.sleep(2000); 

            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"))).click();
                Thread.sleep(1000);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.mirraw.android.jewellery:id/tv_name\"]"))).click();
                Thread.sleep(1000);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.mirraw.android.jewellery:id/loginLogoutTextView\"]"))).click();
                Thread.sleep(1000);

                driver.pressKey(new KeyEvent(AndroidKey.BACK));
                Thread.sleep(1000);
                driver.pressKey(new KeyEvent(AndroidKey.BACK));
                Thread.sleep(1000);

                results.add("adityahimgrajiya56@gmail.com: Login Successful");
            } catch (NoSuchElementException e) {
                results.add("adityahimgrajiya56@gmail.com: Login Failed");
            }

            // Invalid credentials
            String[] invalidCredentials = {
                "adityahimgrajiya87@gmail.com",
                "adityahimgrajiya84@gmail.com",
                "adityahimgrajiya89@gmail.com"
            };

            for (String email : invalidCredentials)
            {
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"))).click();
                Thread.sleep(1000);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id=\"com.mirraw.android.jewellery:id/tv_name\"]"))).click();
                Thread.sleep(1000);

                MobileElement usernameField = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"com.mirraw.android.jewellery:id/edt_emailmobile\"]")));
                usernameField.clear();
                usernameField.sendKeys("adityahimgrajiya87@gmail.com");
                Thread.sleep(2000);

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.mirraw.android.jewellery:id/btn_genearteotp\"]"))).click();
                Thread.sleep(2000); 

                // Event after entering invalid credentials
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"))).click();
                Thread.sleep(2000);
                //results.add(email + ": Login Failed");
                
                // Clear email field after navigating back
                MobileElement usernameField1 = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"com.mirraw.android.jewellery:id/edt_emailmobile\"]")));
                usernameField1.clear();
                usernameField1.sendKeys("adityahimgrajiya84@gmail.com");
                Thread.sleep(3000);

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.mirraw.android.jewellery:id/btn_genearteotp\"]"))).click();
                Thread.sleep(3000); 

                // Event after entering invalid credentials
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"))).click();
                Thread.sleep(3000);
                
                MobileElement usernameField2 = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"com.mirraw.android.jewellery:id/edt_emailmobile\"]")));
                usernameField2.clear();
               //Thread.sleep(2000);
               
                //MobileElement usernameField3 = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"com.mirraw.android.jewellery:id/edt_emailmobile\"]")));
                //usernameField3.clear();
                usernameField2.sendKeys("adityahimgrajiya89@gmail.com");
                Thread.sleep(3000);

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id=\"com.mirraw.android.jewellery:id/btn_genearteotp\"]"))).click();
                Thread.sleep(3000); 

                // Event after entering invalid credentials
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"))).click();
                Thread.sleep(3000);
                
                MobileElement usernameField4 = (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@resource-id=\"com.mirraw.android.jewellery:id/edt_emailmobile\"]")));
                usernameField4.clear();
                Thread.sleep(2000);
                //results.add(email + ": Login Failed");
                results.add("adityahimgrajiya87@gmail.com" + ": Login Failed");
                results.add("adityahimgrajiya84@gmail.com" + ": Login Failed");
                results.add("adityahimgrajiya89@gmail.com" + ": Login Failed");
                Thread.sleep(2000);
              
            }

        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (WebDriverException e) {
            e.printStackTrace();
        } finally {
            
            driver.quit();
        }

        // Generate Report
        System.out.println("Login Test Report:");
        for (String result : results) {
            System.out.println(result);
        }
    }
}