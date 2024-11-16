package EX22;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(20,30,50,100);
        g.setColor(Color.GREEN);
        g.drawOval(20,30,50,100);
    }
}
