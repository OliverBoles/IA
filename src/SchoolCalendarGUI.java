import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchoolCalendarGUI extends JFrame {
    private JTextField dayTextField;
    private JTextField monthTextField;
    private JTextArea resultTextArea;
    private JTextField roomTextField;
    private JTextField timeTextField;

    private SchoolCalendar schoolCalendar;

    public SchoolCalendarGUI() {
        super("School Calendar");

        // Create an instance of the SchoolCalendar class
        schoolCalendar = new SchoolCalendar();

        // Set up the GUI components
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel dayLabel = new JLabel("Day:");
        dayTextField = new JTextField(10);

        JLabel monthLabel = new JLabel("Month:");
        monthTextField = new JTextField(10);

        JLabel roomLabel = new JLabel("Room:");
        roomTextField = new JTextField(10);

        JLabel timeLabel = new JLabel("Time:");
        timeTextField = new JTextField(10);

        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchDate();
            }
        });

        resultTextArea = new JTextArea(10, 30);
        resultTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultTextArea);

        panel.add(dayLabel);
        panel.add(dayTextField);
        panel.add(monthLabel);
        panel.add(monthTextField);
        panel.add(roomLabel);
        panel.add(roomTextField);
        panel.add(timeLabel);
        panel.add(timeTextField);
        panel.add(searchButton);
        panel.add(scrollPane);

        add(panel);

        setExtendedState(JFrame.MAXIMIZED_BOTH); // Set the frame to be maximized

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void searchDate() {
        String day = dayTextField.getText();
        System.out.println(day);
        String month = monthTextField.getText();
        System.out.println(month);
        String room = roomTextField.getText();
        String time = timeTextField.getText();

        String validcheck = schoolCalendar.checkBooking(day, month, room, time);
        if(validcheck.equals("null")){
            NotValidWindow nvw = new NotValidWindow();
            dispose();
        }
        GUImain home = new GUImain();
        dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SchoolCalendarGUI();
            }
        });
    }
}