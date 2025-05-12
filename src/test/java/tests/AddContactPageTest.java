package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import enitity.NewContactData;
import pages.AddContactPage;
import pages.LoginPage;
import pages.MyContactsPage;
import utils.JSONFileReader;
import utils.TestDataGenerator;

public class AddContactPageTest extends BaseTest{

	
	@DataProvider
	public Object[] getContactData() {
		NewContactData contactData_1 = TestDataGenerator.getContactData();
		//NewContactData contactData_2 = TestDataGenerator.getContactData();
		//NewContactData contactData_3 = TestDataGenerator.getContactData();
		return new Object[] {contactData_1};
	}
	
	@Test(dataProvider="getContactData")
	public void addAContactTest(NewContactData contactData) {
		LoginPage loginPage = new LoginPage();
		MyContactsPage contactsPage = loginPage.doLogin(JSONFileReader.getDataWithMap("email"), JSONFileReader.getDataWithMap("password"));
		AddContactPage addContactPage = contactsPage.doClickAddNewContactBtn();
		addContactPage.createANewContact(contactData);
	}
	
	@Test(dataProvider="getContactData")
	public void addAContactWithLoginInAPITest(NewContactData contactData) {
		MyContactsPage contactsPage = new MyContactsPage();
		AddContactPage addContactPage = contactsPage.doClickAddNewContactBtn();
		addContactPage.createANewContact(contactData);
	}
}
