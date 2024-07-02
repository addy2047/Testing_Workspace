package com.tng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class MyTest2 {

	
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
		else if(browser.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver","E:\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(browser.equals("opera"))
		{
			System.setProperty("webdriver.opera.driver","E:\\TEST\\operadriver.exe");
			driver = new OperaDriver();
			System.out.println("Executed");
		}
		System.out.println("Executed2");
		driver.get("https://topsint.com/topserp/index.php");
		
	}
}
