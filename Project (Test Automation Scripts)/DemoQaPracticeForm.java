package javaAssesment;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class DemoQaPracticeForm {

	    public static void main(String[] args) throws IOException, InterruptedException 
	    {
	       
	    	System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demoqa.com/automation-practice-form");
	        driver.manage().window().maximize();
	        Thread.sleep(1500);
	        
	        JavascriptExecutor js= (JavascriptExecutor)driver;

			js.executeScript("window.scrollBy(0,500)","");
			Thread.sleep(2000);	
	        
	        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("John");
	        Thread.sleep(1500);
	        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Doe");
	        Thread.sleep(1500);
	        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("johndoe@example.com");
	        Thread.sleep(1500);
	        driver.findElement(By.xpath("//label[text()='Male']")).click();
	        Thread.sleep(1500);
	        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1234567890");
	        
	        js.executeScript("window.scrollBy(0,200)","");
			Thread.sleep(1500);		
	        
	        driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	        Thread.sleep(1500);
	        driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).sendKeys("May");
	        Thread.sleep(1500);
	        driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).sendKeys("1990");
	        Thread.sleep(1500);
	        driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day--015')]")).click();

	        WebElement subjectsInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
	        subjectsInput.sendKeys("Maths");
	        subjectsInput.sendKeys(Keys.ENTER);
	        Thread.sleep(1500);
	        
//	        WebElement subjectsInput = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
//	        Actions actions = new Actions(driver);
//	        actions.sendKeys(subjectsInput, "Maths").sendKeys("\n").perform();
//	        Thread.sleep(1500);
//	        WebElement subject =  driver.findElement(By.id("subjectsContainer"));
//			Actions builder = new Actions(driver);
//			
//			builder.click(subject).sendKeys("Maths").sendKeys(Keys.ENTER).sendKeys("Physics").sendKeys(Keys.ENTER).build().perform();
//			//Connection.getScreenShot(driver, "reg");
	        
	        
	        driver.findElement(By.xpath("//label[text()='Sports']")).click();
	        Thread.sleep(1500);
	        
	        driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("C:\\Users\\AD\\cropped-7680-4320-1091959.jpg");
	        Thread.sleep(1500);
	      
	        driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("123 Main St, Anytown, USA");
	        Thread.sleep(1500);
	        
	        js.executeScript("window.scrollBy(0,200)","");
			Thread.sleep(1500);	
	        
	        Actions actions = new Actions(driver);

	        WebElement stateDropdown = driver.findElement(By.xpath("//div[@id='state']"));
	        actions.moveToElement(stateDropdown).click().perform();
	        Thread.sleep(1500);
	        WebElement stateOption = driver.findElement(By.xpath("//div[text()='NCR']"));
	        actions.moveToElement(stateOption).click().perform();
	        Thread.sleep(1500);
	        
	        WebElement cityDropdown = driver.findElement(By.xpath("//div[@id='city']"));
	        actions.moveToElement(cityDropdown).click().perform();
	        Thread.sleep(1500);
	        WebElement cityOption = driver.findElement(By.xpath("//div[text()='Delhi']"));
	        actions.moveToElement(cityOption).click().perform();
	        Thread.sleep(1500);
	        
	        
	        
	        
	        TakesScreenshot screenshot = (TakesScreenshot) driver;
	        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

	        String baseName = "screenshot";
	        String extension = ".png";
	        Path destFile;
	        int counter = 0;

	        do {
	            counter++;
	            destFile = Path.of("E:\\TAimg\\New folder", baseName + (counter > 1 ? "_" + counter : "") + extension);
	        } while (Files.exists(destFile));

	        Files.copy(srcFile.toPath(), destFile, StandardCopyOption.REPLACE_EXISTING);

	        
//	        TakesScreenshot screenshot = ((TakesScreenshot) driver);
//	        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
//	        File destFile = new File("E:\\TAimg\"+imgname+\".jpg");
//	        FileUtils.copyFile(srcFile, destFile);

	        
	        driver.findElement(By.xpath("//button[@id='submit']")).click();
	        Thread.sleep(1500);
	        js.executeScript("window.scrollBy(0,200)","");
			Thread.sleep(1500);		
	        
//	        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	        String basePath = "E:\\TAimg\\DemoQA";
//	        String extension = ".png";
//	        int counter = 1;
//	        File destFile = new File(basePath + extension);
//	        while (destFile.exists()) {
//	            destFile = new File(basePath + "_" + counter++ + extension);
//	        }
//	        FileUtils.copyFile(srcFile, destFile);
	        
	        
	       driver.quit();
	    }
	}

