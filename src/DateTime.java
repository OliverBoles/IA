public class DateTime {
    private String[] period={"P0","P1","P2","P3","P4","P5","P6","P7","P8"};

    public String getTime (String timeRequest){
        for (String s : period) {
            if (s.equals(timeRequest)) {
                return timeRequest;
            }
        }
        System.out.println("this is not a valid time");
        return null;
    }
}
