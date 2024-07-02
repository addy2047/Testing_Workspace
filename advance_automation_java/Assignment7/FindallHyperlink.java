package module78.webdriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindallHyperlink {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver-win64\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		ArrayList<String> data = new ArrayList<String>();
		for(int i=0;i<links.size();i++)
		{
			//if((links.get(i).getText().length())!=0)
			//{
				System.out.println(links.get(i).getText());
				data.add(links.get(i).getAttribute("href"));
				System.out.println(links.get(i).getAttribute("href"));
				
			}
		System.out.println(data.size());
			driver.quit();
	}
	
}
