package lesson15.api;

import Lesson11.hw.Room;

/**
 * Created by user on 30.09.2017.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();
}
