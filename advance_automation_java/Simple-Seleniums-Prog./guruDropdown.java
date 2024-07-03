package simple;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class guruDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		try 
		{
			JavascriptExecutor js= (JavascriptExecutor)driver;

			js.executeScript("window.scrollBy(0,700)","");
			Thread.sleep(4000);				// Method to scroll window by pixel
			
		
			WebElement drpCountryEle=driver.findElement(By.name("country"));
			Select drpCountry=new Select(drpCountryEle);
			
			drpCountry.selectByVisibleText("UNITED STATES");	// select dropdown by Text
			//drpMonth.selectByValue("4");				// select dropdown by value
			//drpMonth.selectByIndex(3);					// select dropdown by Index
			Thread.sleep(1500);
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//driver.close();
		}
}



