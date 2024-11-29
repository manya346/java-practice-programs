import javax.swing.*;
import java.awt.*;

public class scrollbar {
    public static void main(String[] args){
        JFrame frame = new JFrame("scrollbar");
        frame.setLayout(new FlowLayout());
        JScrollBar scrollbar = new JScrollBar();
        frame.add(scrollbar);
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
