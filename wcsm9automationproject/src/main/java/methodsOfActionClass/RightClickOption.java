package methodsOfActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/button");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		Thread.sleep(2000);
		WebElement FirstRightbutton = driver.findElement(By.xpath("(//button[text()='Right Click'])[1]"));
		WebElement SecondRightbutton = driver.findElement(By.xpath("(//button[text()='Right Click'])[2]"));
		WebElement ThirdRightButton = driver.findElement(By.xpath("(//button[text()='Right Click'])[3]"));
		
		Thread.sleep(2000);
	    Actions act = new Actions(driver);

        act.contextClick(FirstRightbutton).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Yes']")).click();
        Thread.sleep(2000);
        
        act.contextClick(SecondRightbutton).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='No']")).click();
        Thread.sleep(2000);
        
        act.contextClick(ThirdRightButton).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='5']")).click();
        Thread.sleep(2000);
        
        
	}

}
