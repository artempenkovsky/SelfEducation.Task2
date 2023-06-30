package task1;

import java.util.Arrays;

public class Home {
    private int homeNumber;
    private Floor[] floors;

    public Home(int homeNumber, Floor[] floors) {
        this.homeNumber = homeNumber;
        this.floors = floors;
    }

    public int getHomeNumber() {
        return homeNumber;
    }
    public Floor[] getFloors() {
        return floors;
    }

    public void print() {
        System.out.println("Номер дома: " + homeNumber);
        for (Floor floor : floors) {
            floor.print();
        }
    }
}
