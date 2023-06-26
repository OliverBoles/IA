import java.util.ArrayList;

public class SchoolCalendar {
    private ArrayList<String> termDays;
    // is in term time (true false function)
    public boolean isTermDate(){
        return true;
    }
    // give a day and month and returns string from array list
    public String getDate() {
        return null;
    }
    // 2 functions one that returns month and one that returns day
    // constructor reads from csv file each record in this format
    // wednesday 21 june, thursday 22 june... etc.
    // bank holidays and other weekday non school days are included but flagged
}
