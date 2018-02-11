package lesson22.task2.exeption;

/**
 * Created by user on 01.12.2017.
 */
public class LimitExceeded extends BadRequestException {
    public LimitExceeded(String message) {
        super(message);
    }
}
