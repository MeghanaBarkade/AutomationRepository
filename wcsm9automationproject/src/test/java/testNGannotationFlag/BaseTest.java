package testNGannotationFlag;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseTest {
	WebDriver driver;
  @Test
  public void LaounchBroser() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
  }
  @Test
  public void closedBrwoser()
  {
	  driver.quit();
  }
}
