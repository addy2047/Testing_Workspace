package javaAssesment;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Q4TestcaseVerification 
{

    public static void main(String[] args)
    {
     	System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            // Load the Excel
        	FileInputStream fis = new FileInputStream("E:\\LoginAssignment.xlsx");
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);

            // Loop through each row in the Excel
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);

                // Read user and pass from the Excel
                String username = getCellValueAsString(row.getCell(0));
                String password = getCellValueAsString(row.getCell(1));

                // Open the URL
                driver.get("http://www.demo.guru99.com/V4/");
                driver.manage().window().maximize();
                Thread.sleep(1500);

                
                WebElement userField = driver.findElement(By.name("uid"));
                userField.sendKeys(username);
                Thread.sleep(1500);
                
                WebElement passwordField = driver.findElement(By.name("password"));
                passwordField.sendKeys(password);
                Thread.sleep(1500);

                WebElement loginButton = driver.findElement(By.name("btnLogin"));
                loginButton.click();
                Thread.sleep(1500);

                try {
                    // Check if login successful
                    if (driver.getTitle().contains("Guru99 Bank Manager HomePage")) {
                        System.out.println("Login successful for user: " + username);
                    } 
                    else 
                    {
                        throw new Exception("Login failed");
                    }
                } 
                catch (Exception e) 
                {
                    if (isAlertPresent(driver))
                    {
                        Alert alert = driver.switchTo().alert();
                        System.out.println("Login failed for user: " + username + ". Alert detected: " + alert.getText());
                        alert.accept();
                    }
                    else 
                    {
                        System.out.println("Login failed for user: " + username);
                    }
                    Thread.sleep(1500);
                    
                    takeScreenshot(driver, "login_failed_" + username);
                }
            }

            // Close the Excel
            workbook.close();
            fis.close();

        }
        catch (IOException | InterruptedException e)
        {
            e.printStackTrace();
        } 
        finally
        {
            
            driver.quit();
        }
    }

    private static String getCellValueAsString(Cell cell)
    {
        switch (cell.getCellType())
        {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf((int) cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            default:
                return "";
        }
    }

    private static void takeScreenshot(WebDriver driver, String fileName)
    {
        try
        {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("E:\\\\TAimg\\\\New folder\\its invalid " + fileName + ".png");
            FileHandler.copy(srcFile, destFile);
            System.out.println("Screenshot saved: " + destFile.getAbsolutePath());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static boolean isAlertPresent(WebDriver driver)
    {
        try
        {
            driver.switchTo().alert();
            return true;
        }
        catch (NoAlertPresentException e)
        {
            return false;
        }
    }
}
