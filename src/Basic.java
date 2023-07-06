import javax.swing.*;
import java.awt.*;

public class Basic extends JPanel {

    private JFrame frame;

    public Basic(int width, int height) {
        // initialise the window
        frame = new JFrame("book room");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);

        // create the canvas that will hold the actual graphics
        frame.getContentPane().add(this);

        // display the frame AFTER adding the panel to prevent drawing glitches
        frame.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        int left = 10;    // hard-coded just for testing
        int top = 80;
        int width = 40;
        int height = 150;
        g.setColor(Color.red);
        g.fillRect(left, top, width, height);
    }
}
