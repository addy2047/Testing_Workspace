package newwJunit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class fbloginProcess {
	
	@Test
	 public void test() throws InterruptedException 
	    {
		
	    System.setProperty("webdriver.chrome.driver", "E:\\\\driver\\\\chromedriver-win64\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.findElement(By.id("email")).sendKeys("your_email@example.com");
	     Thread.sleep(2000);
	     driver.findElement(By.id("pass")).sendKeys("your_password");
	     Thread.sleep(2000);
	     driver.findElement(By.linkText("Log in")).click();
	     Thread.sleep(2000);

	        driver.quit();
	        
	    }
}
