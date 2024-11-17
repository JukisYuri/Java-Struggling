package FinalBoss.Boss1;

import javax.swing.*;
import java.awt.*;

public class MainFrame2 extends JPanel {
    private JLabel labelNameStaff, labelNameBorrow;
    private JTextField fieldNameStaff, fieldNameBorrow;
    private JLabel labelBookName, labelAuthor, labelYearRelease;
    private JTextField fieldBookName, fieldAuthor, fieldYearRelease;
    public MainFrame2(){
        setLayout(new BorderLayout());
        centerPanel();
        setVisible(true);
    }
    public void centerPanel(){
        JPanel totalPanel = new JPanel();
        totalPanel.setLayout(new BoxLayout(totalPanel, BoxLayout.Y_AXIS));
        JPanel panelInformation = new JPanel(new GridLayout(2,2,10,10));
        panelInformation.setBorder(BorderFactory.createTitledBorder("Thông tin 1"));
        labelNameStaff = new JLabel("Nhân viên bảo trợ:");
        fieldNameStaff = new JTextField();
        fieldNameStaff.setEditable(false);
        labelNameBorrow = new JLabel("Người mượn sách:");
        fieldNameBorrow = new JTextField();
        fieldNameBorrow.setEditable(false);
        panelInformation.add(labelNameStaff);
        panelInformation.add(fieldNameStaff);
        panelInformation.add(labelNameBorrow);
        panelInformation.add(fieldNameBorrow);
        totalPanel.add(panelInformation);

        JPanel panelInformation2 = new JPanel(new GridLayout(3,2,10,10));
        panelInformation2.setBorder(BorderFactory.createTitledBorder("Thông tin 2"));
        labelBookName = new JLabel("Sách:");
        fieldBookName = new JTextField();
        fieldBookName.setEditable(false);
        labelAuthor = new JLabel("Tác giả:");
        fieldAuthor = new JTextField();
        fieldAuthor.setEditable(false);
        labelYearRelease = new JLabel("Năm sáng tác:");
        fieldYearRelease = new JTextField();
        fieldYearRelease.setEditable(false);
        panelInformation2.add(labelBookName);
        panelInformation2.add(fieldBookName);
        panelInformation2.add(labelAuthor);
        panelInformation2.add(fieldAuthor);
        panelInformation2.add(labelYearRelease);
        panelInformation2.add(fieldYearRelease);
        totalPanel.add(panelInformation2);
        add(totalPanel, BorderLayout.NORTH);
    }
}
