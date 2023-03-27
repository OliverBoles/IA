import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String RoomOpen = Event.room();
        String freeTime = Event.timeBooked();

        //writes data to file
        FileHandler.writeToFile("DataBase","Room " + RoomOpen + " at " + freeTime, true);

    }
}
