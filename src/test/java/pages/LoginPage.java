package pages;

import org.openqa.selenium.By;

public class LoginPage  extends BasePage{
	
	//Locators
	private By emailAddressLocator = By.id("email");
	private By passwordLocator = By.name("login[password]");
	private By loginSubmitLocatorBtn = By.xpath("//*[@id=\"send2\"]");
	private By loggedInMsgLocator = By.cssSelector("h1");
	
	// Getter for loginSubmitLocatorBtn
    public By getLoginSubmitLocatorBtn() {
        return loginSubmitLocatorBtn;
    }

	
	public void signIn() {
		if(super.isDisplayed(emailAddressLocator)) {
			super.type("letzalet@gmail.com", emailAddressLocator);
			super.type("LLetzalet091297%", passwordLocator);
			super.click(loginSubmitLocatorBtn);
			
		}else {
			System.out.println("Email Textbox was not present");
			}	
	}
	
	public String loggedInAccountMsg() {
		return super.getText(loggedInMsgLocator);
		
	}

}
