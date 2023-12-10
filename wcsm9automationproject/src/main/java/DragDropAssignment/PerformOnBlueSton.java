package DragDropAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformOnBlueSton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame("//iframe[@id='fc_widget']");
		Thread.sleep(2000);
		
		driver.findElement(By.id("chat-icon")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("meghana");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("asd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("////input[@id='chat-fc-phone']")).sendKeys("1233455551");
		Thread.sleep(2000);
		
	}

}
