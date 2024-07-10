package javaAssesment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DemoQaWedgits
{

    public static void main(String[] args) 
    {
    	System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/widgets");

        WebDriverWait wait = new WebDriverWait(driver, 20);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Actions actions = new Actions(driver);
        try {
        // Scroll down
        js.executeScript("window.scrollBy(0,400)");

        // Click on the "Accordian" category
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Accordian']"))).click();

        
        WebElement section2Heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='section2Heading']")));
        js.executeScript("arguments[0].click();", section2Heading);
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1500);
        
        WebElement section3Heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='section3Heading']")));
        js.executeScript("arguments[0].click();", section3Heading);
        Thread.sleep(1500);

        // Test Auto Complete
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("window.scrollBy(0,150)");
        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Auto Complete']"))).click();
        Thread.sleep(1500);
        WebElement multipleColorInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='autoCompleteMultipleInput']")));
        multipleColorInput.sendKeys("Red,");
        Thread.sleep(500);
        multipleColorInput.sendKeys("Blue,");
        Thread.sleep(500);
        multipleColorInput.sendKeys("Green,");
        Thread.sleep(500);
        multipleColorInput.sendKeys("Yellow");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,100)");
        Thread.sleep(1500);
        WebElement singleColorInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='autoCompleteSingleInput']")));
        singleColorInput.sendKeys("R"); // you have to click color suggestion drop down by Manually
        Thread.sleep(4000);
        
//        // Handle the Date Picker category
//      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Date Picker']"))).click();
 //       js.executeScript("window.scrollBy(0,200)");
//      Thread.sleep(2000);
//        WebElement dateInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='datePickerMonthYearInput']")));
//        dateInput.click();
//        dateInput.sendKeys("07/09/2024");
//        js.executeScript("window.scrollBy(0,300)");
//        Thread.sleep(2000);
//        WebElement dateTimeInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='dateAndTimePickerInput']")));
//        dateTimeInput.click();
//        Thread.sleep(2000);
//        dateTimeInput.sendKeys("July 9, 2024 10:15 PM");
//        Thread.sleep(2000);

         // Test Slider
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Slider']"))).click();
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1500);
        WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='range-slider range-slider--primary']")));
        Thread.sleep(1500);
        actions.dragAndDropBy(slider, 67, 0).perform();
        Thread.sleep(4000);
//
//        // Test Progress Bar
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Progress Bar']"))).click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,250)");
        Thread.sleep(1500);
        WebElement startButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='startStopButton']")));
        startButton.click();
        wait.until(ExpectedConditions.attributeToBe(By.xpath("//div[@class='progress-bar bg-success']"), "style", "width: 100%;"));
        Thread.sleep(4000);
//
//        // Test Tabs
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(4000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Tabs']"))).click();
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='demo-tab-origin']"))).click();
        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='demo-tab-use']"))).click();
        Thread.sleep(2000);
//
//        // Test Tool Tips
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Tool Tips']"))).click();
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1500);
        WebElement hoverButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='toolTipButton']")));
        actions.moveToElement(hoverButton).perform();
        Thread.sleep(1500);
        WebElement hoverTextField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='toolTipTextField']")));
        actions.moveToElement(hoverTextField).click().perform();
        Thread.sleep(1500);;
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1500);
        WebElement hoverContrary = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Contrary']")));
        actions.moveToElement(hoverContrary).perform();
        Thread.sleep(2000);
//
//        // Test Menu
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1500);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Menu']"))).click();
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0,300)");
        Thread.sleep(1500);
        WebElement mainItem1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Main Item 1']")));
        actions.moveToElement(mainItem1).perform();
        Thread.sleep(1500);
        WebElement mainItem2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Main Item 2']")));
        actions.moveToElement(mainItem2).perform();
        
        Thread.sleep(1500);
        WebElement subSubList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='SUB SUB LIST »']")));
        actions.moveToElement(subSubList).perform();
        Thread.sleep(1500);
        WebElement mainItem3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Main Item 3']")));
        actions.moveToElement(mainItem3).perform();
        Thread.sleep(1500);

        // Test Select Menu
         js.executeScript("window.scrollBy(0,400)");
         Thread.sleep(2000);
         js.executeScript("window.scrollBy(0,300)");
         Thread.sleep(4000);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Menu']"))).click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,400)");
        Thread.sleep(4000);

        WebElement selectValueDropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='withOptGroup']")));
        selectValueDropDown.click();
   
        Thread.sleep(3000);
//        WebElement optionGroup2Option2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Group 2, option 2']")));
//        optionGroup2Option2.click();
//        Thread.sleep(4000);
        WebElement selectOneDropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='selectOne']")));
        selectOneDropDown.click();
        Thread.sleep(3000);
//        WebElement mrOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Mr.']")));
//        mrOption.click();
//        Thread.sleep(2000);
        Select oldStyleSelect = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='oldSelectMenu']"))));
        oldStyleSelect.selectByVisibleText("Aqua");
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(2000);

        WebElement multiSelectDropDown = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='cars']")));
        Select multiSelect = new Select(multiSelectDropDown);
        multiSelect.selectByVisibleText("Volvo");
        multiSelect.selectByVisibleText("Opel");
        Thread.sleep(2000);
    
    } catch (InterruptedException e) {
        e.printStackTrace();
    } finally 
        {
        
        driver.quit();
        }
    }
}
    
