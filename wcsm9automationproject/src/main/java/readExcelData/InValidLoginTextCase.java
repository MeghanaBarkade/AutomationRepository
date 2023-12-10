package readExcelData;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InValidLoginTextCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://laptop-hskr9u4o/login.do");
		
	    Flib flib=new Flib();
	    int rc = flib.rowCount("./src/main/resources/ActiTimeTextDataFile.xlsx", "invalidcread");
	    
	    for(int i=1;i<=rc;i++) {
	    	
	    	String usndata = flib.readExcelData("./src/main/resources/ActiTimeTextDataFile.xlsx", "invalidcread", i, 0);
	    	String pwdData = flib.readExcelData("./src/main/resources/ActiTimeTextDataFile.xlsx", "invalidcread", i, 1);
	    	driver.findElement(By.name("username")).sendKeys(usndata);
	    	driver.findElement(By.name("pwd")).sendKeys(pwdData);
	    	driver.findElement(By.id("loginButton")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.name("username")).clear();
	    	
	    }

	}

}
