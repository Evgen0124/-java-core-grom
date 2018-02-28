package lesson20.task2;

/**
 * Created by user on 01.12.2017.
 */
public class LimitExceeded extends BadRequestException {
    public LimitExceeded(String message) {
        super(message);
    }
}
