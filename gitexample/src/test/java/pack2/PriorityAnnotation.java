package pack2;

import org.testng.annotations.Test;

public class PriorityAnnotation {

	@Test
	public void invokeBrowser() {
		// Invoking Browser
		System.out.println("Launch Browser");
	}

	@Test(dependsOnMethods = { "invokeBrowser" })
	public void flightBooking() {
		// Book flight ticket
		System.out.println("booking done");
	}
	
	@Test(enabled=true)
	//@Test(enabled=false)
	public void payment()
	{
		System.out.println("Payment verification");
	}
	
	@Test(timeOut=5000)
	public void cardPayment()
	{
		System.out.println("Processing payment");
	}

}
