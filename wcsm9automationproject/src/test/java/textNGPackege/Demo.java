package textNGPackege;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void Method1() {
	 Reporter.log("Method1 from demo class");
  }
  
  @Test
  public void Method2()
  {
	  Reporter.log("Method2 from demo class");
  }
 
}
