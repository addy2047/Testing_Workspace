package simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracForm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		
		driver().manage().window().maximize();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[1]/a")).click();
		Thread.sleep(1500);
		
	}

	private static WebDriver driver() {
		// TODO Auto-generated method stub
		return null;
	}

	
		
	}

