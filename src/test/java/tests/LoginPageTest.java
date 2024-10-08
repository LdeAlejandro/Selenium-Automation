package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

class LoginPageTest {
	
	private LoginPage loginPage;
	private final String URL = "https://magento.softwaretestingboard.com/customer/account/login/";
	

	@BeforeEach
	void setUp() throws Exception {
		loginPage = new LoginPage();
		loginPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		loginPage.quitWebDriver();
	}

	@Test
	void LoginTest() {
		//when
		loginPage.signIn();
		
		//then
		Assertions.assertTrue((this.loginPage.loggedInAccountMsg()).equals("My Account"));
		Assertions.assertFalse(this.loginPage.getCurrentUrl().equals(this.URL));
	}
}
