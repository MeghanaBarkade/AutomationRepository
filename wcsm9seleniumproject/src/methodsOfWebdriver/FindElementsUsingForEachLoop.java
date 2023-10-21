package methodsOfWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUsingForEachLoop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("bike");
		Thread.sleep(2000);
		
		List<WebElement> bikeoption = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		Thread.sleep(2000);
		
		for(WebElement op:bikeoption)
		{
			String options = op.getText();
			Thread.sleep(2000);
			System.out.println(options);
		}
	}

}

