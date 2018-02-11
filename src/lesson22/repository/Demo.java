package lesson22.repository;

import java.util.Arrays;

/**
 * Created by user on 11.02.2018.
 */
public class Demo {
    public static void main(String[] args) {
User user1 = new User(1001,"Danil","-pojjl12" );
        UserRepository.save(user1);
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));
        User user2 = new User(1002,"Andrey","fsdkjhsghs" );
        UserRepository.save(user2);
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));
    }
}
