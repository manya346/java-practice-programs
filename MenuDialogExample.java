import javax.swing.*;
import java.awt.event.*;

public class MenuDialogExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu and Dialog Example");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem menuItem = new JMenuItem("Show Dialog");

        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "This is a dialog box");
            }
        });

        menu.add(menuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
    