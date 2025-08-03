
package Test_TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import 	org.testng.annotations.BeforeClass;
import  org.testng.annotations.*;



public class Method_testNg {
	
	WebDriver driver;
	
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("DataBase Connection"); //1
	}
	
	@BeforeClass  
	public void BeforeClass() {
		
		System.out.println("Launch Browser");//2
	    driver= new ChromeDriver();
		driver.get("http://49.249.28.218:8888/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
    @BeforeMethod
	public void beforeMethod() {
		System.out.println("Login Application");//3
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

	}

   @AfterMethod
    public void AfterMethod() {
		System.out.println("Logout Application");//5
		Actions action = new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		action.moveToElement(move).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
		
	}
    @org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("closeing Browser");//6
		driver.close();
	}
    @AfterSuite
	public void AfterSuite() {
		System.out.println("Close Database connection ");//7
	}

	@Test
	public void test() throws InterruptedException {
		System.out.println(" Test Application");//4
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='index.php?module=Accounts&action=index'])[1]")).click();
		
	}

	@Test
	public void test02() {
		System.out.println("Test_02");
		
	

}

@Test
public void test03() {
	System.out.println("Test_03");
    }
}

