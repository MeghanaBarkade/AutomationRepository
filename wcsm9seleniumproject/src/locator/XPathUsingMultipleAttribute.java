package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XPathUsingMultipleAttribute {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwiGk7r5pMuBAxUP1RYFHdCRCc0YABAAGgJ0bA&gclid=Cj0KCQjwpc-oBhCGARIsAH6ote-BE-aj0fRAebumlyXEBrtTemvKAXMrjMe1CtWkPvftWRPcW9VdOd0aAgylEALw_wcB&ohost=www.google.com&cid=CAESa-D2MaATcMVWh6WCYwZAhiQFZhdQ6SjHWz2gk8Kqk_P_aok_8YVpdzE2Q9kHuveywHc2w7a774EgPs3UwAT3SMaYVhWPhFLYT9_SDbMGv5i6I5evszNQrb11DK14HhNXyiFNAkqUnmdQOrjS&sig=AOD64_0BY7ETYq6UUwWx2xuK4X0i20jdHA&q&adurl&ved=2ahUKEwjGlrT5pMuBAxXEUfUHHXaCDUgQ0Qx6BAgGEAE");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='nav-a  ' and (text()='Mobiles')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']")).click();
		Thread.sleep(2000);
		
		
		
	}
	
}
