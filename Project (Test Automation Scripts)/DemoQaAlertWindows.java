package javaAssesment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class DemoQaAlertWindows 
{
    public static void main(String[] args)
    {
        
    	System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);  // Using long timeOutInSeconds
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);

        try {
          
            driver.get("https://demoqa.com/alertsWindows");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            //Browser Windows
            WebElement browserWindows = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", browserWindows);
            wait.until(ExpectedConditions.elementToBeClickable(browserWindows)).click();
            Thread.sleep(2000);

            // Open new tab and close 
            WebElement newTabButton = driver.findElement(By.id("tabButton"));
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", newTabButton);
            js.executeScript("arguments[0].click();", newTabButton);
            String originalWindow = driver.getWindowHandle();
            Set<String> allWindows = driver.getWindowHandles();
            for (String window : allWindows) {
                if (!window.equals(originalWindow)) {
                    driver.switchTo().window(window);
                    System.out.println("New tab title: " + driver.getTitle());
                    driver.close();
                }
            }
            driver.switchTo().window(originalWindow);
            Thread.sleep(2000);

            // Open new window and close 
            WebElement newWindowButton = driver.findElement(By.id("windowButton"));
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", newWindowButton);
            js.executeScript("arguments[0].click();", newWindowButton);
            allWindows = driver.getWindowHandles();
            for (String window : allWindows) {
                if (!window.equals(originalWindow)) {
                    driver.switchTo().window(window);
                    System.out.println("New window title: " + driver.getTitle());
                    driver.close();
                }
            }
            driver.switchTo().window(originalWindow);
            Thread.sleep(2000);

            //Alerts
            WebElement alerts = driver.findElement(By.xpath("//span[text()='Alerts']"));
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", alerts);
            wait.until(ExpectedConditions.elementToBeClickable(alerts)).click();
            Thread.sleep(2000);

            // Click alert button
            WebElement alertButton = driver.findElement(By.id("alertButton"));
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", alertButton);
            js.executeScript("arguments[0].click();", alertButton);
            wait.until(ExpectedConditions.alertIsPresent());
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            Thread.sleep(2000);

            // Click timer alert button
            WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", timerAlertButton);
            js.executeScript("arguments[0].click();", timerAlertButton);
            wait.until(ExpectedConditions.alertIsPresent());
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            Thread.sleep(2000);

            // Click confirm button
            WebElement confirmButton = driver.findElement(By.id("confirmButton"));
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", confirmButton);
            js.executeScript("arguments[0].click();", confirmButton);
            wait.until(ExpectedConditions.alertIsPresent());
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            Thread.sleep(2000);

            // Click prompt button and enter text
            WebElement promptButton = driver.findElement(By.id("promtButton"));
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", promptButton);
            js.executeScript("arguments[0].click();", promptButton);
            wait.until(ExpectedConditions.alertIsPresent());
            driver.switchTo().alert().sendKeys("Your Name");
            Thread.sleep(2000);
            driver.switchTo().alert().accept();
            Thread.sleep(2000);

            WebElement frames = driver.findElement(By.xpath("//span[text()='Frames']"));
            js.executeScript("arguments[0].scrollIntoView(true);", frames);
            wait.until(ExpectedConditions.elementToBeClickable(frames)).click();
            Thread.sleep(2000);

            // Scroll the main page
            js.executeScript("window.scrollBy(0, 700);");

            driver.switchTo().frame("frame2");
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(0, 250);"); // Scroll down
            Thread.sleep(2000);
            js.executeScript("window.scrollBy(250, 0);"); // Scroll right
            Thread.sleep(2000);
            driver.switchTo().defaultContent();
            Thread.sleep(2000);
            

            //Modal Dialogs
            WebElement modalDialogs = driver.findElement(By.xpath("//span[text()='Modal Dialogs']"));
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", modalDialogs);
            wait.until(ExpectedConditions.elementToBeClickable(modalDialogs)).click();
            Thread.sleep(2000);

            // Open and close small modal
            WebElement smallModalButton = driver.findElement(By.id("showSmallModal"));
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", smallModalButton);
            js.executeScript("arguments[0].click();", smallModalButton);
            WebElement smallModalCloseButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("closeSmallModal")));
            Thread.sleep(2000);
            smallModalCloseButton.click();
            Thread.sleep(2000);

            // Open and close large modal
            WebElement largeModalButton = driver.findElement(By.id("showLargeModal"));
            js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", largeModalButton);
            js.executeScript("arguments[0].click();", largeModalButton);
            WebElement largeModalCloseButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("closeLargeModal")));
            Thread.sleep(2000);
            largeModalCloseButton.click();
            Thread.sleep(2000);
         
            
        } 
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        finally
        {
            driver.quit();
        }
    }
}