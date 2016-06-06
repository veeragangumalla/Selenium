package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/"); 
		driver.getTitle();
		System.out.println("test 1");
		//driver.findElement(By.xpath(".//*[@id='pagenav']/ul/li[2]/a"));
		driver.findElement(By.id("email")).sendKeys("satish.gangumalla");
		driver.findElement(By.id("pass")).sendKeys("Lasanmes1.,");
		driver.findElement(By.xpath(".//*[@id='u_0_y']")).click();
	}

}
