package simple;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleAlert {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		try 
		{
	
			JavascriptExecutor js= (JavascriptExecutor)driver;

			js.executeScript("window.scrollBy(0,300)","");
			Thread.sleep(4000);				// Method to scroll window by pixel
			
			/* driver.findElement(By.id("firstName")).sendKeys("jay");
			Thread.sleep(1500);
			driver.findElement(By.id("lastName")).sendKeys("patel");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")).click();
			Thread.sleep(1500);	// Next button click path */
			
			driver.findElement(By.id("alertButton")).click();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			Thread.sleep(4000);					// for ok button in popup alert
			
			
			driver.findElement(By.id("timerAlertButton")).click();
			Thread.sleep(7000);
			
			driver.switchTo().alert().accept();
			Thread.sleep(4000);					// for ok button in popup alert
			
			driver.findElement(By.id("confirmButton")).click();
			Thread.sleep(7000);
			
			//driver.switchTo().alert().dismiss();
			//Thread.sleep(2000);						// for Cancle button in popup alert
			
			driver.switchTo().alert().accept();
			Thread.sleep(4000);
			
			driver.findElement(By.id("promtButton")).click();
			Thread.sleep(4000);
			
			Alert alertwindow=driver.switchTo().alert();
			System.out.println("Nik alert:"+alertwindow.getText());
			alertwindow.sendKeys("jay");
			Thread.sleep(2000);	
			
			alertwindow.accept();
			//driver.switchTo().alert().dismiss();
			//Thread.sleep(2000);	
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//driver.close();
		}



}
