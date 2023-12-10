package popupHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupOnOmayo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='ClickToGetAlert']")).click();
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		//to 
		//al.accept();
		
		//to get text from alert popup
		System.out.println(al.getText());
		//to close the alert
		al.dismiss();
		
		
	}
	

}
