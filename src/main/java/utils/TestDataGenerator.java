/**
 * 
 */
package utils;

import com.github.javafaker.Faker;

import enitity.UserSignUpData;

/**
 * Testdata will be generated using the Java Faker library.
 * 
 * Apr 4, 2025
 * @author Debasmita A
 */
public class TestDataGenerator {

	public static final Faker FAKER = new Faker();
	
	public static UserSignUpData getUserData() {
		return new UserSignUpData(
				FAKER.name().firstName(),
				FAKER.name().lastName(),
				FAKER.internet().emailAddress(),
				FAKER.internet().password()
				);
				
	}
}
