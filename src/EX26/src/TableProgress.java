package EX26.src;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Map;

public class TableProgress {
    private Map<String, Student> students;
    private JTextField fieldMSSV;
    private JTextField fieldTenSV;
    private JTextField fieldMaMH, fieldTenMH, fieldDiem;
    private DefaultTableModel model;
    private JComboBox<Course> comboBoxTenMH;

    public TableProgress(Map<String, Student> students, JTextField fieldMSSV, JTextField fieldTenSV, JTextField fieldMaMH, JTextField fieldTenMH, JTextField fieldDiem, DefaultTableModel model, JComboBox<Course> comboBoxTenMH) {
        this.students = students;
        this.fieldMSSV = fieldMSSV;
        this.fieldTenSV = fieldTenSV;
        this.fieldMaMH = fieldMaMH;
        this.fieldTenMH = fieldTenMH;
        this.fieldDiem = fieldDiem;
        this.model = model;
        this.comboBoxTenMH = comboBoxTenMH;
    }

    public void searchStudent() {
        String mssv = fieldMSSV.getText();
        Student student = students.get(mssv);
        if (student != null) {
            fieldTenSV.setText(student.getTenSV());
            updateTable(student);
        } else {
            JOptionPane.showMessageDialog(null, "Sinh viên không tồn tại");
        }
    }

    public void updateTable(Student student) {
        model.setRowCount(0); // Xóa dữ liệu cũ
        int stt = 1;
        for (Course course : student.getCourses()) {
            model.addRow(new Object[]{stt++, course.getTenMH(), course.getDiem()});
        }
    }
    private int findSubject(Student stu, String subName) {
        int index = -1;
        for (int i = 0; i < stu.getCourses().size(); i++) {
            if (stu.getCourses().get(i).getTenMH().equals(subName)) {
                return index = i;
            }
        }
        return index;
    }
    public void addCourse(){
        String mssv = fieldMSSV.getText();
        Student student = students.get(mssv);
        if (student != null) {
            String maMH = fieldMaMH.getText();
            String tenMH = fieldTenMH.getText();
            if(!maMH.isEmpty() && !tenMH.isEmpty()){
                student.addCourse(tenMH, 0); // Điểm mặc định là 0
                updateTable(student); // Cập nhật lại bảng
                JOptionPane.showMessageDialog(null, "Thêm môn học thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Mã môn học và tên môn học không được để trống!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sinh viên không tồn tại");
        }
    }
    public void addScore(){
        String mssv = fieldMSSV.getText();
        Student student = students.get(mssv);
        if(student != null){
            String tenMH = (String) comboBoxTenMH.getSelectedItem();
            String nameSub = tenMH.split("\t")[1].trim();
            String diem = fieldDiem.getText();
            int index = findSubject(student, nameSub);
            if (index == -1) {
                student.addScore(nameSub, Double.parseDouble(diem));
                updateTable(student);
                JOptionPane.showMessageDialog(null, "Đã thay đổi điểm số");
            }else {
                student.getCourses().get(index).setDiem(Double.parseDouble(diem));
                updateTable(student);
                JOptionPane.showMessageDialog(null, "Đã thay đổi điểm số");
            }
        }
    }
}
