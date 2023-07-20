import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// provides a way to create new graph pop-ups
public class NotValidWindow extends JFrame implements ActionListener{
    private JFrame frame;
    private JButton okButton;


    public NotValidWindow() {
        super("The room you booked is not valid");
        frame = new JFrame("Home");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        JLabel messageLabel = new JLabel("The room you booked is not valid");
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        frame.setUndecorated(true); // Remove the window decorations (title bar, close button, etc.)
        frame.setLayout(null);
        okButton = new JButton("ok");
        okButton.setBounds(500, 50, 400, 40);
        frame.getContentPane().add(okButton);
        frame.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("ok")) {
            SchoolCalendarGUI test = new SchoolCalendarGUI();
            frame.dispose();
        }
    }
}