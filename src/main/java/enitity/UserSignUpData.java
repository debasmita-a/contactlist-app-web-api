package enitity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@ToString
@Builder
public class UserSignUpData {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
