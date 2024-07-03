package simple;


	import java.io.File;
	import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.privilege.GetSystemPropertyAction;
import ss.Connection;

	public class toolqa {

		public static <webdriver> void main(String[] args) throws InterruptedException 
		{
			
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/");
			
			driver.manage().window().maximize();
			Thread.sleep(1500);
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("E:\\TAimg\\"+imgname+".png");
			
		
				
		           
		try {	
				JavascriptExecutor js= (JavascriptExecutor)driver;
				FileUtils.copyFile(source, dest);
				System.out.println("screenshot taken");
				
				
				js.executeScript("window.scrollBy(0,500)","");
				Thread.sleep(3000);				// Method to scroll window by pixel
			
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
				
				driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();	//Sign Up button xpath
				Thread.sleep(1500);
				
				
				WebDriver driver = Connections.getconnection("https://www.facebook.com/");
				getScreenShot(driver, "err");
				
				
				
				driver.findElement(By.xpath("//*[@id=\"item-1\"]/span")).click();
				Thread.sleep(1500);
				
		}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			//driver.close();
			}

		private static void getScreenShot(WebDriver driver, String string) {
			// TODO Auto-generated method stub
			
		}

	
	}




