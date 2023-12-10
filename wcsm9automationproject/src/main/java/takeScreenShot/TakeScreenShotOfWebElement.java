package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class TakeScreenShotOfWebElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		
		//handle the popup
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		
		Thread.sleep(2000);
		WebElement coinsTarget = driver.findElement(By.xpath("//a[text()='Coins '] "));
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		
		act.moveToElement(coinsTarget).perform();
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
	    //act.moveToElement(coinsTarget).perform();
	    Thread.sleep(2000);
	    
		//find the webelement on webPage
	    
	    WebElement SelectCoins = driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']"));
	    Thread.sleep(2000);
	    //to take ScreenShot method
	    File scr=SelectCoins.getScreenshotAs(OutputType.FILE);
	    
	    File dest= new File("./Screenshots/LaxmiCoin.png");
	    
	    Files.copy(scr, dest);
	    
	    
	}

}
