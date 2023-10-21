package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingTextFunction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://laptop-hskr9u4o/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/tasks/otasklist.do']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	
		
		driver.findElement(By.xpath("//label[text()='Create blank customer']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Baroda");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("bank");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Show list of active projects and customers']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		Thread.sleep(2000);
		//input[@value='Create New Project']
		driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='Baroda']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("WebApplication");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Show list of active projects and customers']")).click();
		Thread.sleep(2000);
		//input[@name='createProjectSubmit']
		driver.findElement(By.xpath("//input[@name='createProjectSubmit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='add tasks']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='Baroda']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[text()='WebApplication']")).click();
		Thread.sleep(2000);
		
	}

}
