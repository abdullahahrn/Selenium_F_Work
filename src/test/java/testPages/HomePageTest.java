package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {

	@Test(enabled = true, priority = 1)

	public void logoTest() throws InterruptedException {
		Thread.sleep(3000);
		homePage.logodisplayed();
		Thread.sleep(3000);
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
	public void redColorSignButtonFieldTest() throws InterruptedException {
		homePage.redColorSignonButtonclicked();
	}

	@Test(enabled = true, priority = 5)
	public void whitecolorSignonButtonclicked() throws InterruptedException {
		homePage.whitecolorSignonButtonclicked();

	}

	@Test(enabled = true, priority = 6)
	public void forgotUsernameOrPasswordclicked() throws InterruptedException {
		homePage.ForgotUsernameOrPasswordclicked();

	}

	@Test(enabled = true, priority = 7)
	public void Privacy_Cookies_and_Legal_clicked_Test() throws InterruptedException {
		homePage.Privacy_Cookies_Legal_clicked();
	}

	@Test(enabled = true, priority = 8) // Another way to show id attribute.
	public void searchbuttonIdclickedTest() throws InterruptedException {
		homePage.searchbuttonclicked();
	}

	@Test(enabled = true, priority = 9)
	public void clicked_Security_Center_Test() throws InterruptedException { // alternate X-path use.
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Security Center']")).click();
		Thread.sleep(5000);

	}

	@Test(enabled = true, priority = 10)
	public void redcolorsignonbuttonclickedTest() throws InterruptedException { // By.name attribute.
		Thread.sleep(3000);
		driver.findElement(By.name("btnSignon")).click();
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 11)
	public void startNowButtonClicked() throws InterruptedException { // By.Class name attribute.
		Thread.sleep(3000);
		driver.findElement(By.className("ps-btn-secondary")).click();
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 12)
	public void privacyCookiesandLegal() throws InterruptedException { // By.linkText attribute.
		Thread.sleep(3000);
		driver.findElement(By.linkText("Privacy, Cookies, and Legal")).click();
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 13)
	public void privacyCookiesandLegal01() throws InterruptedException { // partialLinkText attribute.
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Privacy, Cookies, an")).click();
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 14)
	public void whiteColorsignonbuttonclicked() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.ps-sign-on-text")).click();
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 15)
	public void findaLocationClicked() throws InterruptedException {
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);// wells-Fargo doesn't have that kind of attribute.that's why i connected it.
		driver.findElement(By.cssSelector("input.gh-tb.ui-autocomplete-input")).click();
		Thread.sleep(3000);
	}

//	@Test(enabled = true, priority = 16)
//	public void redcolorSignOnButtonClicked() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("//input[@name='btnSignon']")).click();
//		Thread.sleep(3000);

	@Test(enabled = true, priority = 17)
	public void redcolorSignOnButtonClicked01() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.ps-btn-primary[name='btnSignon']")).click();// . using dot in CSS
																								// selector.
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 17)
	public void redcolorSignOnButtonClicked02() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#btnSignon[name='btnSignon']")).click();// # Using # in CSS selector.
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 17)
	public void tableTest() throws InterruptedException { // tag name attribute for CSS selector.
		driver.get("https://www.ebay.com/");
		String t = driver.findElement(By.tagName("table")).getText();
		System.out.println("the text is:" + t);
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 18)
	public void logoTest02() { // is displayed() method Available for image,link,button,text field, check box
								// etc.
		boolean elementDisplayed = driver.findElement(By.xpath(
				"//img[@src='https://www17.wellsfargomedia.com/assets/images/rwd/Navtive_App_Phone_Personal.png']"))
				.isDisplayed();
		System.out.println("is this logo diplayed? ans: " + elementDisplayed);

	}

	@Test(enabled = true, priority = 19)
	public void redColorSignonButtonClickedTest() throws InterruptedException {
		boolean signonButtonEnabled = driver.findElement(By.id("btnSignon")).isDisplayed();
		Thread.sleep(3000);
		System.out.println("is this sign on button enable? Ans:" + signonButtonEnabled);
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 20)
	public void save_Username_Is_Selected_Test() throws InterruptedException {
		Thread.sleep(3000);
		boolean checkBoxSelected = driver.findElement(By.cssSelector("input#save-username")).isSelected();
		System.out.println("is this check box selected? ans: " + checkBoxSelected);
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 21)
	public void A_Use_Of_gettitle_method() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("the title of the page is: " + driver.getTitle());
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 22)
	public void A_use_of_gettext_method() throws InterruptedException {
		Thread.sleep(3000);
		WebElement text = driver.findElement(By.xpath("//a[contains(text(), 'Enroll')]"));
		System.out.println("the text is for webelement is: " + text.getText());
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 23)
	public void use_op_getCurrentURL_method() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(), 'Enroll')]")).click();
		Thread.sleep(3000);
		System.out.println("the current URL is: " + driver.getCurrentUrl());
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 24)
	public void use_of_getattribute_method() {
		String value01 = driver.findElement(By.xpath("//input[@id='btnSignon']")).getAttribute("id");
		String value02 = driver.findElement(By.xpath("//input[@id='btnSignon']")).getAttribute("name");
		String value03 = driver.findElement(By.xpath("//input[@id='btnSignon']")).getAttribute("class");
		String value04 = driver.findElement(By.xpath("//input[@id='btnSignon']")).getAttribute("type");
		String value05 = driver.findElement(By.xpath("//input[@id='btnSignon']")).getAttribute("value");
		System.out.println("the value of the id attribute is : " + value01);
		System.out.println("the value of the name attribute is : " + value02);
		System.out.println("the value of the class attribute is : " + value03);
		System.out.println("the value of the type attribute is : " + value04);
		System.out.println("the value of the value attribute is : " + value05);

	}

	@Test(enabled = true, priority = 25)
	public void a_use_of_sendKeys_method() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("abcdef_12345");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456789");
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 26)
	public void a_use_of_sendkeys_method_then_click_submit_and_click_clear01() throws InterruptedException {
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("T-shirts");
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 27)
	public void a_use_of_sendkeys_method_then_click_by_enter_and_click_clear() throws InterruptedException {
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("T-shirts", Keys.RETURN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		Thread.sleep(3000);
	}

	@Test(enabled = true, priority = 28)
	public void use_of_navigate_method() throws InterruptedException {

		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);

	}

	@Test(enabled = true, priority = 29) // Another way to show id attribute.
	public void set_a_specific_size_of_windows() throws InterruptedException {
		Dimension dimention = new Dimension(800, 500);
		driver.manage().window().setSize(dimention);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		System.out.println("the size is for screen is: " + driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().setSize(dimention);
		Thread.sleep(3000);
		System.out.println("the size is for screen is: " + driver.manage().window().getSize());

	}

}
