import java.util.Scanner;

//Stores location of user booking
public class Event {

    private String period;
    private String date;
    private String name;
    private String room;

    //gets info on room wanted to book
    public static String room(){
        Room rr = new Room();
        //ask user what room they want to book
        Scanner roomRequest = new Scanner(System.in);
        System.out.println("what room do you want to book");
        String room = roomRequest.next();
        String roomCheck = rr.getRoom(room);
        //checks if the room is real
        if (roomCheck == null) {
            System.out.println("this is not a valid room");
            return null;
        }
        return rr.getRoom(room);
    }

    public static String timeBooked() {
        DateTime tr = new DateTime();
        Scanner dateRequest = new Scanner(System.in);
        System.out.println("what period do you want to book");
        String holdTime = dateRequest.next();
        String timeCheck = tr.getTime(holdTime);
        if (timeCheck == null) {
            System.out.println("this is not a valid time");
            return null;
        }
        return timeCheck;
    }



}
