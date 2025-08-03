import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PracTestNg {
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("DataBase Connection");

		
	}
	@Test
	public void test01 () {
		System.out.print("Test_01");
	}
}