//Stores location of user booking
public class Event {

    private int period;
    private String date;
    private String name;
    private String[] room = {"H12","H13","H14","H15","J1"};

    /*public Event(int period, String date, String name, String room) {
        this.period = period;
        this.date = date;
        this.name = name;
        this.room = room;
    }*/

    public boolean getRoom(String v){
        for (int i=0; i< room.length; i++) {
            if (room[i].equals(v)) {
                return true;
            }
        }
        return false;
    }



}
