package task1;

public class Room {
    private boolean isPassageRoom;

    public Room(boolean isPassageRoom) {
        this.isPassageRoom = isPassageRoom;
    }

    public boolean isPassageRoom() {
        return isPassageRoom;
    }

    @Override
    public String toString() {
        return "Room{" +
                "isPassageRoom=" + isPassageRoom +
                '}';
    }

    public void print(){
        System.out.println("Комната проходная? : " + isPassageRoom);
    }
}
