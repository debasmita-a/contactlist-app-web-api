package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AddUserPage;

public class AddUserPageTest extends BaseTest{
	
	@Test
	public void addUserTest() {
		AddUserPage page = new AddUserPage();
		page.enterFirstName("Curran").enterLastName("Lennert")
		.enterEmail("testakiko@gmail.com")
		.enterPassword("tyuierto")
		.doSubmit();
	}

}
