package assignTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginUsingBeforetestAftertestTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
       
    	System.setProperty("webdriver.chrome.driver", "E:\\\\driver\\\\chromedriver-win64\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testFacebookLogin() {
        driver.get("http://www.facebook.com");

        
        WebElement email = driver.findElement(By.id("email"));
        WebElement password = driver.findElement(By.id("pass"));

        email.sendKeys("your_email@example.com");
        password.sendKeys("your_password");
        driver.findElement(By.name("login")).click();

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}

