package methodsOfActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1oncontextClickMethods {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.selenium.dev/");
			Thread.sleep(2000);
			WebElement Downloadlink = driver.findElement(By.xpath("//a[@href='/downloads']"));
			
			Actions act=new Actions(driver);
			act.contextClick(Downloadlink).perform();
	}

}
