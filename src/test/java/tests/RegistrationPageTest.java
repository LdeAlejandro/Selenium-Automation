package tests;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.RegistrationPage;


class RegistrationPageTest {
	
	private RegistrationPage registrationPage;
	private final String URL = "https://magento.softwaretestingboard.com/customer/account/create/";

	@BeforeEach
	void setUp() throws Exception {
		registrationPage = new RegistrationPage();
		registrationPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		registrationPage.quitWebDriver();
	}

	@Test
	void successfulRegistrationTest() {
		//when
		this.registrationPage.signUp();
		
		//then
		Assertions.assertFalse(this.registrationPage.getCurrentUrl().equals(this.URL));
		/*string comparison
		String expectedRegistrationMsg = "Thank you for registering with Main Website Store.";
		String actualRegistrationMsg = this.registrationPage.UserRegisteredMsg();
		Assertions.assertEquals(expectedRegistrationMsg, actualRegistrationMsg);
		*/
		
		Assertions.assertTrue(this.registrationPage.UserRegisteredMsg());
	}

}
