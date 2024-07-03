package simple;

import java.io.File;
import java.sql.Connection;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

	public static void getScreenShot(WebDriver driver, String imgname) 
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\TAimg\\"+imgname+".jpg");
		
		try
		{
			FileUtils.copyFile(source, dest);
			System.out.println("screenshot taken");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = Connection.getconnection("https://www.facebook.com/");
		getScreenShot(driver, "err");
	}
}

