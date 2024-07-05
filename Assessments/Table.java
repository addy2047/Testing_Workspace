package javaAssesment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table {

    public static void main(String[] args) throws InterruptedException {
        
    	System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

        
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();
        JavascriptExecutor js= (JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,500)","");
		Thread.sleep(3000);	
		
        try {

        	String nameToEdit = "Cierra";
            editName(driver, nameToEdit, "Addy");
            Thread.sleep(3000);

            String nameToDelete = "Alden";
            deleteName(driver, nameToDelete);
            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            
            driver.quit();
        }
    }

    public static void editName(WebDriver driver, String name, String newName) {
        List<WebElement> rows = driver.findElements(By.cssSelector(".rt-tbody .rt-tr-group"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        boolean found = false;
        for (WebElement row : rows) {
            if (row.getText().contains(name)) {
                WebElement editButton = row.findElement(By.cssSelector("span[title='Edit']"));
                js.executeScript("arguments[0].click();", editButton);
                found = true;
                break;
            }
        }

        if (found) {
            // Edit the name and submit
            WebElement firstNameInput = driver.findElement(By.id("firstName"));
            firstNameInput.clear();
            firstNameInput.sendKeys(newName);

            WebElement submitButton = driver.findElement(By.id("submit"));
            js.executeScript("arguments[0].click();", submitButton);
        } else {
            System.out.println("Name not found for editing: " + name);
        }
    }

    public static void deleteName(WebDriver driver, String name) {
        List<WebElement> rows = driver.findElements(By.cssSelector(".rt-tbody .rt-tr-group"));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        boolean found = false;
        for (WebElement row : rows) {
            if (row.getText().contains(name)) {
                WebElement deleteButton = row.findElement(By.cssSelector("span[title='Delete']"));
                js.executeScript("arguments[0].click();", deleteButton);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Name not found for deleting: " + name);
        }
    }
}
