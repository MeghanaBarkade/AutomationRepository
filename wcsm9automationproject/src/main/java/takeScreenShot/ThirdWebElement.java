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
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ThirdWebElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/");
		
		//handle the popup
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		Thread.sleep(2000);
		WebElement WatchTarget = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		Actions act=new Actions(driver);
		act.moveToElement(WatchTarget).perform();
		 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		//img[@alt='The Cloe Mutliwearable Watch Band']
		
		
		WebElement brandTarget = driver.findElement(By.xpath("//img[@alt='The Cloe Mutliwearable Watch Band']"));
		
		
		//downcast Into WebDriver class to call getScreenShotAs methods
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
		
		//Take ScreenShot of website And store in src
		File Src = brandTarget.getScreenshotAs(OutputType.FILE);
		
		//Define destination for storing screenshot
		File dest = new File("./Screenshots/ThirdWebElement.png");
		
		//to store ss  in destination
		Files.copy(Src, dest);

	}
}
