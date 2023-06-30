package task1;

import java.util.Arrays;

public class Flat {
    private int number;
    private Room[] rooms;

    public Flat(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public int getNumber() {
        return number;
    }

    public Room[] getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "number=" + number +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }

    public void print() {
        System.out.println("Квартира: номер " + number);
        for (Room room : rooms) {
            room.print();
        }
    }
}
