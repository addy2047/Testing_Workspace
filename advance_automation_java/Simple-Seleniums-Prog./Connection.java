package ss;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Connection 
	{
		public static WebDriver getconnection(String url)
		{
			
			System.setProperty("webdriver.chrome.driver", "E:\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			return driver;
			
		}
	}

