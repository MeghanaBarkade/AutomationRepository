package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetflixLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		Thread.sleep(2000);
		
		//identify UserName byUsing tagName
		driver.findElement(By.tagName("Input")).sendKeys("6495679956");
		Thread.sleep(2000);
		
		//identify UserName byUsing tagName
		driver.findElement(By.id("id_password")).sendKeys("Meghaman");
		Thread.sleep(2000);
	}
	

}
