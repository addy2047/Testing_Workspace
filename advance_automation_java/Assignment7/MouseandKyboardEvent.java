package module78.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseandKyboardEvent {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		//Thread.sleep(2000);
		Actions actions = new Actions(driver);
		 WebElement blogsMenu = driver.findElement(By.id("blogsmenu"));
		 
		 WebElement SeleniumByArunOption = driver.findElement(By.xpath("//a/span[text()='SeleniumByArun']"));
		 Thread.sleep(2000);
		actions.moveToElement(blogsMenu).moveToElement(SeleniumByArunOption).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		driver.quit();
		 Thread.sleep(2000);
	}
	
}
