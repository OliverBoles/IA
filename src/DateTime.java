public class DateTime {
    private String[] period={"P0","P1","P2","P3","P4","P5","P6","P7","P8"};

    public String Date (){
        CalendarStore rr = new CalendarStore();
        rr.getDay();
        rr.getMonth();
        rr.getYear();
        System.out.println(rr.getDay() + "/" + rr.getMonth() + "/" + rr.getYear());
        return null;
    }

    public String getDate(){
        WeekdaySelector ws = new WeekdaySelector();
        ws.
    }

    public String getTime (String timeRequest){
        for (int i = 0; i< period.length; i++) {
            if (period[i].equals(timeRequest)) {
                return timeRequest;
            }
        }
        System.out.println("this is not a valid time");
        return null;
    }

}
