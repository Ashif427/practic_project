package Test_TestNG;

import org.testng.annotations.BeforeMethod;

public class NgTest {
	
	@BeforeMethod
	public void beforesuit() {
		System.out.print("Database connection");
	}

}
