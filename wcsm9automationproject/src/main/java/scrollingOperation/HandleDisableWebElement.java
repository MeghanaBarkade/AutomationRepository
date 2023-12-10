package scrollingOperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		Thread.sleep(2000);
		//to handle disable Webelement
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		
		jse.executeScript("document.getElementById('name').value='Meghana'");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('email').value='meghanabarkade52.com'");
		Thread.sleep(2000);
		jse.executeScript("document.getElementById('password').value='Meghana@90'");
		
		
		//to perform click on disable button
		WebElement DisableButton = driver.findElement(By.xpath("//button[text()='Register']"));
		Thread.sleep(2000);
		if(DisableButton.isDisplayed())
		{
			jse.executeScript("arguments[0].click()",DisableButton);
			System.out.println("Click");
		}
		else
		{
			System.out.println("not Click");
			
		}
		
		
	}

}


