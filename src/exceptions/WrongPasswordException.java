package exceptions;

public class WrongPasswordException extends ValidationException{
    public WrongPasswordException(String message){
        super(message);
    }
}
