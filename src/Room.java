public class Room{
    private String[] room = {"H12","H13","H14","H15","J1"};

    public String getRoom(String v){
        for (int i=0; i< room.length; i++) {
            if (room[i].equals(v)) {
                return v;
            }
        }
        return null;
    }
}