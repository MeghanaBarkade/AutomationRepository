package methodsOfWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Navigation nav = driver.navigate();
		nav.to("https://selenium.dev");
		Thread.sleep(2000);
		//backword
		nav.back();
		Thread.sleep(2000);
		//forword
		nav.forward();
		Thread.sleep(2000);
		//refresh
		nav.refresh();
		Thread.sleep(2000);
	}

}
