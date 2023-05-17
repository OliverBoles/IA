import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String RoomOpen = Event.room();
        while (RoomOpen == null) {
            RoomOpen = Event.room();
        }

        String freeTime = Event.timeBooked();
        if (freeTime == null) {
            freeTime = Event.timeBooked();
        }
        System.out.println(freeTime);


        String booking = "Room " + RoomOpen + " at " + freeTime;
        //reads through the file and checks if the booking is already there
        //if booking isn't there it writes booking
        //if booking already exists doesn't write booking
        if (!FileHandler.containsString("DataBase",booking)){
            FileHandler.writeToFile("DataBase",booking, true);
            System.out.println("Room has been booked");
        } else {
            System.out.println("Room is already booked by someone else");
        }

    }
}
