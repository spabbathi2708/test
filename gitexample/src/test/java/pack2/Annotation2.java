package pack2;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation2 {
	
	@BeforeSuite
	public void Install()
	{
		System.out.println("I will execute first");
	}
	@Test
	public void CFlightBooking()
	{
		System.out.println("flight booking");
	}

}
