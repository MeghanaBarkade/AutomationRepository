package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakeSSThirdWay {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://demoapps.qspiders.com/");
		
		//downcast Into WebDriver class to call getScreenShotAs methods
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
		
		//Take ScreenShot of website And store in src
		File Src = rwd.getScreenshotAs(OutputType.FILE);
		
		//Define destination for storing screenshot
		File dest = new File("./Screenshots/ThirdWayss.png");
		
		//to store ss  in destination
		Files.copy(Src, dest);

	}

}
