package Button;

import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.*;

public class jbuDemo implements ActionListener{

    JLabel lb;

    public jbuDemo()
    {
        JFrame frame = new JFrame("Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);



        ImageIcon im1 = new ImageIcon("C:/Users/PC/Downloads/HC.png");
        JButton bu1 = new JButton(im1);
        bu1.setActionCommand("Image1");
        bu1.addActionListener(this);
        frame.add(bu1);

        lb = new JLabel("Button 1");
        frame.add(lb);



    }


    public void actionPerformed(ActionEvent e) 
    {
        lb.setText("You clicked on this " + e.getActionCommand());
    }        




    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                new jbuDemo();

            }
        });
        
    }
    
}
