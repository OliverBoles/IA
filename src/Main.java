import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String RoomOpen = Event.room();
        while (RoomOpen == null) {
            RoomOpen = Event.room();
        }

        String freeTime = Event.timeBooked();
        while (freeTime == null) {
            freeTime = Event.timeBooked();
        }

        FileHandler.arrayListRead("DataBase");
        FileHandler.readFromFile("DataBase",1);

        //writes data to file
        FileHandler.writeToFile("DataBase","Room " + RoomOpen + " at " + freeTime, true);

    }
}
