import java.util.Scanner;

//Stores location of user booking
public class Event {

    // gets info on room wanted to book
    public static String room(){
        Room rr = new Room();
        //ask user what room they want to book
        Scanner roomRequest = new Scanner(System.in);
        System.out.println("what room do you want to book");
        String roomNum = roomRequest.next();
        //checks if the room is real
        if (rr.getRoom(roomNum) == null) {
            return room();
        }
        return roomNum;
    }

    public static String timeBooked() {
        DateTime tr = new DateTime();
        Scanner dateRequest = new Scanner(System.in);
        System.out.println("what period do you want to book");
        String holdTime = dateRequest.next();
        tr.getDate();
        // checks if the booking is an actual time
        if (tr.getTime(holdTime) == null) {
            return timeBooked();
        }
        return holdTime;
    }

    public static String Date() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day: ");
        int day = scanner.nextInt();
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
    }



}
