package BTNhom;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class mhOnline extends JFrame {
    private JPanel panelCustomerInfo, panelButtons, panelResult;
    private JTextField fieldHoTen, fieldDiaChi, fieldSDT, fieldMaSP, fieldTenSP, fieldDonGia;
    private JLabel labelHoTen, labelDiaChi, labelSDT, labelMaSP, labelTenSP, labelDonGia;
    private JButton buttonThemSP, buttonXoaSP, buttonThanhToan, buttonThoat;
    private JTable table;
    //DefaultTableModel tableModel;
    public mhOnline() {
        setTitle("Mua Hang Online");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel customerPanel = new JPanel(new GridLayout(3, 2));
        customerPanel.setBorder(BorderFactory.createTitledBorder("Thong Tin Khach Hang"));

        labelHoTen = new JLabel("Ho Va Ten", JLabel.LEFT);
        fieldHoTen = new JTextField();
        labelDiaChi = new JLabel("Dia Chi", JLabel.LEFT);
        fieldDiaChi = new JTextField();
        labelSDT = new JLabel("So Dien Thoai", JLabel.LEFT);
        fieldSDT = new JTextField();
        customerPanel.add(labelHoTen); customerPanel.add(fieldHoTen);
        customerPanel.add(labelDiaChi); customerPanel.add(fieldDiaChi);
        customerPanel.add(labelSDT); customerPanel.add(fieldSDT);
        setLayout(new BorderLayout());
        add(customerPanel, BorderLayout.NORTH);
        setVisible(true);
    }
    public static void main(String[] args){
        new mhOnline();
    }
}
