public class LoginService {
    private static final int MAX_LOGIN_ATTEMPTS = 3;
    private int loginAttempts;

    public LoginService() {
        this.loginAttempts = 0;
    }

    public void login(String username, String password) throws UserAttemptsExceededException, InvalidPasswordException {
        if (loginAttempts >= MAX_LOGIN_ATTEMPTS) {
            throw new UserAttemptsExceededException("Maximum login attempts exceeded.");
        }

        if (!password.equals("password")) {
            throw new InvalidPasswordException("Invalid password.");
        }

        loginAttempts++;
    }
}