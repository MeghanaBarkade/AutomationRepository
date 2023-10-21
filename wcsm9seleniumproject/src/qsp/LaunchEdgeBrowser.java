package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new EdgeDriver();
		System.out.println("Edge is open");
		Thread.sleep(200);
		driver.close();
		System.out.println("Edge is closed");
	}

}
