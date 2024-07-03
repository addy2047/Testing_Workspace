package simple;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginGmail {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?hl=en-GB&ifkv=AVQVeyz5QFWklPe3WP0yUxgVecdOmATWDjixgd6W1dYVqLRjFSkhTKLanb5Rjj6UHtxC9TvzkB--KQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1544484048%3A1697702416311893&theme=glif");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		try 
		{
			driver.findElement(By.id("identifierId")).sendKeys("adityapatelVS2080@gmail.com");
			Thread.sleep(1500);
			
			
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(1500);
			driver.findElement(By.name("Passwd")).sendKeys("#ADityapatelVS2080");
			Thread.sleep(1500);
			driver.findElement(By.id("passwordNext")).click();
			Thread.sleep(1500);
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//driver.close();
		}
}