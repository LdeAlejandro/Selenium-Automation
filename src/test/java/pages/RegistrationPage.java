package pages;

import java.time.Duration;

import org.openqa.selenium.By;

public class RegistrationPage extends BasePage {
	
	//Locators
	private By firstName = By.id("firstname");
	private By lastName = By.id("lastname");
	private By email = By.id("email_address");
	private By password = By.id("password");
	private By passwordConfirmation = By.id("password-confirmation");
	private By createAccountBtn = By.cssSelector("#form-validate > div > div.primary > button");
	private By registrationMsgSuccess = By.cssSelector("#maincontent > div.page.messages > div:nth-child(2) > div > div > div");
	
	
	public void signUp() {
		fillOutForm();
	}
	
		/*//checking string
		 * public String UserRegisteredMsg(){
		 * 	super.waitForVisibilityOfElementLocated(registrationMsgSuccess, Duration.ofSeconds(5));
			return super.getText(registrationMsgSuccess);
		}
		 */
	
		public Boolean UserRegisteredMsg() {
			super.waitForVisibilityOfElementLocated(registrationMsgSuccess, Duration.ofSeconds(5));
			String successMsg = super.getText(registrationMsgSuccess);
			return super.isContainedInPageSource(successMsg);
		}
		
		public void fillOutForm() {
			super.waitForVisibilityOfElementLocated(passwordConfirmation);
			if(super.isDisplayed(firstName)) {
				super.type("Juanito", firstName);
				super.type("Garcia", lastName);
				super.type("test12122223@gmail.com", email);
				super.type("LLJuanito9#", password);
				super.type("LLJuanito9#", passwordConfirmation);
				click(createAccountBtn);
			}else {
				
				System.out.println("Missing required text box or unexpected error");
				
				}	
		}
}






