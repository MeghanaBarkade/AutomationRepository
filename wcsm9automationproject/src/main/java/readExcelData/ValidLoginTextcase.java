package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTextcase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://laptop-hskr9u4o/login.do");
		
	    Flib flib=new Flib();
	    
	    String usndata = flib.readExcelData("./src/main/resources/ActiTimeTextDataFile.xlsx", "validcread", 1, 0);
	    String pwdData = flib.readExcelData("./src/main/resources/ActiTimeTextDataFile.xlsx", "validcread", 1, 1);
	    driver.findElement(By.name("username")).sendKeys(usndata);
    	driver.findElement(By.name("pwd")).sendKeys(pwdData);
    	driver.findElement(By.id("loginButton")).click();
	    
		
	}

}
