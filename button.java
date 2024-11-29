import javax.swing.*;
import java.awt.event.*;

public class button {
    public static void main(String[] args){
        JFrame frame = new JFrame("Button event");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new java.awt.FlowLayout());
        frame.setVisible(true);
        
        JButton button = new JButton("CLICK ME");
        JLabel label = new JLabel("Button not clicked yet");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                label.setText("BUTTON CLICKED");
            }
        });
        frame.add(button);
        frame.add(label);
    }
}