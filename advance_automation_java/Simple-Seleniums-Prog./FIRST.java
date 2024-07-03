package simple;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIRST {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.facebook.com/");
		try 
		{
			driver.findElement(By.id("email")).sendKeys("aditya@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("aditya");
			driver.findElement(By.name("login")).click();
			//Thread.sleep(5000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//driver.close();
		}
}
