package javaAssesment;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DemoQaLastModule {
    public static void main(String[] args) throws InterruptedException {
        
    	System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        try {
           
            driver.get("https://demoqa.com/login");
            driver.manage().window().maximize();

           
            WebElement newUserButton = driver.findElement(By.id("newUser"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newUserButton);
            Thread.sleep(2000);

            // Click on the New User button to avoid overlays
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", newUserButton);
            Thread.sleep(2000);

           
            driver.findElement(By.id("firstname")).sendKeys("John");
            driver.findElement(By.id("lastname")).sendKeys("Doe");
            driver.findElement(By.id("userName")).sendKeys("johndoe");
            driver.findElement(By.id("password")).sendKeys("Password@123");

          
            Thread.sleep(11000); // Sleep for 10 seconds to manually solve the captcha

       
            WebElement registerButton = driver.findElement(By.id("register"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", registerButton);
            Thread.sleep(2000);

//            // Handle alert 
//            Alert alert = driver.switchTo().alert();
//            alert.accept();
//            Thread.sleep(2000);

            
            WebElement backToLoginButton = driver.findElement(By.id("gotologin"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", backToLoginButton);
            Thread.sleep(2000);

            // Scroll down 
            WebElement loginButton = driver.findElement(By.id("login"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", loginButton);
            Thread.sleep(2000);

            // Log in 
            driver.findElement(By.id("userName")).sendKeys("johndoe");
            driver.findElement(By.id("password")).sendKeys("Password@123");
            Thread.sleep(2000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", loginButton);
            Thread.sleep(2000);           

            // Log out
            WebElement logoutButton = driver.findElement(By.id("submit"));
            Thread.sleep(2000);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", logoutButton);
            Thread.sleep(2000);

            // Book Store category
            WebElement bookStoreButton = driver.findElement(By.xpath("//span[text()='Book Store']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", bookStoreButton);
            Thread.sleep(2000);

            
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
            Thread.sleep(2000);

            // Search for "Java" 
            driver.findElement(By.id("searchBox")).sendKeys("Java");
            Thread.sleep(2000);

////            // Go to the Book Store API category
////            WebElement bookStoreAPIButton = driver.findElement(By.xpath("//span[text()='Book Store API']"));
////            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", bookStoreAPIButton);
////            Thread.sleep(2000);
////
////            // Click on every dropdown and scroll to the end
////            for (WebElement element : driver.findElements(By.className("element-group"))) {
////                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
////                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
////                Thread.sleep(2000);
//            }
         //Book Store API category
            WebElement bookStoreAPIButton = driver.findElement(By.xpath("//span[text()='Book Store API']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", bookStoreAPIButton);
            Thread.sleep(2000);

            
            driver.navigate().to("https://demoqa.com/swagger/");
            Thread.sleep(2000);
            
            JavascriptExecutor js= (JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,100)","");
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,100)","");
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,100)","");
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,100)","");
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,100)","");
            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0,100)","");
            // Scroll to the end of the page using JavaScript
//            long lastHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
//
//            while (true) {
//                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
//                Thread.sleep(2000);
//
//                long newHeight = (long) ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
//                if (newHeight == lastHeight) {
//                    break;
//                }
//                lastHeight = newHeight;
//            }

            // Click on every dropdown
            for (WebElement element : driver.findElements(By.className("opblock-summary"))) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
                Thread.sleep(2000);
            }
            
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}