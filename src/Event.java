
//Stores location of user booking
public class Event {

    // gets info on room wanted to book
    public static String room(String room){
        Room rr = new Room();
        //checks if the room is real
        if (rr.getRoom(room) == null) {
            return "null";
        }
        return room;
    }

    public static String timeBooked(String time) {
        DateTime tr = new DateTime();
        // checks if the booking is an actual time
        if (tr.getTime(time) == null) {
            return "null";
        }
        return time;
    }
}
