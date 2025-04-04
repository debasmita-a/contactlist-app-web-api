package enitity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
@Getter
@Builder
public class NewContactData {

	@NonNull
    private String firstName;
	@NonNull
    private String lastName;
    private String address;
    private String email;
    private String dob;
    private String city;
    private String state;
    private String country;
    private String postal;
    private String street1;
    private String street2;
    
}
