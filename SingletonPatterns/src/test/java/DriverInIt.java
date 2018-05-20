import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInIt {
	
	private static  DriverInIt instanceDriver = null;
	private WebDriver driver;
	
	private DriverInIt() {
		String str = "Hello";
		System.out.println(str);
		
	}
	//Base class
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GAURAV\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		return  driver;
		
	}
	//getInstance method and  we have to achieve Lazy Initialization if we have to achieve singleton Pattern
	public static DriverInIt getInstance() {
		if(instanceDriver == null)// it has to be null then only it will be initialized.
			instanceDriver = new DriverInIt();
		return instanceDriver;
		
	}
	

}
