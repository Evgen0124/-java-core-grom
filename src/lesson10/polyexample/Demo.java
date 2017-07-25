package lesson10.polyexample;

/**
 * Created by user on 16.07.2017.
 */
public class Demo {
    public static void main(String[] args) {
Human human = new Human("Test");
        run(human);
        User user = new User("Jeck");
                run(user);
    }
    private  static  void  run(Human human){
        human.run();
    }
}
