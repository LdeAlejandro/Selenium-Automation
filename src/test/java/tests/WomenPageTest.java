package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.WomenPage;

class WomenPageTest {
	
	private WomenPage womenPage;
	private final String URL = "https://magento.softwaretestingboard.com/";

	@BeforeEach
	void setUp() throws Exception {
		this.womenPage = new WomenPage();
		this.womenPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.womenPage.quitWebDriver();
	}

	@Test
	void test() {
		//when
		this.womenPage.viewTopWomenPage();
		
		//then
		Assertions.assertEquals("Tops", this.womenPage.getTitleCategoryPageText());
		Assertions.assertFalse(this.URL.equals(this.womenPage.getCurrentUrl()));
	}

}
