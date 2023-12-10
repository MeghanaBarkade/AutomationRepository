package testNGannotationFlag;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Flag8DataProvider {
	
	@ DataProvider(name="Testdata")
	public Object[][] actiTimeTestData()
	{
		Object[][] testData = new Object [5] [2];
		
		testData[0][0]="ad_min";
		testData[0][1]="mana_ger";
		
		testData[1][0]="ad_min";
		testData[1][1]="mana_ger";
		
		testData[2][0]="ad_min";
		testData[2][1]="mana_ger";
		
		testData[3][0]="ad_min";
		testData[3][1]="mana_ger";
		
		testData[4][0]="ad_min";
		testData[4][1]="mana_ger";
		
		return testData;
	}
  @Test(dataProvider = "Testdata")
  public void LoginonActiTime(String usn,String pass) {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("http://laptop-hskr9u4o/login.do");
	  
	  driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
	  
  }
}
