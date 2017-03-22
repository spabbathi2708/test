package framework;

import java.io.IOException;

import org.testng.annotations.Test;

@Test
public class PriorityAnnotation extends TestBaseLogin{

	
	public void invokeBrowser() {
		// Invoking Browser
		System.out.println("Launch Browser");
	}

	public void flightBooking() throws IOException, InterruptedException {
		
		Login();
		System.out.println("booking done");
		Thread.sleep(4000);
		driver.quit();
	}
	
	public void payment()
	{
		System.out.println("Payment verification");
	}
	
	public void cardPayment()
	{
		System.out.println("Processing payment");
		
	}

}
