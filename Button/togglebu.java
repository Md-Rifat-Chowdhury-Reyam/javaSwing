package Button;

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import java.awt.*;  

public class togglebu {



    public togglebu()
    {
        JFrame frame = new JFrame("Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);


        JToggleButton bt1  = new JToggleButton("Toggle Button on-off");
        JLabel lb = new JLabel("show the change");

        bt1.addItemListener(new ItemListener()            
        {
            
        
            public void itemStateChanged(ItemEvent e)
            {
                if (bt1.isSelected()) {
                    lb.setText("Switch On");
                    
                }
                else {
                    lb.setText("Switch Off");
                }

            }
        });

        frame.add(bt1);
        frame.add(lb);

        

    }

    public static void main(String[] args) {
            
            SwingUtilities.invokeLater(new Runnable() {
                public void run()
                {
                    new togglebu();
    
                }
            });
    }
    
}
