//Stores location of user booking
public class Event {

    private int period;
    private String date;
    private String name;
    private String room;

    /*public Event(int period, String date, String name, String room) {
        this.period = period;
        this.date = date;
        this.name = name;
        this.room = room;
    }*/

    public boolean getRoom(String v){
        if (room == v) {
            return true;
        }
        return false;
    }

}
