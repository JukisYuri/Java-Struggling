package JavaBasic.FinalBoss.Boss1;


import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JPanel {
    private JLabel labelNameBorrow, labelAge, labelAddress, labelBookWillBorrow;
    private JLabel labelBookName, labelAuthor, labelYearRelease, labelQuantityRemain;
    private JTextField fieldNameBorrow, fieldAge, fieldAddress;
    private JTextField fieldBookName, fieldAuthor, fieldYearRelease, fieldQuantityRemain;
    private JComboBox comboBoxBookWillBorrow;
    private ArrayList<AuthorBook> listAuthorBook = new ArrayList<>();
    private DefaultTableModel tableModel;
    private JTable table;
    public MainFrame(){
        topPanel();
        centerPanel();
        underPanel();
        loadData();
        noteLabel();
        setVisible(true);
    }
    public void noteLabel(){
        JPanel nonExitPanel = new JPanel(new GridLayout(2,1));
        JLabel noteLabel = new JLabel("Bạn được đặt mặc định làm phòng chờ của Client khi mượn sách");
        JButton exitButton = new JButton("Thoát");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Bạn Muốn Thoát Ứng Dụng?", "Xác Nhận", JOptionPane.YES_NO_OPTION);
                if(result == JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
        nonExitPanel.add(noteLabel);
        nonExitPanel.add(exitButton);
        add(nonExitPanel, BorderLayout.SOUTH);
    }
    public void topPanel(){
        JPanel informationBorrowPanel = new JPanel(new GridLayout(4,2));
        informationBorrowPanel.setBorder(BorderFactory.createTitledBorder("Thông tin người mượn"));
        labelNameBorrow = new JLabel("Người mượn sách:");
        fieldNameBorrow = new JTextField();
        fieldNameBorrow.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateBorrowerName();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateBorrowerName();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                updateBorrowerName();
            }
        });
        labelAge = new JLabel("Tuổi:");
        fieldAge = new JTextField();
        labelAddress = new JLabel("Địa chỉ:");
        fieldAddress = new JTextField();
        labelBookWillBorrow = new JLabel("Sách mượn:");
        comboBoxBookWillBorrow = new JComboBox();
        comboBoxBookWillBorrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayBookInfo();
            }
        });
        informationBorrowPanel.add(labelNameBorrow);
        informationBorrowPanel.add(fieldNameBorrow);
        informationBorrowPanel.add(labelAge);
        informationBorrowPanel.add(fieldAge);
        informationBorrowPanel.add(labelAddress);
        informationBorrowPanel.add(fieldAddress);
        informationBorrowPanel.add(labelBookWillBorrow);
        informationBorrowPanel.add(comboBoxBookWillBorrow);
        add(informationBorrowPanel, BorderLayout.NORTH);
    }
    public void centerPanel(){
        JPanel authorInformationPanel = new JPanel(new GridLayout(4,1));
        authorInformationPanel.setBorder(BorderFactory.createTitledBorder("Thông tin tác giả"));
        labelBookName = new JLabel("Tên sách:");
        fieldBookName = new JTextField();
        fieldBookName.setEditable(false);
        labelAuthor = new JLabel("Tác giả:");
        fieldAuthor = new JTextField();
        fieldAuthor.setEditable(false);
        labelYearRelease = new JLabel("Năm xuất bản:");
        fieldYearRelease = new JTextField();
        fieldYearRelease.setEditable(false);
        labelQuantityRemain = new JLabel("Số lượng tồn đọng:");
        fieldQuantityRemain = new JTextField();
        fieldQuantityRemain.setEditable(false);
        authorInformationPanel.add(labelBookName);
        authorInformationPanel.add(fieldBookName);
        authorInformationPanel.add(labelAuthor);
        authorInformationPanel.add(fieldAuthor);
        authorInformationPanel.add(labelYearRelease);
        authorInformationPanel.add(fieldYearRelease);
        authorInformationPanel.add(labelQuantityRemain);
        authorInformationPanel.add(fieldQuantityRemain);
        add(authorInformationPanel,BorderLayout.CENTER);
    }
    public void underPanel(){
        JPanel tableSale = new JPanel();
        tableSale.setBorder(BorderFactory.createTitledBorder("Tóm gọn:"));
        tableModel = new DefaultTableModel(new Object[]{"Người mượn", "Tên sách", "Tồn đọng"}, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        tableSale.add(scrollPane);
        add(tableSale, BorderLayout.SOUTH);
    }
    // Phương thức để cập nhật tên người mượn trong bảng
    private void updateBorrowerName() {
        String borrowerName = fieldNameBorrow.getText(); // Lấy tên người mượn
        String bookBorrow = fieldBookName.getText(); // Lấy tên sách
        String quantityRemain = fieldQuantityRemain.getText(); // Lấy số liệu tồn đọng
        if (tableModel.getRowCount() == 0) {
            // Nếu bảng trống, thêm một hàng mới
            tableModel.addRow(new Object[]{borrowerName, bookBorrow, quantityRemain});
        } else {
            // Nếu đã có hàng, cập nhật tên người mượn
            tableModel.setValueAt(borrowerName, 0,0);
            tableModel.setValueAt(bookBorrow,0,1);
            tableModel.setValueAt(quantityRemain,0,2);
        }
    }
    private void loadData(){
        listAuthorBook.add(new AuthorBook("Không Gia Đình", "Hector Malot", "1878", "3450"));
        listAuthorBook.add(new AuthorBook("Ông Già Và Biển Cả", "Ernest Hemingway", "1952", "2001"));
        listAuthorBook.add(new AuthorBook("Nhà Giả Kim", "Paulo Coelho", "1988", "3023"));
        listAuthorBook.add(new AuthorBook("Lược Sử Thời Gian", "Stephen Hawking", "1988", "1024"));
        listAuthorBook.add(new AuthorBook("Cuốn Theo Chiều Gió", "Margaret Munnerlyn Mitchell", "1936", "2020"));
        for(AuthorBook book : listAuthorBook){
            comboBoxBookWillBorrow.addItem(book.getBookName());
        }
    }
    // Phương thức để hiển thị thông tin sách khi chọn từ comboBox
    private void displayBookInfo() {
        String selectedBookName = (String) comboBoxBookWillBorrow.getSelectedItem();
        for (AuthorBook book : listAuthorBook) {
            if (book.getBookName().equals(selectedBookName)) {
                fieldBookName.setText(book.getBookName());
                fieldAuthor.setText(book.getAuthor());
                fieldYearRelease.setText(book.getYearRelease());
                fieldQuantityRemain.setText(book.getQuantityRemain());
                break;
            }
        }
    }
}