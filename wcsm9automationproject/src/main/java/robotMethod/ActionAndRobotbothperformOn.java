package robotMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionAndRobotbothperformOn {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
	WebDriver driver =new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Not now']")).click();
	
	Thread.sleep(2000);
	WebElement WatchTarget = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
	Actions act=new Actions(driver);
	act.moveToElement(WatchTarget).perform();
	 
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Band']")).click();
	 
	
	WebElement filterBytarget = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
	//to hold the filterby
	for(int i=1;i<=2;i++)
	{
		act.doubleClick(filterBytarget).perform();
		Thread.sleep(2000);
		act.clickAndHold(filterBytarget);
	}
		//to copy selected value
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_C);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_C);
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//input[@name='search_query']")).click();
	Thread.sleep(2000);
	
	//to Pest 
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@name='submit_search']")).submit();
		
	}
	
}
