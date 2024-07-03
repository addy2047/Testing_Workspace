package ss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class webtable {
		public static void main(String[] args) throws InterruptedException {

	WebDriver driver = Connection.getconnection("https://demoqa.com/webtables");
	
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,200)","");
	Thread.sleep(1500);	
	
	String name = "ADDY";
	
	
	try {
		WebElement text = driver.findElement(By.xpath("//*[text()='"+name+"']"));
		if(text.isDisplayed())
		{
			driver.findElement(By.xpath("//*[text()='"+name+"']/following-sibling::div[6]/div/span[1]")).click();
		}
	}
	 
	catch (Exception e)
	{
		System.out.println("Not found");
	}
		}}
		
