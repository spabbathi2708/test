
/*package datadriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotation {

	@Test(dataProvider = "getData")
	public void login(String username, String password) {
		System.out.println("userID generated before each test case");
		System.out.println(username);
		System.out.println(password);
	}

	// invoke the browser
	@Test
	public void AOpeningBrowser() {
		System.out.println("Invoking Browser");
	}

	// book flight ticket
	@Test()
	public void flightBooking() {
		System.out.println("booking done");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][2];
		data[0][0] = "sadhana";
		data[0][1] = "reddy";
		data[1][0] = "sadhana";
		data[1][1] = "reddy";
		return data;
	}

	// cancel flight ticket
	@Test()
	public void cancelFlight() {
		System.out.println("cancelling done");
	}

}
*/