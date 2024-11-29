import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class checkbox {
    public static void main(String[] args){
        JFrame frame = new JFrame("stuff");
        frame.setLayout(new FlowLayout());
        JButton button = new JButton("CLICKK");
        JLabel label = new JLabel("Click me now");
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                label.setText("CLICKED");
            }
        });
        JCheckBox checkBox = new JCheckBox("Check Me");
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        frame.add(button);
        frame.add(checkBox);
        frame.add(radioButton1);
        frame.add(radioButton2);
        frame.add(label);

        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
