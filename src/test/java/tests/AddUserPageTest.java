package tests;

import java.util.stream.Stream;

import org.testng.annotations.Test;

import base.BaseTest;
import enitity.UserSignUpData;
import io.github.sskorol.core.DataSupplier;
import pages.AddUserPage;
import pages.LoginPage;
import utils.TestDataGenerator;

public class AddUserPageTest extends BaseTest{
	
	@DataSupplier
	public Stream<UserSignUpData> getData(){
		UserSignUpData data = TestDataGenerator.getUserData();
		return Stream.of(data);
	}

	@Test(dataProvider="getData", description= "User should be able to sign up with valid info")
	public void addUserTest(UserSignUpData data) {
		LoginPage loginPage = new LoginPage();
		AddUserPage page = loginPage.clickSignUpButton();
		page.enterFirstName(data.getFirstName()).enterLastName(data.getLastName())
		.enterEmail(data.getEmail())
		.enterPassword(data.getPassword())
		.doSubmit();
		//TODO : assert with my contacts page title / url / Logout button
	}

	@Test(description = "User should not be able to sign up with same email ID")
	public void emailExistsErrorTest(){ 
		//TODO : provide test data accordingly

	}

}
