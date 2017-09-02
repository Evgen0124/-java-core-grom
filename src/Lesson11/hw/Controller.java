package Lesson11.hw;

/**
 * Created by user on 10.08.2017.
 */
public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        if(apis.length == 0){
            Room[] res = new Room[0];
            return res;
        }
        int lengthApi = 0;

        Room[] findRoomForApi = new Room[]{};
        for (int i = 0; i < apis.length; i++) {
            findRoomForApi = apis[i].findRooms(price, persons, city, hotel);
            lengthApi = lengthApi + findRoomForApi.length;
        }
        Room[] requestRooms = new Room[lengthApi];
        int index = 0;
        for (API api: apis) {
            if(api != null){
                for (Room room: api.findRooms(price,persons,city,hotel)) {
                    requestRooms[index] = room;
                    index++;
                }
            }
        }

        return requestRooms;

    }

    public Room[] check(API api1, API api2) {

        Room[] api1Rooms = api1.getAll();
        Room[] api2Rooms = api2.getAll();

        if (api1Rooms.length == 0 || api2Rooms.length == 0) {
            Room[] res = new Room[0];
            return res;

        }
        int countRes = 0;
        for (int i = 0; i < api1Rooms.length; i++) {
            for (int j = 0; j < api2Rooms.length; j++) {

                if (api1Rooms[i].getPrice() == api2Rooms[j].getPrice() &&
                        api1Rooms[i].getPersons() == api2Rooms[j].getPersons() &&
                        api1Rooms[i].getCityName().equals(api2Rooms[j].getCityName()) &&
                        api1Rooms[i].getHotelName().equals(api2Rooms[j].getHotelName())) {
                    countRes++;
                }
            }
        }

        Room[] res = new Room[countRes];
        for (int i = 0; i < api1Rooms.length; i++) {
            for (int j = 0; j < api2Rooms.length; j++) {

                if (api1Rooms[i].getPrice() == api2Rooms[j].getPrice() &&
                        api1Rooms[i].getPersons() == api2Rooms[j].getPersons() &&
                        api1Rooms[i].getCityName().equals(api2Rooms[j].getCityName()) &&
                        api1Rooms[i].getHotelName().equals(api2Rooms[j].getHotelName())) {
                    res[i] = api1Rooms[i];

                }
            }
        }
        return res;

    }
}