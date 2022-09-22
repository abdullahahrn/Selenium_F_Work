package testPages;

import org.testng.annotations.Test;
import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	@Test

	public void logoTest() {
		homePage.logodisplayed();
	}
}