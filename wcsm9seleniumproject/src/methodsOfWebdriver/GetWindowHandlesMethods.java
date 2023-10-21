package methodsOfWebdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethods {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		
		String ParentHandle=driver.getWindowHandle();
		System.out.println(ParentHandle);
		
		System.out.println("Address of Parent Brnbowser or Window"+ParentHandle);
		
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
			if (!ParentHandle.equals(wh)) {
				System.out.println("address of child window:" +wh);
			}
			else
			{
				System.out.println("address of parent windows:"+wh);
			}
		}
		driver.quit();
	}

}
