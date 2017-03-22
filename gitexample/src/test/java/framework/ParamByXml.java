/*
package framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamByXml {
	
		//invoke the browser
	@Test(priority=1)
  public void OpeningBrowser() 
	{
		System.out.println("Invoking Browser");
  }
	
	//book flight ticket
	@Test(priority=2)
	@Parameters({"userID"})
	public void flightBooking(String username)
	{
		System.out.println("booking done for " + username);
	}
	
	//cancel flight ticket
		@Test(priority=3)
		public void cancelFlight()
		{
			System.out.println("cancelling done");
		}
	
}
*/