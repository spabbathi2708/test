package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBaseLogin {
	
	public WebDriver driver=null;
	
	
	public void Login() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Sadhana\\workspace\\testNG\\testNG\\src\\framework\\datadriven.properties");
		prop.load(fis);
		//System.out.println(prop.getProperty("username"));
		if(prop.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		}
		else
		{
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("url"));
	}
	

}
