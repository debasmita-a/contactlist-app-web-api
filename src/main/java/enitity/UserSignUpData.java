package enitity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserSignUpData {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
