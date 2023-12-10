package droupDownSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DroupDownSingleSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//section[@class='poppins'and(text()='Dropdown')]")).click();
		Thread.sleep(2000);
		
		//identify single droupdown
		Select set=new Select(driver.findElement(By.xpath("//select[contains(@class,'ease-linear transition-all duration-150 w-5/12')]")));
		set.selectByIndex(2);
		Thread.sleep(2000);
		
		//identify single dropdown
		WebElement dropdown1 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select set1= new Select(dropdown1);
		set1.selectByValue("India");
		Thread.sleep(2000);
		
		//identify single dropdown
		WebElement dropdown2 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		Select set2=new Select(dropdown2);
		set2.selectByVisibleText("Maharashtra");
		Thread.sleep(2000);
		
		
		//----------------------------------------------------------------------
		//identify multi dropdown
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		Thread.sleep(2000);
		
		WebElement dropdown3 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		//select only one options
		Select set3= new Select(dropdown3);
		Thread.sleep(2000);
		for(int i=0;i<=4;i++)
		{
			Thread.sleep(2000);
			set3.selectByIndex(i);
		}
		Thread.sleep(2000);
		
		//select multiple option from manu dropdown
		driver.navigate().to("file:///C:/Users/Trupti/Desktop/html%20Code/multipledropdown.html");
		
		WebElement MenuDropdown = driver.findElement(By.xpath("//select[@id='iddd']"));
		//select only one menu from multy dropdown
		Select sel=new Select(MenuDropdown);
		Thread.sleep(2000);
		sel.selectByVisibleText("Pohaa");
		Thread.sleep(2000);
		
		Select sell= new Select(MenuDropdown);
		//to select Product in Multi dropdown
		for (int i=0;i<4;i++)
		{
			Thread.sleep(2000);
			sell.selectByIndex(i);
		}
		
	}

}
