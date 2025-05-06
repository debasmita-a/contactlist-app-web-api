package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

	private static final By EMAIL_TEXT = By.cssSelector("#email");
	private static final By PASSWORD_TEXT = By.cssSelector("#password");
	private static final By SUBMIT_BTN = By.cssSelector("button#submit");
	private static final By SIGNUP_BTN = By.cssSelector("#signup");
	
	public MyContactsPage doLogin(String email, String password) {
		waitAndSendKeys(EMAIL_TEXT, email, 2);
		waitAndSendKeys(PASSWORD_TEXT, password, 2);
		clickWithWait(SUBMIT_BTN, 2);
		return new MyContactsPage();
	}
	
	public AddUserPage clickSignUpButton() {
		clickWithWait(SIGNUP_BTN,2);
		return new AddUserPage();
	}
}
