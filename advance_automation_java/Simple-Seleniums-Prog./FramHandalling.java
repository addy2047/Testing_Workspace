package ss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramHandalling {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Connection.getconnection("https://demoqa.com/frames");
		JavascriptExecutor js= (JavascriptExecutor)driver;

		
		
		//List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		//System.out.println(frames.size());
		
		WebElement myframe = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(myframe);
		js.executeScript("window.scrollBy(0,200)","");
		Thread.sleep(2000);				// Method to scroll window by pixel

		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		}
	}



