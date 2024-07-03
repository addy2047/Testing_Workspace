package newwJunit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverConnction {
			
			public static WebDriver getconnection()
			{
				System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe\\chromedriver.exe");		
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				return driver;
				
			}

}
