package testNGAssertations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OperationsOnActiTimeAssertion {

	static WebDriver driver;
  @BeforeMethod
  public void LoginToActitime()
  {
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));  
	  
  }
  @Test
  public void OperationsOnActiTime() {
	  
  }
}
