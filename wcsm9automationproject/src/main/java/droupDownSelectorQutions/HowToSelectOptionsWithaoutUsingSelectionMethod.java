package droupDownSelectorQutions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HowToSelectOptionsWithaoutUsingSelectionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/Trupti/Desktop/html%20Code/Singledropdown.html");
		//identify single select dropdown
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='iddd']"));
		Thread.sleep(2000);
		
		//handle the dropdown
		Select sel1 = new Select(dropdown1);
		Thread.sleep(2000);
		
		//get all the options from dropdown by using getoptions Methods
		List<WebElement> allops1 = sel1.getOptions();
		//select the options from drop down 
		for(WebElement op:allops1)
		{
			if(op.getText().equals("Vadapao"));
			{
				op.click();
				//break;
			}
			
		}
	}

}
