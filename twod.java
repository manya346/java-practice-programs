import java.awt.*;
import javax.swing.*;

public class twod extends JPanel {
    @Override
    protected void paintComponent(Graphics g){
        // super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.RED);
        g2d.fillRect(30,30,100,50);
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("two d shapes");
        
        frame.add(new twod());
        frame.setSize(200,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
