package models;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class UserInfo {
    String login;
    String password;

    public UserInfo(String login, String password){
        this.login = login;
        this.password = password;
    }

    public static void check(String login, String password, String confrim_password)
            throws WrongLoginException, WrongPasswordException {
            if (login == null || login.length() > 20 || !login.matches("^[a-zA-Z0-9_]+$")){
                throw new WrongLoginException("Login must be less than 20 characters and contain only letters, digits, and underscores.");
            }
            if (password == null || password.length() > 20 || !password.matches("^[a-zA-Z0-9_]+$")){
                throw new WrongPasswordException("Login must be less than 20 characters and contain only letters, digits, and underscores.");
            }
            if (password.equals(confrim_password)){
                throw new WrongPasswordException("Passwords must be equal");
            }
    }
}
