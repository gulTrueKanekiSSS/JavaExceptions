import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;
import models.UserInfo;

public class Main {
    public static void main(String[] args) {
        String login = "MyHomework";
        String password = "password1234";
        String confirmPassword = "password1234";

        try {
            UserInfo.check(login, password, confirmPassword);
            UserInfo user = new UserInfo(login, password);
            System.out.println("User credentials are valid.");
        } catch (WrongLoginException e) {
            System.out.println("Login validation error: " + e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Password validation error: " + e.getMessage());
        }
    }
}