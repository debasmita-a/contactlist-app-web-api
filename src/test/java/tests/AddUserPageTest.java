package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AddUserPage;

public class AddUserPageTest extends BaseTest{
	
	@Test
	public void addUserTest() {
		AddUserPage page = new AddUserPage();
		page.enterFirstName("test56").enterLastName("last678")
		.enterEmail("testakiko@gmail.com")
		.enterPassword("tyuierto")
		.doSubmit();
	}

}
