import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// provides a way to create new graph pop-ups
public class GUImain extends JFrame implements ActionListener {

    private JFrame frame;
    private JButton newGraph;
    private JButton newGraph1;
    private JButton newGraph2;
    private JButton newGraph3;


    public GUImain() {
        frame = new JFrame("Home");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLayout(null);
        newGraph = new JButton("book room");
        newGraph.setBounds(500, 50, 400, 40);
        newGraph.addActionListener(this);
        newGraph1 = new JButton("view rooms");
        newGraph1.setBounds(500, 150, 400, 40);
        newGraph1.addActionListener(this);
        newGraph2 = new JButton("view bookings");
        newGraph2.setBounds(500, 250, 400, 40);
        newGraph2.addActionListener(this);
        newGraph3 = new JButton("close program");
        newGraph3.setBounds(500, 350, 400, 40);
        newGraph3.addActionListener(this);
        frame.getContentPane().add(newGraph);
        frame.getContentPane().add(newGraph1);
        frame.getContentPane().add(newGraph2);
        frame.getContentPane().add(newGraph3);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("book room")) {
            SchoolCalendarGUI test = new SchoolCalendarGUI();
            frame.dispose();
        }
        if (e.getActionCommand().equals("view rooms")) {
            CSVViewer test = new CSVViewer("Dates.CSV");
            frame.dispose();
        }
        if (e.getActionCommand().equals("view bookings")) {
            TextFileViewer test = new TextFileViewer("DataBase");
            frame.dispose();
        }
        if (e.getActionCommand().equals("close program")) {
            System.exit(0);
        }
    }
}