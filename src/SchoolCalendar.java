import java.util.ArrayList;
import java.util.Scanner;

public class SchoolCalendar {
    private final ArrayList<String> termDays;

    public SchoolCalendar(){
        termDays=FileHandler.readWholeFile("Dates.CSV");
        System.out.println(termDays);
    }

    // give a day and month and returns string from array list
    public String getDate(String day, String month) {
        String v = month + " " + day;
        System.out.println("v is " + v);
        for (String element : termDays) {
            //removes the first character and last 2 characters from the element
            String modifiedElement = element.substring(1, element.length() - 2);
            if (modifiedElement.contains(v)) {
                return modifiedElement; // Return the searchTerm is found
            }
        }
        System.out.println("This is not a valid date");
        return "null"; // Return if the searchTerm is not found in the ArrayList
    }

    //function that asks user to input a day of the month they want to book the room
    public String getDay() {
        Scanner roomRequest = new Scanner(System.in);
        System.out.println("what day of the month do you want to book the room >> e.g. 01, 09, 16, 20 etc");
        return roomRequest.next();
    }

    //function that asks user to input a month they want to book the room
    public String getMonth() {
        Scanner roomRequest = new Scanner(System.in);
        System.out.println("what month do you want to book");
        return roomRequest.next();
    }

    public String checkBooking(String day, String month, String room, String time){
        String booking = "Room " + Event.room(room) + " at " + Event.timeBooked(time) + " on " + getDate(day, month);
        if (booking.contains("null")){
            return "null";
        }
        // reads through the file and checks if the booking is already there
        // if booking isn't there it writes booking
        if (!FileHandler.containsString("DataBase",booking)){
            FileHandler.writeToFile("DataBase",booking, true);
            System.out.println("Room has been booked");
        } else {    // if booking already exists doesn't write booking
            System.out.println("Room is already booked by someone else");
            return null;
        }
        return "ok";
    }

}
