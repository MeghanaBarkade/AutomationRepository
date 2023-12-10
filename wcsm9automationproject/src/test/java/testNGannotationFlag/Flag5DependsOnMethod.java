package testNGannotationFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag5DependsOnMethod {
  @Test(description = "Create User",dependsOnMethods = "Login")
  public void CreateUser() {
	  Reporter.log("User is created", true);
  }
  
  @Test(description = "Login")
  public void Login() {
	  Reporter.log("Login", true);
  }
  
  
  @Test(description = "Logout",dependsOnMethods = "CreateUser")
  public void Logout() {
	  Reporter.log("Logout", true);
  }
}
