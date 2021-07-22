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
        addToTableButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                // Append a row
                model.insertRow(0,new Object[]{counter++,"Or"+counter++});
                model.setRowCount(5);

            }
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
