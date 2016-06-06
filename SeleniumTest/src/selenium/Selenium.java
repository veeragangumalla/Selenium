package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {
	public static void main(String[] args)
			{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.youtube.com"); 
	System.out.println(driver.getPageSource());
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
}
}