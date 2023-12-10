package DragDropAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformOnJquery {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
		WebElement firstOPtion = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(firstOPtion, target).perform();
		Thread.sleep(2000);
	}
	

}
