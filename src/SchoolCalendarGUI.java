import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SchoolCalendarGUI extends JFrame {
    private JTextField dayTextField;
    private JTextField monthTextField;
    private JTextField roomTextField;
    private JTextField timeTextField;
    private JTextArea resultTextArea;

    private SchoolCalendar schoolCalendar;

    public SchoolCalendarGUI() {
        // Create and configure the main JFrame
        setTitle("School Calendar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));
        setLayout(new BorderLayout());

        // Create and configure the input components
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JLabel dayLabel = new JLabel("Day:");
        dayTextField = new JTextField(2);

        JLabel monthLabel = new JLabel("Month:");
        monthTextField = new JTextField(12);

        JLabel roomLabel = new JLabel("Room Number:");
        roomTextField = new JTextField(2);

        JLabel timeLabel = new JLabel("Period:");
        timeTextField = new JTextField(2);

        inputPanel.add(dayLabel);
        inputPanel.add(dayTextField);
        inputPanel.add(monthLabel);
        inputPanel.add(monthTextField);
        inputPanel.add(roomLabel);
        inputPanel.add(roomTextField);
        inputPanel.add(timeLabel);
        inputPanel.add(timeTextField);

        // Create the button to get the date
        JButton getDateButton = new JButton("Book Room");
        getDateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String day = dayTextField.getText();
                schoolCalendar.getDay();
                String month = monthTextField.getText();
                schoolCalendar.getMonth();
                String roomNumber = roomTextField.getText();
                Event.room();
                String time = timeTextField.getText();
                Event.timeBooked();
                String dateBooked = schoolCalendar.getDate();
                resultTextArea.setText(dateBooked);
            }
        });

        inputPanel.add(getDateButton);

        // Create and configure the result text area
        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);

        // Add the components to the JFrame
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(resultTextArea), BorderLayout.CENTER);

        pack();
        setVisible(true);

        // Create an instance of SchoolCalendar
        schoolCalendar = new SchoolCalendar();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SchoolCalendarGUI();
            }
        });
    }
}

