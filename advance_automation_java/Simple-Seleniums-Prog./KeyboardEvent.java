package ss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Connection.getconnection("https://www.google.com/");
		
		
		WebElement search = driver.findElement(By.name("q"));
		
		Actions builder = new Actions(driver);
		Thread.sleep(2000);
		builder.click(search)
				.keyDown(Keys.SHIFT)
				.sendKeys("tops technologies")
				.keyUp(Keys.SHIFT)
				.sendKeys(Keys.ENTER)
				.build()
				.perform();
			}
}

