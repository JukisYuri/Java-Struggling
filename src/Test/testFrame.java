package Test;

import javax.swing.*;
import java.awt.*;

public class testFrame extends JFrame {

    public testFrame() throws HeadlessException{
        super();
        setTitle("BookStore.Book Store");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,200);
        setLocationRelativeTo(null);
        setResizable(false);


        setVisible(true);
    }

    public static void main(String[] args) {
        new testFrame();
    }
}