import java.util.Scanner;

public class Room{
    private boolean roomFree;

    public boolean Room() {
        Event fr = new Event();
        Scanner roomRequest = new Scanner(System.in);
        System.out.println("what room do you want to book");
        String hold = roomRequest.next();
        roomFree = fr.getRoom(hold);
        return roomFree;

    }
}