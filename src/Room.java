public class Room{
    private final String[] roomList = {"H12","H13","H14","H15","J1"};

    public String getRoom(String v){
        for (String s : roomList) {
            if (s.equals(v)) {
                return s;
            }
        }
        System.out.println("this is not a valid room");
        return null;
    }
}