package simple;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		try 
		{
			/*driver.findElement(By.id("email")).sendKeys("aditya@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("aditya");
			driver.findElement(By.signin2("signin2")).click();*/
			
			WebElement searchsignin2 = driver.findElement(By.id("signin2"));
			searchsignin2.click();    //  " SECOND METHOD "
			
			Thread.sleep(2000);
			driver.findElement(By.id("sign-username")).sendKeys("aditya@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("sign-password")).sendKeys("aditya");
			Thread.sleep(2000);
			//WebElement signUp = 
					driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();	//Sign Up button xpath
					//button[@class='btn btn-primary' and @onclick='register()']    			//Sign Up button xpath
	         //signUp.click(); //
			Thread.sleep(4000);
			driver.switchTo().alert().accept();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@id='signInModal']//span[@aria-hidden='true'][normalize-space()='×']")).click();		// exit(cross button) xpath
			Thread.sleep(4000);
			//div[@id='signInModal']//button[@type='button'][normalize-space()='Close']   		//close xpath
			
			
				driver.findElement(By.id("login2")).click();
			Thread.sleep(4000);
			
			driver.findElement(By.id("loginusername")).sendKeys("aditya@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("loginpassword")).sendKeys("aditya");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
			Thread.sleep(7000);
			//driver.switchTo().alert().accept();
			//Thread.sleep(4000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		driver.close();
		}
}

