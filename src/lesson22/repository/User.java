package lesson22.repository;

/**
 * Created by user on 11.02.2018.
 */
public class User {
    private  long id;
    private  String name;
    private  String sessionld;

    public User(long id, String name, String sessionld) {
        this.id = id;
        this.name = name;
        this.sessionld = sessionld;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSessionld() {
        return sessionld;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sessionld='" + sessionld + '\'' +
                '}';
    }
}
