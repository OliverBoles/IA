import javax.swing.*;
import java.awt.*;

public class Basic extends JPanel {

    private JFrame frame;

    public Basic(int width, int height) {
        // initialise the window
        frame = new JFrame("book room");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

}
