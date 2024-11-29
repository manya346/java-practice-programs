import javax.swing.*;
import java.awt.*;

public class app {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Swing App");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);

        JLabel label = new JLabel("Hello, Swing!");
        label.setForeground(Color.BLUE); 
        panel.add(label); 
        frame.add(panel);
    }
}
