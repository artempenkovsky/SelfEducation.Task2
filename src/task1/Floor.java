package task1;

import java.util.Arrays;

public class Floor {
    private int floorNumber;
    private Flat[] flats;

    public Floor(int floorNumber, Flat[] flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Flat[] getFlats() {
        return flats;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "floorNumber=" + floorNumber +
                ", flats=" + Arrays.toString(flats) +
                '}';
    }

    public void print() {
        System.out.println("Номер этажа: " + floorNumber + ", количество квартир: " + flats.length);
        for (Flat flat : flats) {
            System.out.println(flat);
            flat.print();
        }
    }
}
