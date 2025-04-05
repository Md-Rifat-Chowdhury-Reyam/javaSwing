package javaSwing.PaintPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class paintingPanel extends JPanel{

    Insets ins;
    Random rand;

    paintingPanel()
    {
        setBorder(BorderFactory.createLineBorder(Color.RED,3));

        rand = new Random();

    }
    protected void paintComponent(Graphics g)
    {

        super.paintComponent(g);
        int x, y , x2, y2;

        int width = getWidth();
        int height = getHeight();

        ins = getInsets();


        for(int i = 0; i < 10 ; i++)
        {
            x = rand.nextInt(width-ins.left);
            y = rand.nextInt(height-ins.bottom);
            x2 = rand. nextInt(width-ins.left);
            y2 = rand.nextInt(height-ins.bottom);

            g.drawLine(x, y, x2, y2);

        }
    }

    
}
