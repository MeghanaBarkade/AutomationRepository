package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass4StripeLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://dashboard.stripe.com/login");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("8446113692");
		Thread.sleep(2000);
		driver.findElement(By.id("old-password")).sendKeys("Meghana");
	}

}
