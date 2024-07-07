package javaAssesment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Set;

public class DemoQAFirstModuleTest {
    public static void main(String[] args) throws InterruptedException {
        
    	System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        
        driver.get("https://demoqa.com/elements");
        Thread.sleep(2000);

        // Test Text Box
        testTextBox(driver);

        
        testCheckBox(driver);

        
        testRadioButton(driver);

        
        testWebTables(driver);

        
        testButtons(driver);

        
        testLinks(driver);

        
        testBrokenLinksAndImages(driver);

        
        testUploadDownload(driver);

        
        testDynamicProperties(driver);

        driver.quit();
    }

    private static void testTextBox(WebDriver driver) throws InterruptedException {
        clickElement(driver, By.xpath("//span[text()='Text Box']"));
        Thread.sleep(1500);

        WebElement fullName = driver.findElement(By.id("userName"));
        scrollToElement(driver, fullName);
        fullName.sendKeys("Addy Patel");
        Thread.sleep(1500);

        WebElement email = driver.findElement(By.id("userEmail"));
        scrollToElement(driver, email);
        email.sendKeys("addypatel@gmail.com");
        Thread.sleep(2000);

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        scrollToElement(driver, currentAddress);
        currentAddress.sendKeys("24 Main St, Jamnagar");
        Thread.sleep(1500);

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        scrollToElement(driver, permanentAddress);
        permanentAddress.sendKeys("47 Elm St, Rajkot");
        Thread.sleep(1500);

        WebElement submitButton = driver.findElement(By.id("submit"));
        scrollToElement(driver, submitButton);
        clickElement(driver, submitButton);
        Thread.sleep(1500);

        driver.navigate().back();
        Thread.sleep(1500);
    }

    private static void testCheckBox(WebDriver driver) throws InterruptedException {
        clickElement(driver, By.xpath("//span[text()='Check Box']"));
        Thread.sleep(1500);

        // Click all dropdown arrows
        List<WebElement> dropDownArrows = driver.findElements(By.xpath("//button[@class='rct-collapse rct-collapse-btn']"));
        for (WebElement arrow : dropDownArrows) {
            scrollToElement(driver, arrow);
            clickElement(driver, arrow);
            Thread.sleep(1500);
        }
//        List<WebElement> dropDownArrow = driver.findElements(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/button/svg/path"));
//        for (WebElement arrow : dropDownArrow) {
//            scrollToElement(driver, arrow);
//            clickElement(driver, arrow);
//            Thread.sleep(1500);}

        // Click all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//span[@class='rct-checkbox']"));
        for (WebElement checkbox : checkboxes) {
            scrollToElement(driver, checkbox);
            clickElement(driver, checkbox);
            Thread.sleep(1500);
        }
        
        
        driver.navigate().back();
        Thread.sleep(1500);
    }

    private static void testRadioButton(WebDriver driver) throws InterruptedException {
        clickElement(driver, By.xpath("//span[text()='Radio Button']"));
        Thread.sleep(1500);

        WebElement yesRadioButton = driver.findElement(By.xpath("//label[text()='Yes']"));
        scrollToElement(driver, yesRadioButton);
        clickElement(driver, yesRadioButton);
        Thread.sleep(1500);

        WebElement impressiveRadioButton = driver.findElement(By.xpath("//label[text()='Impressive']"));
        scrollToElement(driver, impressiveRadioButton);
        clickElement(driver, impressiveRadioButton);
        Thread.sleep(1500);

        driver.navigate().back();
        Thread.sleep(1500);
    }

    private static void testWebTables(WebDriver driver) throws InterruptedException {
        clickElement(driver, By.xpath("//span[text()='Web Tables']"));
        Thread.sleep(1500);

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        scrollToElement(driver, addButton);
        clickElement(driver, addButton);
        Thread.sleep(1500);

        WebElement firstName = driver.findElement(By.id("firstName"));
        scrollToElement(driver, firstName);
        firstName.sendKeys("Addy");
        Thread.sleep(1500);

        WebElement lastName = driver.findElement(By.id("lastName"));
        scrollToElement(driver, lastName);
        lastName.sendKeys("Patel");
        Thread.sleep(1500);

        WebElement email = driver.findElement(By.id("userEmail"));
        scrollToElement(driver, email);
        email.sendKeys("addypatel@gmail.com");
        Thread.sleep(1500);

        WebElement age = driver.findElement(By.id("age"));
        scrollToElement(driver, age);
        age.sendKeys("20");
        Thread.sleep(1500);

        WebElement salary = driver.findElement(By.id("salary"));
        scrollToElement(driver, salary);
        salary.sendKeys("1999999");
        Thread.sleep(1500);

        WebElement department = driver.findElement(By.id("department"));
        scrollToElement(driver, department);
        department.sendKeys("IT");
        Thread.sleep(1500);

        WebElement submitButton = driver.findElement(By.id("submit"));
        scrollToElement(driver, submitButton);
        clickElement(driver, submitButton);
        Thread.sleep(1500);

//        WebElement searchBox = driver.findElement(By.id("searchBox"));
//        scrollToElement(driver, searchBox);
//        searchBox.sendKeys("John");
//        Thread.sleep(2000);

        WebElement editButton = driver.findElement(By.id("edit-record-1"));
        scrollToElement(driver, editButton);
        clickElement(driver, editButton);
        Thread.sleep(1500);

        WebElement editAge = driver.findElement(By.id("age"));
        scrollToElement(driver, editAge);
        editAge.clear();
        editAge.sendKeys("25");
        WebElement submitEditButton = driver.findElement(By.id("submit"));
        scrollToElement(driver, submitEditButton);
        clickElement(driver, submitEditButton);
        Thread.sleep(1500);

        WebElement deleteButton = driver.findElement(By.id("delete-record-1"));
        scrollToElement(driver, deleteButton);
        clickElement(driver, deleteButton);
        Thread.sleep(1500);

        WebElement rowDropdown = driver.findElement(By.xpath("//select"));
        scrollToElement(driver, rowDropdown);
        clickElement(driver, rowDropdown.findElement(By.xpath("//option[text()='5 rows']")));
        Thread.sleep(1500);
       
        WebElement searchBox = driver.findElement(By.id("searchBox"));
      scrollToElement(driver, searchBox);
      searchBox.sendKeys("Addy");
      Thread.sleep(2000);
      
        driver.navigate().back();
        Thread.sleep(1500);
    }

    private static void testButtons(WebDriver driver) throws InterruptedException {
        clickElement(driver, By.xpath("//span[text()='Buttons']"));
        Thread.sleep(1500);

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        scrollToElement(driver, doubleClickButton);
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleClickButton).perform();
        Thread.sleep(1500);

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        scrollToElement(driver, rightClickButton);
        actions.contextClick(rightClickButton).perform();
        Thread.sleep(1500);

        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        scrollToElement(driver, clickMeButton);
        clickElement(driver, clickMeButton);
        Thread.sleep(1500);

        driver.navigate().back();
        Thread.sleep(1500);
    }

    private static void testLinks(WebDriver driver) throws InterruptedException {
        clickElement(driver, By.xpath("//span[text()='Links']"));
        Thread.sleep(1500);

        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (int i = 0; i < links.size(); i++) {
            WebElement link = links.get(i);
            String href = link.getAttribute("href");
            if (href != null && !href.isEmpty()) {
                scrollToElement(driver, link);
                clickElement(driver, link);
                Thread.sleep(1500);

                Set<String> windowHandles = driver.getWindowHandles();
                if (windowHandles.size() > 1) {
                    for (String handle : windowHandles) {
                        driver.switchTo().window(handle);
                    }
                    Thread.sleep(1500);
                    driver.close();
                    driver.switchTo().window(driver.getWindowHandles().iterator().next());
                }

                // Re-fetch the list to avoid StaleElementReferenceException
                links = driver.findElements(By.tagName("a"));
            }
        }

        driver.navigate().back();
        Thread.sleep(1500);
    }

    private static void testBrokenLinksAndImages(WebDriver driver) throws InterruptedException {
        clickElement(driver, By.xpath("//span[text()='Broken Links - Images']"));
        Thread.sleep(1500);

        // Check for broken images
        List<WebElement> images = driver.findElements(By.tagName("img"));
        for (WebElement img : images) {
            String src = img.getAttribute("src");
            if (src != null && !src.isEmpty()) {
                scrollToElement(driver, img);
                if (getResponseCode(src) != 200) {
                    System.out.println("Broken Image: " + src);
                } else {
                    System.out.println("Valid Image: " + src);
                }
                Thread.sleep(1500);
            }
        }

        // Check for broken links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            String href = link.getAttribute("href");
            if (href != null && !href.isEmpty()) {
                scrollToElement(driver, link);
                if (getResponseCode(href) != 200) {
                    System.out.println("Broken Link: " + href);
                } else {
                    System.out.println("Valid Link: " + href);
                
                }
                Thread.sleep(1500);
            }
        }

        driver.navigate().back();
        Thread.sleep(1500);
    }


private static void testUploadDownload(WebDriver driver) throws InterruptedException {
    clickElement(driver, By.xpath("//span[text()='Upload and Download']"));
    Thread.sleep(1500);

    WebElement uploadButton = driver.findElement(By.id("uploadFile"));
    scrollToElement(driver, uploadButton);
    uploadButton.sendKeys("C:\\Users\\AD\\Downloads\\sampleFile.jpeg"); // Replace with your file path
    Thread.sleep(1500);
    uploadButton.sendKeys("C:\\Users\\AD\\Downloads\\Projects.pdf"); // Replace with your file path
    Thread.sleep(1500);
    uploadButton.sendKeys("C:\\Users\\AD\\Downloads\\Module 5.docx"); // Replace with your file path
    Thread.sleep(1500);

    
    WebElement downloadButton = driver.findElement(By.id("downloadButton"));
    scrollToElement(driver, downloadButton);
    clickElement(driver, downloadButton);
    Thread.sleep(1500);

    driver.navigate().back();
    Thread.sleep(1500);
}

private static void testDynamicProperties(WebDriver driver) throws InterruptedException {
	Thread.sleep(6000);
	clickElement(driver, By.xpath("//span[text()='Dynamic Properties']"));
    Thread.sleep(3000);

    WebElement enableButton = driver.findElement(By.id("enableAfter"));
    scrollToElement(driver, enableButton);
    clickElement(driver, enableButton);
    Thread.sleep(6000);

    driver.navigate().back();
    Thread.sleep(1500);
}

// Helper methods (clickElement, scrollToElement, getResponseCode) implementation here...

private static void clickElement(WebDriver driver, By by) {
    WebElement element = driver.findElement(by);
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
}

private static void clickElement(WebDriver driver, WebElement element) {
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
}

private static void scrollToElement(WebDriver driver, WebElement element) {
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
}

private static int getResponseCode(String url) {
    try {
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("HEAD");
        connection.connect();
        return connection.getResponseCode();
    } catch (Exception e) {
        return 0;
    }
}
}