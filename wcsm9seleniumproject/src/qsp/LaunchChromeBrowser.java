package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();     //to launch chrome
		
		System.out.println("Launch chrome");
		driver.manage().window().maximize();//to maximize
		
		Thread.sleep(2000);      //TimeOut
		
		driver.close();         //to closed
		System.out.println("crome is closed");
	}

}
