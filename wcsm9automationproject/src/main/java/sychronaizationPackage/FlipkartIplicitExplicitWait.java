package sychronaizationPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartIplicitExplicitWait {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//span[@role='button']")).click();
	driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
	driver.findElement(By.xpath("//img[@alt='Vivo']")).click();
	driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/fk-p-flap/100/100/image/c451d43420dce846.jpg?q=50']")).click();
	driver.findElement(By.xpath("//div[@data-img='https://rukminim1.flixcart.com/image/{@width}/{@height}/xif0q/mobile/5/y/8/-original-imagtt4mhqrzjs9r.jpeg?q={@quality}']")).click();
	driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("411039");
	driver.findElement(By.xpath("//span[text()='Check']")).click();
	driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("411039");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	//driver.findElement(By.xpath("//a[text()='vivo T2 Pro 5G (Dune Gold, 128 GB)']")).click();
	
	
	}

}
