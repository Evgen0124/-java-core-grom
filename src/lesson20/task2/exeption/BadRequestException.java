package lesson20.task2.exeption;

/**
 * Created by user on 01.12.2017.
 */
public class BadRequestException extends  Exception {
    public BadRequestException(String message) {
        super(message);
    }
}
