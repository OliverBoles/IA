import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the date (yyyy-mm-dd): ");
        String inputDate = scanner.nextLine();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(inputDate);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH) + 1; // Calendar months are zero-based
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            System.out.println("Selected date: " + year + "-" + month + "-" + day);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-mm-dd format.");
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Date Selector ===");
        System.out.println("Enter the date in yyyy-mm-dd format or 'exit' to quit:");

        String inputDate;
        do {
            System.out.print("Date: ");
            inputDate = scanner.nextLine();

            if (!inputDate.equalsIgnoreCase("exit")) {
                DateSelector.main(new String[]{inputDate});
                System.out.println();
            }
        } while (!inputDate.equalsIgnoreCase("exit"));

        System.out.println("Exiting Date Selector. Goodbye!");
    }
}