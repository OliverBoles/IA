import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

public class TextFileViewer extends JFrame {
    private JTextArea textArea;

    public TextFileViewer(String filePath) {
        super("Text File Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton returnButton = new JButton("Return");
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GUImain gui = new GUImain();
                dispose();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(returnButton);

        add(buttonPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        add(scrollPane, BorderLayout.CENTER);

        displayTextFile(filePath);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void displayTextFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }

            textArea.setText(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TextFileViewer("path/to/your/file.txt"));
    }
}