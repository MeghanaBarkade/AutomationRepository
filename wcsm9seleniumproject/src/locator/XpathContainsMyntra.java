package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathContainsMyntra {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'myntraweb-sprite mobile-leftNav')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@data-group,'wom')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[contains(@class,'image-image undefined')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@value,'girls')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@class,'common-customCheckbox vertical-')]")).click();
		Thread.sleep(2000);

	
	}

}
