package module78.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkLocator  
	{

		public static void main(String[] args) throws InterruptedException
		{

			System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.rediff.com/");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Sign in")).click();
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("rediff.com")).click();
			Thread.sleep(1000);
			driver.quit();
		}

}
