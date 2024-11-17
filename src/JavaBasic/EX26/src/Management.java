package JavaBasic.EX26.src;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Management extends JFrame {
    private JPanel mainPanel;
    private CardLayout cardLayout;
    private Map<String, Student> students;

    public Management() {
        setTitle("Khoa Công Nghệ Thông Tin");
        setSize(600, 670);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        students = new HashMap<>();
        initializeData();

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        add(mainPanel, BorderLayout.CENTER);

        MenuPanel menuPanel = new MenuPanel(this);
        setJMenuBar(menuPanel.createMenuBar());

        CoursePanel coursePanel = new CoursePanel(students);
        ScorePanel scorePanel = new ScorePanel(students);
        mainPanel.add(coursePanel, "CourseManagement");
        mainPanel.add(scorePanel, "ScoreManagement");

        showDefaultPanel();
        setVisible(true);
    }

    public void showDefaultPanel() {
        JPanel defaultPanel = new JPanel();
        JLabel textLabel = new JLabel("QUẢN LÝ SINH VIÊN K.CNTT");
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        defaultPanel.setLayout(new BorderLayout());
        defaultPanel.add(textLabel, BorderLayout.CENTER);
        mainPanel.add(defaultPanel, "Default");
        cardLayout.show(mainPanel, "Default");
    }

    public void showCourseManagement() {
        cardLayout.show(mainPanel, "CourseManagement");
    }

    public void showScoreManagement() {
        cardLayout.show(mainPanel, "ScoreManagement");
    }

    private void initializeData() {
        Student student = new Student("12345", "Nguyễn Huy An");
        student.addCourse("Lập trình nâng cao", 8.5);
        student.addCourse("Lý thuyết đồ thị", 7.5);
        student.addCourse("Lập trình cơ bản", 8.75);

        Student student1 = new Student("12346", "Nguyễn Huỳnh Anh");
        student1.addCourse("Lập trình nâng cao", 6.5);
        student1.addCourse("Lập trình cơ bản", 8);

        students.put(student.getMssv(), student);
        students.put(student1.getMssv(), student1);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Management::new);
    }
}
