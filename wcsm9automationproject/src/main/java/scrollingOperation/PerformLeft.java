package scrollingOperation;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformLeft {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		
		Thread.sleep(2000);
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	
		//to perform left
		jse.executeScript("window.scrollBy(-2000,0)");
	}


}
