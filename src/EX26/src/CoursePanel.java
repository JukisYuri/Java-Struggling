package EX26.src;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CoursePanel extends JPanel {
    private JTable table;
    private DefaultTableModel model;
    public JTextField fieldMSSV, fieldTenSV, fieldMaMH, fieldTenMH, fieldDiem;
    private Map<String, Student> students;
    private JComboBox<Course> comboBoxTenMH;

    public Map<String, Student> getStudents() {
        return students;
    }

    public CoursePanel(Map<String, Student> students) {
        this.students = students;
        setLayout(new BorderLayout());

        JPanel panelTTSV = new JPanel(new GridLayout(4, 2));
        panelTTSV.setBorder(BorderFactory.createTitledBorder("Thêm Môn Học"));
        // Phần Thêm Môn Học
        JLabel labelMSSV = new JLabel("MSSV", JLabel.RIGHT);
        fieldMSSV = new JTextField();
        JLabel labelTenSV = new JLabel("Họ và Tên", JLabel.RIGHT);
        fieldTenSV = new JTextField();
        JLabel labelMaMH = new JLabel("Mã môn học", JLabel.RIGHT);
        fieldMaMH = new JTextField();
        JLabel labelTenMH = new JLabel("Tên môn học", JLabel.RIGHT);
        fieldTenMH = new JTextField();

        panelTTSV.add(labelMSSV); panelTTSV.add(fieldMSSV);
        panelTTSV.add(labelTenSV); panelTTSV.add(fieldTenSV);
        panelTTSV.add(labelMaMH); panelTTSV.add(fieldMaMH);
        panelTTSV.add(labelTenMH); panelTTSV.add(fieldTenMH);
        // Phần Thao Tác
        JPanel panelButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelButton.setBorder(BorderFactory.createTitledBorder("Thao Tác"));
        panelButton.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton buttonThemMH = new JButton("Thêm Môn Học");
        JButton buttonTimSV = new JButton("Tìm Sinh Viên");
        panelButton.add(buttonThemMH);
        panelButton.add(buttonTimSV);
        // Phần Table - TableProgress
        model = new DefaultTableModel(new Object[]{"So TT", "Ten mon hoc", "Diem"}, 0);
        table = new JTable(model);
        JScrollPane scroll = new JScrollPane(table);

        TableProgress tableProgress = new TableProgress(students, fieldMSSV, fieldTenSV, fieldMaMH, fieldTenMH, fieldDiem, model, comboBoxTenMH);

        buttonTimSV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableProgress.searchStudent();
            }
        });

        buttonThemMH.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableProgress.addCourse();
            }
        });

        add(panelTTSV, BorderLayout.NORTH);
        add(panelButton, BorderLayout.CENTER);
        add(scroll, BorderLayout.SOUTH);
    }
}


