package ss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class dynamicTable 
			{
				public static void main(String[] args) 
				{
		
		
		WebDriver driver = Connection.getconnection("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		String text = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[3]")).getText();
		System.out.println(text);
	}
}

