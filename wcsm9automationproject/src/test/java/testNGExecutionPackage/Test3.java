package testNGExecutionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	  public void Method1() {
		  Reporter.log("Method1 from text3 class", true);
	  }
	  @Test
	  public void Method2() {
		  int a=10;
		  int b=2;
		  int c=a/b;
		  Reporter.log("Method2 from text3 class" +c, true);
	  }
}
