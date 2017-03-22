/*
package framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	@BeforeMethod()
	public void logindetailsGeneration()
	{
		System.out.println("userID generated before each test case");
	}
	@BeforeTest
	public void DeleteCookie()
	{
		System.out.println("delete cookies before starting the test");
	}
	
	@AfterTest
	public void DeleteCookies()
	{
		System.out.println("Delete all the cookies after the test");
	}
	@AfterMethod
	public void aftermethodDemo()
	{
		System.out.println("This should execute after each test case");
	}
	
	//invoke the browser
	@Test
  public void AOpeningBrowser() 
	{
		System.out.println("Invoking Browser");
  }
	
	//book flight ticket
	@Test(groups={"Priority1"})
	public void flightBooking()
	{
		System.out.println("booking done");
	}
	
	//cancel flight ticket
		@Test(groups={"Priority2"})
		public void cancelFlight()
		{
			System.out.println("cancelling done");
		}
	@AfterSuite
	public void Deinstall()
	{
		System.out.println("I will execute in the last");
	}
}
*/
