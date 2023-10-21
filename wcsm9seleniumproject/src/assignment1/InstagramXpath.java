package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Phone number')]")).sendKeys("8446113692");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@aria-label,'Pass')]")).sendKeys("Meghana@21");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@type,'sub' )]")).click();
		Thread.sleep(2000);
	}

}
