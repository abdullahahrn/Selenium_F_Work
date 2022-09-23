package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

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

	@FindBy(xpath = "//input[@id='btnSignon']")
	WebElement loginButton;

	@FindBy(xpath = "//a[text()='Forgot username or password?']")
	WebElement forgotUsernameOrPassword;

	@FindBy(xpath = "//a[text()='Sign On']")
	WebElement clickSignonButton;

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

	public void loginButtonFieldclicked() throws InterruptedException {
		Thread.sleep(3000);
		loginButton.click();
		Thread.sleep(3000);
	}

	public void ForgotUsernameOrPasswordclicked() throws InterruptedException {
		Thread.sleep(3000);
		forgotUsernameOrPassword.click();
		Thread.sleep(3000);
	}

	public void SignonButtonclicked() throws InterruptedException {
		Thread.sleep(3000);
		clickSignonButton.click();
		Thread.sleep(3000);
	}

}
