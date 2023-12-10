package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class SecondWebElement {
	public static void main(String[] args) throws IOException {
		RemoteWebDriver rwd=new ChromeDriver();
		rwd.manage().window().maximize();
		rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		rwd.get("https://www.flipkart.com/");
		
		rwd.findElement(By.xpath("//span[@role='button']")).click();
		
		WebElement ImageFlipcart = rwd.findElement(By.xpath("//div[@class='_3ZqtNW']"));
		//Take ScreenShot of website And store in src
		File Src = ImageFlipcart.getScreenshotAs(OutputType.FILE);
		
		//Define destination for storing screenshot
		File dest = new File("./Screenshots/ScondWebElement.png");
		
		//to store ss  in destination
		Files.copy(Src, dest);
	}

}

