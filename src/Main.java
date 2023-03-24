import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Room rr = new Room();
        DateTime tr = new DateTime();

        boolean RoomOpen = rr.Room();
        if (RoomOpen == true) {
            System.out.println("the room is free");
        } else {
            System.out.println("the room is booked");
        }

        Scanner dateRequest = new Scanner(System.in);
        System.out.println("what period do you want to book");
        String holdtime = dateRequest.next();
        String freeTime = tr.getTime(holdtime);
        System.out.println(freeTime);

        FileHandler tt = new FileHandler();

    }
}
