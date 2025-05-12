package pages;

import org.openqa.selenium.By;

public class MyContactsPage extends BasePage{

	private static final By ADD_NEW_CONTACT_BTN = By.id("add-contact");
	private static final By LOGOUT_BTN = By.id("logout");
	private static final By CONTACT_TABLE = By.className("contactTable");
	
	public LoginPage doLogout() {
		waitAndClick(LOGOUT_BTN);
		return new LoginPage();
	}
	
	public AddContactPage doClickAddNewContactBtn() {
		clickWithWait(ADD_NEW_CONTACT_BTN, 5);
		return new AddContactPage();
	}
	
	
}
