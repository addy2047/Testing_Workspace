package simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoFB {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		//System.out.println("first page"+driver.getTitle());
		//Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL + "t");
		// driver.switchTo().window(WindowType.TAB);
		Thread.sleep(4000);
		// driver.navigate().to("https://static.xx.fbcdn.net/rsrc.php/yI/r/4aAhOWlwaXf.svg");
		
		 driver.get("https://static.xx.fbcdn.net/rsrc.php/yI/r/4aAhOWlwaXf.svg");
		//System.out.println("second tab"+driver.getTitle());
		
		
		//Set <String> windowHandles= driver.getWindowHandles();
		//List <String> handle = new ArrayList<String>();
		//handle.addAll(windowHandles);
		//Thread.sleep(2000);
	//driver.close();
		
}
}
