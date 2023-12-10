package droupDownSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Trupti/Desktop/html%20Code/multipledropdown.html");
		
		
		WebElement MenuDropdown = driver.findElement(By.xpath("//select[@id='iddd']"));
		//select only one menu from multy dropdown
		Select sel=new Select(MenuDropdown);
		Thread.sleep(2000);
		sel.selectByVisibleText("Pohaa");
		//Deselect the only one Menu from Multi dropdown by using deselectByVisibleText()
		Thread.sleep(2000);
		sel.deselectByVisibleText("Pohaa");
		Thread.sleep(2000);
		
		//select two Menu from multi dropdown
		Select sel1=new Select(MenuDropdown);
		sel1.selectByValue("v2");
		Thread.sleep(2000);
		//sel1.selectByValue("menduWada");
		Thread.sleep(2000);
		//Deselect the only one Menu from Multi dropdown by using deselectByVisibleText()
		sel1.deselectByValue("v2");
		
		
		Thread.sleep(2000);
		
		Select sel2= new Select(MenuDropdown);
		Thread.sleep(2000);
		//to select Product in Multi dropdown
		for (int i=0;i<4;i++)
		{
			Thread.sleep(2000);
			sel2.selectByIndex(i);
		}
		
		//to deselect Product in Multi dropdown
		for (int i=0;i<4;i++)
		{
			Thread.sleep(2000);
			sel2.deselectByIndex(i);
		}
		
	}

}
