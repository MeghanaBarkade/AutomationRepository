package scrollingOperation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class PerformScrollingOnSelenium {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		//get location of webElement
		WebElement WebEleTwitter = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
		Point loc = WebEleTwitter.getLocation();
		int xaxis=loc.getX();
		int yaxis=loc.getY();
		
		//to perform down
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		//to take screenshot
		TakesScreenshot tst=(TakesScreenshot)driver;
		Thread.sleep(2000);
		File scr=WebEleTwitter.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dest=new File("./ScreenShots/WebEleTwitterimg.png");
		Thread.sleep(2000);
		//to save screenshot 
		Files.copy(scr, dest);
	}

}
