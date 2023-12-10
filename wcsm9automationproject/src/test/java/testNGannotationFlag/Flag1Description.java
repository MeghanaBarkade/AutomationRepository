package testNGannotationFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1Description {
  @Test(description = "first Method")
  public void Method1() {
	  Reporter.log("This is frist Methods", true);
  }
}
