package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TkeScreenShotsbyusingFirstWay {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://demoapps.qspiders.com/");
		
		//Take ScreenShot of website And store in src
		File Src = driver.getScreenshotAs(OutputType.FILE);
		
		//Define destination for storing screenshot
		File dest = new File("./Screenshots/FirstWayss.png");
		
		//to store ss  in destination
		Files.copy(Src, dest);
	}
		

}
