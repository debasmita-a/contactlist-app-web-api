package pages;

import org.openqa.selenium.By;

import enitity.NewContactData;

public class AddContactPage extends BasePage{

	private static final By FIRST_NAME_TXT = By.id("firstName");
	private static final By LAST_NAME_TXT = By.id("lastName");
	private static final By DOB_TXT = By.id("birthdate");
	private static final By EMAIL_TXT = By.id("email");
	private static final By PHONE_TXT = By.id("phone");
	private static final By ST_ADDR1_TXT = By.id("street1");
	private static final By ST_ADDR2_TXT = By.id("street2");
	private static final By CITY_TXT = By.id("city");
	private static final By STATE_TXT = By.id("stateProvince");
	private static final By POSTAL_CODE_TXT = By.id("postalCode");
	private static final By COUNTRY_TXT = By.id("country");
	
	private static final By SUBMIT_BTN = By.id("submit");
	private static final By CANCEL_BTN = By.id("cancel");
	
	private AddContactPage enterFirstName(String fname) {
		waitAndSendKeys(FIRST_NAME_TXT, fname, 2);
		return this;
	}
	
	private AddContactPage enterLastName(String lname) {
		waitAndSendKeys(LAST_NAME_TXT, lname, 2);
		return this;
	}
	
	private AddContactPage enterDOB(String dob) {
		waitAndSendKeys(DOB_TXT, dob, 2);
		return this;
	}
	
	private AddContactPage enterEmail(String email) {
		waitAndSendKeys(EMAIL_TXT, email, 2);
		return this;
	}
	
	private AddContactPage enterPhone(String phone) {
		waitAndSendKeys(PHONE_TXT, phone, 2);
		return this;
	}
	
	private AddContactPage enterStreetAddr1(String streetAddr1) {
		waitAndSendKeys(ST_ADDR1_TXT, streetAddr1, 2);
		return this;
	}
	
	private AddContactPage enterStreetAddr2(String streetAddr2) {
		waitAndSendKeys(ST_ADDR2_TXT, streetAddr2, 2);
		return this;
	}
	
	private AddContactPage enterCity(String city) {
		waitAndSendKeys(CITY_TXT, city, 2);
		return this;
	}
	
	private AddContactPage enterStateOrProvince(String state) {
		waitAndSendKeys(STATE_TXT, state, 2);
		return this;
	}
	
	private AddContactPage enterPostalCode(String postalCode) {
		waitAndSendKeys(POSTAL_CODE_TXT, postalCode, 2);
		return this;
	}
	
	private AddContactPage enterCountry(String country) {
		waitAndSendKeys(COUNTRY_TXT, country, 2);
		return this;
	}
	
	public MyContactsPage doSubmit() {
		waitAndClick(SUBMIT_BTN);
		return new MyContactsPage();
	}
	
	public MyContactsPage doCancel() {
		waitAndClick(CANCEL_BTN);
		return new MyContactsPage();
	}
	
	public MyContactsPage createANewContact(NewContactData contactData) {
		return enterFirstName(contactData.getFirstName())
		.enterLastName(contactData.getLastName())
		.enterDOB(contactData.getDob())
		.enterEmail(contactData.getEmail())
		.enterPhone(contactData.getPhoneNumber())
		.enterStreetAddr1(contactData.getStreet1())
		.enterStreetAddr2(contactData.getStreet2())
		.enterCity(contactData.getCity())
		.enterStateOrProvince(contactData.getState())
		.enterPostalCode(contactData.getPostal())
		.enterCountry(contactData.getCountry())
		.doSubmit();
	}
	
	
}
