package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();

	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.get("file:///C:/Users/Trupti/Desktop/html%20Code/SimpleLogin.html");
	Thread.sleep(2000);
	driver.findElement(By.id("I1")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.id("I2")).sendKeys("manager");
	
	
	}
	

}
