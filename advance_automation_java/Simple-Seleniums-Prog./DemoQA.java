package simple;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1500);
	
		
			try
			{
				JavascriptExecutor js= (JavascriptExecutor)driver;

				js.executeScript("window.scrollBy(0,500)","");
				Thread.sleep(3000);				// Method to scroll window by pixel
				
				//	WebElement flag=driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]"));
				//	js.executeScript("arguments[0].DemoQAIntoView();",flag);			// Second Method To Scroll down the page by its Element
		
			
				driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]")).click();
				Thread.sleep(1500);
				
				js.executeScript("window.scrollBy(0,200)","");
				Thread.sleep(1500);				// Method to scroll window by pixel
				
				driver.findElement(By.id("item-0")).click();
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,300)","");
				Thread.sleep(1500);				// Method to scroll window by pixel
				
				driver.findElement(By.id("userName")).sendKeys("aditya");
				Thread.sleep(1500);
				driver.findElement(By.id("userEmail")).sendKeys("aditya@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.id("currentAddress")).sendKeys("EveryWhere*&^%$#@!()_+-=0987654321");
				Thread.sleep(1500);
				driver.findElement(By.id("permanentAddress")).sendKeys("EveryWhere*&^%$#@!()_+-=0987654321");
				Thread.sleep(1500);
				
				driver.findElement(By.xpath("//button[@id='submit']")).submit();	//Sign Up button xpath
				  			
				//signUp.click(); //
				Thread.sleep(1500);
				
				driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]")).click();
					Thread.sleep(1000);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			driver.close();
		
		}
}
	



