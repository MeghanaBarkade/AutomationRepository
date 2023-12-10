package pegeObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name="username") private WebElement usnTB;
	@FindBy(name="pwd") private WebElement passTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(name="remember") private WebElement KeepMeLoggedInCheckBox;
	@FindBy(partialLinkText = "Actimin") private WebElement actiMindLink;
	@FindBy(partialLinkText="remember") private WebElement licenseLink;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);

	}

	public WebElement getUsnTB() {
		return usnTB;
	}
	
	public WebElement getPassTB() {
		return passTB;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}

	
	
	
		
	
	
}
