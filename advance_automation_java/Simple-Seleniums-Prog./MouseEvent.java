package ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Connection.getconnection("https://www.amazon.in/");
		
		WebElement sell = driver.findElement(By.linkText("Sell"));
		WebElement mobile = driver.findElement(By.linkText("Mobiles"));
		WebElement fashion = driver.findElement(By.linkText("Fashion"));
		
		
		Actions builder = new Actions(driver);
		
		
		builder.moveToElement(sell).build().perform();
		Thread.sleep(2000);
		builder.moveToElement(mobile).build().perform();
		Thread.sleep(2000);
		builder.moveToElement(fashion).build().perform();
		Thread.sleep(2000);
		
		
	}
}

