package methodsOfActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethods {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/button");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Double Click']")).click();
	
	WebElement YesButton = driver.findElement(By.xpath("//button[text()='Yes']"));
	WebElement NoButton = driver.findElement(By.xpath("(//button[text()='No'])[2]"));
	WebElement scaleButton = driver.findElement(By.xpath("//button[text()='5']"));
    Actions act = new Actions(driver);
    Thread.sleep(2000);
    act.doubleClick(YesButton).perform();
    Thread.sleep(2000);
    
    act.doubleClick(NoButton).perform();
    Thread.sleep(2000);
    
    act.doubleClick(scaleButton).perform();
    

	}
}
