import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;

public class CSVViewer extends JFrame {
    private JTable table;

    public CSVViewer(String filePath) {
        super("CSV Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        table = new JTable();
        JScrollPane scrollPane = new JScrollPane(table);

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

        loadCSV(filePath);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void loadCSV(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            DefaultTableModel model = new DefaultTableModel();

            // Read the header line
            if ((line = br.readLine()) != null) {
                String[] headers = line.split(",");
                for (String header : headers) {
                    model.addColumn(header);
                }
            }

            // Read the remaining data
            while ((line = br.readLine()) != null) {
                String[] rowData = line.split(",");
                model.addRow(rowData);
            }

            table.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CSVViewer("path/to/your/file.csv"));
    }
}
