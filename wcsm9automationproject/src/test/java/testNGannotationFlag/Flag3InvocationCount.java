package testNGannotationFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3InvocationCount {
  @Test(invocationCount = 2)
  public void Method1() {
	  Reporter.log("Login is done");
  }
}
