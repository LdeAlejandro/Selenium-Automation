package dev.alejandro.automation.practice;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {
	
	private WebDriver driver;

	
	@BeforeEach
	void setUp() throws Exception {
	     System.getProperty("webdriver.chrome.driver", "drivers/chromedriver");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://practice.automationtesting.in/my-account/");
	        //driver.quit();
	}

	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}	

	@Test
	void test() {
		WebElement emailAddressElement = driver.findElement(By.id("username"));
		emailAddressElement.sendKeys("letzalet@gmail.com");
		
		WebElement passwordElement = driver.findElement(By.name("password"));
		passwordElement.sendKeys("QALetzalet091297%");
		
		WebElement loginSubmitElement = driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
		loginSubmitElement.click();
		
		//para tags
		//driver.findElement(By.tagName("h1"));
		
		WebElement loginMsgElement = driver.findElement(By.cssSelector("#page-36 > div > div.woocommerce > div"));
		String loggedInText = loginMsgElement.getText();
		
		Assertions.assertTrue(loggedInText.contains("Hello letzalet "));
		
	}

}
