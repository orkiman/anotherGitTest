import javax.swing.*;
import javax.swing.table.DefaultTableModel;
//import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tables {
    private JTable table1;
    private JButton addToTableButton;
    private JPanel panel;
    int counter=0;
    public Tables() {
        DefaultTableModel model = new DefaultTableModel();
        table1.setModel(model);
//        model.setD
// Create a couple of columns
        model.addColumn("Col1");
        model.addColumn("Col2");
        addToTableButton.addActionListener(e -> {
//                // Append a row
            model.insertRow(0, new Object[]{"this is the update on 9/8/21:" +counter++,"Or from work :) "+counter++});
            model.setRowCount(10);

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tables");
        frame.setContentPane(new Tables().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
