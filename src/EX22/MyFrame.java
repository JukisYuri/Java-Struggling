package EX22;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        setTitle("Simple Paint");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 600);
        setResizable(false);
        setLocationRelativeTo(null);

        MyPanel panel = new MyPanel();
        getContentPane().add(panel);

        setVisible(true);
    }
    public static void main(String[] args){
        new MyFrame();
    }
}
