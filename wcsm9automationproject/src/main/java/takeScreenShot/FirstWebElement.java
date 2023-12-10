package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FirstWebElement {
	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
	
		//find webElement on webpage
		WebElement WebElementFirst = driver.findElement(By.xpath("//img[@alt='signin']"));
		
		//take screenshot of webpage
		File scr=WebElementFirst.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./Screenshots/FirstWebelement.png");
		
		Files.copy(scr, dest);
	}

}
