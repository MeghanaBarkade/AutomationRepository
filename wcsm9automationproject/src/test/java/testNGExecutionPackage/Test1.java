package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void Method1() {
	  Reporter.log("Method1 from text1 class", true);
  }
  @Test
  public void Method2() {
	  Reporter.log("Method2 from text1 class", true);
  }
}

