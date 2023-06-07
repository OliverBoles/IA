import java.util.Calendar;

public class CalendarStore {

    // Retrieves the current date
    Calendar calendar = Calendar.getInstance();
    // Retrieve individual components of the calendar
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH); // Note: January is 0
    int day = calendar.get(Calendar.DAY_OF_MONTH);
}

