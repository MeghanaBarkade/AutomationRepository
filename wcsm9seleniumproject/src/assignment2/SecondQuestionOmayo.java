package assignment2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondQuestionOmayo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://omayo.blogspot.com");
		Thread.sleep(2000);
		
		//String ParentAddr=driver.getWindowHandle();
		
		
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		Thread.sleep(2000);
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			TargetLocator switchTo=driver.switchTo();
			//switchTo.window(wh).manage().window().maximize();
			Thread.sleep(2000);
			switchTo.window(wh).close();
			
				
		
		}
	//how to closed all browser withaout using quit()	
		
		
	}	
}
