package assignTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProviders {

	    private WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        
	    	System.setProperty("webdriver.chrome.driver", "E:\\\\driver\\\\chromedriver-win64\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @DataProvider(name = "loginData")
	    public Object[][] getLoginData() {
	        return new Object[][]{
	            {"valid_email@example.com", "valid_password"},
	            {"invalid_email@example.com", "invalid_password"},
	            {"aditya@gmail.com","password"},
	            {"virajmovaliya031@gmail.com","password"}
	        };
	    }

	    @Test(dataProvider = "loginData")
	    public void testFacebookLogin(String email, String password) throws InterruptedException {
	        driver.get("http://www.facebook.com");

	        WebElement emailField = driver.findElement(By.name("email"));
	        WebElement passwordField = driver.findElement(By.name("pass"));

	        emailField.sendKeys(email);
	        passwordField.sendKeys(password);
	        Thread.sleep(2000);
	        driver.findElement(By.name("login")).click();
	        Thread.sleep(2000);
	    }

	    @AfterTest
	    public void tearDown() throws InterruptedException {
	    	Thread.sleep(2000);
	        driver.quit();
	    }
	}
	

