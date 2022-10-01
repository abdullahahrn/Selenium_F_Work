package baseUtil;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseClass {
	protected WebDriver driver;
	protected HomePage homePage;

	@BeforeMethod
	public void setUp() {
		//absolute path:
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\aalha\\eclipse-workspace\\com.wellsfargo\\driver\\chromedriver.exe");
		//relative path:
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		//relative path:
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.wellsfargo.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
	}

	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
}