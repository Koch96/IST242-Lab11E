package lab11e;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

//@author sak5680

public class Lab11e {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
      
        // Create and add a mouse listener
        class EnterExitListener implements MouseListener {
            public void mouseEntered(MouseEvent event){
                frame.getContentPane().setBackground(Color.BLUE);
            }
         
            public void mouseExited(MouseEvent event){
                frame.getContentPane().setBackground(Color.RED);
            }
            // Do-nothing methods
            public void mousePressed(MouseEvent event) {}
            public void mouseReleased(MouseEvent event) {}
            public void mouseClicked(MouseEvent event) {}
        }
         
        MouseListener listener = new EnterExitListener();
        frame.addMouseListener(listener);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
   }

}
