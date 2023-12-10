package testNGannotationFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag6groups {
  @Test(groups = "Functional Test Case")
  public void FT1() {
	  Reporter.log("Functional Test Case1", true);;
  }
  @Test(groups = "Integration Test Case")
  public void IT1() {
	  Reporter.log("Integration Test Case1", true);;
  }
  @Test(groups = "Smoke Test Case")
  public void ST1() {
	  Reporter.log("Smoke Test Case1", true);;
  }
  //-----------------------------------------------------------------------
  @Test(groups = "Functional Test Case")
  public void FT2() {
	  Reporter.log("Functional Test Case1", true);;
  }
  @Test(groups = "Integration Test Case")
  public void IT2() {
	  Reporter.log("Integration Test Case1", true);;
  }
  @Test(groups = "Smoke Test Case")
  public void ST2() {
	  Reporter.log("Smoke Test Case1", true);;
  }
  //--------------------------------------------
  @Test(groups = "Functional Test Case")
  public void FT3() {
	  Reporter.log("Functional Test Case1", true);;
  }
  @Test(groups = "Integration Test Case")
  public void IT3() {
	  Reporter.log("Integration Test Case1", true);;
  }
  @Test(groups = "Smoke Test Case")
  public void ST3() {
	  Reporter.log("Smoke Test Case1", true);;
  }
  //---------------------------------------------
  @Test(groups = "Functional Test Case")
  public void FT4() {
	  Reporter.log("Functional Test Case1", true);;
  }
  @Test(groups = "Integration Test Case")
  public void IT4() {
	  Reporter.log("Integration Test Case1", true);;
  }
  @Test(groups = "Smoke Test Case")
  public void ST4() {
	  Reporter.log("Smoke Test Case1", true);;
  }
  //-------------------------------------
  @Test(groups = "Functional Test Case")
  public void FT5() {
	  Reporter.log("Functional Test Case1", true);;
  }
  @Test(groups = "Integration Test Case")
  public void IT5() {
	  Reporter.log("Integration Test Case1", true);;
  }
  @Test(groups = "Smoke Test Case")
  public void ST5() {
	  Reporter.log("Smoke Test Case1", true);;
  }
  //------------------------------------------------------
  @Test(groups = "Functional Test Case")
  public void FT6() {
	  Reporter.log("Functional Test Case1", true);;
  }
  @Test(groups = "Integration Test Case")
  public void IT6() {
	  Reporter.log("Integration Test Case1", true);;
  }
  @Test(groups = "Smoke Test Case")
  public void ST6() {
	  Reporter.log("Smoke Test Case1", true);;
  }
}
