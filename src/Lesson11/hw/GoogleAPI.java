package Lesson11.hw;

/**
 * Created by user on 20.08.2017.
 */
public class GoogleAPI implements API {
    private Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] notFindRoom = new Room[0];
        if (rooms.length == 0) {

            return notFindRoom ;
        }

        int countFindRooms = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null && rooms[i].getPrice() == price && rooms[i].getPersons() == persons &&
                    rooms[i].getCityName().equals(city)  && rooms[i].getHotelName().equals(hotel)) {
                countFindRooms++;

            }

        }
        Room[] findRooms = new Room[countFindRooms];
        int indexFindRooms = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null && rooms[i].getPrice() == price && rooms[i].getPersons() == persons &&
                    rooms[i].getCityName().equals(city) && rooms[i].getHotelName().equals(hotel)) {
                findRooms[indexFindRooms] = rooms[i];
                indexFindRooms++;
                }

        }
        return findRooms;

    }
}
