package lesson10.polyexample;

/**
 * Created by user on 15.07.2017.
 */
public class User extends  Human {

    public User(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("User class caled...");
        super.run();
    }
}
