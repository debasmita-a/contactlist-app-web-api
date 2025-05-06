/**
 * 
 */
package utils;

import java.time.ZoneId;

import com.github.javafaker.Faker;

import enitity.NewContactData;
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
	
	public static NewContactData getContactData() {
		return new NewContactData(
				FAKER.name().firstName(), 
				FAKER.name().lastName(),
				FAKER.date().birthday().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().toString(),
				FAKER.internet().emailAddress(),
				FAKER.phoneNumber().cellPhone(),
				FAKER.address().streetAddress(),
				FAKER.address().streetAddress(),
				FAKER.address().city(),
				FAKER.address().state(),
				FAKER.address().zipCode(),
				FAKER.address().country()
				);
				
	}
}
