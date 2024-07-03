package simple;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopsCar {


	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("9426289097");
			Thread.sleep(1000);
			
			
			//driver.findElement(By.id("identifierNext")).click();
			//Thread.sleep(1500);
			driver.findElement(By.id("password")).sendKeys("9426289097");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/input")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/div/div/div/ul/li[1]/a")).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,500)","");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/div/div/div/ul/li[2]/a")).click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,500)","");
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/div/div/div/ul/li[3]/a")).click();
			Thread.sleep(1000);	
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	        Thread.sleep(1000);
	        
	        driver.findElement(By.xpath("//*[@id=\"course-dropdown\"]/span")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/ul/div/div/div/ul/li[4]/a")).click();
			Thread.sleep(1000);	
			js.executeScript("window.scrollBy(0,500)","");
			Thread.sleep(2000);
			
			 driver.findElement(By.xpath("//*[@id=\"profileDropdown\"]/span[1]")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[2]/div[1]/ul/li[4]/a")).click();
				Thread.sleep(1000);
				
				//driver.close();
		}

}
