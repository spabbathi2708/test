package datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookExample {
	
	WebDriver driver =null;
	
	@Test
	@Parameters({"userID", "password"})
	public void Facebook(String username, String password)
	{
		System.setProperty("webdriver.gecko.driver", "C://geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();

	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
}
