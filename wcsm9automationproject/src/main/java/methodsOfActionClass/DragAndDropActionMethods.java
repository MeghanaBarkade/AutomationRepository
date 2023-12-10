package methodsOfActionClass;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActionMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/button");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Drag And Drop']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		
		WebElement FirstOption = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement SecondOption = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement ThirdOption = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement FourthOption = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		
		
		WebElement Target1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement Target2= driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement Target3 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		WebElement Target4= driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(FirstOption, Target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(SecondOption, Target3).perform();
		Thread.sleep(2000);
		act.dragAndDrop(ThirdOption, Target2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(FourthOption, Target4).perform();
	}

}
