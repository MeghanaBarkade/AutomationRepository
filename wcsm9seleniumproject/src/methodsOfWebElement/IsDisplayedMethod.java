package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-hskr9u4o/login.do");
		
		// identify username text box and pass admin
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(2000);
		//identify password text box and pass manager
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//identify login button and click
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		//identify log out link for verify
		WebElement logoutLinkElement = driver.findElement(By.partialLinkText("Logout"));
		Thread.sleep(2000);
		
		//check for logoutLinkElement is displayed or not
		boolean status = logoutLinkElement.isDisplayed();
		System.out.println(status);
		
	}

}
