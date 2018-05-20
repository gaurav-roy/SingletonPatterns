import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		DriverInIt instanceDriver = DriverInIt.getInstance();
		driver = instanceDriver.openBrowser();
	}
	
	@Test
	public void test1() {
		driver.get("https://www.google.com");  
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
