package JavaBasic.FinalBoss.Boss1;

import javax.swing.*;
import java.awt.*;

public class CardLayoutSwitching extends JFrame {
    MainFrame mainFrame = new MainFrame();
    MainFrame2 mainFrame2 = new MainFrame2();
    CardLayout cardLayout = new CardLayout();
    JPanel cardPanel = new JPanel(cardLayout);
    public CardLayoutSwitching(){
        setTitle("Quản lý thư viện");
        setSize(600,730);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Thêm các panel vào cardPanel
        cardPanel.add(mainFrame, "MainFrame");
        cardPanel.add(mainFrame2, "MainFrame2");
        add(cardPanel);
        informationMenu();
        setVisible(true);
    }
    private void informationMenu(){
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Lựa chọn");
        JMenuItem menu1 = new JMenuItem("Thông tin của Client");
        menu1.addActionListener(e -> cardLayout.show(cardPanel, "MainFrame"));
        JMenuItem menu2 = new JMenuItem("Thông tin của Staff");
        menu2.addActionListener(e -> cardLayout.show(cardPanel, "MainFrame2"));
        menu.add(menu1);
        menu.addSeparator();
        menu.add(menu2);
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(CardLayoutSwitching::new);
    }
}
