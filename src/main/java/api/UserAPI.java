package api;

import enitity.UserLogin;
import enitity.UserSignUpData;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public final class UserAPI {
	
	private UserAPI() {}
	
	private static final String BASE_URL = "https://thinking-tester-contact-list.herokuapp.com/users";
	
	public static Response getUsers() {
		return RestAssured.given()
		.baseUri(BASE_URL)
		.get();
	}
	
	public static Response addUser(UserSignUpData userData) {
		return RestAssured.given()
		.header("Authorization", "${token}")
		.contentType(ContentType.JSON)
		.body(userData)
		.post();
	}
	
	public static String getToken() {
		UserLogin user = new UserLogin();
		user.setEmail("gale.shanahan@hotmail.com");
		user.setPassword("yfffs9ffmcz1");
		
		Response response =  RestAssured.given()
		.contentType(ContentType.JSON)
		.baseUri(BASE_URL)
		.body(user)
		.post("/login");
		
		return  response.jsonPath().getString("token");
	}

}
