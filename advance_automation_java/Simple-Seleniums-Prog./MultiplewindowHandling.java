package ss;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MultiplewindowHandling {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Connection.getconnection("http://demo.guru99.com/popup.php");
		
		String mainWin = driver.getWindowHandle();
		//System.out.println(mainWin);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click Here")).click();
		JavascriptExecutor js= (JavascriptExecutor)driver;

		
		Set<String> allwins =  driver.getWindowHandles();
		for(String win : allwins)
		{
			if(!win.equals(mainWin))
			{
				driver.switchTo().window(win);
			} 
		}
		
		driver.findElement(By.name("emailid")).sendKeys("tops@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		js.executeScript("window.scrollBy(0,100)","");
		Thread.sleep(2000);				// Method to scroll window by pixel

//		driver.close();
	driver.switchTo().window(mainWin);
//		driver.close();
		
	//	driver.quit();
	
	}
}


