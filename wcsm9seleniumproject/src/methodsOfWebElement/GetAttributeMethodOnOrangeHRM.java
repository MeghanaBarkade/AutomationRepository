package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GetAttributeMethodOnOrangeHRM {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement loginButon = driver.findElement(By.xpath("//button[@type='submit']"));
		String attributeName = loginButon.getAttribute("type");
		//Thread.sleep(2000);
		System.out.println(attributeName);
		
		String CSsValue=loginButon.getCssValue("width");
		System.out.println(CSsValue);
		
		
		String tag = loginButon.getTagName();
		System.out.println(tag);
	}

}
