package mock1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d'and(@name='username')]")).sendKeys("777777778888");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d'and(@name='password')]")).sendKeys("Meghanadgjj@43");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	}

}
