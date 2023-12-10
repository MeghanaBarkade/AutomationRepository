package testNGannotationFlag;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Flag7AlwayesRun {
	 @Test(description = "Create User",dependsOnMethods = "Login")
	  public void CreateUser() {
		 Assert.fail();
		  Reporter.log("User is created", true);
	  }
	  
	  @Test(description = "Login")
	  public void Login() {
		  Reporter.log("Login", true);
	  }
	  
	  
	  @Test(description = "Logout",dependsOnMethods = "CreateUser",alwaysRun = true)
	  public void Logout() {
		  Reporter.log("Logout", true);
	  }
}
