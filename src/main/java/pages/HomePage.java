package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	protected WebDriver driver;
	protected HomePage homepage;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@alt='Wells Fargo Home Page']")
	WebElement logo;

	@FindBy(xpath = "//a[text()='About Us']")
	WebElement aboutUs;

	@FindBy(xpath = "//a[text()='ATMs/Locations']")
	WebElement ATMLocation;

	@FindBy(xpath = "//a[text()='Privacy, Cookies, and Legal']")
	WebElement Privacy_Cookies_Legal;

	@FindBy(id = "btnSignon")
	WebElement redColorSignonButton;

	@FindBy(how = How.XPATH, using = "//a[text()='Forgot username or password?']")
	WebElement forgotUsernameOrPassword;

	@FindBy(xpath = "//a[text()='Sign On']")
	WebElement whitecolorSignonButton;

	@FindBy

	By searchbuttonclicked = By.id("nxgSearchButton");

	public boolean logodisplayed() {
		boolean flag = logo.isDisplayed();
		System.out.println("is this logo displayed? " + flag);
		return flag;

	}

	public void aboutUsclicked() throws InterruptedException {
		Thread.sleep(3000);
		aboutUs.click();
		Thread.sleep(3000);
	}

	public void ATMLocationclicked() throws InterruptedException {
		Thread.sleep(3000);
		ATMLocation.click();
		Thread.sleep(3000);

	}

	public void Privacy_Cookies_Legal_clicked() throws InterruptedException {
		Thread.sleep(3000);
		Privacy_Cookies_Legal.click();
		Thread.sleep(3000);

	}

	public void redColorSignonButtonclicked() throws InterruptedException {
		Thread.sleep(3000);
		redColorSignonButton.click();
		Thread.sleep(3000);
	}

	public void whitecolorSignonButtonclicked() throws InterruptedException {
		Thread.sleep(3000);
		whitecolorSignonButton.click();
		Thread.sleep(3000);
	}

	public void ForgotUsernameOrPasswordclicked() throws InterruptedException {
		Thread.sleep(3000);
		forgotUsernameOrPassword.click();
		Thread.sleep(3000);
	}

	public void searchbuttonclicked() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(searchbuttonclicked).click();
		Thread.sleep(3000);

	}

}
