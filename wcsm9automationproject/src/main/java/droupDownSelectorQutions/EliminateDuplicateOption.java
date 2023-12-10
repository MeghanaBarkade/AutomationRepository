package droupDownSelectorQutions;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Trupti/Desktop/html%20Code/Singledropdownduplicateopt.html");
		
		//identify dropdown and store it in ref varriable
		WebElement dropdown = driver.findElement(By.id("iddd"));
		Thread.sleep(2000);
		//get all the option of memnudropdown
		Select sel=new Select(dropdown);
		List<WebElement> allopt = sel.getOptions();
		
		//to eleminiate duplicate we used Hashset
		HashSet<String> hs = new HashSet<String>();
		Thread.sleep(2000);
		//read the list by using for loop and eliminate duplicate
		for(int i=0; i<allopt.size();i++)
		{
			WebElement op = allopt.get(i);
			String DropdownOption =op.getText();
			hs.add(DropdownOption);
			
		}
		Thread.sleep(2000);
		for(String opt:hs)
		{
			Thread.sleep(2000);
			System.out.println(opt);
		}
		
		
		
		
		
		
	}

}
