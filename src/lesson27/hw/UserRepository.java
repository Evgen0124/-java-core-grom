package lesson27.hw;
import java.util.ArrayList;

/**
 * Created by user on 29.03.2018.
 */
public class UserRepository {
    private ArrayList<User> users = new ArrayList<>();

    public User save(User user){
        if (user == null)
            return null;

        if (findById(user.getId()) != null)
            return null;

        int index = 0;
        for (User user1 : users) {
            if (user1 == null) {
                users.add(user);
                break;
            }
            index++;
        }
        return user;
    }

    public User update(User user){
        if (user == null)
            return null;

        int index = 0;
        for (User user1 : users) {
            if (user1 == findById(user.getId())){
                users.add(user);
                break;
            }
            index++;
        }
        return user;
    }

    public void delete(long id){
        int index = 0;
        for (User user1 : users) {
            if (user1 == findById(user1.getId())){
                users.remove(user1);
                break;
            }
            index++;
        }
    }

    private User findById(long id){
        int index = 0;
        for (User user : users) {
            if (user != null && id == user.getId()){
                return users.get(index);
            }
            index++;
        }
        return null;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}

