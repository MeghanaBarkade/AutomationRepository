package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass5Twitter {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://profile.w3schools.com/sign-up?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com%2F");
		Thread.sleep(2000);
		driver.findElement(By.id("modalusername")).sendKeys("8446113692");
		Thread.sleep(2000);
		driver.findElement(By.id("new-password")).sendKeys("Meghana");
	}


}
