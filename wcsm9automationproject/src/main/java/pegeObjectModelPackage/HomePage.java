package pegeObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//div[text()='Time-Track']/following-sibling::div/img")private WebElement Time_Track;
	@FindBy(xpath = "//div[text()='Tasks']/following-sibling::div/img")private WebElement Task_module;
	@FindBy(xpath="//div[text()='Reports']/following-sibling::img")private WebElement Report_module;
	@FindBy(xpath = "//div[text()='Users']/following-sibling::img")private WebElement User_module;
	@FindBy(xpath = "//div[text()='Work Schedule']/following-sibling::img")private WebElement Work_Shedule_module;
	@FindBy(xpath = "//div[text()='Settings']/following-sibling::div/img")private WebElement Settings_module;
	@FindBy(partialLinkText = "Logout")private WebElement Logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getTime_Track() {
		return Time_Track;
	}

	public WebElement getTask_module() {
		return Task_module;
	}

	public WebElement getReport_module() {
		return Report_module;
	}

	public WebElement getUser_module() {
		return User_module;
	}

	public WebElement getWork_Shedule_module() {
		return Work_Shedule_module;
	}

	public WebElement getSettings_module() {
		return Settings_module;
	}

	public WebElement getLogout() {
		return Logout;
	}
	
	//operationaa Module
	public void click_on_Time_Track() {
		Time_Track.click();
	}

	public void click_on_Task_module() {
		Task_module.click();
	}

	public void click_on_Report_module() {
		Report_module.click();
	}

	public void click_on_User_module() {
		User_module.click();
	}

	public void click_on_Work_Shedule_module() {
		Work_Shedule_module.click();
	}

	public void click_on_Settings_module() {
		Settings_module.click();
	}

	public void click_on_Logout() {
		Logout.click();
	}
	

}
