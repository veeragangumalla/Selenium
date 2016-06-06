package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FormSubmit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		//this is for static drop down
		// for static drop down you need to create an object using select class
		Select dropdown = new Select(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_Adult']")));
		dropdown.selectByIndex(4);
		
	}

}
