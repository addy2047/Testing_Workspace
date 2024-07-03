package simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		try 
		{
		
		
			WebElement RadioButton = driver.findElement(By.name("webform"));
			RadioButton.click();				// to click on radiobutton 
			Thread.sleep(2000);
			WebElement RadioButton1 = driver.findElement(By.id("vfb-7-2"));
			RadioButton1.click();				// to click on radiobutton 
			Thread.sleep(2000);
			WebElement RadioButton2 = driver.findElement(By.id("vfb-7-3"));
			RadioButton2.click();				// to click on radiobutton 
			Thread.sleep(2000);
			
			/* WebElement CheckBox = driver.findElement(By.id("vfb-6-0"));
			CheckBox.click();				// to click on CheckBox 
			Thread.sleep(2000);
			WebElement CheckBox1 = driver.findElement(By.id("vfb-6-1"));
			CheckBox1.click();				// to click on CheckBox 
			Thread.sleep(2000);
			WebElement CheckBox2 = driver.findElement(By.id("vfb-6-2"));
			CheckBox2.click();				// to click on CheckBox 
			Thread.sleep(2000); */
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//driver.close();
		}
}



