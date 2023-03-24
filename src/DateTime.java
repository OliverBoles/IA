import java.util.Scanner;

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
                return period[i];
            }
        }
        return null;
    }
}
