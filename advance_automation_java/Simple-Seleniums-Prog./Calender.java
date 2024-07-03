package ss;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Calender {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = Connection.getconnection("https://www.globalsqa.com/demo-site/datepicker/");
		
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,100)","");
		//Thread.sleep(2000);
		
		String day = "15";
		String month = "June";
		String year ="2025";
		
		WebElement frame  =driver.findElement(By.xpath("//*[@id=\"post-2661\"]/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("datepicker")).click();
		
		
		while(!driver.findElement(By.className("ui-datepicker-year")).getText().equals(year))
		{
			int cyear =Integer.parseInt(driver.findElement(By.className("ui-datepicker-year")).getText());
			int myyear = Integer.parseInt(year);
			
			if(myyear>cyear)
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
				while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals(month))
				{
					driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			}}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
				while(!driver.findElement(By.className("ui-datepicker-month")).getText().equals(month))
				{
					driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
				}
			}}
		
		
		
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
		for(WebElement d : dates)
		{
			if(d.getText().equals(day))
			{
				d.click();
				break;
			}
}}}

