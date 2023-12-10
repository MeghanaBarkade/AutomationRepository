package methodsOfActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverMethod {
	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.bluestone.com/");

		//Handle popup

		driver.findElement(By.id("denyBtn")).click();

		//perform mousehover
		WebElement WatchTarget = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		

		Actions act = new Actions(driver);
        act.moveToElement(WatchTarget).perform();

        driver.findElement(By.xpath("//a[text()='Band']")).click();

	}



}

