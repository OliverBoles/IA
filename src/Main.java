public class Main {

    public static void main(String[] args) {
        Room rr = new Room();
        boolean FreeRoom = rr.Room();
        if (FreeRoom == true) {
            System.out.println("the room is free");
        } else {
            System.out.println("the room is booked");
        }
    }
}
