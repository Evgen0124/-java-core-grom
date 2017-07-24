package Lesson10.polyexample;

/**
 * Created by user on 16.07.2017.
 */
public class Child extends Human  {


    public Child(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Child class caled...");
        super.run();
    }
}
