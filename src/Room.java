public class Room{
    private String[] roomList = {"H12","H13","H14","H15","J1"};

    public String getRoom(String v){
        for (int i=0; i< roomList.length; i++) {
            if (roomList[i].equals(v)) {
                return roomList[i];
            }
        }
        System.out.println("this is not a valid room");
        return null;
    }
}