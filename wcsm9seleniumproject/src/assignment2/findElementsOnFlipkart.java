package assignment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsOnFlipkart {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[@role='button']")).click();
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("laptop");
	driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	driver.findElement(By.xpath("//div[text()='HP']")).click();
	
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//span[text()='13 MORE'] ")).click();
	driver.findElement(By.xpath("//div[text()='Core i7']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and (text()='Operating System')]")).click();
	driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Windows 11')]")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	Thread.sleep(2000);

	List<WebElement> allMobileName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
	List<WebElement> allMobilePrice = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	
	for(int i=0;i<allMobileName.size();i++ )
	{
	   String laptop = allMobileName.get(i).getText();
		Thread.sleep(2000);
		
		for(int j=i;j<=i;j++)
		{
			String price=allMobilePrice.get(j).getText();
			System.out.println(laptop+ " : "+ price);
		}
		
		
	}
	
	}


}
