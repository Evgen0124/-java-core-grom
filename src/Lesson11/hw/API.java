package Lesson11.hw;

/**
 * Created by user on 09.08.2017.
 */
public interface API {
    Room[] findRooms(int price, int persons,String city, String hotel);
        Room[] getAll();

}
