package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest {
public static void main(String[] args) throws IOException, InterruptedException {
		
		//To launch the browser  and close the browser
		BaseTest bt = new BaseTest();
		bt.OpenBrowser();
		
		//to read the data from excel file 
		Flib flib = new Flib();
		int rc = flib.rowCount("./src/main/resources/ActiTimetestDataLogin.xlsx","invalidcread");
		
		for(int i=1;i<=rc;i++)
		{	
			String usernametab = flib.readDataFromExcel("./src/main/resources/ActiTimetestDataLogin.xlsx","invalidcread",i,0);
		
	
		        //identify username Text box
			WebElement usnTB = driver.findElement(By.name("username"));
			usnTB.sendKeys(usernametab);
	    
			String passwordtab = flib.readDataFromExcel("./src/main/resources/ActiTimetestDataLogin.xlsx","invalidcread",i,1);
		
				//identify password Text Box
				WebElement passTB = driver.findElement(By.name("pwd"));
				passTB.sendKeys(passwordtab);
				//identify login Button and click
				driver.findElement(By.id("loginButton")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("username")).clear();	
		}	
		bt.CloseBrowser();
	}


}
