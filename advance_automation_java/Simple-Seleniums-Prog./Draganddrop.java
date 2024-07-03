package ss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class Draganddrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Connection.getconnection("https://www.globalsqa.com/demo-site/draganddrop/");
		
		
		
		List<WebElement> frames1 = driver.findElements(By.tagName("iframe"));
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
		Thread.sleep(2000); 
		
		
		WebElement from = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]"));
		WebElement to = driver.findElement(By.id("trash"));
		
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(from, to).build().perform();
		
		Action dd =builder.clickAndHold(from).moveToElement(to).release().build();
		
		dd.perform();
		
		Thread.sleep(2000);
		//driver.quit();
	}
}

