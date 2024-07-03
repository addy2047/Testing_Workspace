package ss;


import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class PracticeForm {
	public static void main(String[] args) {
		
		WebDriver driver = Connection.getconnection("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js  =(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.id("firstName")).sendKeys("test");
		driver.findElement(By.id("lastName")).sendKeys("test");
		driver.findElement(By.id("userEmail")).sendKeys("test");
		driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("89898989");
		
		String day = "27";
		String month = "March";
		String year = "2000";
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement mymonth = driver.findElement(By.className("react-datepicker__month-select"));
		Select m = new Select(mymonth);
		m.selectByVisibleText(month);
		
		
		WebElement myyear = driver.findElement(By.className("react-datepicker__year-select"));
		Select y = new Select(myyear);
		y.selectByVisibleText(year);
		
		
		Lists<WebElement> days = driver.findElements(By.xpath("//*[@class='react-datepicker__week']/div"));
		
		for(WebElement d : days)
		{
			if(d.getText().equals(day))
			{
				if(d.getAttribute("aria-label").contains(month))
				{
					d.click();
					break;
				}
				}
			}
		
		WebElement subject =  driver.findElement(By.id("subjectsContainer"));
		Actions builder = new Actions(driver);
		
		builder.click(subject).sendKeys("Maths").sendKeys(Keys.ENTER).sendKeys("Physics").sendKeys(Keys.ENTER).build().perform();
		Connection.getScreenShot(driver, "reg");
	}
	}



