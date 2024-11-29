import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mouse extends JPanel implements MouseListener{

    String message = "";
    public mouse(){
        addMouseListener(this);
    }
    
    public void mouseClicked(MouseEvent e){
        message = "Mouse Clicked" + e.getX() + e.getY();
        repaint();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString(message, 20,20);
    }

    @Override public void mousePressed(MouseEvent e){}
    @Override public void mouseReleased(MouseEvent e){}
    @Override public void mouseEntered(MouseEvent e){}
    @Override public void mouseExited(MouseEvent e){}
    public static void main(String[] args){
        JFrame frame = new JFrame("Mouse Events");
        frame.add(new mouse());
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}