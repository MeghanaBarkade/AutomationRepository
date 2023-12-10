package scrollingOperation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AssignmentOnOmayo {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		Thread.sleep(2000);
		//to get location of webelement withaout using getLocation method
		WebElement DisableWebElement = driver.findElement(By.xpath("//input[@id='tb2']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView(true)", DisableWebElement);
		
		//to handle disable Webelement
		jse.executeScript("document.getElementById('tb2').value='Automation Testing'", DisableWebElement);
		Thread.sleep(2000);
		//to take ScreenShot
		TakesScreenshot Tss=(TakesScreenshot)driver;
		File scr= DisableWebElement.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		File dest=new File("./ScreenShots/WebElementDisable.png");
		
		Files.copy(scr, dest);
		
	}

}
