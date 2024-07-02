package com.tng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class MyT {

	
	@Parameters("browser")
	@Test
	public void test(String browser)
	{
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
			driver = new ChromeDriver();
		}
//		else if(browser.equals("ff"))
//		{
//			System.setProperty("webdriver.gecko.driver","D:\\BrowserDriver\\geckodriver.exe");
//			driver = new FirefoxDriver();
//		}
		
		driver.get("https://topsint.com/topserp/index.php");
		
	}
}
