package assignTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assignQ {

	@Test
	public void testFB()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\driver\\\\chromedriver-win64\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
        driver.get("http://www.facebook.com");

        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("pass"));

        email.sendKeys("your_email@example.com");
        password.sendKeys("your_password");

        driver.findElement(By.name("login")).click();

       // String expectedTitle = "Facebook - Log In or Sign Up";
        //String actualTitle = driver.getTitle();
        //Assert.assertEquals(actualTitle, expectedTitle);
        
        driver.quit();
    }

    }



