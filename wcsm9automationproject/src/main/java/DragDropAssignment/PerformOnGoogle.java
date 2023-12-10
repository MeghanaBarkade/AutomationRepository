package DragDropAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformOnGoogle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		
		WebElement optionsOnGoogle = driver.findElement(By.xpath("//a[@class='gb_d']"));
		optionsOnGoogle.click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("callout");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		//driver.switchTo().frame(optionsOnGoogle);
		
		
	}

}
