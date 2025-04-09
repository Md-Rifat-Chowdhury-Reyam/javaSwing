package Button;

import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.*;

public class jbuDemo implements ActionListener{

    JLabel lb, lb1;

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


        ImageIcon im2 = new ImageIcon("C:/Users/PC/Downloads/HC.png");
        JButton bu2 = new JButton(im2);
        bu2.setActionCommand("Image2");
        bu2.addActionListener(this);
        frame.add(bu2);

        lb1 = new JLabel("this is im1");
        frame.add(lb1);



    }


    public void actionPerformed(ActionEvent e) 
    {
        if ("Image1".equals(e.getActionCommand())) {
            lb.setText("You clicked on this " + e.getActionCommand());
        } else if ("Image2".equals(e.getActionCommand())) {
            lb1.setText("You clicked on this " + e.getActionCommand());
        }
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
