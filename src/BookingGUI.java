import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookingGUI extends JFrame {
    private JTextField roomTextField;
    private JTextField timeTextField;
    Room rr = new Room();
    DateTime tr = new DateTime();


    public BookingGUI() {
        setTitle("Room Booking");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel roomLabel = new JLabel("Room:");
        roomTextField = new JTextField(10);

        JLabel timeLabel = new JLabel("Time:");
        timeTextField = new JTextField(10);

        JButton bookButton = new JButton("Book");
        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String roomNum = roomTextField.getText();
                String holdTime = timeTextField.getText();

                // Perform booking operations using the Event class methods
                String room = rr.getRoom(roomNum);
                String time = tr.getTime(holdTime);

                if (room != null && time != null) {
                    // Room and time are valid, perform the booking or other operations
                    // ...

                    JOptionPane.showMessageDialog(BookingGUI.this, "Room " + room + " booked at " + time);
                } else {
                    JOptionPane.showMessageDialog(BookingGUI.this, "Invalid room or time");
                }
            }
        });

        add(roomLabel);
        add(roomTextField);
        add(timeLabel);
        add(timeTextField);
        add(bookButton);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BookingGUI();
            }
        });
    }
}