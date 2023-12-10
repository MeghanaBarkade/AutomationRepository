package scrollingOperation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentOnDemoQspiders {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Progress Bar']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Disabled Element']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text' and(@placeholder='Enter time in seconds')]")).sendKeys("5");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		Thread.sleep(2000);
		
		WebElement DisableWebElement = driver.findElement(By.xpath("//option[text()='Select your answer']"));
		Thread.sleep(2000);
		
		if (DisableWebElement.isDisplayed())
		{
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click()", DisableWebElement);
			WebDriver dri=(WebDriver)jse;
			WebElement dropdown1 = driver.findElement(By.xpath("//option[text()='Select your answer']"));
			Select set1= new Select(dropdown1);
			set1.selectByValue("yes");
			Thread.sleep(2000);
		}
		
		
		
		
	}


}
