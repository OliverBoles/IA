import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchoolCalendarGUI extends JFrame {
    private JTextField dayTextField;
    private JTextField monthTextField;
    private JTextArea resultTextArea;

    private SchoolCalendar schoolCalendar;

    public SchoolCalendarGUI() {
        super("School Calendar");

        // Create an instance of the SchoolCalendar class
        schoolCalendar = new SchoolCalendar();

        // Set up the GUI components
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel dayLabel = new JLabel("Day:");
        dayTextField = new JTextField(2);

        JLabel monthLabel = new JLabel("Month:");
        monthTextField = new JTextField(12);

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
        panel.add(searchButton);
        panel.add(scrollPane);

        add(panel);

        setSize(1920, 1080);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private String searchDate() {
        String day = dayTextField.getText();
        String month = monthTextField.getText();

        String result = schoolCalendar.getDate(day, month);

        if (result != null) {
            resultTextArea.setText(result);
        } else {
            resultTextArea.setText("Date not found.");
        }
        return result;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SchoolCalendarGUI();
            }
        });
    }

}
