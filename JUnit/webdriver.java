package test1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {
	
	WebDriver driver=null;
	
	@Before
	public void beforelogin()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Testlogin() throws InterruptedException
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(1500);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		Thread.sleep(1500);
	}
	
	@After
	public void Afterlogin() throws InterruptedException
	{
		Thread.sleep(1500);
		System.out.println("tata");
		driver.close();
		
	}
	
}
