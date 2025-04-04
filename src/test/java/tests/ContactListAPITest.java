package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import api.UserAPI;
import enitity.UserSignUpData;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import utils.TestDataGenerator;

public class ContactListAPITest {

	private static final String BASE_URL = "https://thinking-tester-contact-list.herokuapp.com/users";
	private static final String LOGIN_URL = "https://thinking-tester-contact-list.herokuapp.com/users/login";
	private static String TOKEN = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2N2VlNGJjMzRhMDAwNDAwMTM5ZGI3OWUiLCJpYXQiOjE3NDM2NzQyNzh9.DGrruxR9PBg9xK8f9h5rFnEtjpJFcq5OZU3bcuakfeE";
	
	@DataProvider
	public static Object[] getUserData(){
		return new Object[] {
			TestDataGenerator.getUserData(),
		};
	}
	
	@Test(dataProvider="getUserData")
	public void addUserTest(UserSignUpData userData) {
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.header("Authorization", "Bearer" + " " + UserAPI.getToken())
		.log().all()
		.body(userData)
		.post(BASE_URL);
		
		response.prettyPrint();
		
		System.out.println(response.getStatusCode());
	}

}
