package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActitimeLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		BaseTest bt=new BaseTest();
		bt.OpenBrowser();
		
		Flib flib=new Flib();
		
		driver.findElement(By.name("username")).sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties", "username"));
    	Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties", "password"));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
    	
    	bt.CloseBrowser();
	}

}
