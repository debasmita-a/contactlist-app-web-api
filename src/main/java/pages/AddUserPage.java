package pages;

import org.openqa.selenium.By;

public class AddUserPage extends BasePage{
	
	private static final By FIRST_NAME = By.id("firstName");
	private static final By LAST_NAME = By.id("lastName");
	private static final By EMAIL = By.id("email");
	private static final By PASSWORD = By.id("password");
	private static final By SUBMIT_BTN = By.id("submit");
	
	public AddUserPage enterFirstName(String firstname) {
		waitAndSendKeys(FIRST_NAME, firstname);
		return this;
	}
	
	public AddUserPage enterLastName(String lastname) {
		waitAndSendKeys(LAST_NAME, lastname);
		return this;
	}
	
	public AddUserPage enterEmail(String email) {
		waitAndSendKeys(EMAIL, email);
		return this;
	}
	
	public AddUserPage enterPassword(String password) {
		waitAndSendKeys(PASSWORD, password);
		return this;
	}
	
	public MyContactsPage doSubmit() {
		waitAndClick(SUBMIT_BTN);
		return new MyContactsPage();
	}
	

}
