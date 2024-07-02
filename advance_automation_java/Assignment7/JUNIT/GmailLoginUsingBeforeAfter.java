package test1;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class GmailLoginUsingBeforeAfter {	
		
		WebDriver driver=null;
		
		@Before
		public void beforelogin()
		{
			System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");		
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/login.php/");
			driver.manage().window().maximize();
		}
		
		@Test
		public void Testlogin() throws InterruptedException
		{
			driver.findElement(By.id("email")).sendKeys("adityahingrajiya7@gmail.com");
			Thread.sleep(1500);
			driver.findElement(By.id("pass")).sendKeys("secret_sauce");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
			Thread.sleep(1500);
			
			//driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
			//Thread.sleep(1500);
			//driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
			//Thread.sleep(1500);
		}
		
		@After
		public void Afterlogin() throws InterruptedException
		{
			Thread.sleep(1500);
			System.out.println("Faild");
			driver.close();
			
		}

}
