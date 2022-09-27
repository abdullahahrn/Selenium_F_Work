package testPages;

import org.testng.annotations.Test;
import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	@Test(enabled = true, priority = 1)

	public void logoTest() {
		homePage.logodisplayed();
	}

	@Test(enabled = true, priority = 2)
	public void aboutUsclicked() throws InterruptedException {
		homePage.aboutUsclicked();
	}

	@Test(enabled = true, priority = 3)
	public void ATMLocationclicked() throws InterruptedException {
		homePage.ATMLocationclicked();
	}

	@Test(enabled = true, priority = 4)
	public void clickloginButtonFieldTest() throws InterruptedException {
		homePage.loginButtonFieldclicked();
	}

	@Test(enabled = true, priority = 5)
	public void clickForgotUsernameOrPassword() throws InterruptedException {
		homePage.ForgotUsernameOrPasswordclicked();
		
	}

	@Test(enabled = true, priority = 6)
	public void clickSignonButton() throws InterruptedException {
		homePage.SignonButtonclicked();

	}

}
