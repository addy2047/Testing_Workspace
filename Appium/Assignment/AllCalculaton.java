package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AllCalculaton {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability("appPackage", "com.google.android.calculator");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");

        AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);

        Thread.sleep(4000);

        // Addition
        driver.findElement(By.id("com.google.android.calculator:id/digit_5")).click();
        driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        Thread.sleep(2000);

        String result = driver.findElement(By.id("com.google.android.calculator:id/result")).getText();

        if (result.equals("8")) {
            System.out.println("Addition result is correct.");
        } else {
            System.out.println("Addition result is incorrect.");
        }

        Thread.sleep(2000);

        // Subtraction
        driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        Thread.sleep(2000);

        result = driver.findElement(By.id("com.google.android.calculator:id/result")).getText();

        if (result.equals("6")) {
            System.out.println("Subtraction result is correct.");
        } else {
            System.out.println("Subtraction result is incorrect.");
        }

        Thread.sleep(2000);

        // Multiplication
        driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_3")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        Thread.sleep(2000);

        result = driver.findElement(By.id("com.google.android.calculator:id/result")).getText();

        if (result.equals("18")) {
            System.out.println("Multiplication result is correct.");
        } else {
            System.out.println("Multiplication result is incorrect.");
        }

        Thread.sleep(2000);

        // Division
        driver.findElement(By.id("com.google.android.calculator:id/op_div")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
        Thread.sleep(2000);

        result = driver.findElement(By.id("com.google.android.calculator:id/result")).getText();

        if (result.equals("9")) {
            System.out.println("Division result is correct.");
        } else {
            System.out.println("Division result is incorrect.");
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
