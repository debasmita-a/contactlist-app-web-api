package tests;

import java.util.stream.Stream;

import org.testng.annotations.Test;

import base.BaseTest;
import enitity.UserSignUpData;
import io.github.sskorol.core.DataSupplier;
import pages.AddUserPage;

public class AddUserPageTest extends BaseTest{
	
	@DataSupplier
	public Stream<UserSignUpData> getData(){
		UserSignUpData data = new UserSignUpData("Kate", "Stewart", "kate123@gmail.com", "TestPass123");
		return Stream.of(data);
	}

	@Test(dataProvider="getData", description= "User should be able to sign up with valid info")
	public void addUserTest(UserSignUpData data) {
		AddUserPage page = new AddUserPage();
		page.enterFirstName(data.getFirstName()).enterLastName(data.getLastName())
		.enterEmail(data.getEmail())
		.enterPassword(data.getPassword())
		.doSubmit(); //assert with my contacts page title / url / Logout button
	}

	@Test(description = "User should not be able to sign up with same email ID")
	public void emailExistsErrorTest(){ //provide test data accordingly

	}

}
