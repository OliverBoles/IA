import java.util.ArrayList;
import java.util.Scanner;

public class SchoolCalendar {
    private ArrayList<String> termDays;

    // is in term time (true false function)
    public boolean isTermDate(String DateRequest){
        if (FileHandler.containsString("DataBase",DateRequest)) {
            return true;
        }
        return false;
    }
    // give a day and month and returns string from array list
    public String getDate(String v) {
        v = getDay() + getMonth();
        if (FileHandler.containsString("DataBase",v)) {
            return FileHandler.readForString("DataBase",v);
        }
        return null;
    }
    // 2 functions one that returns month and one that returns day
    public String getDay() {
        return null;
    }

    public String getMonth() {
        return null;
    }
    // constructor reads from csv file each record in this format
    // wednesday 21 june, thursday 22 june... etc.

    termDays=FileHandler.readWholeFile("Dates.CSV")


}
