package baseUtil;

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
		driver.get("https://www.wellsfargo.com/");
		driver.manage().window().maximize();
		homePage= new HomePage(driver);			
	}	
	@AfterMethod
	public void tearUp() {
	driver.quit();
	}
}