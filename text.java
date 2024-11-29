import java.awt.*;
import javax.swing.*;

public class text{
    public static void main(String[] args){
        JFrame frame = new JFrame("text");
        frame.setLayout(new FlowLayout());
        JTextField textf = new JTextField(20);
        frame.add(new JLabel("Enter text:"));
        frame.add(textf);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}