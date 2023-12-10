package testNGannotationFlag;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationFlags {
  @Test
  public void annoTation_Test() {
	  Reporter.log("Test Annotation", true);
  }
  @BeforeMethod
  public void annoTation_BeforeMethodTest() {
	  Reporter.log("BeforeMethod_Test Annotation", true);
  }
  
  @AfterMethod
  public void annoTation_AfterMethodTest() {
	  Reporter.log("Test AfterMethodAnnotation", true);
  }
  
  @BeforeClass
  public void annoTation_BeforeClassTest() {
	  Reporter.log("Test BeforeClassAnnotation", true);
  }
  @AfterClass
  public void annoTation_AfterClassTest() {
	  Reporter.log("Test AfterClassAnnotation", true);
  }
  @BeforeTest
  public void annoTation_BeforeTest() {
	  Reporter.log("Test BeforeTestAnnotation", true);
  }
  @AfterTest
  public void annoTation_AfterTest() {
	  Reporter.log("Test AfterTestAnnotation", true);
  }
  @BeforeSuite
  public void annoTation_BeforeSuite() {
	  Reporter.log("Test Annotation", true);
  }
  @AfterSuite
  public void annoTation_AfterSuite() {
	  Reporter.log("Test Annotation", true);
  }
}
