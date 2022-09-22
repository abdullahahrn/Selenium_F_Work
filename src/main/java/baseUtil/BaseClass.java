package baseUtil;
/*
 * Create a maven project of your own and show the URL is running and opening the page. Please add maximize(), deleteAllCookies(), pageLoadTimeOut(), implicitlyWait() in the BaseClass. In the home page, validate the logo, the way I validated. Use click() method to click webeElement, create at least 5. Use @FindBy to find web Elelement. You can use at least one as HOW keyword. Use Thread.sleep() to know use of it. Use enabled and priority keyword in test method along with @Test. Push to the github and share the link below
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	WebDriver driver;
	protected HomePage homePage;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aalha\\eclipse-workspace\\com.wellsfargo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.wellsfargo.com/");
		driver.manage().window().maximize();
		homePage= new HomePage(driver);			
	}	
	@AfterMethod
	public void tearUp() {
	driver.quit();
	}
}