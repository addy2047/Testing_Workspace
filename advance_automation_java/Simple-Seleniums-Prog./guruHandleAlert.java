package simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class guruHandleAlert {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		try 
		{
	
			/* driver.findElement(By.id("firstName")).sendKeys("jay");
			Thread.sleep(1500);
			driver.findElement(By.id("lastName")).sendKeys("patel");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
			Thread.sleep(1500);	// Next button click path */
			
			driver.findElement(By.name("cusid")).sendKeys("jay");
			Thread.sleep(3000);
			
			driver.findElement(By.name("submit")).click();
			Thread.sleep(4000);
			
			driver.switchTo().alert().accept();
			Thread.sleep(4000);					// for ok button in popup alert
			
			//driver.switchTo().alert().dismiss();
			//Thread.sleep(2000);						// for Cancle button in popup alert
			
			driver.switchTo().alert().accept();
			Thread.sleep(4000);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//driver.close();
		}
}

