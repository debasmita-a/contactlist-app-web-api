package tests;

import java.io.File;

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
	
	@Test
	public void loginUserTest() {
		File loginData = new File(System.getProperty("user.dir") + "/config/userlogin.json");
		String jsonData = "{\r\n"
				+ "	\"email\" : \"gale.shanahan@hotmail.com\",\r\n"
				+ "	\"password\" : \"yfffs9ffmcz1\"\r\n"
				+ "}";
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				//.header("Authorization", "Bearer" + " " + UserAPI.getToken())
				.log().all()
				.body(loginData)
				.post(LOGIN_URL);
		response.then().statusCode(200);

		response.prettyPrint();
		System.out.println(response.getStatusCode());
		System.out.println(response.getCookie("token"));
		System.out.println(response.jsonPath().getString("user._id"));
	
	}

}
