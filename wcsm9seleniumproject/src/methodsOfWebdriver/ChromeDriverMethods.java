package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//
		
		driver.get("https://www.primevideo.com");
		
		//driver.close();
		driver.get("https://chat.qspiders.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
