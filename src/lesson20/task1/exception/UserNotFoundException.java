package lesson20.task1.exception;

/**
 * Created by user on 01.12.2017.
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException(String message) {
        super(message);
    }
}
