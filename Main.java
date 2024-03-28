public class Main {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();

        try {
            loginService.login("username", "wrongpassword");
        } catch (UserAttemptsExceededException | InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}