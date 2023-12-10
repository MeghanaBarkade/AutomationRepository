package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakeSSFourthWay {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		
		//to call getScreenShot method we use thired party class create object of that class
		EventFiringWebDriver efwd=new EventFiringWebDriver(driver);//depcreation// deprecated object
		
		
		//Take ScreenShot of website And store in src
		File Src = efwd.getScreenshotAs(OutputType.FILE);
		
		//Define destination for storing screenshot
		File dest = new File("./Screenshots/FourWayss.png");
		
		//to store ss  in destination
		Files.copy(Src, dest);

	}

}
