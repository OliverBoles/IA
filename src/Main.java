public class Main {

    public static void main(String[] args) {
        Room rr = new Room();
        boolean RoomOpen = rr.Room();
        if (RoomOpen == true) {
            System.out.println("the room is free");
        } else {
            System.out.println("the room is booked");
        }

        FileHandler tt = new FileHandler();
    }
}
