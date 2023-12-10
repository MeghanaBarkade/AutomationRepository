package droupDownSelector;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Trupti/Desktop/html%20Code/Singledropdown.html");
		//identify single select dropdown
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='iddd']"));
		
		//handle the dropdown
		Select sel1 = new Select(dropdown1);
		Thread.sleep(2000);
		
		//select the option from single dropdown
		sel1.selectByValue("v7");
		Thread.sleep(2000);
		
		//get the opyion which is selected first
		WebElement firstOPt = sel1.getFirstSelectedOption();
		//get the first opt
		System.out.println(firstOPt.getText());
		Thread.sleep(2000);
		
		// for multiple select  dropdown
		driver.navigate().to("file:///C:/Users/Trupti/Desktop/html%20Code/multipledropdown.html");
		//identify single select dropdown
		Thread.sleep(2000);
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='iddd']"));
				
		//handle the dropdown
		Select sel2 = new Select(dropdown2);
				
		//select the option from single dropdown
		for(int i=5;i<8;i++)
		{
			Thread.sleep(2000);
			sel2.selectByIndex(i);
		}
				
		//get the opyion which is selected first
		//WebElement firstOPt = sel1.getFirstSelectedOption();
		//get the first opt
		System.out.println(sel2.getFirstSelectedOption().getText());
		
		
		
		
		
		
		
		
	}

}
