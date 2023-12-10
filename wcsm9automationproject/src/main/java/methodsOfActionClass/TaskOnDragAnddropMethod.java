package methodsOfActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TaskOnDragAnddropMethod {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
	
		WebElement BankOption = driver.findElement(By.xpath("//a[text()= ' BANK ']"));
		WebElement SalesOption = driver.findElement(By.xpath("//a[text()= ' SALES ']]"));
		WebElement Amount1Option = driver.findElement(By.xpath("//a[text()= ' 5000']]"));
		WebElement Amount2Option = driver.findElement(By.xpath("//a[text()= ' 5000']]"));
	
		WebElement AccountTarget = driver.findElement(By.xpath("//div[@class= 'shoppingCart' and (@id='shoppingCart1')]"));
		WebElement AmountTarget = driver.findElement(By.xpath("(//div[@class= 'shoppingCart' and (@id='shoppingCart4')])[1]"));
	
		WebElement AccountTarget1 = driver.findElement(By.xpath("//div[@class= 'shoppingCart' and (@id='shoppingCart3')]"));
		WebElement AmountTarget2 = driver.findElement(By.xpath("(//div[@class= 'shoppingCart' and (@id='shoppingCart4') ])[2]"));
	
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(BankOption, AccountTarget).perform();
		Thread.sleep(2000);
	
		act.dragAndDrop(Amount1Option, AmountTarget).perform();
		Thread.sleep(2000);
	
		act.dragAndDrop(SalesOption, AccountTarget1).perform();
		Thread.sleep(2000);
	
		act.dragAndDrop(Amount2Option, AmountTarget2).perform();
		Thread.sleep(2000);
	}

}
