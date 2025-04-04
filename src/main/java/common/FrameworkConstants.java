package common;

public class FrameworkConstants {

    public static final int SHORT_TIMEOUT = 5;
    public static final int LONG_TIMEOUT = 10;

    //App constants::

    public static final String LOGIN_PAGE_TITLE = "Contact List App";
    public static final String CONTACTS_PAGE_TITLE = "My Contact";

    public static final String LOGIN_ERROR_MESSAGE = "Incorrect username or password";
    public static final String USER_SIGNUP_ERROR_MESSAGE = "User validation failed";
    public static final String SIGNUP_EMAIL_EXISTS_ERROR = "Email address is already in use";
    
    private static final String CONFIGFILEPATH = "";

	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}
    

}
