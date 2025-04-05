package javaSwing.PaintPanel;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class paintDemo {

    paintingPanel pp;

    paintDemo()
    {
        JFrame frame = new JFrame(" Paint Demo");   

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        

        pp = new paintingPanel();
        frame.add(pp);
        pp.setSize(200  ,200);
        
        frame.setVisible(true);


    }

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            
            public void run()
            {
                new paintDemo(); 
            }
        });
    }
    
    
}
