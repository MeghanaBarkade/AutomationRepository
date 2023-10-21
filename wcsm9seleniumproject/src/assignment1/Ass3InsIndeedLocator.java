package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass3InsIndeedLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://secure.indeed.com/auth?hl=en_IN&co=IN&continue=https%3A%2F%2Fin.indeed.com%2Fq-naukri-com-l-pune%2C-maharashtra-jobs.html&tmpl=desktop&service=mob&from=gnav-util-jobsearch--indeedmobile&jsContinue=https%3A%2F%2Fin.indeed.com%2Fq-naukri-com-l-pune%2C-maharashtra-jobs.html%3Fq%3Dnaukri+com%26l%3Dpune%2C+maharashtra&empContinue=https%3A%2F%2Faccount.indeed.com%2Fmyaccess&_ga=2.80800727.1587314617.1694799238-1210121856.1684729024");
		Thread.sleep(2000);
		driver.findElement(By.id("ifl-InputFormField-3")).sendKeys("meghanabarkade52@gmail.com");
	}

}
