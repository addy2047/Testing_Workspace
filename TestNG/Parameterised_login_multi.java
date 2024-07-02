package com.tng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class Parameterised_login_multi {
	
	
	static WebDriver driver;
	@BeforeClass
	public static void openBrowser()
	{
		driver = Dconnection.connect("E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://www.facebook.com/");
	}
	
	@Test(dataProvider = "dp")
	public void logintest(String email, String pass) throws InterruptedException
	{
		WebElement username =  driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys(email);
		Thread.sleep(2000);
		WebElement password =  driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys(pass);
		Thread.sleep(2000);
	}
	
	@DataProvider(name="dp")
	public static Object[][] data() 
	{
		Object obj[][] = new Object[3][2];
		
		obj[0][0] = "tops@gmail.com";
		obj[0][1] = "tops123";
		
		obj[1][0] = "abc@gmail.com";
		obj[1][1] = "tops124";
		
		obj[2][0] = "xyz@gmail.com";
		obj[2][1] = "tops125";
		
		return obj;
	}
}
