public class Main {
    public static void main(String[] args) {
        String RoomOpen = Event.room();
        String freeTime = Event.timeBooked();

        String booking = "Room " + RoomOpen + " at " + freeTime;
        // reads through the file and checks if the booking is already there
        // if booking isn't there it writes booking
        if (!FileHandler.containsString("DataBase",booking)){
            FileHandler.writeToFile("DataBase",booking, true);
            System.out.println("Room has been booked");
        } else {    // if booking already exists doesn't write booking
            System.out.println("Room is already booked by someone else");
        }

    }
}

//TODO import term dates from csv
//TODO build gui class to show term dates
//TODO import current bookings from csv
//TODO check for existing bookings when you click a date
//TODO show buttons for available rooms when you click on a date
//TODO gui class to add a new booking
//TODO write booking to csv file
//TODO display summary of all bookings
//TODO admin option to edit bookings
//TODO print schedule
