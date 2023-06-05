import java.util.Scanner;
import java.util.Calendar;

public class DateTime {
    private String[] period={"P0","P1","P2","P3","P4","P5","P6","P7","P8"};

    public String getDate (){
        Scanner dateRequest = new Scanner(System.in);
        System.out.println("what date do you want to book");
        String holdDate = dateRequest.next();
        return null;
    }

    public String getTime (String timeRequest){
        for (int i = 0; i< period.length; i++) {
            if (period[i].equals(timeRequest)) {
                return timeRequest;
            }
        }
        return null;
    }

    Calendar calendar = Calendar.getInstance();
    // Retrieve individual components of the calendar
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH); // Note: January is 0
    int day = calendar.get(Calendar.DAY_OF_MONTH);

}
