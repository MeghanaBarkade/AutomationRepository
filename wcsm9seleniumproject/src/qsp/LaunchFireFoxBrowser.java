package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		System.out.println("FireFox is open");
		Thread.sleep(2000);
		driver.close();
		System.out.println("FireFox is closed");

	}

}
