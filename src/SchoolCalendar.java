import java.util.ArrayList;
import java.util.Scanner;

public class SchoolCalendar {
    private ArrayList<String> termDays;

    public SchoolCalendar(){
        termDays=FileHandler.readWholeFile("Dates.CSV");
        System.out.println(termDays);
    }


    // is in term time (true false function)
    public boolean isTermDate(String DateRequest){

        return false;
    }
    // give a day and month and returns string from array list
    public String getDate() {
        String a = getMonth();
        String b = getDay();
        String v = " " + a + " " + b;
        for (int i = 1; i < termDays.size()-1; i++) {
            System.out.println(termDays.get(i));
            if (termDays.get(i).equals(v)) {
                return termDays.get(i); // Return the searchTerm is found
            }
        }
        return null; // Return null if the searchTerm is not found in the ArrayList
    }

    // 2 functions one that returns month and one that returns day
    public String getDay() {
        Scanner roomRequest = new Scanner(System.in);
        System.out.println("what day of the month do you want to book the room > ");
        String dayRequest = roomRequest.next();
        return dayRequest;
    }

    public String getMonth() {
        Scanner roomRequest = new Scanner(System.in);
        System.out.println("what month do you want to book");
        String monthRequest = roomRequest.next();
        return monthRequest;
    }


    // constructor reads from csv file each record in this format
    // wednesday 21 june, thursday 22 june... etc.



}
