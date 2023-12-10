package sychronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoExplicitWait {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Apply Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		driver.get("http://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		//driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		
		 //Apply Explicit Wait
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));

	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Flipkart']"))).click();
	    
		//driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
	}
}
