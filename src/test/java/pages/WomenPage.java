package pages;

import org.openqa.selenium.By;

public class WomenPage extends BasePage {
	
	//Locators
	private By menuWomenLocator = By.cssSelector("#ui-id-2 > li.level0.nav-2.category-item.level-top.parent.ui-menu-item");
	private By submenuTopWomenLocator = By.id("ui-id-9");
	//private By submenuSubmenuJacketsTopWomenLocator = By.id("ui-id-11");
	private By titlePageCategoryName = By.className("base");
	
	public void viewTopWomenPage() {
		
		super.waitForVisibilityOfElementLocated(menuWomenLocator);
		if(super.isDisplayed(menuWomenLocator)) {
			super.actionMoveToElementPerform(menuWomenLocator);
			
			
			super.waitForVisibilityOfElementLocated(submenuTopWomenLocator);
			super.actionMoveToElementClickPerform(submenuTopWomenLocator);
			
		}
		else{
			System.out.println("menu Women was not found");
		}
	}
	
	public String getTitleCategoryPageText() {
		return super.getText(titlePageCategoryName);
	}

}
