package simple;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class CGisWrong {
		
	    public static void main(String[] args) throws InterruptedException {
	    
	    	// Set the path to your ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver","E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	        
	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        
	        // Navigate to the website
	        driver.get("https://www.demoblaze.com/");
	        try {
	        	
	        
	        // Click the "Login" button
	        WebElement signin2Button = driver.findElement(By.id("signin2"));
	        signin2Button.click();
	        
	        // Find the username and password fields and enter your credentials
	        WebElement usernameField = driver.findElement(By.id("loginusername"));
	        
	        WebElement passwordField = driver.findElement(By.id("loginpassword"));
	       
	        
	        usernameField.sendKeys("vinu@gmail.com");
	        
	        passwordField.sendKeys("vinay");
	        Thread.sleep(4000); 
	        
	        // Click the "Log in" button
	        WebElement FormButton = driver.findElement(By.xpath("button[@class='btn btn-primary' and @onclick='register()']"));
	        FormButton.click();
	        Thread.sleep(4000);
	        
	        }
	        catch (Exception e)
			{
				e.printStackTrace(); 
	        	
	        }
	        // You can add further test cases and assertions here
	        
	        // Close the browser
	        driver.quit();
	    }
	}



