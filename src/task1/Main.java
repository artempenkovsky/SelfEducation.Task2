package task1;

/**
 * 
 */


public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(true);
        Room room2 = new Room(false);
        Room room3 = new Room(false);
        Room room4 = new Room(false);
        Room room5 = new Room(true);
        Room room6 = new Room(true);

        Flat flat1 = new Flat(78, new Room[]{room1, room3});
        Flat flat2 = new Flat(79, new Room[]{room2, room4});
        Flat flat3 = new Flat(80, new Room[]{room5});
        Flat flat4 = new Flat(81, new Room[]{room6});

        Floor floor1 = new Floor(7, new Flat[]{flat1, flat2});
        Floor floor2 = new Floor(8, new Flat[]{flat3, flat4});

        Home home = new Home(8, new Floor[]{floor1, floor2});
        printAllInformation(home);
    }

    private static void printAllInformation(Home home) {
        home.print();
    }
}
