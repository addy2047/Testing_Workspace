package simple;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


	


	public class multiItemInDropdown {

		public static void main(String[] args) throws InterruptedException 
		{
			
			System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/select-menu");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			WebElement ele = driver.findElement(By.id("oldSelectMenu"));
			
			Select select = new Select(ele);
			//select.selectByIndex(2);
			//Thread.sleep(4000);
			select.selectByVisibleText("Green");
			Thread.sleep(4000);
			select.selectByVisibleText("Black");
			Thread.sleep(2000);
			//System.out.println(select.getFirstSelectedOption().getText());
			//Thread.sleep(4000);
			JavascriptExecutor js= (JavascriptExecutor)driver;

			js.executeScript("window.scrollBy(0,200)","");
			Thread.sleep(2000);				// Method to scroll window by pixel

			select.selectByIndex(0);
			Thread.sleep(2000);
			select.selectByIndex(1);
			select.selectByIndex(2);
			Thread.sleep(4000);
			
	}

	}

	
	
	
	/*	WebElement ele1 = driver.findElement(By.id("cars"));
	 * Select select = new Select(ele1);
		select.selectByIndex(0);
		select.selectByIndex(1);
		select.selectByIndex(2);
		Thread.sleep(4000);
		List<WebElement> listofoptions = select.getAllSelectedOptions();
		for (WebElement obj : listofoptions) {
			System.out.println(obj.getText());  */
		


