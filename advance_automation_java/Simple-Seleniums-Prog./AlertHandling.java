package ss;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertHandling {
	public static void main(String[] args) {
		
		
		WebDriver driver = Connection.getconnection("https://demoqa.com/alerts");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//alert button
//		driver.findElement(By.id("alertButton")).click();
//		Alert alert =   driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
		//timerAlertButton
//		driver.findElement(By.id("timerAlertButton")).click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert =   driver.switchTo().alert();
//		System.out.println(alert.getText());
//		alert.accept();
		
		//confirmButton
//		driver.findElement(By.id("confirmButton")).click();
//		driver.switchTo().alert().dismiss();
		
		
//		/promtButton
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Typing..");
		alert.accept();
		
	}}

