import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    // demo of drawing directly onto a panel

    public Canvas(int top, int left, int width, int height, Color bgColor) {
        super();  // this is called implicitly, even if you omit it
        setBounds(top, left, width, height);
        setBackground(bgColor);
        System.out.println("Canvas created");
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(255,255,0));
        g.fillOval(100,100,50,50);
    }
}