package javaAssesment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintDynamicWebTable {

    public static void main(String[] args) throws InterruptedException {
        
    	System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");


        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        Thread.sleep(3000);
        
        try {
           
            Thread.sleep(2000); // Adding sleep to see the process

            // Print the entire dynamic table
            List<WebElement> rows = driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr"));
            System.out.println("Entire dynamic table:");
            for (WebElement row : rows) {
                List<WebElement> columns = row.findElements(By.tagName("td"));
                for (WebElement column : columns) {
                    System.out.print(column.getText() + " ");
                }
                System.out.println();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
